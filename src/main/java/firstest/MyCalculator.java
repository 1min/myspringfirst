package firstest;

public class MyCalculator {

	Calculator calculator;
	private int firstNum;
	private int secondNum;
	
	//멤버변수의 setter가 꼭 있어야 xml에서 불러올수 있다!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	//xml에서 부르기위해서는
	public MyCalculator() {

	}

	public void add() {
		calculator.addition(firstNum, secondNum);
	}
	
	public void sub() {
		calculator.subtraction(firstNum, secondNum);
	}
	
	public void mul() {
		calculator.multiplication(firstNum, secondNum);
	}
	
	public void div() {
		calculator.division(firstNum, secondNum);
	}
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}
	
	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
}
