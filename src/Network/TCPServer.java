package Network;


import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {   

	public static void main(String[] args) {

		ServerSocket serverSocket = null;
/*		ServerSocket 객체는
		1. Socket 생성
		2. binding(Server 정보등록)
		3. Listening(대기)
		를 모두 포함하고 있다.
*/ 

		try {
			serverSocket = new ServerSocket(5000); // 포트번호 5000
			System.out.println("[ " + InetAddress.getLocalHost().getHostAddress() + " Ready server...");
		} catch (IOException e) {
			e.printStackTrace();
		}
		while (true) {
			try {
				System.out.println("[ client 연결 요청 대기");
				Socket socket = serverSocket.accept();	//왼쪽이 연결 Socket, serverSocket이 연결 대기 Socket이다.
				System.out.println("[ " + socket.getInetAddress() + " connection ]");
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				dos.writeUTF("Hi... [ " + socket.getInetAddress() + " ]");
				System.out.println("[ 메시지 전송 완료 ]");
				dos.close();
				socket.close();	//연결 소켓 닫기
			} catch (IOException e) {
				e.printStackTrace();

			}
		}
	}

}
