package com.icc.serviceImpl;

import com.icc.dto.Country;
import com.icc.propertyConstant.CountryConstant;
import com.icc.service.ICountryService;

import java.util.ArrayList;
import java.util.List;

public class CountryServiceImpl implements ICountryService{
    @Override
    public List<Country> getAllCountries(){
        var countryValues = CountryConstant.values();
        var countryList  = new ArrayList<Country>();
        for(var item:
            countryValues){
        var country = new Country();
            country.setCountryName(item.name());
            country.setCountryText(item.getValue());
            countryList.add(country);
        }
        return countryList;
    }
}
