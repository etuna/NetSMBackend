package com.netas.netsm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.netas.netsm.model.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, String> {

	Stock findStockByCode(String code);

}
