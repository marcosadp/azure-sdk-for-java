/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website.models;

import java.util.List;

/**
 * Describes main public ip address and any extra vips.
 */
public class AddressResponse {
    /**
     * Main public vip.
     */
    private String serviceIpAddress;

    /**
     * VNET internal ip address of the hostingEnvironment (App Service
     * Environment) if it is in internal load-balancing mode.
     */
    private String internalIpAddress;

    /**
     * IP addresses appearing on outbound connections.
     */
    private List<String> outboundIpAddresses;

    /**
     * Additional vips.
     */
    private List<VirtualIPMapping> vipMappings;

    /**
     * Get the serviceIpAddress value.
     *
     * @return the serviceIpAddress value
     */
    public String getServiceIpAddress() {
        return this.serviceIpAddress;
    }

    /**
     * Set the serviceIpAddress value.
     *
     * @param serviceIpAddress the serviceIpAddress value to set
     */
    public void setServiceIpAddress(String serviceIpAddress) {
        this.serviceIpAddress = serviceIpAddress;
    }

    /**
     * Get the internalIpAddress value.
     *
     * @return the internalIpAddress value
     */
    public String getInternalIpAddress() {
        return this.internalIpAddress;
    }

    /**
     * Set the internalIpAddress value.
     *
     * @param internalIpAddress the internalIpAddress value to set
     */
    public void setInternalIpAddress(String internalIpAddress) {
        this.internalIpAddress = internalIpAddress;
    }

    /**
     * Get the outboundIpAddresses value.
     *
     * @return the outboundIpAddresses value
     */
    public List<String> getOutboundIpAddresses() {
        return this.outboundIpAddresses;
    }

    /**
     * Set the outboundIpAddresses value.
     *
     * @param outboundIpAddresses the outboundIpAddresses value to set
     */
    public void setOutboundIpAddresses(List<String> outboundIpAddresses) {
        this.outboundIpAddresses = outboundIpAddresses;
    }

    /**
     * Get the vipMappings value.
     *
     * @return the vipMappings value
     */
    public List<VirtualIPMapping> getVipMappings() {
        return this.vipMappings;
    }

    /**
     * Set the vipMappings value.
     *
     * @param vipMappings the vipMappings value to set
     */
    public void setVipMappings(List<VirtualIPMapping> vipMappings) {
        this.vipMappings = vipMappings;
    }

}