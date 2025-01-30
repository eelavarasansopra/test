package com.myspace.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myspace.model.UserInfo;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo,String> {

	    Optional<UserInfo> findByFirstName(String firstName);

}
