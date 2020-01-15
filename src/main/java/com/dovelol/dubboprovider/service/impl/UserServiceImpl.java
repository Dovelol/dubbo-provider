package com.dovelol.dubboprovider.service.impl;

import com.dovelol.dubboprovider.interfaces.UserShareService;
import com.dovelol.dubboprovider.entity.User;

/**
 * @author Dovelol
 * @date 2020/1/13 22:39
 */
public class UserServiceImpl implements UserShareService {


    @Override
    public User getById(Long id) {
        return new User();
    }
}
