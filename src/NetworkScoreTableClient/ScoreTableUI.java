package NetworkScoreTableClient;

import java.util.List;
import java.util.Scanner;

public class ScoreTableUI {
	private NetworkScoreTableClient scoreTableClient;

	public ScoreTableUI() {
		scoreTableClient = new NetworkScoreTableClient("localhost", 9000);
	}

	public void mainMenu() {
		String menu = "   <<< 성적 관리 >>>\n\n" + "1. 학생 성적 정보 등록\n" + "2. 성적 일람표 출력\n" + "0. 종료\n" + "원하는 메뉴를 선택하세요... ";
		Scanner sc = new Scanner(System.in);
		int select = -1;
		while (select != 0) {
			System.out.print(menu);
			select = Integer.parseInt(sc.nextLine());
			switch (select) {
			case 1:
				inputStudentInfo();
				break;
			case 2:
				printScoreTable();
				break;
			case 0:
				scoreTableClient.disconnect();
				break;
			default:
				System.out.println("Error : 0 ~ 2사이만 입력 가능...\n");
			}
		}
		System.out.println("\nStop program.....\n");
	}

	public void inputStudentInfo() {
		Scanner sc = new Scanner(System.in);

		String name;
		int subject;

		StringBuffer message;

		System.out.printf("\n학생 이름 입력 ( 이름이 \'end\' 이면 종료 ) : ");
		name = sc.nextLine();
		while (!name.equals("end")) {
			message = new StringBuffer(); // 서버에 전달할 내용.
			message.append("1/"); // 1번 번호 후 슬래시
			message.append(name + "/"); // 이름 후 슬래시
			for (int i = 0; i < Student.MAX_SUBJECT; ++i) {
				System.out.printf("\t[%2d]번째 과목 점수 입력 ( 0 ~ 100 ) : ", i + 1);
				subject = Integer.parseInt(sc.nextLine());
				while (subject < Student.LOW_SCORE || subject > Student.HIGH_SCORE) {
					System.out.printf("\tError : 점수는 0 ~ 100사이만 입력 하세요.\n\n");
					System.out.printf("\t[%2d]번째 과목 점수 입력 ( 0 ~ 100 ) : ", i + 1);
					subject = Integer.parseInt(sc.nextLine());
				}
				message.append(String.valueOf(subject) + "/"); // StringBuffer이기 때문에 숫자를 입력받을 수 없으므로 subject를 문자로 변환 작업
			}
			scoreTableClient.send(message); // 메세지 전송

			System.out.printf("\n학생 이름 입력 ( 이름이 \'end\' 이면 종료 ) : ");
			name = sc.nextLine();
		}
		System.out.println();
	}

	public void printScoreTable() {
		StringBuffer message = new StringBuffer();
		int count = 0;
		message.append("2/");
		scoreTableClient.send(message);

		List<String> msgReceive = scoreTableClient.receive();

		System.out.println();
		System.out.println("\t\t    <<< 성적일람표 >>>");
		System.out.println();
		System.out.println("---------------------------------------------------------------");
		System.out.println("이름\t\t과목성적\t총점\t평균\t석차\t등급");
		System.out.println("---------------------------------------------------------------");
		for (String student : msgReceive) {
			System.out.println(student);
			++count;
		}
		System.out.println("---------------------------------------------------------------");
		System.out.printf("\t\t\t\t\t\t  총학생수 : %2d\n", count);
		System.out.println();

	}
}
