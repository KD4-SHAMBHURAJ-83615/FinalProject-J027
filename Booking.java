package com.hotelhub.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "booking")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Booking {
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name="booking_id")
	private int bookingId;
	
	@Column(name="check_in")
	private LocalDate checkIn;
	
	@Column(name="check_out")
	private LocalDate checkOut;
	
	@Column(name="total_price")
	private double totalPrice;
	
	@ManyToOne
	@JoinColumn(name="hotel_id",nullable=false)
	private Hotel hotel;
	
	@ManyToOne
	@JoinColumn(name="user_id",nullable=false)
	private User user;
	
	@ManyToOne
	@JoinColumn(name="room_id",nullable=false)
	private Room room;
}
