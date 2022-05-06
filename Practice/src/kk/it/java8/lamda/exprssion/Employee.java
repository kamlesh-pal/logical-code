package kk.it.java8.lamda.exprssion;

public class Employee {
	private int eno;
	private String eName;

	public Employee(int eno, String eName) {
		this.eno = eno;
		this.eName = eName;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"eno=" + eno +
				", eName='" + eName + '\'' +
				'}';
	}
}
