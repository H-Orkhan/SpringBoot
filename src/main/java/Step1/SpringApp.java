package Step1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringApp extends SpringBootServletInitializer {

    //We need to extend the class SpringBootServletInitializer
    //to support WAR file deployment.
    @Override
    protected SpringApplicationBuilder configure (
            SpringApplicationBuilder applicationBuilder) {
        return applicationBuilder.sources(SpringApp.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringApp.class,args);
    }
}
