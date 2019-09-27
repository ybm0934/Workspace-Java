package Network;


import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) {

		try {
			String serverIP = "127.0.0.1";
			//String serverIP = "192.168.6.183";
			System.out.println("ready connection server : " + serverIP);
			Socket socket = new Socket(serverIP, 5000);
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			System.out.println("receive message : " + dis.readUTF());
			System.out.println("close connection");
			dis.close();
			socket.close();
		} catch (ConnectException ce) {
			ce.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
