/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Response for a migration of app content request.
 */
@JsonFlatten
public class StorageMigrationResponseInner extends Resource {
    /**
     * When server starts the migration process, it will return an operation
     * ID identifying that particular migration operation.
     */
    @JsonProperty(value = "properties.operationId", access = JsonProperty.Access.WRITE_ONLY)
    private String operationId;

    /**
     * Get the operationId value.
     *
     * @return the operationId value
     */
    public String operationId() {
        return this.operationId;
    }

}
