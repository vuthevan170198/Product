package com.company.ProductService.service;

import com.company.ProductService.model.ProductReponse;
import com.company.ProductService.model.ProductRequest;

public interface ProductService {
    long addProduct(ProductRequest productRequest);

    ProductReponse getProductById(long productId);

  void reduceQuantity(long productId, long quantity);
}
