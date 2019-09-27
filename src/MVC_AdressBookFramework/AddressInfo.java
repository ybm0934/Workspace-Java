package MVC_AdressBookFramework;

public class AddressInfo {
	private static int count;
	static {
		count = 0;
	}

	private int no;
	private String name;
	private String tel;
	private String email;

	private static int countingNo() {
		++count;
		return count;
	}

	public AddressInfo(String name, String tel, String email) {
		this.no = AddressInfo.countingNo(); // count 자동 증가. Oracle의 시퀀스 역할.
		this.name = name;
		this.tel = tel;
		this.email = email;
	}

	public AddressInfo(String name, String tel) {
		this(name, tel, "");
	}

	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}

	public String getEmail() {
		return email;
	}

	public String toString() {
		return "AddressInfo [no=" + no + ", name=" + name + ", tel=" + tel + ", email=" + email + "]";
	}

}
