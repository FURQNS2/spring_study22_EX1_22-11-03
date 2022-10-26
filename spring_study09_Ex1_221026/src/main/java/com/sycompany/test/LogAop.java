package com.sycompany.test;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {

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
