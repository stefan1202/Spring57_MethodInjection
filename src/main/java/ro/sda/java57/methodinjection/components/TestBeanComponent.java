package ro.sda.java57.methodinjection.components;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class TestBeanComponent implements CommandLineRunner {

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public void run(String... args) throws Exception {
        Date date = new Date();
        System.out.println(objectMapper.writeValueAsString(date));
    }
}
