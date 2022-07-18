package com.example.loanapp.controllers;

import com.example.loanapp.models.AppUser;
import com.example.loanapp.services.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1")
public class AppUserController {

    private final AppUserService appUserService;

    @Autowired
    public AppUserController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }


    @GetMapping(path = "/users")
    public List<AppUser> getUsers(){
        return appUserService.getAllUsers();
    }

    @PostMapping(path= "/user")
    public void postUser(@RequestBody AppUser user){
        appUserService.createUser(user);
    }

    @GetMapping(path="/users/search")
    public ResponseEntity<List<AppUser>> searchUser(@RequestParam("query") String query){
        return ResponseEntity.ok(appUserService.searchUser(query));
    }
}
