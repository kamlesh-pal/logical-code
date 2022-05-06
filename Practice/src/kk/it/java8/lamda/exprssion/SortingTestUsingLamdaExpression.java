package kk.it.java8.lamda.exprssion;

import java.util.ArrayList;
import java.util.Collections;

public class SortingTestUsingLamdaExpression {
	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(new Employee(199, "kamlesh"));
		empList.add(new Employee(104, "Dinesh"));
		empList.add(new Employee(108, "Mahesh"));
		empList.add(new Employee(100, "Akhilesh"));
		System.out.println(empList);
		Collections.sort(empList, (e1,e2) -> (e1.getEno() < e2.getEno() ? -1 : (e1.getEno() > e2.getEno() ? 1 : 0)));
		System.out.println(empList);
	}
}
