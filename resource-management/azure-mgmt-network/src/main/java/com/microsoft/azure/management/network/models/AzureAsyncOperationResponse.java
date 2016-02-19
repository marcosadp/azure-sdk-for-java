/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.azure.management.network.models;

/**
* The response body contains the status of the specified asynchronous
* operation, indicating whether it has succeeded, is inprogress, or has
* failed. Note that this status is distinct from the HTTP status code returned
* for the Get Operation Status operation itself. If the asynchronous operation
* succeeded, the response body includes the HTTP status code for the
* successful request. If the asynchronous operation failed, the response body
* includes the HTTP status code for the failed request and error information
* regarding the failure.
*/
public class AzureAsyncOperationResponse extends RetriableOperationResponse {
    private String status;
    
    /**
    * Optional. Status of the AzureAsuncOperation
    * @return The Status value.
    */
    public String getStatus() {
        return this.status;
    }
    
    /**
    * Optional. Status of the AzureAsuncOperation
    * @param statusValue The Status value.
    */
    public void setStatus(final String statusValue) {
        this.status = statusValue;
    }
}