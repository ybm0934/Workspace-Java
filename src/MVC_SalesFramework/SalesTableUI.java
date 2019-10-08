package MVC_SalesFramework;

import java.util.Scanner;

public class SalesTableUI {
	private SalesTable salesTable;
	
	public SalesTableUI() {
		salesTable = new SalesTable();
	}
	
	public void mainMenu() {
		String menu = "\t<<<판매 일람표>>>\n\n"
					+ "1. 품목 정보 등록\n"
					+ "2. 판매 정보 등록\n"
					+ "3. 판매 일람표 출력(품목명 순)\n"
					+ "4. 판매 일람표 출력(판매금액 순)\n"
					+ "0. 종료\n"
					+ "메뉴를 선택하세요...";
		Scanner sc = new Scanner(System.in);
		int select = -1;
		while(select != 0) {
			System.out.println(menu);
			select = Integer.parseInt(sc.nextLine());
			switch(select) {
			case 1: inputItemInfo(); break;
			case 2: inputSaleInfo(); break;
			case 3: printSaleTableItem(); break;
			case 4: printSaleTableAmount(); break;
			case 0:
				default: System.out.println("Error : 0 ~ 4 숫자만 선택 가능합니다...\n");
			}
			System.out.println("\nStop Program...\n");
		}
		
	}
	
	public void inputItemInfo() {
		Scanner sc = new Scanner(System.in);
		
		String itemName;
		int price;
		
		System.out.print("\n품목명을 입력하세요(\'end\' 입력시 종료) : ");
		itemName = sc.nextLine();
		while(!itemName.equals("end")) {
			System.out.print("단가를 입력하세요 : ");
			price = Integer.parseInt(sc.nextLine());
			
			salesTable.appendItemInfo(itemName, price);
			
			System.out.print("\n품목명을 입력하세요(\'end\' 입력시 종료) : ");
			itemName = sc.nextLine();
		}
	}

	public void inputSaleInfo() {
		Scanner sc = new Scanner(System.in);

		String itemName;
		int saleQuantity;
		int index;

		System.out.print("\n품목명을 입력하세요(\'end\' 입력시 종료) : ");
		itemName = sc.nextLine();
		while (!itemName.equals("end")) {
			index = salesTable.searchItemInfo(itemName);
			while (index < 0) {
				System.out.println("\tError : 품목이 없습니다.\n\t\t품목을 등록해주세요.");
				System.out.print("\n품목명을 입력하세요(\'end\' 입력시 종료) : ");
				itemName = sc.nextLine();
				if (!itemName.equals("end")) {
					index = salesTable.searchItemInfo(itemName);
				} else {
					break;
				}
			}
			
			if(!itemName.equals("end")) {
				System.out.println("수량을 입력하세요.");
				saleQuantity = Integer.parseInt(sc.nextLine());
				
				salesTable.appendSaleInfo(itemName, saleQuantity);
				
				System.out.println();
				System.out.print(salesTable.getSalesControl());
				System.out.println();
				
				System.out.print("\n품목명을 입력하세요(\'end\' 입력시 종료) : ");
				itemName = sc.nextLine();
			}else {
				break;
			}
		}
	}

	public void printSaleTableItem() {
		System.out.println();
		System.out.println("\t\t<<<판매 일람표>>>\n");
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("품목명\t단가\t판매수량\t판매금액");
		System.out.println("----------------------------------------");
		salesTable.printSalesTableItemName();
		System.out.println("----------------------------------------");
		System.out.println("\t\t\t 총판매금액 : " + salesTable.getItemControl());
		System.out.println();
	}

	public void printSaleTableAmount() {
		System.out.println();
		System.out.println("\t\t<<<판매 일람표>>>\n");
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("품목명\t단가\t판매수량\t판매금액");
		System.out.println("----------------------------------------");
		salesTable.printSalesTableAmount();
		System.out.println("----------------------------------------");
		System.out.println("\t\t\t 총판매금액 : " + salesTable.getItemControl());
		System.out.println();
	}

}
