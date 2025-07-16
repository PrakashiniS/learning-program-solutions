package com.example.countryapi.service;
import com.example.countryapi.model.Country;
import com.example.countryapi.repository.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    private final CountryRepository repository;

    public CountryService(CountryRepository repository) {
        this.repository = repository;
    }

    public List<Country> getAllCountries() {
        return repository.findAll();
    }

    public Optional<Country> getCountryByCode(String code) {
        return repository.findById(code);
    }

    public Country createCountry(Country country) {
        return repository.save(country);
    }

    public Country updateCountry(Country country) {
        return repository.save(country);
    }

    public void deleteCountry(String code) {
        repository.deleteById(code);
    }
}
