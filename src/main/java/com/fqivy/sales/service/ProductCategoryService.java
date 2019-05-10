package com.fqivy.sales.service;


import com.fqivy.sales.dataobject.ProductCategory;

import java.util.List;

public interface ProductCategoryService {

    ProductCategory findOne(Integer id);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryType(List<Integer> types);

    ProductCategory save(ProductCategory productCategory);

}
