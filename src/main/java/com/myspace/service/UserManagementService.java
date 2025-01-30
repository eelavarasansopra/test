package com.myspace.service;

import com.myspace.model.UserInfo;
import org.springframework.stereotype.Service;


@Service
public interface UserManagementService {


       public void onboardUser(UserInfo userInfo);

       public void modifyUser();

       public void deleteUser();

}
