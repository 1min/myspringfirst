package javalec.outter3;

import org.aspectj.apache.bcel.util.ClassPath;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


@Configuration
public class ApplicationConfig {
@Value("${admin.id}")
	private String adminId;
@Value("${admin.pw}")
	private String adminPw;
@Value("${sub_admin.id}")
	private String sub_adminId;
@Value("${sub_admin.pw}")
	private String sub_adminPw;

@Bean
public static PropertySourcesPlaceholderConfigurer Properties() {
	PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
	
	Resource[] locations = new Resource[2];//외부파일 넣을 리소스 2개크기
	locations[0] = new ClassPathResource("admin.properties");//외부파일 위치값
	locations[1] = new ClassPathResource("sub_admin.properties");//외부파일 위치값
	configurer.setLocations(locations);//외부파일위치값 장착

	return configurer;
}
@Bean
public AdminConnection adminConfig() {//메소드이름이 빈 인스턴스의 이름이된다
	AdminConnection adminConnection = new AdminConnection();
	adminConnection.setAdminId(adminId);//set함수로 위에서 불러온 외부파일의 필드를 넣어줌
	adminConnection.setAdminPw(adminPw);
	adminConnection.setSub_adminId(sub_adminId);
	adminConnection.setSub_adminPw(sub_adminPw);
	return adminConnection;
}




}
