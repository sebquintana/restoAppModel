package com.model.carta;

import java.util.ArrayList;
import java.util.List;

public class Carta {

	private String restaurant;
	private List<ItemCarta> carta = new ArrayList<ItemCarta>();
	
	public Carta(String restaurant) {
		this.restaurant = restaurant;
	}

	public String getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(String restaurant) {
		this.restaurant = restaurant;
	}
	
}
