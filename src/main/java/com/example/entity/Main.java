package com.example.entity;

import javax.persistence.*;

@MappedSuperclass
public class Main {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    
    public Integer getId(){
    	return id;
    }
    
    public void setId(Integer id){
    	this.id = id;
    }
    
    public boolean isNew(){
    	return this.id == null;
    }
    


}