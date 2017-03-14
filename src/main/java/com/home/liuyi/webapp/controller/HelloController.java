package com.home.liuyi.webapp.controller;

import com.home.liuyi.webapp.service.HelloBo;
import com.home.liuyi.webapp.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by liuyi on 17/3/2.
 */
@Controller
@RequestMapping(value = "/api")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public @ResponseBody
    HelloBo hello(@RequestParam("id")int id) {
        return helloService.getObject(id, "success");
    }

    @RequestMapping(value = "/hellodb", method = RequestMethod.GET)
    public @ResponseBody
    HelloBo hellodb(@RequestParam("id")int id) {
        return helloService.getFromDB(id);
    }
}