package com.zhijie.manage.repository;

import com.zhijie.manage.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, String> {
    AppUser findByLoginName(String loginName);
}
