package aopEx;

import org.aspectj.lang.ProceedingJoinPoint;

import ch.qos.logback.core.net.SyslogOutputStream;

public class LogAop {
	
	
	
	public Object loggerAop(ProceedingJoinPoint joinpoint)throws Throwable{//joinpoint는 핵심기능 메소드 자체가 프록시
		
		String signatureStr = joinpoint.getSignature().toShortString();//joinpoint의 핵심 기능 메소드명을 String으로 반환
		System.out.println(signatureStr+"is start");//공통기능
		long st = System.currentTimeMillis();//실행시간용 시작
		
		try {
			Object obj = joinpoint.proceed();//진짜 타겟 즉 핵심기능이 실행되는 부분
			return obj;
		}finally{
			long et =System.currentTimeMillis();//실행시간용 종료
			System.out.println(signatureStr+"is finished");//공통기능
			System.out.println(signatureStr+"경과시간"+(et-st));//경과시간 구하기
		}
		
		
		
	}

}
