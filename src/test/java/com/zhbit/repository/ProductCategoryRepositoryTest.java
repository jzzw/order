package com.zhbit.repository;

import com.zhbit.dataobject.ProductCategory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;
    @Test
    public  void findOneTest(){
        ProductCategory productCategory = repository.getOne(1);
        System.out.println(productCategory);
    }

    @Test
    public  void saveTest(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("饮料");
        productCategory.setCategoryType(3);
        repository.save(productCategory);
    }

    @Test
    public  void updateTest(){
        ProductCategory productCategory = repository.getOne(2);

        productCategory.setCategoryId(2);
        productCategory.setCategoryName("饮料111");
        productCategory.setCategoryType(7);
        repository.save(productCategory);
    }

    @Test
    public void findByCategoryTypeIn(){
        List<Integer> list = Arrays.asList(2,3,4);
        List<ProductCategory> result = repository.findByCategoryTypeIn(list);

        Assert.assertNotEquals(0,result);
    }
}