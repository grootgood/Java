package rambdaex.ex03;

public class Ex02 {
	private String name = "홍길동";

	public Runnable test() {
		String lname = "고길동"; // 지역변수. return 되면 사라진다.
		Runnable r;
		
		// Runnable의 익명구현객체에서 this 확인
		r = new Runnable() {
			private String name = "박길동";
			@Override
			public void run() {
				System.out.println(name); // 이 this는 호출할 때 누가 호출했느냐로 결정
			}
		};
		r.run();
		System.out.println(this);
		
//		r = () -> System.out.println(name); // this.name에서 this 생략 가능
		r = () -> System.out.println(lname); // 지역변수 출력
//		r.run();
		return r;
	}
	
	
	public static void main(String[] args) {
		Ex02 t = new Ex02();
		Runnable r = t.test();
		r.run();
	}
}
