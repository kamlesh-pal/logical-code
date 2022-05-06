package kk.it.array.datastructure.arrayproblems;

class ArrayListTest {
	public static void main(String[] args) {
		DVD[] array = new DVD[10];
		DVD avenger = new DVD("avenger", 1995, "John");
		DVD race = new DVD("avenger", 1995, "John");
		DVD rider = new DVD("avenger", 1995, "John");
		DVD sider = new DVD("avenger", 1995, "John");
		array[3]=avenger;
		array[5]=race;
		array[7]=rider;
		array[9]=sider;

		for(int i=0; i< 10 ; i++){
			System.out.println("Prints the movies list  :::::: " + array[i]);
		}
	}
}
