package net.ifaye.ecommerce.config;

import net.ifaye.ecommerce.entities.Product;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {

        HttpMethod[] unSupportedMethods = {HttpMethod.POST,HttpMethod.PUT,HttpMethod.DELETE};
        config
                .getExposureConfiguration()
                .forDomainType(Product.class)
                .withItemExposure(((metdata, httpMethods) -> httpMethods.disable(unSupportedMethods)))
                .withCollectionExposure(((metdata, httpMethods) -> httpMethods.disable(unSupportedMethods)));
        //RepositoryRestConfigurer.super.configureRepositoryRestConfiguration(config, cors);
    }
}
