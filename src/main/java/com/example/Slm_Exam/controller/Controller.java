package com.example.Slm_Exam.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("/modify")
    public String modifyString(String string){
        StringBuilder modifiedString = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);

            if (i % 2 == 1) {
                c = Character.toUpperCase(c);
            }

            modifiedString.append(c);
        }

        return modifiedString.toString();
    }
}
