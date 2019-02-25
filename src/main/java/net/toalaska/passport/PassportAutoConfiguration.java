package net.toalaska.passport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;


@Configuration
//@EnableConfigurationProperties(PassportProperties.class)

public class PassportAutoConfiguration {
//    @Autowired
//    PassportProperties passportProperties;

    @Bean
//    @ConditionalOnMissingBean
    public PassportClient passportClient(){
        return new PassportClient();
    }
}
