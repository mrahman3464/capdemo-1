package com.capdemo.domain;

import java.util.Date;

<<<<<<< HEAD
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class Appointment {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
=======
public class Appointment {

>>>>>>> 9d06e21d25eece3da5d0fc05c563236a79f43443
	private Long id;
    private Date date;
    private String location;
    private String description;
    private boolean confirmed;
<<<<<<< HEAD
    
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;
    
    
    
    
=======
    private User user;
>>>>>>> 9d06e21d25eece3da5d0fc05c563236a79f43443
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isConfirmed() {
		return confirmed;
	}
	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
<<<<<<< HEAD
	
	
	
	
	@Override
	public String toString() {
		return "Appointment [id=" + id + ", date=" + date + ", location="
				+ location + ", description=" + description + ", confirmed="
				+ confirmed + ", user=" + user + "]";
	}
	
	
	
	
=======
    
>>>>>>> 9d06e21d25eece3da5d0fc05c563236a79f43443
	
	
	
	
	
	
	
	
	
	
	
	
}
