package com.company.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.product.ProductVO;
import com.company.product.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired ProductService prdService;
	
	@RequestMapping("getProductList")
	public String getProductList(ProductVO vo, Model model){
		model.addAttribute("list", prdService.getProductList(vo));
		return "product/getProductList";
	}
	
	@GetMapping("insertProduct")
	public String insertProduct(ProductVO vo) {
		return "product/insertForm";
	}
	
	@PostMapping("insertProduct")
	public String insertProductProc(ProductVO vo) {
		prdService.insertProduct(vo);
		return "redirect:getProductList";
	}

}
