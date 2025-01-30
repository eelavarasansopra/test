package com.myspace.impl;

import com.myspace.model.UserInfo;
import com.myspace.repo.UserInfoRepository;
import com.myspace.service.UserManagementService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserManagementServiceImpl implements UserManagementService {

    @Autowired
    private UserInfoRepository userInfoRepository;
    @Override
    public void onboardUser(UserInfo userInfo) {
        userInfoRepository.save(userInfo);
    }

    @Override
    public void modifyUser() {

    }

    @Override
    public void deleteUser() {

    }
}
