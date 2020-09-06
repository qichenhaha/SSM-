package com.heidan.dao;

import com.heidan.model.User;

public interface IUserDao {

    User selectUser(long id);
}
