package com.ustglobal.stockmanagement.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="order_info")
public class Order {
	
	@Id
	@Column
	@GeneratedValue
	private int id;
	@Column
	private double totalPrice;
	@Column
	private double totalPriceWithGst;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="order_history_info", joinColumns=@JoinColumn(name="orderId"),inverseJoinColumns=@JoinColumn(name="id"))
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public double getTotalPriceWithGst() {
		return totalPriceWithGst;
	}
	public void setTotalPriceWithGst(double totalPriceWithGst) {
		this.totalPriceWithGst = totalPriceWithGst;
	}
	
	

}
