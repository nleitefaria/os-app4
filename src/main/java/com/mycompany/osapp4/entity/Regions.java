package com.mycompany.osapp4.entity;
// Generated 9/out/2018 20:31:08 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Regions generated by hbm2java
 */
@Entity
@Table(name="REGIONS" ,catalog="hr"
)
public class Regions  implements java.io.Serializable {

     private int regionId;
     private String regionName;
     @JsonIgnore
     private Set<Countries> countrieses = new HashSet<Countries>(0);

    public Regions() {
    }

	
    public Regions(int regionId) {
        this.regionId = regionId;
    }
    public Regions(int regionId, String regionName, Set<Countries> countrieses) {
       this.regionId = regionId;
       this.regionName = regionName;
       this.countrieses = countrieses;
    }
   
     @Id 

    
    @Column(name="region_id", unique=true, nullable=false)
    public int getRegionId() {
        return this.regionId;
    }
    
    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    
    @Column(name="region_name", length=25)
    public String getRegionName() {
        return this.regionName;
    }
    
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="regions")
    public Set<Countries> getCountrieses() {
        return this.countrieses;
    }
    
    public void setCountrieses(Set<Countries> countrieses) {
        this.countrieses = countrieses;
    }




}


