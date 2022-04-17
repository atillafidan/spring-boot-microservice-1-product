package com.sha.springbootmicroservices1product.repository;

import com.sha.springbootmicroservices1product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @author afidan
 * @date 17.04.2022
 * @time 02:29
 */

public interface IProductRepository extends JpaRepository<Product,Long> {
}
