package com.sha.springbootmicroservices1product.service;


import com.sha.springbootmicroservices1product.model.Product;
import com.sha.springbootmicroservices1product.repository.IProductRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author afidan
 * @date 17.04.2022
 * @time 02:29
 */
@Service
public class ProductService implements IProductService{

    private final IProductRepository iProductRepository;

    public ProductService(IProductRepository iProductRepository) {
        this.iProductRepository = iProductRepository;
    }

    @Override
    public Product saveProduct(Product product){
        product.setCreateTime(LocalDateTime.now());
        return iProductRepository.save(product);
    }

    @Override
    public void deleteProduct(Long productId){
        iProductRepository.deleteById(productId);
    }

    @Override
    public List<Product> findAllProducts(){
        return iProductRepository.findAll();
    }
}
