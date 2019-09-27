package MVC_AdressBookFramework;
import java.util.Scanner;

public class AddressBookUI {
	private AddressBook addressBook;

	public AddressBookUI() {
		addressBook = new AddressBook();
	}

	public void mainMenu() {
		String menu = "1. 주소정보 등록\n" + "2. 주소정보 삭제\n" + "3. 주소정보 검색\n" + "4. 주소록 정보출력\n" + "0. 종료\n"
				+ "원하는 메뉴를 선택하세요...";

		Scanner sc = new Scanner(System.in);
		int select = -1;

		while (select != 0) {
			System.out.print(menu);
			select = Integer.parseInt(sc.nextLine());
			switch (select) {
			case 1:
				inputAddressInfo();
				break;
			case 2:
				deleteAddressInfo();
				break;
			case 3:
				searchAddressInfo();
				break;
			case 4:
				printAddressBook();
				break;
			case 0:
				break;
			default:
				System.out.println("Error : 0 ~ 4 사이만 입력 가능...\n");
			}
		}
	}

	public void inputAddressInfo() {
		Scanner sc = new Scanner(System.in);
		String name;
		String tel;
		String email;

		System.out.print("주소 정보 이름 입력 ( \'end\' : 종료 ) : ");
		name = sc.nextLine();
		while (!name.equals("end")) {
			System.out.print("주소 정보 전화번호 입력 : ");
			tel = sc.nextLine();
			System.out.print("주소 정보 e-mail 입력 : ");
			email = sc.nextLine();

			addressBook.appendAddressInfo(new AddressInfo(name, tel, email));

			System.out.print("주소 정보 이름 입력 (\'end\' : 종료 ) : ");
			name = sc.nextLine();
		}

	}

	public void deleteAddressInfo() {
		Scanner sc = new Scanner(System.in);
		String name;
		String tel;

		System.out.println("이름과 번호를 입력하세요.");
		name = sc.nextLine();
		tel = sc.nextLine();

		addressBook.removeAddressInfo(name, tel);
	}

	public void searchAddressInfo() {
		Scanner sc = new Scanner(System.in);
		String name;
		String tel;
		int index = -1;

		System.out.print("\n이름과 번호를 입력하세요.\n이름 : ");
		name = sc.nextLine();
		System.out.print("번호 : ");
		tel = sc.nextLine();

		index = addressBook.searchAddressInfo(name, tel);

		if (index > -1) {
			System.out.println(addressBook.getAddressInfo(index));
		} else {
			System.out.println("검색 결과가 없습니다.");
		}

	}

	public void printAddressBook() {
		System.out.println();
		System.out.println(addressBook);
		System.out.println();
	}

}
