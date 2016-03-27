package spring.bk.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.bk.domain.SampleVO;


/*
 *  REST방식은 요청에 대해 요청에 대한 리소스만 응답 하는 방
 *  ajax 요청에서 많이 사용하게 된다.
 *  
 *  REST테스트 시에는 크롬의 Advanced REST Client 확장 프로그램을 사용하면 좋다!
 */
@RestController
@RequestMapping("sample")
public class RestTestController {
	
	/*
	 *  리턴형의 데이터를 그대로 요청한 곳으로 보내게 된다
	 *  즉, 문자열 자체로 응답하게 된다.
	 *  
	 *  일반 컨트롤러의 경우 일반 문자열은
	 *  문자열.jsp를 의미하지만, 
	 *  
	 *  REST컨트롤러의 경우 
	 *  문자열 자체를 의미한다.
	 */
	@RequestMapping("/hello")
	public String sayHello(){
		return "Yejin hello";
	}
	
	
	/*
	 * 일반 객체를 리턴할 시 
	 * JSON형태로 응답하게 된다.
	 * 
	 * 이때 jackson core가 반드시 필요하다.
	 */
	@RequestMapping("/sendVO")
	public SampleVO sendVO(){
		SampleVO vo = new SampleVO();
		vo.setFirstname("kildong");
		vo.setLastName("hong");
		vo.setMno(123);
		
		return vo;
	}
	
	@RequestMapping("/sendList")
	public List<SampleVO> sendList(){
		List<SampleVO> list = new ArrayList<SampleVO>();
		
		for(int i=0; i<10; i++){
			SampleVO vo = new SampleVO();
			vo.setFirstname("kildong");
			vo.setLastName("hong");;
			vo.setMno(123);
			list.add(vo);
		}
		
		return list;
	}
	
	@RequestMapping("/sendMap")
	public Map<Integer, SampleVO> sendMap(){
		Map<Integer, SampleVO> map = new HashMap<Integer, SampleVO>();
		
		for(int i=0; i<10; i++){
			SampleVO vo = new SampleVO();
			vo.setFirstname("kildong");
			vo.setLastName("hong");;
			vo.setMno(123);
			map.put(i, vo);
		}
		
		return map;
	}
	
	
	/*
	 *  ResponseEntity를 사용해서
	 *  요청에 대한 응답 데이터와 동시에 상태코드를 보낼 수 있다.
	 *  
	 *  상태코드만 보낼 수도 있다.
	 */
	
	@RequestMapping("/sendErrorAuth")
	public ResponseEntity<Void> sendListAuth(){
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	
	
	/*
	 *  리스트와 함께 상태코드를 보낼 수도 있다.
	 */
	@RequestMapping("/sendErrorNot")
	public ResponseEntity<List<SampleVO>> sendListNot(){
			
		List<SampleVO> list = new ArrayList<SampleVO>();
		
		for(int i=0; i<10; i++){
			SampleVO vo = new SampleVO();
			vo.setFirstname("kildong");
			vo.setLastName("hong");;
			vo.setMno(123);
			list.add(vo);
		}
		return new ResponseEntity<>(list, HttpStatus.NOT_FOUND);
	}
}
