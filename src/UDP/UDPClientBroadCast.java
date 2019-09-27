package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClientBroadCast {

	public static void main(String[] args) {
		try {
			DatagramSocket ds = new DatagramSocket(40000);
			byte[] by = new byte[65508];
			while (true) {
				DatagramPacket data = new DatagramPacket(by, by.length);
				ds.receive(data);
				InetAddress ia = data.getAddress();
				String str = new String(data.getData()).trim();
				System.out.println(ia.getHostName() + " ===> " + str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
