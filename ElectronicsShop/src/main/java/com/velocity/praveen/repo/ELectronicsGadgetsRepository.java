package com.velocity.praveen.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.velocity.praveen.entity.ELectronicsGadgets;


public interface ELectronicsGadgetsRepository extends JpaRepository<ELectronicsGadgets, Integer> {

	public ELectronicsGadgets findByGadgetName(String gadgetName);
	
	
}
