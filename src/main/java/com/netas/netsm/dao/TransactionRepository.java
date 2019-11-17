package com.netas.netsm.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.netas.netsm.model.Stock;
import com.netas.netsm.model.NTransaction;

@Repository
public interface TransactionRepository extends JpaRepository<NTransaction, String> {

	List<NTransaction> findTransactionByUserId(String userId);

}
