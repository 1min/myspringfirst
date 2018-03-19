package third;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String configLocation ="classpath:applicationCTX3.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		StudentInfo studentInfo = ctx.getBean("studentInfo",StudentInfo.class);//인터페이스로 타입을 묶으면 자식 클래스를 끼워넣기로 사용가능
		studentInfo.getStudentInfo();
		
		Student student2 = ctx.getBean("student2",Student.class);
		studentInfo.setStudent(student2);
		studentInfo.getStudentInfo();
		
		//ctx.close();
	}

}
