package com.mzbloc.elasticsearch.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.mzbloc.elasticsearch.service.TestService;
import org.springframework.stereotype.Component;


/**
 * Created by tanxw on 2018/12/26.
 */
@Service(interfaceClass = TestService.class)
public class TestServiceImpl implements TestService{


    @Override
    public String say(){
        return "devintam,hello world";
    }
}
