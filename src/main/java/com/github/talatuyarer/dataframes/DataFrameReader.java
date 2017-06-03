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

import java.util.Map;

/**
 * Interface used to load a DataFrame from external storage systems
 * 
 * @author tuyarer
 *
 */

public interface DataFrameReader {
	
	/**
	 * Specifies the input data source format.
	 * @param source
	 * @return
	 */
	DataFrameReader format(String source);
	
	/**
	 * Adds an input option for the underlying data source.
	 * @param key
	 * @param value
	 * @return
	 */
	DataFrameReader option(String key, String value);
	
	/**
	 * Adds input options for the underlying data source.
	 * @param values
	 * @return
	 */
	DataFrameReader options(Map<String, String> values);
	
	/**
	 * Loads input in as a `DataFrame`, for data sources that don't require a path
	 * @return
	 */
	DataFrame load();
	
	/**
	 * Loads input in as a `DataFrame`, for data sources that require a path 
	 * @return
	 */
	DataFrame load(String path);

}
