package firstest;

public class Calculator {//직점 메소드 돌리는 클래스, xml에서 생성됨

	public void addition(int f, int s) {
		System.out.println("addition()");
		int result = f + s;
		System.out.println(f + " + " + s + " = " + result);
	}
	
	public void subtraction(int f, int s) {
		System.out.println("subtraction()");
		int result = f - s;
		System.out.println(f + " - " + s + " = " + result);
	}
	
	public void multiplication(int f, int s) {
		System.out.println("multiplication()");
		int result = f * s;
		System.out.println(f + " * " + s + " = " + result);
	}
	
	public void division(int f, int s) {
		System.out.println("division()");
		int result = f / s;
		System.out.println(f + " / " + s + " = " + result);
	}

}
