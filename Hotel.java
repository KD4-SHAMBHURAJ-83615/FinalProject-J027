package com.hotelhub.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "hotel")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Hotel {
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name="hotel_id")
	private int hotelId;
	
	private String name;
	
	@Column(name="contact_details")
	private String contactDetails;
	
	@Column(name="image_name")
	private String imageName;
	
	@Lob
	private byte[] image;
	
	@Column(name="swimming_pool")
	private boolean swimmingPool;
	private boolean restaurant;
	private boolean gym;
	private boolean parking;
	private boolean wifi;
	@Column(name="power_backup")
	private boolean powerBackup;
	
	@ManyToOne
	@JoinColumn(name="user_id",nullable=false)
	private User user;
	
	@ManyToOne
	@JoinColumn(name="adress_id",nullable=false)
	private Address address;
	
	

}
