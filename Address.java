package com.hotelhub.entities;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "address")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Address {
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name="address_id")
	private int addressId;
	
	private String addressLine;
	private String city;
	private String state;
	private String country;
	
	@NotNull
	@Size(min=6,max=6)
	private String pincode;
	
	@ManyToOne
	@JoinColumn(name="user_id",nullable=false)
	private User user;
	
	@ManyToOne
	@JoinColumn(name="hotel_id",nullable=false)
	private Hotel hotel;
	
	
	

}
