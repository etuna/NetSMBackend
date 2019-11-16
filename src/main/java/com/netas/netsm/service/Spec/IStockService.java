package com.netas.netsm.service.Spec;

import java.util.List;

import com.netas.netsm.model.Result;
import com.netas.netsm.model.Stock;
import com.netas.netsm.model.StockResponseModel;


public interface IStockService {

	Stock addStock(Stock stock);
	Result delStock(String stockId);
	List<StockResponseModel> getStocks();
	Stock getStock(String stockId);
	List<Stock> getStocksByUserId(String userId);
	Result buyStock(String userId, String stockId, double price, double quantity);
	Result sellStock(String userId, String stockId, double price, double quantity);
	
	
}
