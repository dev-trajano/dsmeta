package com.trajano.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trajano.dsmeta.entities.Sale;
import com.trajano.dsmeta.repository.SaleRepositoy;

@Service
public class SaleService {

	@Autowired
	private SaleRepositoy repository;

	public List<Sale> findSales() {
		return repository.findAll();

	}

}
