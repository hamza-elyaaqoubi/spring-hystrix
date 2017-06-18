package fr.spring.controller;

import fr.spring.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

    private final UsersService users;

    @Autowired
    public UsersController(UsersService users) {
        this.users = users;
    }

    @GetMapping("users")
    public int fetch() throws Exception {
        return users.fetchUserId();
    }
}
