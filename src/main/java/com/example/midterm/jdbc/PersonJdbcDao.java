package com.example.midterm.jdbc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import  com.example.midterm.entity.PersonJdbc;
import java.util.List;

@Repository
public class PersonJdbcDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<PersonJdbc> findAll() {
        List<PersonJdbc> people = jdbcTemplate.query("select * from users",
                new BeanPropertyRowMapper<>(PersonJdbc.class));

        return people;
    }

    public int insert(PersonJdbc personJdbc) {
        return jdbcTemplate.update("insert into users " +
                        "(user_id, user_name, user_password) " +
                        "values (?,?,?)",
                new Object[]{
                        personJdbc.getId(), personJdbc.getLogin(), personJdbc.getPassword()
                });
    }

}
