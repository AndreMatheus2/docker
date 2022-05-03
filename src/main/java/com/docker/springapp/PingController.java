package com.docker.springapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ping")
public class PingController {

    public void ping(){
        System.out.println("Tudo funcionando!");
    }
}
