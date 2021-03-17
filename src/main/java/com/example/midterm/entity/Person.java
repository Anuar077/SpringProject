package com.example.midterm.entity;
import javax.persistence.*;

@Entity
@Table(name = "users")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String login;
    private String password;
    private String address;

    public Person(String login, String password, String address) {
        this.login = login;
        this.password = password;
        this.address = address;
    }

    public Person() { }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}