package com.example.productcatalog.controller;

import com.example.productcatalog.entity.Product;
import com.example.productcatalog.repository.ProductRepository;
import com.example.productcatalog.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {
    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }


    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("add-product")
    public String addProductForm(Model model){
        model.addAttribute("product", new Product());
        return "add-product";
    }

    @PostMapping("/save-product")
    public String saveProduct(@ModelAttribute Product product){
        service.saveProduct(product);
        return "redirect:/display-products";
    }

    @GetMapping("/display-products")
    public String displayProducts(Model model){
        model.addAttribute("products", service.getAllProducts());
        return "display-products";
    }
}
