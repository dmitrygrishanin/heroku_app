package com.copart.demo.response;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Results{

	@JsonProperty("realTime")
	private boolean realTime;

	@JsonProperty("suggestions")
	private Object suggestions;

	@JsonProperty("spellCheckList")
	private Object spellCheckList;

	@JsonProperty("facetFields")
	private List<FacetFieldsItem> facetFields;

	@JsonProperty("content")
	private List<ContentItem> content;

	@JsonProperty("totalElements")
	private int totalElements;

	public void setRealTime(boolean realTime){
		this.realTime = realTime;
	}

	public boolean isRealTime(){
		return realTime;
	}

	public void setSuggestions(Object suggestions){
		this.suggestions = suggestions;
	}

	public Object getSuggestions(){
		return suggestions;
	}

	public void setSpellCheckList(Object spellCheckList){
		this.spellCheckList = spellCheckList;
	}

	public Object getSpellCheckList(){
		return spellCheckList;
	}

	public void setFacetFields(List<FacetFieldsItem> facetFields){
		this.facetFields = facetFields;
	}

	public List<FacetFieldsItem> getFacetFields(){
		return facetFields;
	}

	public void setContent(List<ContentItem> content){
		this.content = content;
	}

	public List<ContentItem> getContent(){
		return content;
	}

	public void setTotalElements(int totalElements){
		this.totalElements = totalElements;
	}

	public int getTotalElements(){
		return totalElements;
	}

	@Override
 	public String toString(){
		return 
			"Results{" + 
			"realTime = '" + realTime + '\'' + 
			",suggestions = '" + suggestions + '\'' + 
			",spellCheckList = '" + spellCheckList + '\'' + 
			",facetFields = '" + facetFields + '\'' + 
			",content = '" + content + '\'' + 
			",totalElements = '" + totalElements + '\'' + 
			"}";
		}
}