package com.lxh.six.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Value("${springfox.documentation.swagger.enable}")
    private boolean enableSwagger;

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Swagger API")
                .description("six document")
                .license("Apache 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
                .termsOfServiceUrl("")
                .version("1.0.0")
                .contact(new Contact("", "", "lxhcnasiaworld@gmail.com"))
                .build();
    }

    @Bean
    public Docket api() {
        List<Parameter> globalParams = new ArrayList<Parameter>();
        ParameterBuilder ticketParams1 = new ParameterBuilder();
        ticketParams1.name("X-Token").description("SSO认证令牌")
                .modelRef(new ModelRef("string")).parameterType("header")
                .required(true).build();
        ParameterBuilder ticketParams2 = new ParameterBuilder();
        ticketParams2
                .name("X-Data").description("登录用户数据")
                .modelRef(new ModelRef("string")).parameterType("header")
                .required(true).build();
        globalParams.add(ticketParams1.build());
        globalParams.add(ticketParams2.build());

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .enable(enableSwagger)
                .select()
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .build()
                .globalOperationParameters(globalParams);
    }
}
