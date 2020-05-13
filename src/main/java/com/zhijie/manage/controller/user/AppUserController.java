package com.zhijie.manage.controller.user;

import com.zhijie.manage.controller.CommonController;
import com.zhijie.manage.dict.ReturnStatus;
import com.zhijie.manage.model.AppUser;
import com.zhijie.manage.service.AppUserService;
import com.zhijie.manage.vo.ReturnMessage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/user")
@Api(value = "/user", tags = "用户接口")  //swagger分类标题注解
public class AppUserController extends CommonController {
    @Autowired
    private AppUserService appUserService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "用户登录", notes = "根据用户名密码进行登录")
    public ReturnMessage login(
            @ApiParam(name = "loginName", value = "登录名")String loginName,
            @ApiParam(name = "password", value = "密码")String password) {
        if (appUserService.login(loginName, password)) {
            return retSuccess();
        }
        return retFail("用户名或密码错误！");
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "新增用户", notes = "添加新的用户")
    public ReturnMessage addUser(AppUser user) {
        appUserService.save(user);
        return retSuccess();
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "更新用户", notes = "更新用户信息")
    public ReturnMessage updateUser(AppUser user) {
        appUserService.update(user);
        return retSuccess();
    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "删除用户", notes = "删除用户信息")
    public ReturnMessage deleteUser(@ApiParam(name = "userId", value = "用户Id")String userId) {
        appUserService.delete(userId);
        return retSuccess();
    }
}