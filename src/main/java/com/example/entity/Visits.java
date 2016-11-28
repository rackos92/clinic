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
	@JoinColumn(name = "peselpatient")
    private Patient PeselPatient;
	
	@Column(name = "datevisit")
    private Date DateVisit;
	
    public Integer getIdVisit() { return IdVisit;};

    public void setIdVisit(Integer IdVisit) {this.IdVisit = IdVisit;};

    public Doctor getIdDoc() {
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
    	this.DateVisit = DateVisit;
    }
    
}
