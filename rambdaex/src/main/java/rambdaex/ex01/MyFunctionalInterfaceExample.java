package rambdaex.ex01;

public class MyFunctionalInterfaceExample {

	public static void main(String[] args) {
		MyFunctionalInterface fi; // 변수 선언
		
		fi = () -> {
			String str = "method call 1";
			System.out.println(str);
		};
		fi.method();
		
		fi = () -> { System.out.println("method call 2"); };
		fi.method();
		
		fi = () -> System.out.println("method call 3");
		fi.method();
		
		Runnable r = () -> System.out.println("method call 4");
		r.run();
		
	}
}
