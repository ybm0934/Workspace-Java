package UDP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServerBroadCast {

	public static void main(String[] args) {

		try {
			DatagramSocket ds = new DatagramSocket();
			ds.setBroadcast(true);
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			while (true) {
				System.out.println("Input Message : ");
				String msg = in.readLine();
				InetAddress ia = InetAddress.getByName("192.168.6.255");
				DatagramPacket data = new DatagramPacket(msg.getBytes(), msg.getBytes().length, ia, 40000);

				ds.send(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
