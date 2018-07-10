package com.example.demo.dao;

import com.example.demo.models.Realestate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RealestateDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Realestate> getAllProperty(){
        List<Realestate> temp = jdbcTemplate.query("Select * FROM realestate.test_table", new BeanPropertyRowMapper<>(Realestate.class));
        return temp;
    }


}
