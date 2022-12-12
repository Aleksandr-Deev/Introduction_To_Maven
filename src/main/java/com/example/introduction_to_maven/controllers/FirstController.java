package com.example.introduction_to_maven.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping
    public String helloWorld() {
        return "Приложение запущенно";
    }

    @GetMapping("/info")
    public String page() {
        return "Деев Александр Владимирович. Проект Maven. Создан 10.12.2022г." +
                " Сборщик Maven собирает web приложения на Java!!!";
    }
}
