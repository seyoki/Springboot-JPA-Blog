package com.cos.blog.repository;
import com.cos.blog.model.RoleType;
import com.cos.blog.model.User;

public interface UserRepository extends JpaRepository<User,Integer>{

	void save(RoleType user);

		

}
