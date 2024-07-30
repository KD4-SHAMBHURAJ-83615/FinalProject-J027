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
@Table(name = "payment")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Payment {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name="payment_id")
	private int paymentId;
	
	@Column(name="payment_date")
	private LocalDate paymentDate;
	
	private int transactionId;
	
	@ManyToOne
	@JoinColumn(name="hotel_id",nullable=false)
	private Hotel hotel;
	
	@ManyToOne
	@JoinColumn(name="user_id",nullable=false)
	private User user;
}
