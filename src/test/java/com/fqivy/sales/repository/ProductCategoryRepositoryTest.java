package com.fqivy.sales.repository;

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
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Test
    public void findOneTest() {
        ProductCategory productCategory = productCategoryRepository.findOne(1);
        System.out.println(productCategory.toString());
    }

    @Test
    public void saveOneTest() {
        ProductCategory productCategory = new ProductCategory();

        productCategory.setCategoryName("女生最爱");
        productCategory.setCategoryType(3);

        productCategoryRepository.save(productCategory);
    }

    @Test
    public void updateOneTest() {
        ProductCategory productCategory = productCategoryRepository.findOne(2);

        productCategory.setCategoryName("女生最爱");
        productCategory.setCategoryType(10);

        productCategoryRepository.save(productCategory);
    }

    @Test
    public void findByCategoryTypeTest() {
        List<Integer> types = Arrays.asList(2, 3, 4, 10);

        List<ProductCategory> result = productCategoryRepository.findByCategoryTypeIn(types);
        Assert.assertNotEquals(0, result.size());
        System.out.println(result);
    }

}