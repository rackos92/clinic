package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "doctor")
public class Doctor extends Person{

    @ManyToOne
    @JoinColumn(name = "idspec")
    private Specializations IdSpec;
    
    @OneToOne (cascade=CascadeType.ALL)
    @JoinColumn(name = "login")
    private Users login;
    
    public Specializations getIdSpec() {
    	return this.IdSpec;
    }
    public void setIDSPEC(Specializations IdSpec) {
    	this.IDSPEC = IdSpec;
    }
    
    public Users getLogin() {
    	return this.login;
    }
    public void setLogin(Users login) {
    	this.login = login;
    }
}
