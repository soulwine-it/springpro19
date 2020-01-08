package com.spring.ex03;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class MemberTest01 {
	public static void main(String[] args) {
							// 실행 시 member.xml에 설정한 대로 빈을 생성한 후 주입합니다.
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("member.xml"));
								//id가 memberService인 빈을 가져옵니다.
		MemberService service = (MemberService) factory.getBean("memberService");
		service.listMembers();
	}
}
