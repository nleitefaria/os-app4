package com.mycompany.osapp4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.osapp4.entity.Countries;

@Repository
public interface CountriesRepository extends JpaRepository<Countries, String> {

}
