package com.zhijie.manage.controller;

import com.zhijie.manage.model.AppUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Api(value = "/test", tags = "测试接口")  //swagger分类标题注解
public class TestController {
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "测试接口", notes = "自定义请求头sessionId，sessionId的值是登陆接口返回的")
    public String test(AppUser user){
        return "Hello Springbootxxxx1111222333444!!!";
    }


}
