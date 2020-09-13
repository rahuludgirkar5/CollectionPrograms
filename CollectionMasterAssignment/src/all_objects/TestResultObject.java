package all_objects;

import java.util.ArrayList;
import java.util.Date;

import master_assignment.bean.TestResult;

public class TestResultObject {
	
	public static ArrayList<TestResult> testOb() {
		
		ArrayList<TestResult> al=new ArrayList<>();
		
		al.add(new TestResult(new Date(22 / 8 / 2020), 301, 11, 60,100));
		al.add(new TestResult(new Date(22 / 8 / 2020), 301, 12, 42,100));
		al.add(new TestResult(new Date(22 / 8 / 2020), 301, 13, 58,100));
		
		al.add(new TestResult(new Date(22 / 8 / 2020), 302, 14, 0,100));
		al.add(new TestResult(new Date(22 / 8 / 2020), 302, 15, 61,100));
		al.add(new TestResult(new Date(22 / 8 / 2020), 302, 16, 72,100));
		
		al.add(new TestResult(new Date(22 / 8 / 2020), 303, 17, 0,100));
		al.add(new TestResult(new Date(22 / 8 / 2020), 303, 18, 52,100));
		al.add(new TestResult(new Date(22 / 8 / 2020), 303, 19, 56,100));
		
		al.add(new TestResult(new Date(22 / 8 / 2020), 304, 20, 64,100));
		al.add(new TestResult(new Date(22 / 8 / 2020), 304, 21, 68,100));
		al.add(new TestResult(new Date(22 / 8 / 2020), 304, 22, 70,100));
		
		al.add(new TestResult(new Date(23 / 8 / 2020), 301, 11, 59,100));
		al.add(new TestResult(new Date(23 / 8 / 2020), 301, 12, 36,100));
		al.add(new TestResult(new Date(23 / 8 / 2020), 301, 13, 49,100));
		al.add(new TestResult(new Date(23 / 8 / 2020), 302, 14, 55,100));
		al.add(new TestResult(new Date(23 / 8 / 2020), 302, 15, 36,100));
		al.add(new TestResult(new Date(23 / 8 / 2020), 302, 16, 48,100));
		al.add(new TestResult(new Date(23 / 8 / 2020), 303, 17, 57,100));
		al.add(new TestResult(new Date(23 / 8 / 2020), 303, 18, 69,100));
		al.add(new TestResult(new Date(23 / 8 / 2020), 303, 19, 68,100));
		al.add(new TestResult(new Date(23 / 8 / 2020), 304, 20, 54,100));
		al.add(new TestResult(new Date(23 / 8 / 2020), 304, 21, 77,100));
		al.add(new TestResult(new Date(23 / 8 / 2020), 304, 22, 45,100));
		 
		return al;
	}

}
