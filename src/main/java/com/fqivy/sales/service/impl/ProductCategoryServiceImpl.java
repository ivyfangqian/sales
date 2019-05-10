package com.fqivy.sales.service.impl;

import com.fqivy.sales.dataobject.ProductCategory;
import com.fqivy.sales.repository.ProductCategoryRepository;
import com.fqivy.sales.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: sales
 * @description:
 * @author: fqivy
 * @create: 2019-05-10 13:56
 */
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    private ProductCategoryRepository repository;

    @Override
    public ProductCategory findOne(Integer id) {
        return repository.findOne(id);
    }

    @Override
    public List<ProductCategory> findAll() {
        return repository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryType(List<Integer> types) {
        return repository.findByCategoryTypeIn(types);
    }


    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return repository.save(productCategory);
    }
}
