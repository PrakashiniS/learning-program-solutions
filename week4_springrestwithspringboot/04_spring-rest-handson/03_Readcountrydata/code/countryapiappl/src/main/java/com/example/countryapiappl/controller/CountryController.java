package com.example.countryapiappl.controller;

import com.example.countryapiappl.model.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/countries")
public class CountryController {

    private static final Logger logger = LoggerFactory.getLogger(CountryController.class);

    @PostMapping
    public Country addCountry(@RequestBody Country country) {
        logger.info("Start");
        logger.info("Received Country: {}", country);
        return country;
    }
}
