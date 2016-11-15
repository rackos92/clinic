package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "doctor")
public class Doctor extends Person{

    @ManyToOne
    @JoinColumn(name = "idspec")
    private Specializations IDSPEC;
    
    @OneToOne (cascade=CascadeType.ALL)
    @JoinColumn(name = "login")
    private Users login;
    
    public Specializations getIDSPEC() {
    	return this.IDSPEC;
    }
    public void setIDSPEC(Specializations IDSPEC) {
    	this.IDSPEC = IDSPEC;
    }
    
    public Users getLogin() {
    	return this.login;
    }
    public void setLogin(Users login) {
    	this.login = login;
    }
}
