package com.zhbit.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Proxy;
import javax.persistence.Id;
import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
@Data
@DynamicUpdate
@Proxy(lazy = false)
public class ProductInfo {
    @Id
    private String productId;
    /** 名称**/
    private String productName;
    /** 价格**/
    private BigDecimal productPrice;
    /** 库存**/
    private Integer productStock;
    /** 描述**/
    private String productDescription;
    /** 小图**/
    private String productIcon;
    /** 商品状态,0正常1下架 **/
    private Integer productStatus;
    /** 类目编号**/
    private Integer categoryType;
}
