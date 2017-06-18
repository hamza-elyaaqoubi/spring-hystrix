package fr.spring.controller;

import fr.spring.service.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberController {

    private final NumberService numberService;

    @Autowired
    public NumberController(NumberService numberService) {
        this.numberService = numberService;
    }

    @GetMapping("number")
    public int get() throws Exception {
        return numberService.getNumber();
    }
}
