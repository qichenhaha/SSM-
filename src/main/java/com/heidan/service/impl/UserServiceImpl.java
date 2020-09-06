package com.heidan.service.impl;

import com.heidan.dao.IUserDao;
import com.heidan.model.User;
import com.heidan.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    public User selectUser(long userId) {
        return userDao.selectUser(userId);
    }
}
