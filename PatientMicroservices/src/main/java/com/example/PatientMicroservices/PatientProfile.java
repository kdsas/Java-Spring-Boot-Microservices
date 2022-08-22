package com.example.PatientMicroservices;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "patient_profile")
public class PatientProfile {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	    private int id;
	    @Column(name = "name")
	    private String name;
	    @Column(name = "email")
	    private String email;
	    @Column(name = "date_time")
	    private DateFormat date_time;
	    @Column(name = "reason")
	    private String reason;
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }
	    public DateFormat getDate_time() {
	    	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	    	Date date = new Date();
	    	System.out.println(dateFormat.format(date));
	        return date_time;
	    }

	    public void setDate_time(DateFormat date_time) {
	    	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	    	Date date = new Date();
	    	System.out.println(dateFormat.format(date));
	        this.date_time = date_time;
	    }
	    
	    public String getReason() {
	        return reason;
	    }

	    public void setReason(String reason) {
	        this.reason= reason;
	    }

	}