package com.fqivy.sales.service.impl;

import com.fqivy.sales.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryServiceImplTest {

    @Autowired
    private ProductCategoryServiceImpl categoryServiceImpl;

    @Test
    public void findOne() {
        ProductCategory category = categoryServiceImpl.findOne(1);

        Assert.assertNotEquals(null, category);
    }

    @Test
    public void findAll() {
        List<ProductCategory> categories = categoryServiceImpl.findAll();

        Assert.assertNotEquals(0, categories.size());
    }

    @Test
    public void findByCategoryType() {
        List<ProductCategory> categories = categoryServiceImpl.findByCategoryType(Arrays.asList(1, 2, 3, 10));

        Assert.assertNotEquals(0, categories.size());
    }

    @Test
    public void save() {
        ProductCategory category = new ProductCategory("男士专享", 4);
        ProductCategory result = categoryServiceImpl.save(category);

        Assert.assertNotEquals(null, category);

    }
}