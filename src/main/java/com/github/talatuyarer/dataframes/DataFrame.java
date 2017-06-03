/*
* Licensed to the Apache Software Foundation (ASF) under one or more
* contributor license agreements.  See the NOTICE file distributed with
* this work for additional information regarding copyright ownership.
* The ASF licenses this file to You under the Apache License, Version 2.0
* (the "License"); you may not use this file except in compliance with
* the License.  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package com.github.talatuyarer.dataframes;

import java.util.ArrayList;
import java.util.List;

public class DataFrame {

	private Column[] columns;

	private DataFrame() {
	}

	/**
	 * Displays the {@link DataFrame} in a tabular form.
	 * 
	 * @param numRows
	 * @param truncate
	 */
	public void show(Integer numRows, Boolean truncate) {
		// TODO Auto-generated method stub
	}

	/**
	 * Returns an array that contains all of Rows in this DataFrame.
	 */
	public ArrayList<Row> collect() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Returns the first row.
	 * 
	 * @return
	 */
	public List<Column> first() {
		return null;
	}

	/**
	 * Returns the first n rows in the DataFrame.
	 * 
	 * @param n
	 * @return
	 */
	public List<Row> take(Integer n) {
		return null;
	}

	/**
	 * Returns a DataFrameReader which helps to create a DataFrame
	 *
	 * @return
	 */
	public static DataFrameReader read() {
		return null;
	}

	/**
	 * Returns a DataFrameWriter which helps to save a DataFrame to somewhere
	 *
	 * @return
	 */
	public static DataFrameWriter write() {
		return null;
	}

	/**
	 * Returns all column names as an array.
	 * 
	 * @return
	 */
	public ArrayList<String> getColumns() {
		return null;
	}

	/**
	 * Returns a new DataFrame that contains only the unique rows from this
	 * DataFrame.
	 */
	public DataFrame distinct() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Returns a new DataFrame by taking the first n rows.
	 * 
	 * @return
	 */
	public DataFrame limit() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Returns a new DataFrame sorted by the given expressions.
	 * 
	 * @return
	 */
	public DataFrame orderBy(Column... sortExprs) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Returns a new DataFrame by sampling a fraction of rows, using a random
	 * seed.
	 * 
	 * @return
	 */
	public DataFrame sample(Boolean random, Double fraction) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Selects a set of columns and return new dataframe
	 * 
	 * @param columns
	 * @return
	 */
	public DataFrame select(String... columns) {
		return null;
	}

	/**
	 * Filters rows using the given SQL expression.
	 * 
	 * @return
	 */
	public DataFrame where(String condition) {
		return null;
	}

	/**
	 * Returns a new DataFrame by adding a column or replacing the existing
	 * column that has the same name..
	 * 
	 * @return
	 */
	public DataFrame withColumn(String colName, Column col) {
		return null;
	}

	/**
	 * Returns a new DataFrame with a column renamed.
	 * 
	 * @return
	 */
	public DataFrame withColumnRenamed(String existingName, String newName) {
		return null;
	}

}
