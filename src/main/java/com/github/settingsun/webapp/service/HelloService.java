package com.github.settingsun.webapp.service;

import com.github.settingsun.webapp.domain.HelloDo;
import com.github.settingsun.webapp.domain.mapper.HelloMapper;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by settingsun1225 on 17/3/2.
 */
@Service
public class HelloService {
    @Resource
    private HelloMapper helloMapper;

    public HelloBo getObject(int id, String msg) {
        return new HelloBo(id, msg);
    }

//    @Cacheable(value = "getHello")
    public HelloBo get(int id) {
        System.out.println("get: id=" + id);
        HelloDo helloDO = getFromDB(id);
        HelloBo helloBO = new HelloBo();
        helloBO.setId(helloDO.getId());
        helloBO.setMsg("type=" + helloDO.getType());
        return helloBO;
    }

    @Cacheable(value = "hello")
    public HelloDo getFromDB(int id) {
        System.out.println("get from db: id=" + id);
        return helloMapper.selectById(id);
    }
}