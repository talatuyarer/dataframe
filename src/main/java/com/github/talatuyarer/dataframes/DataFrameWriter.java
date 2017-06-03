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
 * Interface used to write a DataFrame to external storage systems
 * 
 * @author tuyarer
 *
 */

public interface DataFrameWriter {

	/**
	 * Specifies the behavior when data or table already exists. Options
	 * include: - `overwrite`: overwrite the existing data. - `append`: append
	 * the data. - `ignore`: ignore the operation (i.e. no-op). - `error`:
	 * default option, throw an exception at runtime.
	 *
	 */
	DataFrameWriter mode(String saveMode);

	/**
	 * Specifies the output data source format.
	 * 
	 * @param source
	 * @return
	 */
	DataFrameWriter format(String source);

	/**
	 * Adds an output option for the underlying data source.
	 * 
	 * @param key
	 * @param value
	 * @return
	 */
	DataFrameWriter option(String key, String value);

	/**
	 * Adds output options for the underlying data source.
	 * 
	 * @param values
	 * @return
	 */
	DataFrameWriter options(Map<String, String> values);

	/**
	 * Saves the content of the `DataFrame` as the specified table.
	 *
	 */
	void save();

	/**
	 * Saves the content of the `DataFrame` at the specified path.
	 *
	 */
	void save(String path);

}
