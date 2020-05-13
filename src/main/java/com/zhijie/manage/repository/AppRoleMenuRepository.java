package com.zhijie.manage.repository;

import com.zhijie.manage.model.AppRoleMenu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleMenuRepository extends JpaRepository<AppRoleMenu, String> {
    void deleteByMenuId(String menuId);
    void deleteByRoleId(String roleId);
}
