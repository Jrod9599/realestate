package com.example.demo.controller;

import com.example.demo.models.Realestate;
import com.example.demo.services.RealestateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class realestateController {

    @Autowired
    RealestateService realestateService;

    @CrossOrigin
    @RequestMapping("/sanity")
    public String sanityCheck(){
        return "You are sane";
    }

    @CrossOrigin
    @RequestMapping("/getAllProperty")
    public List<Realestate> getAllProperty(){
        return realestateService.getAllProperty();
    }

    @CrossOrigin
    @RequestMapping("/getAvailableProperty")
    public List<Realestate> getAvailableProperty(){
        return realestateService.getAvailableProperty();
    }

    @CrossOrigin
    @RequestMapping("/getAvailablePropertyByCity")
    public List<Realestate> getAvailablePropertyByCity(@RequestBody String city){
        return realestateService.getAvailablePropertyByCity(city);
    }

    @CrossOrigin
    @PostMapping("/addNewProperty")
    public void addNewProperty(@RequestBody Realestate realestate){
        realestateService.addNewProperty(realestate);
    }

    @CrossOrigin
    @PostMapping("/purchase")
    public void purchaseHome(@RequestBody Realestate realestate){
        realestateService.purchaseHome(realestate);
    }

}
