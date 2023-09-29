package com.velocity.praveen.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.velocity.praveen.entity.ElectronicsPriceCalculator;

@FeignClient(name = "ELECTRONICS-SHOP-API")
public interface ElectronicsPriceCalculatorClient {

	@GetMapping("/price/{gadgetName}")
	public ElectronicsPriceCalculator invokeGadgetPrice(@PathVariable String gadgetName);
	
}
