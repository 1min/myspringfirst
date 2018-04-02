package outsidefile;

import java.io.IOException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConfigurableApplicationContext ctx = new GenericApplicationContext();
		ConfigurableEnvironment env = ctx.getEnvironment();
		
		MutablePropertySources propertySources = env.getPropertySources();
		
		try {
			propertySources.addLast(new ResourcePropertySource("classpath:admin.properties"));
			System.out.println("admin.id");
			System.out.println("admin.pw");
		}catch (IOException e) {}
		
		
	}

}
