/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.network.models;


/**
 * SKU of application gateway.
 */
public class ApplicationGatewaySku {
    /**
     * Gets or sets name of application gateway SKU. Possible values include:
     * 'Standard_Small', 'Standard_Medium', 'Standard_Large'.
     */
    private String name;

    /**
     * Gets or sets tier of application gateway. Possible values include:
     * 'Standard'.
     */
    private String tier;

    /**
     * Gets or sets capacity (instance count) of application gateway.
     */
    private Integer capacity;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the tier value.
     *
     * @return the tier value
     */
    public String getTier() {
        return this.tier;
    }

    /**
     * Set the tier value.
     *
     * @param tier the tier value to set
     */
    public void setTier(String tier) {
        this.tier = tier;
    }

    /**
     * Get the capacity value.
     *
     * @return the capacity value
     */
    public Integer getCapacity() {
        return this.capacity;
    }

    /**
     * Set the capacity value.
     *
     * @param capacity the capacity value to set
     */
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

}