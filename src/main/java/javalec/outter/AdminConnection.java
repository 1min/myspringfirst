package javalec.outter;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class AdminConnection implements EnvironmentAware, InitializingBean, DisposableBean {

	private Environment env;
	private String adminId;
	private String adminPw;
	
	//@Override 빈이 생성되기전에 최초에 실행됨
	public void setEnvironment(Environment env) { //env매개변수는 시스템에서 알아서 던져줌 env는 웹 어플리케이션당 단하나
		System.out.println("setEnvironment()");
		setEnv(env);
	}
	
	public void setEnv(Environment env) {
		this.env = env;
	}
	
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	
	public void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}
	
	public String getAdminId() {
		return adminId;
	}
	
	public String getAdminPw() {
		return adminPw;
	}
	
	//@Override
	public void afterPropertiesSet() throws Exception {//빈 생성시 실행
		System.out.println("afterPropertiesSet()");
		setAdminId(env.getProperty("admin.id"));
		setAdminPw(env.getProperty("admin.pw"));
	}

	//@Override
	public void destroy() throws Exception {//빈 종료시 실행
		System.out.println("destroy()");
	}

}
