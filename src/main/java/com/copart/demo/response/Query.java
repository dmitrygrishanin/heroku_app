package com.copart.demo.response;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Query{

	@JsonProperty("watchListOnly")
	private boolean watchListOnly;

	@JsonProperty("size")
	private int size;

	@JsonProperty("specificRowProvided")
	private boolean specificRowProvided;

	@JsonProperty("query")
	private List<String> query;

	@JsonProperty("start")
	private int start;

	@JsonProperty("page")
	private int page;

	@JsonProperty("hideImages")
	private boolean hideImages;

	@JsonProperty("defaultSort")
	private boolean defaultSort;

	@JsonProperty("freeFormSearch")
	private boolean freeFormSearch;

	public void setWatchListOnly(boolean watchListOnly){
		this.watchListOnly = watchListOnly;
	}

	public boolean isWatchListOnly(){
		return watchListOnly;
	}

	public void setSize(int size){
		this.size = size;
	}

	public int getSize(){
		return size;
	}

	public void setSpecificRowProvided(boolean specificRowProvided){
		this.specificRowProvided = specificRowProvided;
	}

	public boolean isSpecificRowProvided(){
		return specificRowProvided;
	}

	public void setQuery(List<String> query){
		this.query = query;
	}

	public List<String> getQuery(){
		return query;
	}

	public void setStart(int start){
		this.start = start;
	}

	public int getStart(){
		return start;
	}

	public void setPage(int page){
		this.page = page;
	}

	public int getPage(){
		return page;
	}

	public void setHideImages(boolean hideImages){
		this.hideImages = hideImages;
	}

	public boolean isHideImages(){
		return hideImages;
	}

	public void setDefaultSort(boolean defaultSort){
		this.defaultSort = defaultSort;
	}

	public boolean isDefaultSort(){
		return defaultSort;
	}

	public void setFreeFormSearch(boolean freeFormSearch){
		this.freeFormSearch = freeFormSearch;
	}

	public boolean isFreeFormSearch(){
		return freeFormSearch;
	}

	@Override
 	public String toString(){
		return 
			"Query{" + 
			"watchListOnly = '" + watchListOnly + '\'' + 
			",size = '" + size + '\'' + 
			",specificRowProvided = '" + specificRowProvided + '\'' + 
			",query = '" + query + '\'' + 
			",start = '" + start + '\'' + 
			",page = '" + page + '\'' + 
			",hideImages = '" + hideImages + '\'' + 
			",defaultSort = '" + defaultSort + '\'' + 
			",freeFormSearch = '" + freeFormSearch + '\'' + 
			"}";
		}
}