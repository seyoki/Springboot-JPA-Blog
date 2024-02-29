package com.cos.blog.model;

import java.sql.Timestamp;
import java.util.function.Supplier;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
//@DynamicInsert
@Data
@Entity //user클래스가 Mysql에 테이블생성이된다
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)//DB 넘버링전략을 따라가게된다
	private int id; //시퀀스 ,auto-increment
	
	@Column(nullable =false, length=30)
	private String username; //아이디
	
	@Column(nullable=false, length=100)//123456=> 해쉬(비밀번호암호화)
	private String password;
	
	@Column(nullable=false, length=50)
	private String email;
	
	//@ColumnDefault("user")
	//db는 roleType이라는게 없다
	private RoleType role; //Enum을 쓴는게좋다//admin,user,manager(managerment)
	
	@CreationTimestamp //시간이 자동입력되게
	private Timestamp createDate;

	public User getId() {
		return null;
	}

	public String getUsername() {
		return null;
	}

	public String getPassword() {
		return null;
	}


	public void setRole(RoleType user) {
		
	}

	public void setRole(String string) {
		// TODO Auto-generated method stub
		
	}


}
