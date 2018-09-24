package com.winstgenerator.backend.service;

import java.util.List;



//import java.util.List;

import com.winstgenerator.backend.model.ProductPriceOnline;


public interface IProductPriceOnlineService {
	
	//public List<ProductPriceOnline> findAll(); 
	
	public ProductPriceOnline create(ProductPriceOnline product);

	public List<ProductPriceOnline> findByProductId(Long productId);
	
	//meer methodes? 
}
