package com.lxh.service.six.service;

import com.alibaba.fastjson.JSON;
import com.lxh.six.SixApplication;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,classes = SixApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public abstract class AbstractTestBase {

    protected void printJson(Object obj) {
        System.out.println(JSON.toJSONString(obj));
    }
}
