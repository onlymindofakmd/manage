package com.zhijie.manage.repository;

import com.zhijie.manage.model.AppMenuButton;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppMenuButtonRepository extends JpaRepository<AppMenuButton, String> {
    void deleteByMenuId(String menuId);
}
