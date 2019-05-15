package com.fqivy.sales.controller;

import com.fqivy.sales.service.ProductCategoryService;
import com.fqivy.sales.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Autowired
    private ProductInfoService productInfoService;

    @Autowired
    private ProductCategoryService productCategoryService;

    @RequestMapping("/list")
    public ResultVO list() {
        return null;
    }

}
