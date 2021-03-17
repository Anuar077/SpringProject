package com.example.midterm;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import com.example.midterm.entity.PersonJdbc;
import com.example.midterm.jdbc.PersonJdbcDao;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringdataApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringdataApplication.class, args);
    }

    @Autowired
    PersonJdbcDao personJdbcDao;

    @Override
    public void run(String... args) throws Exception {

        PersonJdbc a = new  PersonJdbc (103, "A", "AA");
        PersonJdbc  b = new  PersonJdbc (104, "B", "BB");
        PersonJdbc  c = new  PersonJdbc (105, "C", "CC");

        personJdbcDao.insert(a);
        personJdbcDao.insert(b);
        personJdbcDao.insert(c);

        System.out.println("   "+personJdbcDao.findAll());
    }
}

