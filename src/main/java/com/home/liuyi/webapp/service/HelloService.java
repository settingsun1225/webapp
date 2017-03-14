package com.home.liuyi.webapp.service;

import com.home.liuyi.webapp.domain.HelloDo;
import com.home.liuyi.webapp.domain.mapper.HelloMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by liuyi on 17/3/2.
 */
@Service
public class HelloService {
    @Autowired
    private HelloMapper helloMapper;

    public HelloBo getObject(int id, String msg) {
        return new HelloBo(id, msg);
    }

    public HelloBo getFromDB(int id) {
        HelloDo helloDO = helloMapper.selectById(id);
        HelloBo helloBO = new HelloBo();
        helloBO.setId(helloDO.getId());
        helloBO.setMsg("type=" + helloDO.getType());
        return helloBO;
    }
}
