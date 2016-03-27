package spring.bk.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class SampleController {

	private static final Logger logger = 
			LoggerFactory.getLogger(SampleController.class);
	
	
	/*
	 * void형 리턴의 경우
	 * views/'url'.jsp 
	 * 로 "forward" 된다.
	 */
	//@RequestMapping("doA")
	public void doA(){
		
		logger.info("doA called....................");
		
	}
	
	@RequestMapping("doB")
	public void doB(){
		
		logger.info("doB called....................");
		
	}
	
	
	@RequestMapping("doA")
	public void doA(@ModelAttribute("msg") String msg){
		
		logger.info("doA called....................");
		
	}
}


