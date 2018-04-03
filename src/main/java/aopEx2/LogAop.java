package aopEx2;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAop {

	@Pointcut("within(aopEx2.*)")
	private void porintcutMethod() {
		
	}
	
	
	
	
	
	
}
