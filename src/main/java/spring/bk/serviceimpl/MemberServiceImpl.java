package spring.bk.serviceimpl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import spring.bk.dao.MemberDAO;
import spring.bk.domain.MemberVO;
import spring.bk.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {

  @Inject
  private MemberDAO dao;

@Override
public String getTime() {
	// TODO Auto-generated method stub
	return dao.getTime();
}

@Override
public void insertMember(MemberVO vo) {
	// TODO Auto-generated method stub
	dao.insertMember(vo);
}

@Override
public MemberVO readMember(String userid) throws Exception {
	// TODO Auto-generated method stub
	return dao.readMember(userid);
}

@Override
public MemberVO readWithPW(String userid, String userpw) throws Exception {
	// TODO Auto-generated method stub
	return dao.readWithPW(userid, userpw);
}

}
