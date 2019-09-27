package Network;


import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class NetworkTest2 {
	public static void main(String[] args) throws Exception, MalformedURLException {

		URL u = new URL(args[0]);
		System.out.println("Url Class------");
		System.out.println("protocol : " + u.getProtocol());
		System.out.println("port : " + u.getPort());
		System.out.println("host : " + u.getHost());
		System.out.println("file(path포함) : " + u.getFile());
		System.out.println("URL : " + u.toExternalForm());

		System.out.println("URLConnection Class-----");
		URLConnection uc = u.openConnection();
		int len = uc.getContentLength();
		System.out.println("document length : " + len + "byte");
		URL uu = uc.getURL();
		System.out.println("URL : " + uu);
	}

}
