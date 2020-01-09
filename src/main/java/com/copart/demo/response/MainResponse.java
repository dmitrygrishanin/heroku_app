package com.copart.demo.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class MainResponse {

	@JsonProperty("returnCode")
	private int returnCode;

	@JsonProperty("returnCodeDesc")
	private String returnCodeDesc;

	@JsonProperty("data")
	private Data data;

	public void setReturnCode(int returnCode){
		this.returnCode = returnCode;
	}

	public int getReturnCode(){
		return returnCode;
	}

	public void setReturnCodeDesc(String returnCodeDesc){
		this.returnCodeDesc = returnCodeDesc;
	}

	public String getReturnCodeDesc(){
		return returnCodeDesc;
	}

	public void setData(Data data){
		this.data = data;
	}

	public Data getData(){
		return data;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"returnCode = '" + returnCode + '\'' + 
			",returnCodeDesc = '" + returnCodeDesc + '\'' + 
			",data = '" + data + '\'' + 
			"}";
		}
}