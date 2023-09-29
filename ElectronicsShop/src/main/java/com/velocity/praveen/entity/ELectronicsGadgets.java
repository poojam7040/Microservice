package com.velocity.praveen.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class ELectronicsGadgets{

	@Id
	@Column(name = "GADGET_ID")
	private Integer gadgetId;
	
	@Column(name = "GADGET_NAME")
	private String gadgetName;
	
	@Column(name = "GADGET_PRICE")
	private Double gadgetPrice;
	
	private String port;

	public String getPort() {
		return port;
	}

	public ELectronicsGadgets(Integer gadgetId, String gadgetName, Double gadgetPrice, String port) {
		super();
		this.gadgetId = gadgetId;
		this.gadgetName = gadgetName;
		this.gadgetPrice = gadgetPrice;
		this.port = port;
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

	public ELectronicsGadgets() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
