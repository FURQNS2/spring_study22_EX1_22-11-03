package com.sycompany.test;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAop {

	@Pointcut("within(com.sycompany.test.Soldier)")  // 적용범위 설정
	private void pointcutMethod() {  // 임의로 메서드 작성
		
	}
	
	@Around("pointcutMethod()")   // 임의로 적은 메서드 안에 작성
	public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable {   //Object 모든 것의 가장 상위, 조상
	
		// 공통기능 시작
		String signatureStr = joinPoint.getSignature().toString();
		
		System.out.println(signatureStr + "메서드가 시작됨!!");
		System.out.println("**자기소개하기**");  // 공통기능
		
		
		try {
		Object obj = joinPoint.proceed();
		return obj;  
		}finally {
			System.out.println(signatureStr+" 종료되었습니다.");
		}
	}
	
}
