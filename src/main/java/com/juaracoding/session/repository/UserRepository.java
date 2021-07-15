package com.juaracoding.session.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.juaracoding.session.entity.UserModel;

public interface UserRepository extends CrudRepository<UserModel, Long> {
	 
	
	@Query("select u from UserModel u where u.username = :username")
	public UserModel getUserByUsername(@Param ("username") String username);
	

}
