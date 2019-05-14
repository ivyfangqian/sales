package com.fqivy.sales.service;

import com.fqivy.sales.dataobject.ProductInfo;

import java.util.List;

public interface ProductInfoService {

    ProductInfo findOne(String productId);

    List<ProductInfo> findAll();

    List<ProductInfo> findByProductStatus(Integer productStatus);

    ProductInfo save(ProductInfo productInfo);
}
