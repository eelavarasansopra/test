package com.myspace.controller;

import com.myspace.model.UserInfo;
import com.myspace.service.UserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/")
public class UserManagementController {

    private UserManagementService userManagementService;

    @PostMapping("/onboard")
    public void onboardUser(@RequestBody UserInfo userInfo){
        userManagementService.onboardUser(userInfo);
    };




}
