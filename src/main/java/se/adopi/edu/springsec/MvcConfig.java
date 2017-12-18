package se.adopi.edu.springsec;

import javax.sql.DataSource;

import org.postgresql.Driver;
import org.postgresql.PGProperty;
import org.postgresql.ds.PGSimpleDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("frontpage");
        registry.addViewController("/").setViewName("frontpage");
        registry.addViewController("/hello").setViewName("hello");
        registry.addViewController("/admin").setViewName("admin");
        registry.addViewController("/login").setViewName("login");
    }

    @Bean(name="authDataSource")
    public DataSource getAuthDatasource() {
    	PGSimpleDataSource result = new PGSimpleDataSource();
    	result.setUrl("jdbc:postgresql://localhost:5432/edukonditori");
    	result.setUser("edu");
    	result.setPassword("edu");
    	result.setLogLevel(Driver.DEBUG);
    	return result;
    }
}














