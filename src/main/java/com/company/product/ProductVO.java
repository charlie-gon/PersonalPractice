package com.company.product;

import java.sql.Date;

import lombok.Data;

@Data
public class ProductVO {
	
	private int product_id;
	private String product_name;
	private int product_price;
	private String product_info;
	private Date product_date;
	private String company;
	private String manager_id;

}
