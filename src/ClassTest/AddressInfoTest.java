package ClassTest;

public class AddressInfoTest {

	public static void main(String[] args) {
		AddressInfo addressInfo = new AddressInfo("Park", "010-8888-9999", "Park@korea.co.kr");
		AddressInfo addressInfo2 = new AddressInfo();
		AddressInfo addressInfo3 = new AddressInfo("KIM");

		System.out.println(addressInfo);
		System.out.println(addressInfo2);
		System.out.println(addressInfo3);

		AddressInfo[] addressBook = new AddressInfo[10];

		addressBook[0] = new AddressInfo("Hong", "010-1111-2222", "Hong@korea.com");
		addressBook[1] = new AddressInfo("Kim", "010-5555-6666", "Kim@korea.com");
		addressBook[2] = new AddressInfo("Lee", "010-8888-9999", "Lee@korea.com");

		for (int i = 0; i < 3; i++) {
			System.out.println(addressBook[i]);
		}

		/*
		 * System.out.println(addressInfo); System.out.println("addressInfo---------");
		 * System.out.println("name : " + addressInfo.getName());
		 * System.out.println("tel : " + addressInfo.getTel());
		 * System.out.println("email : " + addressInfo.getEmail());
		 * 
		 * System.out.println(addressInfo2);
		 * System.out.println("addressInfo2---------"); System.out.println("name : " +
		 * addressInfo.getName()); System.out.println("tel : " + addressInfo.getTel());
		 * System.out.println("email : " + addressInfo.getEmail());
		 * 
		 * addressInfo.setName("Hong"); addressInfo.setTel("010-1234-5678");
		 * addressInfo.setEmail("Hong@korea.co.kr");
		 * 
		 * System.out.println("name : " + addressInfo.getName());
		 * System.out.println("tel : " + addressInfo.getTel());
		 * System.out.println("email : " + addressInfo.getEmail());
		 * 
		 * addressInfo.writeAddress("kim", "010-3333-4444", "kim@korea.co.kr");
		 * addressInfo.searchAddress("Lee");
		 */

	}

}
