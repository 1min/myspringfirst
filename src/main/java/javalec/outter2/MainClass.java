package javalec.outter2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:outter2CTX.xml");//xml받아옴
		
		AdminConnection2 connection = ctx.getBean("adminConnection2",AdminConnection2.class);//Admin객체얻고 생성
		System.out.println("adminID:"+connection.getAdminId());;//아시는바대로
		System.out.println("adminPW:"+connection.getAdminPw());;
		System.out.println("sub_adminID:"+connection.getSub_adminId());
		System.out.println("sub_adminPW:"+connection.getSub_adminPw());
		
		ctx.close();
	}

}
