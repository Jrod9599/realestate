package com.example.demo.services;

import com.example.demo.dao.RealestateDAO;
import com.example.demo.models.Realestate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RealestateService {

    @Autowired
    RealestateDAO realestateDAO;

    public List<Realestate> getAllProperty(){
        return realestateDAO.getAllProperty();
    }

    public List<Realestate> getAvailableProperty(){
        return realestateDAO.getAvailableProperty();
    }

    public List<Realestate> getAvailablePropertyByCity(String city){
        return  realestateDAO.getAvailablePropertyByCity(city);
    }

    public void addNewProperty(Realestate realestate){
        realestateDAO.addNewProperty(realestate);
    }

    public void purchaseHome(Realestate realestate){
        realestateDAO.purchaseHome(realestate);
    }

}
