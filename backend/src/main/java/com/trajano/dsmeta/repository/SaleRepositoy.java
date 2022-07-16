package com.trajano.dsmeta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trajano.dsmeta.entities.Sale;

public interface SaleRepositoy extends JpaRepository<Sale, Long> {

}
