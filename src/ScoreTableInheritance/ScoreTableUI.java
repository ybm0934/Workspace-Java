package ScoreTableInheritance;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScoreTableUI {
	private ScoreTable scoreTable;
	private DepartmentControl departmentControl;
	
	public ScoreTableUI() {
		scoreTable = new ScoreTable();
		departmentControl = new DepartmentControl();
	}
	
	public void mainMenu() {
		String menu = "   <<< ���� ���� >>>\n\n"
					+ "1. �а� ���� ���\n"
				    + "2. �л� ���� ���� ���\n"
				    + "3. ���� �϶�ǥ ���( �Է¼� )\n"
				    + "4. ���� �϶�ǥ ���( ��ռ� )\n"				    
				    + "0. ����\n"
				    + "���ϴ� �޴��� �����ϼ���... ";
		Scanner sc = new Scanner( System.in );
		int select = -1;
		while ( select != 0 ) {
			System.out.print( menu );
			select = Integer.parseInt( sc.nextLine() );
			switch ( select ) {
			case 1: inputDepartmentInfo();		break;
			case 2: inputStudentInfo();			break;
			case 3: printScoreTable();			break;
			case 4: printScoreTableAverage();	break;
			case 0: 							break;
			default: System.out.println( "Error : 0 ~ 4���̸� �Է� ����...\n" );
			}
		} 
		System.out.println( "\nStop program.....\n" );
	}
	
	public void inputDepartmentInfo() {
		Scanner sc = new Scanner( System.in );
		
		String departmentName;
		int majors;
		int countDepartment = departmentControl.getCountDepartment(); 
		
		if ( countDepartment < DepartmentControl.MAX_DEPARTMENT ) {
			System.out.printf( "\n[ %2d�� %2d ]��° �а� �̸� �Է� ( \'end\'�� ���� ) : ",  
					DepartmentControl.MAX_DEPARTMENT, countDepartment + 1 );
			departmentName = sc.nextLine();
			while ( !departmentName.equals( "end" ) ) {
				System.out.printf( "[ %-20s] ���� ����� �Է� : ", departmentName );
				majors = Integer.parseInt( sc.nextLine() );
				while ( majors < Department.LOW_MAJORS ) {
					System.out.printf( "\tError : ������� 1�̻� �Է� �ϼ���.\n\n" );
					System.out.printf( "[ %-20s] ���� ����� �Է� : ", departmentName );
					majors = Integer.parseInt( sc.nextLine() );
				}
				
				departmentControl.appendDepartment( departmentName, majors );
				countDepartment = departmentControl.getCountDepartment();
				
				if ( countDepartment < DepartmentControl.MAX_DEPARTMENT ) {
					System.out.printf( "\n[ %2d�� %2d ]��° �а� �̸� �Է� ( \'end\'�� ���� ) : ",  
										DepartmentControl.MAX_DEPARTMENT, countDepartment + 1 );
					departmentName = sc.nextLine();
				} else {
					break;
				}
			}
		} else {
			System.out.println( "\nInfo : �а� ������ �̹� ��� �Է� �Ǿ����ϴ�.\n" );
		}
	}
	
	public void inputStudentInfo() {
		if ( departmentControl.getCountDepartment() > 0 ) {
			Scanner sc = new Scanner( System.in );
			
			String name;
			String departmentName;
			int majors;
			int[] commonSubjects = new int[ Student.MAX_SUBJECT ];
			int[] majorSubjects;
			
			int count = scoreTable.getCountStudent();
			int majorIndex;
			
			System.out.printf( "\n�л� �̸� �Է� ( �̸��� \'end\' �̸� ���� ) : " );
			name = sc.nextLine();
			while ( !name.equals( "end" ) ) {
				++count;
				
				System.out.println( "\n    <<< �а� ��� >>>" );
				System.out.print( departmentControl );
				System.out.println();
				System.out.print( "�а� �̸� �Է� : " );
				departmentName = sc.nextLine();
				majorIndex = departmentControl.searchMajors( departmentName );
				while ( majorIndex < 0 ) {
					System.out.printf( "\tError : ��ϵ� �а����� �ƴմϴ�.\n\n" );
					System.out.println( "\n    <<< �а� ��� >>>" );
					System.out.print( departmentControl );
					System.out.println();
					System.out.print( "�а� �̸� �Է� : " );
					departmentName = sc.nextLine();
					majorIndex = departmentControl.searchMajors( departmentName );
				}
				
				majors = departmentControl.getMajors( majorIndex ).getMajors();
				majorSubjects = new int[ majors ];
				for ( int i = 0; i < majors; ++i ) {
					System.out.printf( "\t[ %-20s ]�а� [%2d]��° �������� ���� �Է� ( 0 ~ 100 ) : ", 
									   departmentName, i + 1 );
					majorSubjects[ i ] = Integer.parseInt( sc.nextLine() );
					while ( majorSubjects[ i ] < Student.LOW_SCORE || majorSubjects[ i ] > Student.HIGH_SCORE ) {
						System.out.printf( "\tError : ������ 0 ~ 100���̸� �Է� �ϼ���.\n\n" );
						System.out.printf( "\t[ %-20s ]�а� [%2d]��° ���ϰ��� ���� �Է� ( 0 ~ 100 ) : ",
											departmentName, i + 1 );
						majorSubjects[ i ] = Integer.parseInt( sc.nextLine() );
					}
				}
				
				System.out.println();
				for ( int i = 0; i < Student.MAX_SUBJECT; ++i ) {
					System.out.printf( "\t[%2d]��° ������� ���� �Է� ( 0 ~ 100 ) : ", i + 1 );
					commonSubjects[ i ] = Integer.parseInt( sc.nextLine() );
					while ( commonSubjects[ i ] < Student.LOW_SCORE || commonSubjects[ i ] > Student.HIGH_SCORE ) {
						System.out.printf( "\tError : ������ 0 ~ 100���̸� �Է� �ϼ���.\n\n" );
						System.out.printf( "\t[%2d]��° ������� ���� �Է� ( 0 ~ 100 ) : ", i + 1 );
						commonSubjects[ i ] = Integer.parseInt( sc.nextLine() );
					}
				}
				
				scoreTable.appendStudentInfo( name, departmentName, commonSubjects, majors, majorSubjects );
					
				System.out.printf( "\n�л� �̸� �Է� ( �̸��� \'end\' �̸� ���� ) : " );
				name = sc.nextLine();
			}
		} else {
			System.out.println( "\nInfo : �а� ������ ���� ����ϼ���.\n" );
		}
			
	}
	
	public void printScoreTable() {
		if ( departmentControl.getCountDepartment() > 0 ) {
			System.out.println();
			System.out.println( "\t\t\t\t    <<< �����϶�ǥ >>>" );
			System.out.println();
			System.out.println( "------------------------------------------------------------------------------------------------------" );
			System.out.println( "�̸�\t   �а�\t\t\t  ����\t\t     ����\t\t����\t���\t����  ���" );
			System.out.println( "------------------------------------------------------------------------------------------------------" );
			scoreTable.printScoreTable();
			System.out.println( "------------------------------------------------------------------------------------------------------" );
			System.out.printf( "���л��� : %2d\n", scoreTable.getCountStudent() );
			System.out.println();
		} else {
			System.out.println( "\nInfo : �а� ������ ���� ����ϼ���.\n" );
		}
	}
	
	public void printScoreTableAverage() {
		if ( departmentControl.getCountDepartment() > 0 ) {		
			System.out.println();
			System.out.println( "\t\t\t\t    <<< �����϶�ǥ >>>" );
			System.out.println();
			System.out.println( "------------------------------------------------------------------------------------------------------" );
			System.out.println( "�̸�\t   �а�\t\t\t  ����\t\t     ����\t\t����\t���\t����  ���" );
			System.out.println( "------------------------------------------------------------------------------------------------------" );
			scoreTable.printScoreTableAverage();
			System.out.println( "------------------------------------------------------------------------------------------------------" );
			System.out.printf( "���л��� : %2d\n", scoreTable.getCountStudent() );
			System.out.println();
		} else {
			System.out.println( "\nInfo : �а� ������ ���� ����ϼ���.\n" );
		}
	}
}
