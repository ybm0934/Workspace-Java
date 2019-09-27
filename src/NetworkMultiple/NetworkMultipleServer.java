package NetworkMultiple;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class NetworkMultipleServer {

	public static void main(String[] args) {

		ServerSocket server = null; // 서버 소켓 + 연결 대기 소켓
		Socket connection = null; // 연결 소켓

		BufferedReader in = null;
		PrintWriter out = null;

		String message;
		String messageSend;
		Integer multiple; // Wrapper Class
		final int MAX = 9; // 구구단

		try {
			server = new ServerSocket(9000); // port 번호
		} catch (IOException e) {
		}

		try {
			System.out.println("[ Server IP : " + server.getInetAddress().getLocalHost().getHostAddress() + " : "
					+ server.getLocalPort() + " ]"); // 서버 IP 주소
		} catch (UnknownHostException e) {
		}

		System.out.println("Pending connection...");

		try {
			connection = server.accept(); // 클라이언트 연결 대기
			System.out.println("[ Client connection : " + connection.getInetAddress().getHostAddress() + " : "
					+ connection.getPort() + " ]");
			System.out.println("Waiting for message...");

			in = new BufferedReader(new InputStreamReader(connection.getInputStream())); // connection(클라이언트)로부터 입력 받은
																							// 데이터를 가져와라(수신 목적)
			out = new PrintWriter(connection.getOutputStream(), true); // 송신 목적

			while ((message = in.readLine()) != null) { // null이 들어올 때까지 메세지를 받아라 (가변 길이)
				System.out.println("Receive message : " + message);

				multiple = Integer.parseInt(message); // 문자를 숫자로 변환
				if (multiple != 0) {
					for (int i = 1; i <= MAX; ++i) {
						messageSend = String.valueOf(multiple);
						messageSend += " X ";
						messageSend += String.valueOf(i);
						messageSend += " = ";
						messageSend += String.valueOf(multiple * i);
						out.println(messageSend); // print 된 값을 송신
					}
					out.println("quit");
				} else {
					out.println("not multiple number\n");
				} // if

				System.out.println("Stop message sending...");

			} // while

			System.out.println("closed server...");
			in.close();
			connection.close();
			server.close();
		} catch (IOException e) {
		}

	}

}
