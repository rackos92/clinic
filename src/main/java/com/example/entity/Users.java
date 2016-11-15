package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Users {

    @Column(name = "login")
    private String Login;
    @Column(name = "password")
    private String Password;
    @Column(name = "rank");
    private Integer Rank;

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Pasword) {
        this.Password = Password;
    }

    public Integer getRank() {
        return Rank;
    }

    public void setRank(Integer Rank) {
        this.Rank = Rank;
    }
    
}
