package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "specialization")
public class Specializations {

    @Column(name = "idspec")
    private Integer IdSpec;
    @Column(name = "name")
    private String Name;
    @Column(name = "description")
    private String Description;

    public Integer getIdSpec() {
        return IdSpec;
    }

    public void setIdSpec(Integer IdSpec) {
        this.IdSpec = IdSpec;
    }

    public String getName(){
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDescription(){
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
}
