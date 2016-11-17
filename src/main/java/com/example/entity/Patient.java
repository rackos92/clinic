package com.example.entity;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "patient")
public class Patient extends Person{

    @Column(name = "pesel")
    private Integer Pesel;
       
    @Column(name = "dateofbirth")
    private Date DateOfBirth;
    
    @Column(name = "phonecontact")
    private Integer PhoneContact;
    
    @Column(name = "city")
    private String City;
    
    @Column(name = "street")
    private String Street;
    
    @Column(name = "apartmentnr")
    private String ApartmentNr;
    
    @Column(name = "postalcode")
    private String PostalCode;
    
    @OneToOne (cascade=CascadeType.ALL)
    @JoinColumn(name = "login")
    private Users Login;
    
    public Integer getPesel() {
        return Pesel;
    }

    public void setPesel(Integer Pesel) {
        this.Pesel = Pesel;
    }
   
    public Date getDateOfBirth() {
    	return DateOfBirth;
    }
    
    public void setDateOfBirth(Date DateOfBirth) {
    	this.DateOfBirth = DateOfBirth;
    }
    
    public Integer getPhoneContact() {
    	return PhoneContact;
    }
    
    public void setPhoneContact(Integer PhoneContact) {
    	this.PhoneContact = PhoneContact;
    }
    
    public String getCity() {
    	return City;
    }
    
    public void setCity(String City) {
    	this.City = City;
    }
    
    public String getStreet() {
    	return Street;
    }
    
    public void setStreet(String Street) {
    	this.Street = Street;
    }
    
    public String getApartmentNr() {
    	return ApartmentNr;
    }
    
    public void setApartmentNr(String ApartmentNr) {
    	this.ApartmentNr = ApartmentNr;
    }
    
    public String getPostalCode() {
    	return PostalCode;
    }
    
    public void setPostalCode(String PostalCode) {
    	this.PostalCode = PostalCode;
    }
    
    public Users getLogin() {
    	return this.Login;
    }
    
    protected void setLogin(Users Login) {
    	this.Login = Login;
    }
}
