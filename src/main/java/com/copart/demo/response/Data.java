package com.copart.demo.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Data{

	@JsonProperty("query")
	private Query query;

	@JsonProperty("results")
	private Results results;

	public void setQuery(Query query){
		this.query = query;
	}

	public Query getQuery(){
		return query;
	}

	public void setResults(Results results){
		this.results = results;
	}

	public Results getResults(){
		return results;
	}

	@Override
 	public String toString(){
		return 
			"Data{" + 
			"query = '" + query + '\'' + 
			",results = '" + results + '\'' + 
			"}";
		}
}