package spring.bk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import spring.bk.domain.ProductVO;

@Controller
public class SampleController5 {

	
	/*
	 * 리턴형에 @ResponseBody를 사용하면
	 * 리턴하려는 객체를 JSON 형태로 리턴할 수 있다.
	 */
	@RequestMapping("/doJSON")
	public @ResponseBody ProductVO doJSON(){
		
		ProductVO vo = new ProductVO("샘플상품",30000);
		
		return vo;
		
	}
}
