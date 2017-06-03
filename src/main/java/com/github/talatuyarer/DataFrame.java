package com.github.talatuyarer;

import java.util.List;

public class DataFrame {
	Column[] columns;
	
	private DataFrame(){}
	
	public DataFrame select(String... columns){
		return null;
	}
	
	public DataFrame where(){
		return null;
	}
	
	public void show(Integer numRows, Boolean truncate) {
		// TODO Auto-generated method stub
	}
	
	public void collect() {
		// TODO Auto-generated method stub

	}
	
	public void describe(String... cols){
		
	}
	
	public List<Column> first(){
		return null;
	}
	
	public List<Row> take(Integer n){
		return null;
	}
	
	public static DataFrameReader read(){
		return null;
	}
	
	public static DataFrameWriter write(){
		return null;
	}	
	
	

}
