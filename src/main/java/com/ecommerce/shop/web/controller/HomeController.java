package com.ecommerce.shop.web.controller;


import com.ecommerce.shop.Service.ProductService;
import com.ecommerce.shop.data.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HomeController {


    @Autowired
    ProductService productServiceImpl;

    @GetMapping(value = {"/", "/index"})
    public String getIndex(Model model){
        List<Product> productList = productServiceImpl.findAll();
        model.addAttribute("products", productList);
        return "index";
    }


    @GetMapping("/about")
    public @ResponseBody String getAbout(){
        return "about";
    }

    @GetMapping("/product")
    public @ResponseBody String getProduct(){
        return "product";
    }


    @GetMapping("/services")
    public @ResponseBody String getServices(){
        return "services";

    }

    @GetMapping("/singles")
    public @ResponseBody String getSingles(){
        return "singles";
    }
}
