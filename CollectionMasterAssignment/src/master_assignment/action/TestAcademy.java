package master_assignment.action;

import master_assignment.manager.CourseManager;
import master_assignment.manager.StudentManager;

public class TestAcademy {
	public static void main(String[] args) {

		CourseManager.addCourse();
		
		// data creation for 3 entries in student map
		// 1st 1 entry, 2nd 3 entries, 3rd 1 entry
		StudentManager.addDummyStudents();

		CourseManager.printMostFavouredCourse();
	}
}
