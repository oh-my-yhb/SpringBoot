package com.example.springboot.service.impl;

import com.example.springboot.common.Result;
import com.example.springboot.service.LoginService;
import org.springframework.stereotype.Service;

/**
 * @author yan hongbo
 * @date 2019/11/12 16:15
 * @description
 */
@Service("loginservice")
public class LoginServiceImpl implements LoginService {


    @Override
    public Result userLogin(String username, String password) {
        return null;
    }

    @Override
    public Result updatePassword(String prePassword, String newPassword) {
        return null;
    }

    @Override
    public Result forgetPasswordByPhone(String username, String phone) {
        return null;
    }

    @Override
    public Result forgetPasswordByEmail(String username, String email) {
        return null;
    }
}
