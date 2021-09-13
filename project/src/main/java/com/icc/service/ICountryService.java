package com.icc.service;

import com.icc.dto.Country;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICountryService{
    List<Country> getAllCountries();
}
