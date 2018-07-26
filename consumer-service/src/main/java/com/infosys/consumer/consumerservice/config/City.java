package com.infosys.consumer.consumerservice.config;

/**
 * @author Sudharshan
 */
public class City {

	private Integer id;
	private String city;
	private String destinyCity;
	private String departureTime;
	private String arrivalTime;
	private int travelTime;
	private int noOfConnections;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDestinyCity() {
		return destinyCity;
	}

	public void setDestinyCity(String destinyCity) {
		this.destinyCity = destinyCity;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	
	public int getTravelTime() {
		return travelTime;
	}

	public void setTravelTime(int travelTime) {
		this.travelTime = travelTime;
	}
	
	public int getNoOfConnections() {
		return noOfConnections;
	}

	public void setNoOfConnections(int noOfConnections) {
		this.noOfConnections = noOfConnections;
	}
}
