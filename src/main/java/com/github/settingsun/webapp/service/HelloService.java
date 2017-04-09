package com.github.settingsun.webapp.service;

import com.github.settingsun.webapp.domain.HelloDo;
import com.github.settingsun.webapp.domain.mapper.HelloMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by settingsun1225 on 17/3/2.
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
