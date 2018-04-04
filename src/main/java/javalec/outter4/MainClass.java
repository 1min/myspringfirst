package javalec.outter4;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String config = null;
Scanner scanner = new Scanner(System.in);
String str = scanner.next();
if(str.equals("dev")) {
	config="dev";
}else if(str.equals("run")){
	config="run";
}
scanner.close();

GenericXmlApplicationContext ctx= new GenericXmlApplicationContext();
ctx.getEnvironment().setActiveProfiles(config);//config위치는 profile config의 이름에 따라서 바로 아래줄에서 load로 받아온 xml중 어느걸 쓸것인지 선택해줌 즉 현재 활성화된 프로파일이 무엇이냐
ctx.load("applicationCTX_dev.xml","applicationCTX_run.xml");
ctx.refresh();
ServerInfo info =ctx.getBean("serverInfo",ServerInfo.class);
System.out.println("ip:"+info.getIpNum());
System.out.println("port:"+info.getPortNum());
ctx.close();



	}

}
