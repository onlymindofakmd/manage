package com.zhijie.manage.service;

import com.zhijie.manage.model.AppMenu;
import com.zhijie.manage.model.AppMenuButton;
import com.zhijie.manage.model.AppRole;
import com.zhijie.manage.model.AppRoleMenu;
import com.zhijie.manage.repository.AppMenuButtonRepository;
import com.zhijie.manage.repository.AppMenuRepository;
import com.zhijie.manage.repository.AppRoleMenuRepository;
import com.zhijie.manage.repository.AppRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private AppMenuRepository appMenuRepository;

    @Autowired
    private AppMenuButtonRepository appMenuButtonRepository;

    @Autowired
    private AppRoleRepository appRoleRepository;

    @Autowired
    private AppRoleMenuRepository appRoleMenuRepository;

    public void addMenu(AppMenu appMenu) {
        //TODO set id

        appMenuRepository.save(appMenu);
    }

    public void updateMenu(AppMenu appMenu) {
        //TODO set properties of app_menu

        appMenuRepository.save(appMenu);
    }

    public void deleteMenu(String menuId) {
        appMenuRepository.deleteById(menuId);
        appRoleMenuRepository.deleteByMenuId(menuId);
        appMenuButtonRepository.deleteByMenuId(menuId);
    }

    public void addRole(AppRole appRole) {

        appRoleRepository.save(appRole);
    }

    public void updateRole(AppRole appRole) {

        appRoleRepository.save(appRole);
    }

    public void deleteRole(String roleId) {
        appRoleRepository.deleteById(roleId);
        appRoleMenuRepository.deleteByRoleId(roleId);
    }

    public void addMenuButton(AppMenuButton appMenuButton) {
        appMenuButtonRepository.save(appMenuButton);
    }

    public void updateMenuButton(AppMenuButton appMenuButton) {
        appMenuButtonRepository.save(appMenuButton);
    }

    public void deleteMenuButton(String menuButtonId) {
        appMenuButtonRepository.deleteById(menuButtonId);
    }

    public void setRoleMenu(AppRoleMenu appRoleMenu) {
        appRoleMenuRepository.deleteByRoleId(appRoleMenu.getRoleId());
        appRoleMenuRepository.save(appRoleMenu);
    }



}
