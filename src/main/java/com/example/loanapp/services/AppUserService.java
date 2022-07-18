package com.example.loanapp.services;

import com.example.loanapp.models.AppUser;
import com.example.loanapp.repository.AppUserRepository;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppUserService {
    public final AppUserRepository appUserRepository;

    @Autowired
    public AppUserService(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    public List<AppUser> getAllUsers() {
        return appUserRepository.findAll();
    }
    public List<AppUser> searchUser(String query){
        List<AppUser> result = appUserRepository.searchUsers(query);
        return result;
    }


    public void createUser(AppUser appUser){
        System.out.println(appUser);
        appUserRepository.save(appUser);
    }

}
