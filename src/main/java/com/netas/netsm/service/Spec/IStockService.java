package com.netas.netsm.service.Spec;

import java.util.List;

import com.netas.netsm.model.*;


public interface IStockService {

	Stock addStock(Stock stock);
	Result delStock(String stockId);
	List<StockResponseModel> getStocks();
	Stock getStock(String stockId);
	List<NTransaction> getStocksByUserId(String userId);
	Result buyStock(BuyRequest buyRequest);
	Result sellStock(SellRequest sellRequest);
	
	
}
