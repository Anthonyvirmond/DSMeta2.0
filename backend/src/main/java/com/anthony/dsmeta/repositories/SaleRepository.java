package com.anthony.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anthony.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	
	

}
