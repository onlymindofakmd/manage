package com.zhijie.manage.service;

import com.zhijie.manage.model.AppUser;
import com.zhijie.manage.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppUserService {
    @Autowired
    private AppUserRepository appUserRepository;

    public boolean login(String loginName, String password) {
        AppUser appUser = appUserRepository.findByLoginName(loginName);
        return appUser.getPassword().equals(password);
    }

    public void save(AppUser appUser) {
        appUser.setId("");
        appUserRepository.save(appUser);
    }

    public void update(AppUser user) {
        AppUser temp = appUserRepository.getOne(user.getId());
        //TODO set temp

        appUserRepository.save(temp);
    }

    public void delete(String userId) {
        appUserRepository.deleteById(userId);
    }
}
