package javalec.javaprofile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javalec.outter4.ServerInfo;

@Configuration
@Profile("run")
public class ApplicationConfigRun {

@Bean
public ServerInfo serverInfo() {
	ServerInfo info = new ServerInfo();
	info.setIpNum("213.186.229.29");
	info.setPortNum("80");
	return info;
}




}
