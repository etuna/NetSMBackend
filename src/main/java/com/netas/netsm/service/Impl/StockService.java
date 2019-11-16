package com.netas.netsm.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netas.netsm.dao.StockRepository;
import com.netas.netsm.dao.TransactionRepository;
import com.netas.netsm.model.Result;
import com.netas.netsm.model.Stock;
import com.netas.netsm.model.StockResponseModel;
import com.netas.netsm.model.Transaction;
import com.netas.netsm.service.Spec.IStockService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Service
public class StockService implements IStockService {

	@Autowired
	private StockRepository stockRepository;
	
	@Autowired
	private TransactionRepository transactionRepository;

	@Override
	public Stock addStock(Stock stock) {
		return stockRepository.save(stock);
	}

	@Override
	public Result delStock(String stockId) {
		stockRepository.deleteById(stockId);
		return new Result("SUCCESS", "Stock succesfully deleted.");
	}

	@Override
	public List<StockResponseModel> getStocks() {
		List<StockResponseModel> stockRes = new ArrayList<StockResponseModel>();
		Random rand = new Random();
		List<Stock> stocks = stockRepository.findAll();
		for(Stock stock: stocks) {
			StockResponseModel stockResponseModel = new StockResponseModel();
			stockResponseModel.setCode(stock.getCode());
			stockResponseModel.setName(stock.getName());
			stockResponseModel.setPrice(rand.nextDouble());
			stockRes.add(stockResponseModel);
		}
		
		return stockRes;

	}

	@Override
	public Stock getStock(String stockId) {
		return stockRepository.findStockByCode(stockId);
	}

	@Override
	public List<Stock> getStocksByUserId(String userId) {
		return transactionRepository.findTransactionByUserId(userId);
	}

	@Override
	public Result buyStock(String userId, String stockId, double price, double quantity) {
		Transaction transaction = new Transaction();
		transaction.setId((UUID.randomUUID()).toString());
		transaction.setPrice(price);
		transaction.setQuantity(quantity);
		transaction.setStock(stockRepository.findStockByCode(stockId).getName());
		transaction.setUserId(userId);
		transaction.setOperation("BUY");
		transactionRepository.save(transaction);
		return new Result("SUCCESS", "Stock is bought successfully.");

	}

	@Override
	public Result sellStock(String userId, String stockId, double price, double quantity) {
		Transaction transaction = new Transaction();
		transaction.setId((UUID.randomUUID()).toString());
		transaction.setPrice(price);
		transaction.setQuantity(quantity);
		transaction.setStock(stockRepository.findStockByCode(stockId).getName());
		transaction.setUserId(userId);
		transaction.setOperation("SELL");
		transactionRepository.save(transaction);
		return new Result("SUCCESS", "Stock is sold successfully.");
}

}
