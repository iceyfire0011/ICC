package com.icc.repository;

import com.icc.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Repository
@Transactional
public interface CountryRepository extends JpaRepository<Country, UUID>{
    Optional<Country> findByCountryName(String countryName);
}
