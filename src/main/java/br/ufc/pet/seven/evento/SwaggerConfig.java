package br.ufc.pet.seven.evento;

import static springfox.documentation.builders.PathSelectors.regex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket produtoApi() {
		return new Docket(DocumentationType.SWAGGER_2)
			.select()
            .apis(
            	RequestHandlerSelectors.
            	basePackage("br.ufc.pet.seven.evento")
            )
            .paths(regex("/evento.*"))
            .build()
            .apiInfo(metaInfo());
	}
	
	private ApiInfo metaInfo() {
		@SuppressWarnings("rawtypes")
		ApiInfo apiInfo = new ApiInfo(
				"SIGE", "Sistema de Gerenciamento de Eventos",
				"1.0", "Antigo SEven",
				new Contact(
					"PET-SI",
					"https://www.github.com/petufc",
					"petufc.quixada@gmail.com"),
                	"MIT License",
                	"https://raw.githubusercontent.com/petufc/sige/master/LICENSE",
                	new ArrayList<VendorExtension>()
				);
		return apiInfo;
	}

}