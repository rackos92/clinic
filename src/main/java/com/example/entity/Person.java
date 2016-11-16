package com.example.entity;

import javax.persistence.*;

@MappedSuperclass
public class Person {
	
	private Integer id;
    //@Column(name = "name")
	private String name;
    //@Column(name = "lastname")
    private String lastname;
    
    public Integer getId(){
    	return id;
    }
    
    public void setId(Integer id){
    	this.id = id;
    }
    
    public boolean isNew(){
    	return this.id == null;
    }
    
    public String getName(){
    	return name;
    }
    
    public void setName(String name){
    	this.name = name;
    }
    @Override
    public String toString(){
    	return this.getName();
    }
    
    public String getLastName(){
    	return lastname;
    }
    
    public void setLastName(String lastname){
    	this.lastname = lastname;
    }
    @Override
    public String toString(){
    	return this.getLastName();
    }
    


}