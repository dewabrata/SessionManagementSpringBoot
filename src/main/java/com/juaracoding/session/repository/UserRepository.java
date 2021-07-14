package com.juaracoding.session.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juaracoding.session.entity.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long> {

}
