package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Users {

    @Column(name = "iduser")
    private Integer iduser;
    @Column(name = "name")
    private String name;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "login")
    private String Login;
    @Column(name = "password")
    private String Password;
    @Column(name = "rank")
    private Integer Rank;
    @Column(name = "pesel")
    private Integer Pesel;

    public Integer getIduser(){return iduser;}

    public void setIduser(Integer iduser){this.iduser = iduser;}

    public String getName(){return name;}

    public void setName(String name){this.name = name;}

    public String getLastName(){return lastname;}

    public void setLastName(String lastname){this.lastname = lastname;}

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

    public Integer getPesel() {return Pesel;}

    public void setPesel(Integer Pesel) {this.Pesel = Pesel;}
}
