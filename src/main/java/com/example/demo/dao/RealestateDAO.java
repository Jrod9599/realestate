package com.example.demo.dao;

import com.example.demo.models.Realestate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RealestateDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Realestate> getAllProperty(){
        List<Realestate> temp = jdbcTemplate.query("Select h_street_address AS Address, h_city AS City, h_state AS State, h_owner AS Owner FROM realestate.Homes", new BeanPropertyRowMapper<>(Realestate.class));
        return temp;
    }

    public List<Realestate> getAvailableProperty(){
        List<Realestate> temp = jdbcTemplate.query("SELECT h_street_address AS Address, h_city AS City, h_state AS State, h_owner AS Owner FROM realestate.Homes WHERE h_Owner IS NULL", new BeanPropertyRowMapper<>(Realestate.class));
        return temp;
    }

    public List<Realestate> getAvailablePropertyByCity(String city){

        String tempArr[] = new String [1];
        tempArr[0] = city;

        List<Realestate> temp = jdbcTemplate.query("SELECT h_street_address AS Address, h_city AS City, h_state AS State, h_owner AS Owner FROM realestate.Homes WHERE h_Owner IS NULL AND h_city = ?", tempArr ,new BeanPropertyRowMapper<>(Realestate.class));
        return temp;
    }

    public void addNewProperty(Realestate realestate){

        String sql = "INSERT INTO realestate.Homes (h_street_address, h_city, h_state, h_owner) VALUES (?,?,?,?)";

        List<Object> arguments = new ArrayList<>();
        arguments.add(realestate.getAddress());
        arguments.add(realestate.getCity());
        arguments.add(realestate.getState());
        arguments.add(realestate.getOwner());

        jdbcTemplate.update(sql, arguments.toArray());

    }

    public void purchaseHome(Realestate realestate){

        String sql = "UPDATE realestate.Homes SET h_owner = ? WHERE h_street_address LIKE ? AND h_city = ? AND h_state = ?";
        List<Object> arguments = new ArrayList<>();

        arguments.add(realestate.getOwner());
        arguments.add(realestate.getAddress());
        arguments.add(realestate.getCity());
        arguments.add(realestate.getState());

        jdbcTemplate.update(sql, arguments.toArray());
    }

}
