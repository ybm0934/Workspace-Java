package ClassTest;

public class AddressInfo {

	private String name;
	private String tel;
	private String email;

	public AddressInfo() {
		// this.name = "";
		// this.tel = "";
		// this.email = "";
		this("", "", "");
	}

	public AddressInfo(String name) {
		this(name, "", "");
	}

	public AddressInfo(String name, String tel, String email) {
		this.name = name;
		this.tel = tel;
		this.email = email;
	}

	public String toString() {
		String str;

		str = name;
		str += "	" + tel;
		str += "	" + email;

		return str;
	}

	public String getName() { // getter, get 연산
		return name;
	}

	public void setName(String name) { // setter, set 연산
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void writeAddress(String name, String tel, String email) {
		System.out.println(this + " writeAddress()");
	}

	public void searchAddress(String name) {
		System.out.println(this + " searchAddress()");
	}

}
