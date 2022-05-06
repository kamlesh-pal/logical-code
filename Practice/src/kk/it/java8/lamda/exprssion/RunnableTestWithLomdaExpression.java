package kk.it.java8.lamda.exprssion;

class RunnableTestWithLamdaExpression {
	public static void main(String[] args) {
		Runnable runnable = () -> {
			for (int i = 0; i <= 10; i++) {
				System.out.println("Child Thread-1");
			}
		};
		Thread t=new Thread(runnable);
		t.start();
		for (int i = 0; i <= 10; i++) {
			System.out.println("Main Thread-1");
		}
	}
}
