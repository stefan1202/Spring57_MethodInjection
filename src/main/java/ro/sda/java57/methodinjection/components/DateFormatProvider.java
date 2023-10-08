package ro.sda.java57.methodinjection.components;

import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.util.Date;

@Component
public class DateFormatProvider {
    public DateFormat getDateFormat() {
        return DateFormat.getDateInstance();
    }

}
