package com.zhbit.repository;

import com.zhbit.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {
    @Autowired
    ProductInfoRepository productInfoRepository;

    @Test
    public void saveTest(){
        ProductInfo productInfo =new ProductInfo();
        productInfo.setProductId("123456");
        productInfo.setProductName("奶茶");
        productInfo.setProductPrice(new BigDecimal(8));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("好喝的茶");
        productInfo.setProductStatus(0);
        productInfo.setProductIcon("1.jpg");
        productInfo.setCategoryType(2);

        ProductInfo result = productInfoRepository.save(productInfo);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByProductStatus() throws Exception{
       List<ProductInfo> productInfoList =  productInfoRepository.findByProductStatus(0);
       Assert.assertNotEquals(0,productInfoList.size());
    }
}