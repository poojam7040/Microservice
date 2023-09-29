package com.velocity.praveen.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.praveen.entity.ELectronicsGadgets;
import com.velocity.praveen.repo.ELectronicsGadgetsRepository;

@RestController
public class ELectronicsGadgetsController {

	@Autowired
	private ELectronicsGadgetsRepository repository;
	
	@Autowired
	private Environment env;

	@GetMapping("/price/{gadgetName}")
	public ResponseEntity<ELectronicsGadgets> getGadgetPrice(@PathVariable String gadgetName) {
		ELectronicsGadgets electronicGadget = repository.findByGadgetName(gadgetName);
		String port = env.getProperty("server.port");
		electronicGadget.setPort(port);
		return new ResponseEntity<ELectronicsGadgets>(electronicGadget, HttpStatus.OK);

	}

}
