package javalec.outter;

import java.io.IOException;

import org.omg.CORBA.Environment;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();//ConfigurableApplicationContext은 상위 인터페이스
ConfigurableEnvironment env = ctx.getEnvironment();//ConfigurableEnvironment인터페이스

MutablePropertySources propertySources = env.getPropertySources();//환경설정안의 프로퍼티소스를 다가져옴 현재 빈상태

try {
	propertySources.addLast(new ResourcePropertySource("classpath:admin.properties"));//resourcepropertysource는 해당 파일을 불러와서
//propertySources.addLast로 프로퍼티소스 받아온거의 맨마지막에 리스트로 하나붙임
System.out.println(env.getProperty("admin.id"));//getProperty로 아까 맨마지막에 붙인 파일의 프로퍼티를 가져옴 이경우 admin.id
System.out.println(env.getProperty("admin.pw"));//이경우 admin.pw
}catch(IOException e) {}

GenericXmlApplicationContext gCtx = (GenericXmlApplicationContext)ctx;
gCtx.load("outterCTX.xml");
gCtx.refresh();

AdminConnection adminConnetion = gCtx.getBean("adminConnection",AdminConnection.class);
System.out.println("admin ID:"+adminConnetion.getAdminId());
System.out.println("admin PW"+adminConnetion.getAdminPw());

gCtx.close();
ctx.close();


	}

}
