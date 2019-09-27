package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPSender {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("보낼 메세지 입력");
		String msg = sc.nextLine();
		try {
			DatagramSocket dsoc = new DatagramSocket();
			InetAddress ia = InetAddress.getByName("127.0.0.1");
			DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length, ia, 9000);
			dsoc.send(dp);
			dsoc.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
