package Week3.Day1Assignment;

public class College extends Department {
	
	public void collegeName() {
	System.out.println("College Name Vysya");

	}
	
	public void collegeCode() {
		System.out.println("College Code is : 123");

	}
	
	public void collegeRank() {
		System.out.println("College Rank :57 ");

	}
	public static void main(String[] args) {
		College obj = new College();
		obj.studentId(1001);
		obj.studentName("Senthil");
		obj.studentDept("CSE");
		obj.deptName("Comp Science");
		obj.collegeName();
		obj.collegeCode();
	}
	

}
