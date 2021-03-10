package com.company.product.service.impl;

import java.util.List;

import com.company.product.ProductVO;

public interface ProductMapper{
	
	// 등록
	public int insertProduct(ProductVO vo);

	// 조회
	public List<ProductVO> getProductList(ProductVO vo);
}
