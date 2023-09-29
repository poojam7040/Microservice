package com.velocity.praveen.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.praveen.entity.ElectronicsPriceCalculator;
import com.velocity.praveen.feign.ElectronicsPriceCalculatorClient;

@RestController
public class StockCalcRestController {
	
	@Autowired
	private ElectronicsPriceCalculatorClient priceClient;

	@GetMapping("/calc/{gadgetName}/{qty}")
	public ResponseEntity<String> calculate(@PathVariable String gadgetName, @PathVariable Integer qty) {

		ElectronicsPriceCalculator Price = priceClient.invokeGadgetPrice(gadgetName);
		Double companyPrice = Price.getGadgetPrice();
		String port = Price.getPort();

		Double totalCost = companyPrice * qty;

		String msg = "Total Cost : " + totalCost +" Port ::"+port;

		return new ResponseEntity<>(msg, HttpStatus.OK);
	}
}
