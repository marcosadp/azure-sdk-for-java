/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website.models;

import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Reports deleted site including the timestamp of operation.
 */
@JsonFlatten
public class DeletedSite extends Resource {
    /**
     * Time when the site was deleted.
     */
    @JsonProperty(value = "properties.deletedTimestamp")
    private DateTime deletedTimestamp;

    /**
     * Name of web app.
     */
    @JsonProperty(value = "properties.name")
    private String deletedSiteName;

    /**
     * State of the web app.
     */
    @JsonProperty(value = "properties.state", access = JsonProperty.Access.WRITE_ONLY)
    private String state;

    /**
     * Hostnames associated with web app.
     */
    @JsonProperty(value = "properties.hostNames", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> hostNames;

    /**
     * Name of repository site.
     */
    @JsonProperty(value = "properties.repositorySiteName", access = JsonProperty.Access.WRITE_ONLY)
    private String repositorySiteName;

    /**
     * State indicating whether web app has exceeded its quota usage. Possible
     * values include: 'Normal', 'Exceeded'.
     */
    @JsonProperty(value = "properties.usageState", access = JsonProperty.Access.WRITE_ONLY)
    private UsageState usageState;

    /**
     * True if the site is enabled; otherwise, false. Setting this  value to
     * false disables the site (takes the site off line).
     */
    @JsonProperty(value = "properties.enabled")
    private Boolean enabled;

    /**
     * Hostnames for the web app that are enabled. Hostnames need to be
     * assigned and enabled. If some hostnames are assigned but not enabled
     * the app is not served on those hostnames.
     */
    @JsonProperty(value = "properties.enabledHostNames", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> enabledHostNames;

    /**
     * Management information availability state for the web app. Possible
     * values are Normal or Limited.
     * Normal means that the site is running correctly and that
     * management information for the site is available.
     * Limited means that only partial management information for
     * the site is available and that detailed site information is
     * unavailable. Possible values include: 'Normal', 'Limited',
     * 'DisasterRecoveryMode'.
     */
    @JsonProperty(value = "properties.availabilityState", access = JsonProperty.Access.WRITE_ONLY)
    private SiteAvailabilityState availabilityState;

    /**
     * Hostname SSL states are  used to manage the SSL bindings for site's
     * hostnames.
     */
    @JsonProperty(value = "properties.hostNameSslStates")
    private List<HostNameSslState> hostNameSslStates;

    /**
     * The serverFarmId property.
     */
    @JsonProperty(value = "properties.serverFarmId")
    private String serverFarmId;

    /**
     * Last time web app was modified in UTC.
     */
    @JsonProperty(value = "properties.lastModifiedTimeUtc", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastModifiedTimeUtc;

    /**
     * Configuration of web app.
     */
    @JsonProperty(value = "properties.siteConfig")
    private SiteConfig siteConfig;

    /**
     * Read-only list of Azure Traffic manager hostnames associated with web
     * app.
     */
    @JsonProperty(value = "properties.trafficManagerHostNames", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> trafficManagerHostNames;

    /**
     * If set indicates whether web app is deployed as a premium app.
     */
    @JsonProperty(value = "properties.premiumAppDeployed", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean premiumAppDeployed;

    /**
     * If set indicates whether to stop SCM (KUDU) site when the web app is
     * stopped. Default is false.
     */
    @JsonProperty(value = "properties.scmSiteAlsoStopped")
    private Boolean scmSiteAlsoStopped;

    /**
     * Read-only property that specifies which slot this app will swap into.
     */
    @JsonProperty(value = "properties.targetSwapSlot", access = JsonProperty.Access.WRITE_ONLY)
    private String targetSwapSlot;

    /**
     * Specification for the hosting environment (App Service Environment) to
     * use for the web app.
     */
    @JsonProperty(value = "properties.hostingEnvironmentProfile")
    private HostingEnvironmentProfile hostingEnvironmentProfile;

    /**
     */
    @JsonProperty(value = "properties.microService")
    private String microService;

    /**
     * Name of gateway app associated with web app.
     */
    @JsonProperty(value = "properties.gatewaySiteName")
    private String gatewaySiteName;

    /**
     * Specifies if the client affinity is enabled when load balancing http
     * request for multiple instances of the web app.
     */
    @JsonProperty(value = "properties.clientAffinityEnabled")
    private Boolean clientAffinityEnabled;

    /**
     * Specifies if the client certificate is enabled for the web app.
     */
    @JsonProperty(value = "properties.clientCertEnabled")
    private Boolean clientCertEnabled;

    /**
     * Specifies if the public hostnames are disabled the web app.
     * If set to true the app is only accessible via API
     * Management process.
     */
    @JsonProperty(value = "properties.hostNamesDisabled")
    private Boolean hostNamesDisabled;

    /**
     * List of comma separated IP addresses that this web app uses for
     * outbound connections. Those can be used when configuring firewall
     * rules for databases accessed by this web app.
     */
    @JsonProperty(value = "properties.outboundIpAddresses", access = JsonProperty.Access.WRITE_ONLY)
    private String outboundIpAddresses;

    /**
     * This is only valid for web app creation. If specified, web app is
     * cloned from
     * a source web app.
     */
    @JsonProperty(value = "properties.cloningInfo")
    private CloningInfo cloningInfo;

    /**
     * Resource group web app belongs to.
     */
    @JsonProperty(value = "properties.resourceGroup", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGroup;

    /**
     * Get the deletedTimestamp value.
     *
     * @return the deletedTimestamp value
     */
    public DateTime getDeletedTimestamp() {
        return this.deletedTimestamp;
    }

    /**
     * Set the deletedTimestamp value.
     *
     * @param deletedTimestamp the deletedTimestamp value to set
     */
    public void setDeletedTimestamp(DateTime deletedTimestamp) {
        this.deletedTimestamp = deletedTimestamp;
    }

    /**
     * Get the deletedSiteName value.
     *
     * @return the deletedSiteName value
     */
    public String getDeletedSiteName() {
        return this.deletedSiteName;
    }

    /**
     * Set the deletedSiteName value.
     *
     * @param deletedSiteName the deletedSiteName value to set
     */
    public void setDeletedSiteName(String deletedSiteName) {
        this.deletedSiteName = deletedSiteName;
    }

    /**
     * Get the state value.
     *
     * @return the state value
     */
    public String getState() {
        return this.state;
    }

    /**
     * Get the hostNames value.
     *
     * @return the hostNames value
     */
    public List<String> getHostNames() {
        return this.hostNames;
    }

    /**
     * Get the repositorySiteName value.
     *
     * @return the repositorySiteName value
     */
    public String getRepositorySiteName() {
        return this.repositorySiteName;
    }

    /**
     * Get the usageState value.
     *
     * @return the usageState value
     */
    public UsageState getUsageState() {
        return this.usageState;
    }

    /**
     * Get the enabled value.
     *
     * @return the enabled value
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * Set the enabled value.
     *
     * @param enabled the enabled value to set
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Get the enabledHostNames value.
     *
     * @return the enabledHostNames value
     */
    public List<String> getEnabledHostNames() {
        return this.enabledHostNames;
    }

    /**
     * Get the availabilityState value.
     *
     * @return the availabilityState value
     */
    public SiteAvailabilityState getAvailabilityState() {
        return this.availabilityState;
    }

    /**
     * Get the hostNameSslStates value.
     *
     * @return the hostNameSslStates value
     */
    public List<HostNameSslState> getHostNameSslStates() {
        return this.hostNameSslStates;
    }

    /**
     * Set the hostNameSslStates value.
     *
     * @param hostNameSslStates the hostNameSslStates value to set
     */
    public void setHostNameSslStates(List<HostNameSslState> hostNameSslStates) {
        this.hostNameSslStates = hostNameSslStates;
    }

    /**
     * Get the serverFarmId value.
     *
     * @return the serverFarmId value
     */
    public String getServerFarmId() {
        return this.serverFarmId;
    }

    /**
     * Set the serverFarmId value.
     *
     * @param serverFarmId the serverFarmId value to set
     */
    public void setServerFarmId(String serverFarmId) {
        this.serverFarmId = serverFarmId;
    }

    /**
     * Get the lastModifiedTimeUtc value.
     *
     * @return the lastModifiedTimeUtc value
     */
    public DateTime getLastModifiedTimeUtc() {
        return this.lastModifiedTimeUtc;
    }

    /**
     * Get the siteConfig value.
     *
     * @return the siteConfig value
     */
    public SiteConfig getSiteConfig() {
        return this.siteConfig;
    }

    /**
     * Set the siteConfig value.
     *
     * @param siteConfig the siteConfig value to set
     */
    public void setSiteConfig(SiteConfig siteConfig) {
        this.siteConfig = siteConfig;
    }

    /**
     * Get the trafficManagerHostNames value.
     *
     * @return the trafficManagerHostNames value
     */
    public List<String> getTrafficManagerHostNames() {
        return this.trafficManagerHostNames;
    }

    /**
     * Get the premiumAppDeployed value.
     *
     * @return the premiumAppDeployed value
     */
    public Boolean getPremiumAppDeployed() {
        return this.premiumAppDeployed;
    }

    /**
     * Get the scmSiteAlsoStopped value.
     *
     * @return the scmSiteAlsoStopped value
     */
    public Boolean getScmSiteAlsoStopped() {
        return this.scmSiteAlsoStopped;
    }

    /**
     * Set the scmSiteAlsoStopped value.
     *
     * @param scmSiteAlsoStopped the scmSiteAlsoStopped value to set
     */
    public void setScmSiteAlsoStopped(Boolean scmSiteAlsoStopped) {
        this.scmSiteAlsoStopped = scmSiteAlsoStopped;
    }

    /**
     * Get the targetSwapSlot value.
     *
     * @return the targetSwapSlot value
     */
    public String getTargetSwapSlot() {
        return this.targetSwapSlot;
    }

    /**
     * Get the hostingEnvironmentProfile value.
     *
     * @return the hostingEnvironmentProfile value
     */
    public HostingEnvironmentProfile getHostingEnvironmentProfile() {
        return this.hostingEnvironmentProfile;
    }

    /**
     * Set the hostingEnvironmentProfile value.
     *
     * @param hostingEnvironmentProfile the hostingEnvironmentProfile value to set
     */
    public void setHostingEnvironmentProfile(HostingEnvironmentProfile hostingEnvironmentProfile) {
        this.hostingEnvironmentProfile = hostingEnvironmentProfile;
    }

    /**
     * Get the microService value.
     *
     * @return the microService value
     */
    public String getMicroService() {
        return this.microService;
    }

    /**
     * Set the microService value.
     *
     * @param microService the microService value to set
     */
    public void setMicroService(String microService) {
        this.microService = microService;
    }

    /**
     * Get the gatewaySiteName value.
     *
     * @return the gatewaySiteName value
     */
    public String getGatewaySiteName() {
        return this.gatewaySiteName;
    }

    /**
     * Set the gatewaySiteName value.
     *
     * @param gatewaySiteName the gatewaySiteName value to set
     */
    public void setGatewaySiteName(String gatewaySiteName) {
        this.gatewaySiteName = gatewaySiteName;
    }

    /**
     * Get the clientAffinityEnabled value.
     *
     * @return the clientAffinityEnabled value
     */
    public Boolean getClientAffinityEnabled() {
        return this.clientAffinityEnabled;
    }

    /**
     * Set the clientAffinityEnabled value.
     *
     * @param clientAffinityEnabled the clientAffinityEnabled value to set
     */
    public void setClientAffinityEnabled(Boolean clientAffinityEnabled) {
        this.clientAffinityEnabled = clientAffinityEnabled;
    }

    /**
     * Get the clientCertEnabled value.
     *
     * @return the clientCertEnabled value
     */
    public Boolean getClientCertEnabled() {
        return this.clientCertEnabled;
    }

    /**
     * Set the clientCertEnabled value.
     *
     * @param clientCertEnabled the clientCertEnabled value to set
     */
    public void setClientCertEnabled(Boolean clientCertEnabled) {
        this.clientCertEnabled = clientCertEnabled;
    }

    /**
     * Get the hostNamesDisabled value.
     *
     * @return the hostNamesDisabled value
     */
    public Boolean getHostNamesDisabled() {
        return this.hostNamesDisabled;
    }

    /**
     * Set the hostNamesDisabled value.
     *
     * @param hostNamesDisabled the hostNamesDisabled value to set
     */
    public void setHostNamesDisabled(Boolean hostNamesDisabled) {
        this.hostNamesDisabled = hostNamesDisabled;
    }

    /**
     * Get the outboundIpAddresses value.
     *
     * @return the outboundIpAddresses value
     */
    public String getOutboundIpAddresses() {
        return this.outboundIpAddresses;
    }

    /**
     * Get the cloningInfo value.
     *
     * @return the cloningInfo value
     */
    public CloningInfo getCloningInfo() {
        return this.cloningInfo;
    }

    /**
     * Set the cloningInfo value.
     *
     * @param cloningInfo the cloningInfo value to set
     */
    public void setCloningInfo(CloningInfo cloningInfo) {
        this.cloningInfo = cloningInfo;
    }

    /**
     * Get the resourceGroup value.
     *
     * @return the resourceGroup value
     */
    public String getResourceGroup() {
        return this.resourceGroup;
    }

}