package com.xnxy.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author 钟国煜
 * @creat 2022-03-17-20:00
 */
@Data
@ApiModel("结果集类(返回数据的同意结果集)")
public class ResultList {
    @ApiModelProperty("返回结果集的状态编码，默认为200")
    private String code = "200";
    @ApiModelProperty("所有结果的数据体")
    private Object data;

    public ResultList(){}
    ResultList(String code){
        this.code = code;
    }
    ResultList(String code,Object data){
        this.code = code;
        this.data = data;
    }
}
