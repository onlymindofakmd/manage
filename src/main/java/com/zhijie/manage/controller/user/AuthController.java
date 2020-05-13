package com.zhijie.manage.controller.user;

import com.zhijie.manage.controller.CommonController;
import com.zhijie.manage.dict.ReturnStatus;
import com.zhijie.manage.model.AppMenu;
import com.zhijie.manage.model.AppMenuButton;
import com.zhijie.manage.model.AppRole;
import com.zhijie.manage.service.AuthService;
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
@RequestMapping(value = "/auth")
@Api(value = "/auth", tags = "权限接口")
public class AuthController extends CommonController {

    @Autowired
    private AuthService authService;

    @RequestMapping(value = "/addMenu",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "新增菜单", notes = "增加新的菜单项")
    public ReturnMessage addMenu(AppMenu appMenu) {

        return retSuccess();
    }

    @RequestMapping(value = "/updateMenu",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "更新菜单", notes = "更新菜单内容")
    public ReturnMessage updateMenu(AppMenu appMenu) {

        return retSuccess();
    }

    @RequestMapping(value = "/deleteMenu",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "删除菜单", notes = "删除菜单项")
    public ReturnMessage deleteMenu(@ApiParam(name = "menuId", value = "菜单Id")String menuId) {

        return retSuccess();
    }

    @RequestMapping(value = "/addRole",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "新增角色", notes = "增加新的角色")
    public ReturnMessage addRole(AppRole appRole) {

        return retSuccess();
    }

    @RequestMapping(value = "/updateRole",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "更新角色", notes = "更新角色")
    public ReturnMessage updateRole(AppRole appRole) {

        return retSuccess();
    }

    @RequestMapping(value = "/deleteRole",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "删除角色", notes = "删除角色")
    public ReturnMessage deleteRole(@ApiParam(name = "roleId", value = "角色Id")String roleId) {

        return retSuccess();
    }

    @RequestMapping(value = "/addMenuButton",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "新增菜单按钮", notes = "增加新的菜单按钮")
    public ReturnMessage addMenuButton(AppMenuButton appMenuButton) {

        return retSuccess();
    }

    @RequestMapping(value = "/updateMenuButton",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "更新菜单按钮", notes = "更新菜单按钮")
    public ReturnMessage updateMenuButton(AppMenuButton appMenuButton) {

        return retSuccess();
    }

    @RequestMapping(value = "/deleteMenuButton",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "删除菜单按钮", notes = "删除菜单按钮")
    public ReturnMessage deleteMenuButton(@ApiParam(name = "menuButtonId", value = "菜单按钮Id")String menuButtonId) {

        return retSuccess();
    }

    @RequestMapping(value = "/addRoleMenu",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "新增菜单按钮", notes = "增加新的菜单按钮")
    public ReturnMessage addRoleMenu(AppMenuButton appMenuButton) {

        return retSuccess();
    }

}
