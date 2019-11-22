package com.zhbit.service;

import com.zhbit.dataobject.ProductInfo;

import java.util.List;

public interface ProductService {
    ProductInfo finOne(String productId);

    /**
     * 查询所有在架商品列表
     * @return
     */
    List<ProductInfo> findUpAll();

}
