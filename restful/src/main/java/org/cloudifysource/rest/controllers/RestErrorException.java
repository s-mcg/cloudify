/*******************************************************************************
 * Copyright (c) 2012 GigaSpaces Technologies Ltd. All rights reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package org.cloudifysource.rest.controllers;

import java.util.Map;

import org.cloudifysource.rest.util.RestUtils;

/**
 * This exception will be thrown on known errors in the rest.
 * an appropriate error message will be constructed from the error description. 
 */
public class RestErrorException extends Exception {

	private static final long serialVersionUID = 1L;

	private Map<String, Object> errorDescription;

	private String verboseData;
	
	public RestErrorException(final String errorDesc) {
		super(errorDesc);
		this.errorDescription = RestUtils.errorStatus(errorDesc);
	}

	public RestErrorException(final String errorDesc, final Object... args) {
		super(errorDesc);
		this.errorDescription = RestUtils.errorStatus(errorDesc, args);
	}
	
	public Map<String, Object> getErrorDescription() {
		return this.errorDescription;
	}
	

	public String getVerboseData() {
		return verboseData;
	}

	public void setVerboseData(final String verboseData) {
		this.verboseData = verboseData;
	}
	
}

