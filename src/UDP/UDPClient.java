package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPClient {

	public static void main(String[] args) {
		try {
			int port = 9000;
			DatagramSocket socket = new DatagramSocket(port);
			byte[] msg = new byte[512];
			DatagramPacket p = new DatagramPacket(msg, msg.length);
			System.out.println("수신 대기 중....");
			socket.receive(p); // 서버는 데이터 한 번 보내면 끝이다. 클라이언트가 제대로 받았는지 확인하지 않는다.
			System.out.println("수신 완료");
			System.out.println("수신 내용 : " + new String(msg));
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
