package kk.it.interfacetest;

public class C implements A, B{
    @Override
    public void test() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        A a = new C();
        a.test();
        B b = new C();
        b.test();
       // System.out.println(7+8+"JAVA"+4+3); testing purpose only
    }
}
