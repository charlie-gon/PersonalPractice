package com.company.product.service;

import java.util.List;

import com.company.product.ProductVO;

public interface ProductService {
	
	// 등록
	public int insertProduct(ProductVO vo);
	
	// 조회
	public List<ProductVO> getProductList(ProductVO vo);

}
