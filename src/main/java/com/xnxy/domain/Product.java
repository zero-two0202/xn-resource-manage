package com.xnxy.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Data;

/**
 * @author 钟国煜
 * @creat 2022-03-17-19:47
 */
@Data
@ApiModel("Product(商品类)")
public class Product {
    @ApiModelProperty("商品id号")
    private Integer id;
    @ApiModelProperty("商品信息的描述")
    private String pDesc;
    @ApiModelProperty("商品的图片信息")
    private String pPicture;
    @ApiModelProperty("商品需求的数量，默认为0")
    private Integer pNeed;
}
