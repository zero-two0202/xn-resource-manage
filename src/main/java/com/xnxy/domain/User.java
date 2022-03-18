package com.xnxy.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.Data;

/**
 * @author 钟国煜
 * @creat 2022-03-16-14:50
 */
//通过lombok生成get,set,toString方法
@Data
@ApiModel("User(用户类)")
public class User {
    @ApiModelProperty("用户的id")
    private Integer id;
    @ApiModelProperty("用户的用户名")
    private String userUsername;
    @ApiModelProperty("用户的密码")
    private String userPassword;
    @ApiModelProperty("用户的头像")
    private String userPicture;
    @ApiModelProperty("用户的预约记录")
    private Integer userRecordId;
}
