package com.hypeone.logmonitoring.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/server-status")
public class ServerStatusController {


    @PostMapping
    public void getStatus() {
       return;
    }

}
