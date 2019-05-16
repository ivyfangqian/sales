package com.fqivy.sales.dataobject;

import com.fqivy.sales.enums.ProductStatusEnum;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
public class ProductInfo {

    @Id
    private String productId;

    private String productName;

    private BigDecimal productPrice;

    private Integer productStock;

    private String productDescription;

    private String productIcon;

    private Integer categoryType;

    private Integer productStatus = ProductStatusEnum.UP.getCode();

    private Date createTime;

    private Date updateTime;

    public ProductInfo() {
    }

    public ProductInfo(String productId, String productName, BigDecimal productPrice, Integer productStock, String productDescription, String productIcon, Integer categoryType, Integer productStatus) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productStock = productStock;
        this.productDescription = productDescription;
        this.productIcon = productIcon;
        this.categoryType = categoryType;
        this.productStatus = productStatus;
    }
}
