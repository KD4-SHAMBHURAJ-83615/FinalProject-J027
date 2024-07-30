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
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "room")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Room {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name="room_id")
	private int roomId;
	
	private boolean tv;
	private boolean ac;
	private double rent;
	
	@Column(name="image_name")
	private String imageName;
	
	@Lob
	private byte[] image;
	
	
	@Size(min=1,max=2)
	private int capacity;
	
	@ManyToOne
	@JoinColumn(name="hotel_id",nullable=false)
	private Hotel hotel;

}
