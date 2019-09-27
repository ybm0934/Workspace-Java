package NetworkMultiple;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class NetworkMultipleClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Socket client = null;
		BufferedReader in = null;
		PrintWriter out = null;

		String message;
		String messageReceive;

		try {
			client = new Socket(); // 소켓 생성자에 ServerIP와 ServerPort가 필요한데, 없기 때문에 client.connect가 필요하다.
			System.out.println("[ Client IP : " + client.getInetAddress().getLocalHost().getHostAddress() + " : "
					+ client.getLocalPort() + " ]");
			System.out.println("Attempting to connect to server...");
			client.connect(new InetSocketAddress("localhost", 9000), 3000); //
			// client.connect(new InetSocketAddress("192.168.6.183", 9000), 3000); // IP 주소,
			// Port 번호, 연결이 안 된다면 3000ms(3초) 동안 연결을 시도하여라
			System.out.println("Server conneection successful...");

			out = new PrintWriter(client.getOutputStream(), true); // 송신
			in = new BufferedReader(new InputStreamReader(client.getInputStream())); // 수신

			System.out.print("Input multiple number (quit : 0) : ");
			while ((message = sc.next()) != null) {
				if (message.equals("0")) {
					break;
				}
				out.println(message); // 전송

				while (!(messageReceive = in.readLine()).equals("quit")) { // 서버로부터 수신하는 값이 quit이 아닐 때까지 받아라
					System.out.println(messageReceive);
				} // while

				System.out.print("\nInput multiple number (quit : 0) : ");
			} // while

			System.out.println("closed server...");

			out.close();
			sc.close();
			client.close();
		} catch (IOException e) {
		}

	}

}
