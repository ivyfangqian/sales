package com.fqivy.sales.service;

import com.fqivy.sales.dataobject.ProductInfo;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface ProductInfoService {

    ProductInfo findOne(String productId);

    List<ProductInfo> findAll();

    List<ProductInfo> findUpAll();

    ProductInfo save(ProductInfo productInfo);
}
