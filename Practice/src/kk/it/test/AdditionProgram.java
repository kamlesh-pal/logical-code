package kk.it.test;

public class AdditionProgram {
    static double a = 10.5;
    static double b = 20;
    public static double addition(){
        double c = a+b;
        return c;
    }
    public static void main(String[] args) {
        System.out.println("The output is :::" + AdditionProgram.addition());
    }
}
