package com.netas.netsm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netas.netsm.dao.StockRepository;
import com.netas.netsm.model.BuyRequest;
import com.netas.netsm.model.Result;
import com.netas.netsm.model.SellRequest;
import com.netas.netsm.model.Stock;
import com.netas.netsm.model.StockResponseModel;
import com.netas.netsm.model.User;
import com.netas.netsm.service.Impl.StockService;
import com.netas.netsm.service.Impl.UserService;

@RestController
@RequestMapping("stock")
public class StockController {

	@Autowired
	private StockService stockService;

	@PostMapping("add")
	public Stock addStock(@RequestBody Stock stock) {
		return stockService.addStock(stock);
	}

	@GetMapping("delete/{id}")
	public Result delUser(@PathVariable("id") String id) {
		return stockService.delStock(id);
	}

	@GetMapping("all")
	public List<StockResponseModel> getStocks() {
		return stockService.getStocks();
	}

	@GetMapping("{id}")
	public Stock getStock(@PathVariable("id") String id) {
		return stockService.getStock(id);
	}

	@GetMapping("all/{id}")
	public List<Stock> getStocksByUserId(@PathVariable("id") String id) {
		return stockService.getStocksByUserId(id);
	}
	
	@PostMapping("buy")
	public Result buyStock(@RequestBody BuyRequest buyRequest) {
		return stockService.buyStock(buyRequest);
	}

	@PostMapping("sell")
	public Result sellStock(@RequestBody SellRequest sellRequest) {
		return stockService.sellStock(sellRequest);
	}


}
