package MVC_ScoreTableFramework;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScoreTableUI {
	private ScoreTable scoreTable;
	
	public ScoreTableUI() {
		scoreTable = new ScoreTable();
	}
	
	public void mainMenu() {
		String menu = "   <<< ���� ���� >>>\n\n"
					+ "1. �л��������� �Է�\n"
				    + "2. �л��������� ��ȸ\n"
				    + "3. �����϶�ǥ ���\n"
				    + "0. ����\n"
				    + "���ϴ� �޴��� �����ϼ���... ";
		Scanner sc = new Scanner( System.in );
		int select = -1;
		while ( select != 0 ) {
			System.out.print( menu );
			select = Integer.parseInt( sc.nextLine() );
			switch ( select ) {
			case 1: inputStudentInfo();		break;
			case 2: searchStudentInfo();	break;
			case 3: printScoreTable();		break;
			case 0: 						break;
			default: System.out.println( "Error : 0 ~ 3���̸� �Է� ����...\n" );
			}
		} 
		System.out.println( "\nStop program.....\n" );
	}
	
	public void inputStudentInfo() {
		Scanner sc = new Scanner( System.in );
		
		String name;
		int[] subjects = new int[ Student.MAX_SUBJECT ];
		
		int count = scoreTable.getCountStudent();
		
		boolean loop = true;
		
		if ( count >= scoreTable.MAX_STUDENT ) {
			System.out.printf( "\n���� [ %2d ]���� ��� �ԷµǾ����ϴ�...\n\n", count );
			loop = false;
		}
		while ( loop ) {
			System.out.printf( "\n[%2d]��° �л� �̸� �Է� ( �̸��� \'end\' �̸� ���� ) : ",  
								count + 1, ScoreTable.MAX_STUDENT );
			name = sc.nextLine();
			while ( !name.equals( "end" ) ) {
				++count;
				for ( int i = 0; i < Student.MAX_SUBJECT; ++i ) {
					System.out.printf( "\t[%2d]��° ���� ���� �Է� ( 0 ~ 100 ) : ", i + 1 );
					subjects[ i ] = Integer.parseInt( sc.nextLine() );
					while ( subjects[ i ] < Student.LOW_SCORE || subjects[ i ] > Student.HIGH_SCORE ) {
						System.out.printf( "\tError : ������ 0 ~ 100���̸� �Է� �ϼ���.\n\n" );
						System.out.printf( "\t[%2d]��° ���� ���� �Է� ( 0 ~ 100 ) : ", i + 1 );
						subjects[ i ] = Integer.parseInt( sc.nextLine() );
					}
				}
				scoreTable.appendStudentInfo( name, subjects );
				scoreTable.setCountStudent( count );
				
				if ( count < scoreTable.MAX_STUDENT ) {
					System.out.printf( "\n[%2d]��° �л� �̸� �Է� ( �̸��� \'end\' �̸� ���� ) : ",  
							count + 1, ScoreTable.MAX_STUDENT );
					name = sc.nextLine();
				} else {
					System.out.printf( "\n���� [ %2d ]���� ��� �ԷµǾ����ϴ�...\n\n", count );
					loop = false;
					break;
				}
			}
			loop = false;
			System.out.println();
		}
	}
	
	public void searchStudentInfo() {
		Scanner sc = new Scanner( System.in );
		
		String name;
		
		List<Student> students;
		
		System.out.print( "\n��ȸ�� �л� �̸� �Է� ( �̸��� \'end\' �̸� ���� ) : " );
		name = sc.nextLine();
		while ( !name.equals( "end" ) ) {
			students = scoreTable.searchStudentInfo( name );
			
			if ( students.size() > 0 ) {
				System.out.println( "\n---------------------------------------------------------------" );
				System.out.println( "�̸�\t\t������\t����\t���\t����\t���" );
				System.out.println( "---------------------------------------------------------------" );
				for ( Student student : students ) {
					System.out.println( student );
				}
				System.out.println( "---------------------------------------------------------------" );
				System.out.printf( "\t\t\t\t\t\t��ȸ�л��� : %2d\n", students.size() );
			} else {
				System.out.printf( "\n[ %-10s ] �л��� ������ ��ϵǾ� ���� �ʽ��ϴ�...\n", name );
			}
			
			System.out.print( "\n��ȸ�� �л� �̸� �Է� ( �̸��� \'end\' �̸� ���� ) : " );
			name = sc.nextLine();
		}
		System.out.println();
	}
	
	public void printScoreTable() {
		System.out.println();
		System.out.println( "\t\t    <<< �����϶�ǥ >>>" );
		System.out.println();
		System.out.println( "---------------------------------------------------------------" );
		System.out.println( "�̸�\t\t������\t����\t���\t����\t���" );
		System.out.println( "---------------------------------------------------------------" );
		scoreTable.printScoreTable();
		System.out.println( "---------------------------------------------------------------" );
		System.out.printf( "\t\t\t\t\t\t  ���л��� : %2d\n", scoreTable.getCountStudent() );
		System.out.println();
		
	}
}
