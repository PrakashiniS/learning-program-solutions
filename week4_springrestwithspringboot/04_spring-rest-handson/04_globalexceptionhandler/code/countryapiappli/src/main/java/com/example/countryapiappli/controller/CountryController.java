package com.example.countryapiappli.controller;

import com.example.countryapiappli.model.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/countries")
public class CountryController {
    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    @PostMapping
    public Country addCountry(@RequestBody @Valid Country country) {
        LOGGER.info("Inside Controller: addCountry()");
        return country;
    }
}
