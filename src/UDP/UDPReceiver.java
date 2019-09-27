package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceiver {

	public static void main(String[] args) {
		try {
			DatagramSocket dsoc = new DatagramSocket(9000);
			byte[] date = new byte[66536];
			DatagramPacket dp = new DatagramPacket(date, date.length);
			System.out.println("데이터 수신 준비 완료...");
			while (true) {
				dsoc.receive(dp);
				System.out.println("송신 IP : " + dp.getAddress());
				String msg = new String(dp.getData(), "UTF-8");
				System.out.println("보내 온 내용 : " + msg);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
