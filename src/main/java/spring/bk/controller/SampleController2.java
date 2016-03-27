package spring.bk.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController2 {
	
	private static final Logger logger = 
			LoggerFactory.getLogger(SampleController2.class);

	
	/*
	 * String 형으로 리턴하면 
	 * 해당 string.jsp로 forward하게 된다..
	 */
	@RequestMapping("doC")
	public String doC( @ModelAttribute("msg") String msg){
		
		logger.info("doC called..............................");
		
		return "result";
		
	}
}


