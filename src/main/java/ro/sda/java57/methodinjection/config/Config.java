package ro.sda.java57.methodinjection.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ro.sda.java57.methodinjection.components.DateFormatProvider;

@Configuration
public class Config {

    @Bean
    public ObjectMapper objectMapper(DateFormatProvider dateFormatProvider) {
        ObjectMapper object = new ObjectMapper();
        object.setDateFormat(dateFormatProvider.getDateFormat());
        return object;
    }
}
