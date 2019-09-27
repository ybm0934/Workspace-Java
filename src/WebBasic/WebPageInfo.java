package WebBasic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class WebPageInfo {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.naver.com");
			InputStream openStream = url.openStream();
			InputStreamReader isr1 = new InputStreamReader(openStream, "UTF-8");
			BufferedReader bis1 = new BufferedReader(isr1);
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("페이지 정보 : ");
			while (true) {
				String str = bis1.readLine();
				if (str == null) {
					break;
				}
				System.out.println(str);
			}
			bis1.close();
			isr1.close();
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
