package Week3.Day1Assignment;

public class DeskTop extends Computer {
	public void DesktopModel() {
		System.out.println("My DESKTOP Name as HP");

	}
	public static void main(String[] args) {
		
		DeskTop model = new DeskTop();
		model.ComputerModel();
		model.DesktopModel();
		
	}

}
