package MVC_AddressBook;

public class AddressInfo {
	private String name;
	private String tel;
	private String email;
	
	public AddressInfo( String name, String tel, String email ) {
		this.name = name;
		this.tel = tel;
		this.email = email;
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
		return String.format( "%-10s %13s %-30s", name, tel, email );
	}
}
