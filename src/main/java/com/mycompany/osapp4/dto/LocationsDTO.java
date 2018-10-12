package com.mycompany.osapp4.dto;

public class LocationsDTO 
{
	private Integer locationId;	
	private String countryId;	
	private String streetAddress;
	private String postalCode;
	private String city;
	private String stateProvince;
	
	public LocationsDTO() 
	{	
	}

	public LocationsDTO(Integer locationId, String countryId, String streetAddress, String postalCode, String city, String stateProvince)
	{
		this.locationId = locationId;
		this.countryId = countryId;
		this.streetAddress = streetAddress;
		this.postalCode = postalCode;
		this.city = city;
		this.stateProvince = stateProvince;
	}

	public Integer getLocationId() {
		return locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStateProvince() {
		return stateProvince;
	}

	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}
}
