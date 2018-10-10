package com.mycompany.osapp4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mycompany.osapp4.entity.Jobs;

@Repository
public interface JobsRepository extends JpaRepository<Jobs, String> 
{
}
