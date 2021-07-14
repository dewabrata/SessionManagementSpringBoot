package com.juaracoding.session.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.context.properties.ConstructorBinding;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor


@Entity
@Table(name = "users")
public class UserModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, unique = true, length=45)
	private String username;
	@Column(nullable = false, length=100)
	private String password;
	@Column(length=45)
	private String fullname;
	@Column(nullable = false, length=50)
	private String email;
	private String gender;
	private String day;
	private String month;
	private String year;
	
	

}
