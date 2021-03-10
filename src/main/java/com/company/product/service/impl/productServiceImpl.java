package com.company.product.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.product.ProductVO;
import com.company.product.service.ProductService;

@Service
public class productServiceImpl implements ProductService {
	
	@Autowired ProductMapper dao;

	public int insertProduct(ProductVO vo) {
		return dao.insertProduct(vo);
	}

	public List<ProductVO> getProductList(ProductVO vo) {
		return dao.getProductList(vo);
	}

}
