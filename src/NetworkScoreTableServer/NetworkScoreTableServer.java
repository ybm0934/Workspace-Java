package NetworkScoreTableServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class NetworkScoreTableServer {
	private static boolean cont = true;
	private Integer port;
	private ServerSocket serverSocket; // 연결 소켓
	private Socket clientSocket; // 연결 대기 소켓

	private ScoreTable scoreTable;

	private BufferedReader in;
	private PrintWriter out;

	private String message;
	private String[] msgReceive;
	private String msgSend;

	public NetworkScoreTableServer(Integer port) {
		this.port = port;
		this.scoreTable = new ScoreTable();
		this.msgReceive = new String[10];

		this.createServerSocket();
	}

	private void createServerSocket() {
		try {
			serverSocket = new ServerSocket(this.port);
			System.out.println("[ Server IP : " + serverSocket.getInetAddress().getLocalHost().getHostAddress() + " : "
					+ serverSocket.getLocalPort() + " ]");
			System.out.println("Create server socket...");
			System.out.println("Pending connection...");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void loopServer() { // 서버 실행
		while (cont) { // 서버 무한루프
			try {
				clientSocket = serverSocket.accept(); // client 접속 대기
				System.out.println("[ Client connection : " + clientSocket.getInetAddress().getHostAddress() + " : "
						+ clientSocket.getPort() + " ]");
				System.out.println("Waiting for message...");

				in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				out = new PrintWriter(clientSocket.getOutputStream(), true);

				while ((message = in.readLine()) != null) { // 메세지가 null이 아닐 때까지 수신
					System.out.println("Receive message : " + message);
					msgReceive = message.split("/"); // 수신 된 메세지마다 '/'로 분리 e.g) 1/kim/80/70/60

					if (msgReceive[0].equals("1")) { // 1이면 성적 입력
						writeScore(msgReceive);
					} else if (msgReceive[0].equals("2")) { // 2이면 성적 출력
						readScoreTable();
					} // if
				} // while
				System.out.println("[ disconnection client : " + clientSocket.getInetAddress().getHostAddress() + " : "
						+ clientSocket.getPort() + " ]");
				in.close();
				clientSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				in.close();
				out.close();
				clientSocket.close();
				System.out.println("Pending connection...");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void writeScore(String[] receive_data) { // 성적 등록 메서드
		final int MAX_MESSAGE = 5;
		String message;

		String name;
		int[] subjects = new int[Student.MAX_SUBJECT];
		int i = 1, j = 0;

		name = receive_data[i];
		for (i = 2; i < MAX_MESSAGE; ++i) {
			subjects[j++] = Integer.parseInt(receive_data[i]);
		}

		scoreTable.appendStudentInfo(name, subjects);
	}

	private void readScoreTable() { // 성적 출력 메서드
		for (Student student : scoreTable.getStudents()) { // getStudent()는 Arraylist로 출력하는 메서드
			out.println(student);
		}
		out.println("quit"); // 송신 끝
		System.out.println("Data send successful...");
	}

}
