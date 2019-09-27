package NetworkScoreTableServerMulti;
import java.util.ArrayList;
import java.util.List;

public class ScoreTable {
	private List<Student> students;
	private int countStudent;
	
	public ScoreTable() {
		students = new ArrayList<>();
		countStudent = 0;
	}
	
	public List<Student> getStudents() {
		return students;
	}
	
	public int getCountStudent() {
		return countStudent;
	}

	public void setCountStudent(int countStudent) {
		this.countStudent = countStudent;
	}

	public void appendStudentInfo( String name, int[] subjects ) {
		students.add( new Student( name, subjects ) );
		++countStudent;
		calcRank();
	}
	
	public List<Student> searchStudentInfo( String name ) {
		List<Student> resultStudents = new ArrayList<>();
		
		for ( Student student : students ) {
			if ( student.getName().equals( name ) ) {
				resultStudents.add( student );
			}
		}
		
		return resultStudents;
	}
	
	public void printScoreTable() {
		for ( Student student : students ) {
			System.out.println( student );
		}
	}
	
	private void calcRank() {
		int rank;
		
		for ( int i = 0; i < this.students.size(); ++i ) {
			rank = 1;
			for ( int j = 0; j < this.students.size(); ++j ) {
				if ( students.get( i ).getAverage() < students.get( j ).getAverage() ) {
					++rank;
				}
			}
			students.get( i ).setRank( rank );
		}
	}
}
