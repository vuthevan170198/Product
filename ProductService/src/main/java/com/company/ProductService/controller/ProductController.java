package com.company.ProductService.controller;

import com.company.ProductService.entity.Product;
import com.company.ProductService.model.ProductReponse;
import com.company.ProductService.model.ProductRequest;
import com.company.ProductService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<Long> addProduct(@RequestBody ProductRequest productRequest) {
        long productId = productService.addProduct(productRequest);
        return new ResponseEntity<>(productId, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<ProductReponse> getProductById(@PathVariable("id") long productId){
        ProductReponse productReponse
                = productService.getProductById(productId);
        return new ResponseEntity<>(productReponse, HttpStatus.OK);

    }

}
