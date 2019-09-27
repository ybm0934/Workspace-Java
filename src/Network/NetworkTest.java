package Network;


import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class NetworkTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		InetAddress addr1 = null, addr2 = null;
		String url = null;

		System.out.println("Input host name : ");
		url = sc.nextLine();
		try {
			addr1 = InetAddress.getByName(url);
			addr2 = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
		}
		System.out.println("\n" + url);
		System.out.print("IP Address : ");
		System.out.println(addr1.getHostAddress());
		System.out.print("Local IP Address : ");
		System.out.println(addr2.getHostAddress());

	}

}
