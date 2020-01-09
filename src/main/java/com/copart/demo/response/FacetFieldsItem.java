package com.copart.demo.response;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class FacetFieldsItem{

	@JsonProperty("facetCounts")
	private List<FacetCountsItem> facetCounts;

	@JsonProperty("sequenceNumber")
	private int sequenceNumber;

	@JsonProperty("includeTag")
	private String includeTag;

	@JsonProperty("displayName")
	private String displayName;

	@JsonProperty("quickPickCode")
	private String quickPickCode;

	public void setFacetCounts(List<FacetCountsItem> facetCounts){
		this.facetCounts = facetCounts;
	}

	public List<FacetCountsItem> getFacetCounts(){
		return facetCounts;
	}

	public void setSequenceNumber(int sequenceNumber){
		this.sequenceNumber = sequenceNumber;
	}

	public int getSequenceNumber(){
		return sequenceNumber;
	}

	public void setIncludeTag(String includeTag){
		this.includeTag = includeTag;
	}

	public String getIncludeTag(){
		return includeTag;
	}

	public void setDisplayName(String displayName){
		this.displayName = displayName;
	}

	public String getDisplayName(){
		return displayName;
	}

	public void setQuickPickCode(String quickPickCode){
		this.quickPickCode = quickPickCode;
	}

	public String getQuickPickCode(){
		return quickPickCode;
	}

	@Override
 	public String toString(){
		return 
			"FacetFieldsItem{" + 
			"facetCounts = '" + facetCounts + '\'' + 
			",sequenceNumber = '" + sequenceNumber + '\'' + 
			",includeTag = '" + includeTag + '\'' + 
			",displayName = '" + displayName + '\'' + 
			",quickPickCode = '" + quickPickCode + '\'' + 
			"}";
		}
}