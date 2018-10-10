package com.mycompany.osapp4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.osapp4.entity.Locations;

@Repository
public interface LocationsRepository extends JpaRepository<Locations, Integer> {

}
