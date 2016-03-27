package spring.bk.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SampleController4 {
	
	private static final Logger logger = 
			LoggerFactory.getLogger(SampleController4.class);

	
	/*
	 *  RedirectAttributes 객체를 사용해서
	 *    리다이렉트로 인자 전달이 가능하다.
	 *    
	 *    포워드의 경우는 Model 객체를 사용한다.
	 */
	@RequestMapping("/doE")
	public String doE(RedirectAttributes rttr){
		logger.info("doE called but redirect to /doF.............");
		
		rttr.addFlashAttribute("msg", "This is the Message!! with redirected");
		
		
		return "redirect:/doF";
	}
	
	
	
	//@RequestMapping("/doE")
	public String doE1(Model model){
		logger.info("doE called but redirect to /doF.............");
		
		//rttr.addFlashAttribute("msg", "This is the Message!! with redirected");
		model.addAttribute("msg", "hello");
		
		return "forward:/doF";
	}
	
	
	
	@RequestMapping("/doF")
	public void doF(@ModelAttribute("msg") String msg){
		
		logger.info("doF called..............."+ msg);
	}
}


