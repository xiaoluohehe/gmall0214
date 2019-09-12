package com.luofu.gmall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.service.UserService;
import com.luofu.gmall.bean.UserInfo;
import com.luofu.gmall.user.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserInfoMapper userInfoMapper;

    public List<UserInfo> userInfoList() {
        return userInfoMapper.selectAll();
    }
}
