package spring.bk.service;

import spring.bk.domain.MemberVO;

public interface MemberService {

	public String getTime();
	
	public void insertMember(MemberVO vo);

	public MemberVO readMember(String userid)throws Exception;
  
	public MemberVO readWithPW(String userid, 
				String userpw)throws Exception;


}
