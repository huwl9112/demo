package com.hu.demo;

import com.alibaba.fastjson.JSON;
import com.hu.demo.service.OperationLogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class DemoApplicationTests {

    @Autowired
    private OperationLogService operationLogService;


    @Test
    public void contextLoads() {
        System.out.println(JSON.toJSONString(operationLogService.selectList(null)));
    }}
