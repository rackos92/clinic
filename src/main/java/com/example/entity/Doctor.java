package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "doctor")
public class Doctor extends Person{
    @Column(name = "iddoc")
    private Integer IdDoc;
    @ManyToOne
    @JoinColumn(name = "idspec")
    private Specialization IdSpec;
    
    @OneToOne (cascade=CascadeType.ALL)
    @JoinColumn(name = "iduser")
    private Users idUsers;
    
    public Specialization getIdSpec() {
    	return this.IdSpec;
    }
    public void setIdSpec(Specialization IdSpec) {
    	this.IdSpec = IdSpec;
    }
    
    public Users getIdUsers() {
    	return this.idUsers;
    }
    public void setIdUsers(Users idUsers) {
    	this.idUsers = idUsers;
    }

    public Integer getIdDoc() {return IdDoc;}
    public void setIdDoc(Integer IdDoc){this.IdDoc= IdDoc; }
}
