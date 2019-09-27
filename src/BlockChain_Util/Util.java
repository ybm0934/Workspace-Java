package BlockChain_Util;

import java.security.MessageDigest;

public class Util {
	public static String getHash(String input) { // hash값을 얻는 메서드
		StringBuffer result = new StringBuffer();

		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256"); // 싱글톤패턴. 하나의 인스턴스만 공유해서 사용한다.
			md.update(input.getBytes());
			byte bytes[] = md.digest();
			for (int i = 0; i < bytes.length; i++) {
				result.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result.toString();
	}
}
