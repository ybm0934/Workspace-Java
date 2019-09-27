package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.rmi.UnknownHostException;

public class UDPServer {

	public static void main(String[] args) {
		try {
			InetAddress ip = InetAddress.getByName("192.168.6.166");
			DatagramSocket socket = new DatagramSocket();
			String msg = "send message : Hi~~~";
			byte[] buf = msg.getBytes();
			int port = 9000;
			DatagramPacket p = new DatagramPacket(buf, buf.length, ip, port);
			socket.send(p);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
