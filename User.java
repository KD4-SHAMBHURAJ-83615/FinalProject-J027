package com.hotelhub.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name="user_id")
	private int userId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(unique=true,nullable=false)
	private String email;
	
	private String password;
	
	private String phoneNo;
	private Role role;
	private Date dob;
	
	@Column(name="aadhar_no")
	private String aadharNo;

	public User(int userId) {
		this.userId = userId;
	}
	
	

}
