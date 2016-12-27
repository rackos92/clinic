package com.example.entity;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "visits")
public class Visits {

    @Column(name = "idvisit")
    private Integer IdVisit;

	@ManyToOne
	@JoinColumn(name = "iddoc")
	private Doctor IdDoc;
	
	@ManyToOne
	@JoinColumn(name = "idpatient")
    private Patient idPatient;
	
	@Column(name = "datevisit")
    private Date DateVisit;
	
    public Integer getIdVisit() { return IdVisit;}

    public void setIdVisit(Integer IdVisit) {this.IdVisit = IdVisit;};

    public Doctor getIdDoc() {
        return IdDoc;
    }

    public void setIdDoc(Doctor IdDoc) {
        this.IdDoc = IdDoc;
    }

    public Patient getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(Patient idPatient) {
        this.idPatient = idPatient;
    }
    
    public Date getDateVisit() {
    	return DateVisit;
    }
    
    public void setDateVisit(Date DateVisit) {
    	this.DateVisit = DateVisit;
    }

}
