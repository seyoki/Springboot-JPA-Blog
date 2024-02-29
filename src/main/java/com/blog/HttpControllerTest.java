package com.blog;



import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cos.blog.test.Member;
@RestController
public class HttpControllerTest {

	//http://localhost:8000/http/get(select)
	@GetMapping("http/get")
	public String getTest(Member m) { //id=1&username=ssar&password=1234&email=ssar@nate.com
		return "get요청 :"+ m.getId()+","+m.getUsername()+","+m.getPassword()+","+m.getEmail();
	}
	//http://localhost:8000/http/post(insert)
	@PostMapping("http/post")
	public String PostTest(@RequestBody Member m) {
		return "post요청 :"+m.getId()+","+m.getUsername()+","+m.getPassword()+","+m.getEmail();
	}
	//http://localhost:8000/http/put(update)
	@PutMapping("/http/put")
	public String PutTest(Member m) {
		return "put요청 :"+m.getId()+","+m.getUsername()+","+m.getPassword()+","+m.getEmail();
	}
	//http://localhost:8000/delete(delete)
	@DeleteMapping("/http/delete")
	public String DeleteTest() {
		return "Delete요청 :";
	}

}
