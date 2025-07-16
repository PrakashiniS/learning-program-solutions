package com.example.countryapi.controller;
import com.example.countryapi.model.Country;
import com.example.countryapi.service.CountryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/countries") // Same URL for all methods
public class CountryController {

    private final CountryService service;

    public CountryController(CountryService service) {
        this.service = service;
    }

    // Get all countries
    @GetMapping
    public List<Country> getAllCountries() {
        return service.getAllCountries();
    }

    // Get a specific country by code
    @GetMapping("/{code}")
    public ResponseEntity<Country> getCountry(@PathVariable String code) {
        return service.getCountryByCode(code)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Create a new country
    @PostMapping
    public ResponseEntity<Country> createCountry(@RequestBody Country country) {
        return ResponseEntity.ok(service.createCountry(country));
    }

    // Update a country
    @PutMapping
    public ResponseEntity<Country> updateCountry(@RequestBody Country country) {
        return ResponseEntity.ok(service.updateCountry(country));
    }

    // Delete a country
    @DeleteMapping("/{code}")
    public ResponseEntity<Void> deleteCountry(@PathVariable String code) {
        service.deleteCountry(code);
        return ResponseEntity.noContent().build();
    }
}
