package com.example.demo.controller;

import com.example.demo.models.Realestate;
import com.example.demo.services.RealestateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class realestateController {

    @Autowired
    RealestateService realestateService;

    @CrossOrigin
    @RequestMapping("/getAllProperty")
    public List<Realestate> getAllProperty(){
        return realestateService.getAllProperty();
    }

    @CrossOrigin
    @RequestMapping("/sanity")
    public String sanityCheck(){
        return "You are sane";
    }

}
