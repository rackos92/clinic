package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "doctor")
public class Doctor extends Person{

    @ManyToOne
    @JoinColumn(name = "idspec")
    private Specialization IdSpec;
    
    @OneToOne (cascade=CascadeType.ALL)
    @JoinColumn(name = "login")
    private Users login;
    
    public Specialization getIdSpec() {
    	return this.IdSpec;
    }
    public void setIdSpec(Specialization IdSpec) {
    	this.IdSpec = IdSpec;
    }
    
    public Users getLogin() {
    	return this.login;
    }
    public void setLogin(Users login) {
    	this.login = login;
    }
}
