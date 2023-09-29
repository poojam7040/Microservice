package com.velocity.praveen.entity;

public class ElectronicsPriceCalculator{

	private Integer gadgetId;
	private String gadgetName;
	private Double gadgetPrice;
	private String port;

	public String getPort() {
		return port;
	}

	public Integer getGadgetId() {
		return gadgetId;
	}

	public void setGadgetId(Integer gadgetId) {
		this.gadgetId = gadgetId;
	}

	public String getGadgetName() {
		return gadgetName;
	}

	public void setGadgetName(String gadgetName) {
		this.gadgetName = gadgetName;
	}

	public Double getGadgetPrice() {
		return gadgetPrice;
	}

	public void setGadgetPrice(Double gadgetPrice) {
		this.gadgetPrice = gadgetPrice;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public ElectronicsPriceCalculator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ElectronicsPriceCalculator(Integer gadgetId, String gadgetName, Double gadgetPrice, String port) {
		super();
		this.gadgetId = gadgetId;
		this.gadgetName = gadgetName;
		this.gadgetPrice = gadgetPrice;
		this.port = port;
	}

	

}
