package firstest;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		MyCalculator myCalculator = new MyCalculator();
		myCalculator.setCalculator(new Calculator());
		
		myCalculator.setFirstNum(10);
		myCalculator.setSecondNum(2);
		
		myCalculator.add();
		myCalculator.sub();
		myCalculator.mul();
		myCalculator.div();
		*/
		
		String configLocation = "classpath:applicationCTX.xml";//xml파일 패스 불러오기
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);//xml파일 패스로 불러와서 해독 즉 파싱과정 generic은 xml파싱 클래스
		MyCalculator myCalculator = ctx.getBean("myCalculator", MyCalculator.class);//xml파일에서 myCalculator라는 인스턴스 불러오기 인자 첫번째는 인스턴스 두번째는 타입.class
		
		myCalculator.add();
		myCalculator.sub();
		myCalculator.mul();
		myCalculator.div();
		
	}
	
}
