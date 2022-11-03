package com.sycompany.val;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class MemberValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) { // 검증할 객체의 클래스 타입정보
		
		return MemberDto.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub

		MemberDto memberDto = (MemberDto) target;
//		
//		String memberid = memberDto.getId();
//		int memberpw = memberDto.getPw();
//		
//		if(memberid == null || memberid.trim().isEmpty()) {  //String이고, trim().isEmpty() => 스페이스바나 엔터가 안 쳐지도록 만듦
//			errors.rejectValue("id", "trouble");
//		} 
//		
//		if(memberpw == 0) {  // int여서 입력되지 않으면  = 0이 같
//			errors.rejectValue("pw", "trouble");
//		} 
//		
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "trouble");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pw", "trouble");
		
	}

}
