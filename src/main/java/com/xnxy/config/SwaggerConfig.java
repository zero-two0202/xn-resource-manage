package com.xnxy.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @author 钟国煜
 * @creat 2022-03-13-20:11
 */
@Configuration  //将配置类加入spring容器中
@EnableSwagger2 //开启swagger2
public class SwaggerConfig {

    //配置了swagger的bean实例
    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("hello")
                .enable(true)
                .groupName("xiang nan xue yuan")
                .select()

                .build()
                ;
    }
    private ApiInfo apiInfo(){
        //作者信息
        Contact contact = new Contact("zgy","localhost","1839801730@qq.com");
        return new ApiInfo(
                "swagger接口文档",
                "很牛逼的文档",
                "v1.0",
                "https://www.baidu.com",
                contact,
                "Apache 2.0",
                "localhosh:8080",
                new ArrayList<>()
        );
    }
}
