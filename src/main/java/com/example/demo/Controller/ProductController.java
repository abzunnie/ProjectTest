package com.example.demo.Controller;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Product;

@Controller
public class ProductController {

	@RequestMapping("/products")
	private String products(Model model){
		model.addAttribute("Products",getProductList());
		model.addAttribute("companyName","ABC Corp. Ltd");
		return "Products";
	}
	
	private List<Product> getProductList()
	{
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1,"Watch",5000,"Fossil",new Date(),new Date()));
		productList.add(new Product(2,"SmartWatch",25000,"Apple Watch",new Date(),new Date()));
		productList.add(new Product(2,"SmartPhone",75000,"Apple iPhone",new Date(),new Date()));
		
		return productList;
	}
	
	
	
}
