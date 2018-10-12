package com.mycompany.osapp4.dto;

public class RegionsDTO 
{
	private int regionId;
    private String regionName;
    
    public RegionsDTO() 
	{	
	}
    
	public RegionsDTO(int regionId, String regionName) 
	{	
		this.regionId = regionId;
		this.regionName = regionName;
	}

	public int getRegionId() {
		return regionId;
	}

	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	} 

}
