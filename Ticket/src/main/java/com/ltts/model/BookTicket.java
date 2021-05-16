package com.ltts.model;



import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "booking")
public class BookTicket {
	@Id
	private int id;
	private String movieName="Revanant";
	private String circleType;
	private String bookingDate;
	private String showDate;
	private int noOfTickets;
	public BookTicket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookTicket(String bookingDate, String showDate, int noOfTickets) {
		super();
		this.bookingDate = bookingDate;
		this.showDate = showDate;
		this.noOfTickets = noOfTickets;
	}
	public BookTicket(int id) {
		super();
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String getShowDate() {
		return showDate;
	}
	public void setShowDate(String showDate) {
		this.showDate = showDate;
	}
	public int getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	@Override
	public String toString() {
		return "BookTicket [id=" + id + ", movieName=" + movieName + ", circleType=" + circleType + ", bookingDate="
				+ bookingDate + ", showDate=" + showDate + ", noOfTickets=" + noOfTickets + "]";
	}
	
	
}
