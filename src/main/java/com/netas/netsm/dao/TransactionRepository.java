package com.netas.netsm.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.netas.netsm.model.Stock;
import com.netas.netsm.model.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, String> {

	List<Stock> findTransactionByUserId(String userId);

}
