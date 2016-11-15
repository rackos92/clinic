package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "visits")
public class Visits extends Main{

	@ManyToOne
	@JoinColumn(name = "iddoc")
	private Doctor IdDoc;
	
	@ManyToOne
	@JoinColumn(name = "peselpatient")
    private Patient PeselPatient;
	
	@Column(name = "datevisit")
    private DateTime DateVisit;
	
    
    public Doctro getIdDoc() {
        return IdDoc;
    }

    public void setIdDoc(Doctor IdDoc) {
        this.IdDoc = IdDoc;
    }

    public Patient getPeselPatient() {
        return PeselPatient;
    }

    public void setPeselPatient(Patient PeselPatient) {
        this.PeselPatient = PeselPatient;
    }
    
    public Date getDateVisit() {
    	return DateVisit;
    }
    
    public void setDateVisit(Date DateVisit) {
    	this.DateVisit = DateVisit
    }
    
}
