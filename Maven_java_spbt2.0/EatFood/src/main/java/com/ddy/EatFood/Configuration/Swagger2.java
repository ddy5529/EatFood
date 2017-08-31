package com.ddy.EatFood.Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@EnableConfigurationProperties(SwaggerProperties.class)
public class Swagger2 {
    @Autowired
    private SwaggerProperties config;

    @Bean
    public Docket createRestApi() {         //通过createRestApi函数创建Docket的Bean
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select().apis(RequestHandlerSelectors.basePackage(config.getBasePackage()))          //select()函数返回一个ApiSelectorBuilder实例用来控制哪些接口暴露给Swagger来展现，本例采用指定扫描的包路径来定义，Swagger会扫描该包下所有Controller定义的API，并产生文档内容（除了被@ApiIgnore指定的请求）。
                .paths(PathSelectors.any()).build();
    }

    private ApiInfo apiInfo() {     //apiInfo()用来创建该Api的基本信息（这些基本信息会展现在文档页面中）
        return new ApiInfoBuilder()
                .title(config.getTitle())
                .description(config.getDescription())
                .termsOfServiceUrl(config.getTermsOfServiceUrl())
                .contact(new Contact(config.getAuthor(),config.getBlogUrl(),config.getEmail()))
                .version(config.getVersion())
                .build();
    }
}
