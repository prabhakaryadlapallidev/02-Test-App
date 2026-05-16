package com.dilipit.DI;

import org.springframework.stereotype.Component;

@Component
public class Address {

	private int door_no;
	private String street_name;
	private String village_name;
	public int getDoor_no() {
		return door_no;
	}
	public void setDoor_no(int door_no) {
		this.door_no = door_no;
	}
	public String getStreet_name() {
		return street_name;
	}
	public void setStreet_name(String street_name) {
		this.street_name = street_name;
	}
	public String getVillage_name() {
		return village_name;
	}
	public void setVillage_name(String village_name) {
		this.village_name = village_name;
	}
	@Override
	public String toString() {
		return "Address [door_no=" + door_no + ", street_name=" + street_name + ", village_name=" + village_name + "]";
	}
	
	
}
