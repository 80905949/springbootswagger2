package com.tao.springboot.action;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/says",method = RequestMethod.GET)
public class sayHello {
    /**
     * 根据用户名说hello
     * @param name
     * @return
     */
    @ApiOperation(value="say hello", notes="根据url的name来say hello!")
    @ApiImplicitParam(name = "name", value = "用户名称", required = true, dataType = "String", paramType = "path")
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(String name){
        return name+" hello";
    }
}
