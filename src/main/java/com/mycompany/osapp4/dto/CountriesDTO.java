package com.mycompany.osapp4.dto;

public class CountriesDTO 
{
	private String countryId;
	private Integer regionID;
	private String countryName;

	public CountriesDTO()
	{		
	}

	public CountriesDTO(String countryId, Integer regionID, String countryName) 
	{
		this.countryId = countryId;
		this.regionID = regionID;
		this.countryName = countryName;
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public Integer getRegionID() {
		return regionID;
	}

	public void setRegionID(Integer regionID) {
		this.regionID = regionID;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
}
