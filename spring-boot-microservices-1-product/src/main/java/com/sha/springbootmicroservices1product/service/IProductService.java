package com.sha.springbootmicroservices1product.service;

import com.sha.springbootmicroservices1product.model.Product;

import java.util.List;

/**
 * @author afidan
 * @date 17.04.2022
 * @time 02:29
 */

public interface IProductService {
    Product saveProduct(Product product);

    void deleteProduct(Long productId);

    List<Product> findAllProducts();
}
