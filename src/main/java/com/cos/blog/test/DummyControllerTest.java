package com.cos.blog.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cos.blog.model.RoleType;
import com.cos.blog.model.User;
import com.cos.blog.repository.UserRepository;

@RestController
public class DummyControllerTest {
	@Autowired
	private UserRepository userRepository;
	
	//http://localhost:8000/blog/dummy/join
	@PostMapping("/dummy/join")
	public String join(User user) {
		System.out.println("username:"+ user.getUsername());
		System.out.println("password: "+ user.getPassword());
		System.out.println("email:" + user.getEmail());
		
		userRepository.save(RoleType.USER);
		return "회원가입 완료되었습니다";
	}
}
