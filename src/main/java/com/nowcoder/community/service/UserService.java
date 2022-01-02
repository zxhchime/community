package com.nowcoder.community.service;

import com.nowcoder.community.dao.UserDao;
import com.nowcoder.community.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public User findUserById(int id){
        return userDao.selectById(id);
    }

}
