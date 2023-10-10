//package com.example.choicematchserver.controllers;
//
//import com.example.choicematchserver.models.Product;
//import com.example.choicematchserver.services.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/products")
//public class ProductController {
//
//    @Autowired
//    private  ProductService productService;
//
//    @GetMapping
//    public List<Product> getProductByCategory(@RequestParam String P_CATEGORY) {
//        return productService.getAllProductsByCategory(P_CATEGORY);
//    }
//}
