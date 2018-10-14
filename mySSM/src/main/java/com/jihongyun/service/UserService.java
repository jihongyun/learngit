package com.jihongyun.service;

import com.jihongyun.base.BaseService;
import com.jihongyun.dao.UserMapper;
import com.jihongyun.po.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService extends BaseService<User>{
    @Resource
    private UserMapper userMapper;
}
