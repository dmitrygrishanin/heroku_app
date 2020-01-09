package com.copart.demo.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
@JsonIgnoreProperties(ignoreUnknown = true)
public class FacetCountsItem{

	@JsonProperty("sequenceNumber")
	private int sequenceNumber;

	@JsonProperty("displayName")
	private String displayName;

	@JsonProperty("query")
	private String query;

	@JsonProperty("count")
	private int count;

	@JsonProperty("columnName")
	private String columnName;

	public void setSequenceNumber(int sequenceNumber){
		this.sequenceNumber = sequenceNumber;
	}

	public int getSequenceNumber(){
		return sequenceNumber;
	}

	public void setDisplayName(String displayName){
		this.displayName = displayName;
	}

	public String getDisplayName(){
		return displayName;
	}

	public void setQuery(String query){
		this.query = query;
	}

	public String getQuery(){
		return query;
	}

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
	}

	public void setColumnName(String columnName){
		this.columnName = columnName;
	}

	public String getColumnName(){
		return columnName;
	}

	@Override
 	public String toString(){
		return 
			"FacetCountsItem{" + 
			"sequenceNumber = '" + sequenceNumber + '\'' + 
			",displayName = '" + displayName + '\'' + 
			",query = '" + query + '\'' + 
			",count = '" + count + '\'' + 
			",columnName = '" + columnName + '\'' + 
			"}";
		}
}