package com.fqivy.sales.repository;

import com.fqivy.sales.dataobject.ProductInfo;
import com.fqivy.sales.enums.ProductStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository repository;

    @Test
    public void saveTest() {
        ProductInfo productInfo = new ProductInfo("CC00001",
                "水煮鱼",
                new BigDecimal(68.80),
                100,
                "人间美味水煮鱼",
                "https://www.google.com/url?sa=i&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwivoJuT-p7iAhVML6YKHZTABjMQjRx6BAgBEAU&url=https%3A%2F%2Fwww.xinshipu.com%2Fzuofa%2F222196&psig=AOvVaw1P19lXDLmIdz-i1mOGzn-Q&ust=1558058441664131",
                2,
                ProductStatusEnum.UP.getCode());

        ProductInfo result = repository.save(productInfo);

        Assert.assertNotEquals(null, result);
        Assert.assertEquals(productInfo.getProductId(), result.getProductId());
        Assert.assertEquals(productInfo.getProductName(), result.getProductName());
        Assert.assertEquals(productInfo.getProductPrice(), result.getProductPrice());
        Assert.assertEquals(productInfo.getProductDescription(), result.getProductDescription());
        Assert.assertEquals(productInfo.getProductIcon(), result.getProductIcon());
        Assert.assertEquals(productInfo.getCategoryType(), result.getCategoryType());


    }

}