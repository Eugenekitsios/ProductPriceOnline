package com.winstgenerator.backend.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.winstgenerator.backend.model.ProductPriceOnline;
import com.winstgenerator.backend.dao.IProductPriceOnlineDao;

@Service
public class ProductPriceOnlineService implements IProductPriceOnlineService {
	
	@Autowired
	private IProductPriceOnlineDao iProductPriceOnlineDao;



	@Override
	public ProductPriceOnline create(ProductPriceOnline productPriceOnline) {
		Assert.notNull(productPriceOnline, "ProductPriceOnline may not be null");

		return this.iProductPriceOnlineDao.save(productPriceOnline);
	}



	@Override
	public List<ProductPriceOnline> findByProductId(Long productId) {
		return this.iProductPriceOnlineDao.findByProductId(productId);
	}

}
