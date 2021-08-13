package cybersoft.javabackend.java12.gira.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration //config nào cũng phải có annotation này để spring boot scan các file và load config
@EnableSwagger2 //kích hoặt swagger 2
public class SwaggerConfig {
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
		.select()
		.apis(RequestHandlerSelectors.basePackage("cybersoft.javabackend.java12.gira"))
		.build()
		.apiInfo(apiInfo());
	}
	private ApiInfo apiInfo() {
		// TODO Auto-generated method stub
		return new ApiInfoBuilder()
				.title("Gira project")
				.description("for edu")
				.contact(new Contact("Vuu Tan", "null", "tanvuu998@gmail.com"))
				.license("MIT2")
				.build();
	}
	
}
