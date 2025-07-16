package com.cognizant.spring_load_list;
import com.cognizant.spring_load_list.model.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;
import java.util.logging.Logger;

public class SpringLoadListApplication {

    private static final Logger LOGGER = Logger.getLogger(SpringLoadListApplication.class.getName());

    public static void main(String[] args) {
        displayCountries();
    }

    public static void displayCountries() {
        LOGGER.info("START - displayCountries");

        ApplicationContext context = new ClassPathXmlApplicationContext("Country.xml");
        List<Country> countries = (List<Country>) context.getBean("countryList");

        for (Country country : countries) {
            LOGGER.info(country.toString());
        }

        LOGGER.info("END - displayCountries");
    }
}
