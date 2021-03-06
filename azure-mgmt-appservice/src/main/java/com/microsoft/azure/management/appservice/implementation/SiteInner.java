/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.implementation;

import java.util.List;
import com.microsoft.azure.management.appservice.UsageState;
import com.microsoft.azure.management.appservice.SiteAvailabilityState;
import com.microsoft.azure.management.appservice.HostNameSslState;
import org.joda.time.DateTime;
import com.microsoft.azure.management.appservice.HostingEnvironmentProfile;
import com.microsoft.azure.management.appservice.CloningInfo;
import com.microsoft.azure.management.appservice.SlotSwapStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * A web app, a mobile app backend, or an API app.
 */
@JsonFlatten
public class SiteInner extends Resource {
    /**
     * Current state of the app.
     */
    @JsonProperty(value = "properties.state", access = JsonProperty.Access.WRITE_ONLY)
    private String state;

    /**
     * Hostnames associated with the app.
     */
    @JsonProperty(value = "properties.hostNames", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> hostNames;

    /**
     * Name of the repository site.
     */
    @JsonProperty(value = "properties.repositorySiteName", access = JsonProperty.Access.WRITE_ONLY)
    private String repositorySiteName;

    /**
     * State indicating whether the app has exceeded its quota usage.
     * Read-only. Possible values include: 'Normal', 'Exceeded'.
     */
    @JsonProperty(value = "properties.usageState", access = JsonProperty.Access.WRITE_ONLY)
    private UsageState usageState;

    /**
     * &lt;code&gt;true&lt;/code&gt; if the app is enabled; otherwise,
     * &lt;code&gt;false&lt;/code&gt;. Setting this value to false disables
     * the app (takes the app offline).
     */
    @JsonProperty(value = "properties.enabled")
    private Boolean enabled;

    /**
     * Enabled hostnames for the app.Hostnames need to be assigned (see
     * HostNames) AND enabled. Otherwise,
     * the app is not served on those hostnames.
     */
    @JsonProperty(value = "properties.enabledHostNames", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> enabledHostNames;

    /**
     * Management information availability state for the app. Possible values
     * include: 'Normal', 'Limited', 'DisasterRecoveryMode'.
     */
    @JsonProperty(value = "properties.availabilityState", access = JsonProperty.Access.WRITE_ONLY)
    private SiteAvailabilityState availabilityState;

    /**
     * Hostname SSL states are used to manage the SSL bindings for app's
     * hostnames.
     */
    @JsonProperty(value = "properties.hostNameSslStates")
    private List<HostNameSslState> hostNameSslStates;

    /**
     * Resource ID of the associated App Service plan, formatted as:
     * "/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms/{appServicePlanName}".
     */
    @JsonProperty(value = "properties.serverFarmId")
    private String serverFarmId;

    /**
     * &lt;code&gt;true&lt;/code&gt; if reserved; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "properties.reserved")
    private Boolean reserved;

    /**
     * Last time the app was modified, in UTC. Read-only.
     */
    @JsonProperty(value = "properties.lastModifiedTimeUtc", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastModifiedTimeUtc;

    /**
     * Configuration of the app.
     */
    @JsonProperty(value = "properties.siteConfig")
    private SiteConfigInner siteConfig;

    /**
     * Azure Traffic Manager hostnames associated with the app. Read-only.
     */
    @JsonProperty(value = "properties.trafficManagerHostNames", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> trafficManagerHostNames;

    /**
     * Indicates whether app is deployed as a premium app.
     */
    @JsonProperty(value = "properties.premiumAppDeployed", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean premiumAppDeployed;

    /**
     * &lt;code&gt;true&lt;/code&gt; to stop SCM (KUDU) site when the app is
     * stopped; otherwise, &lt;code&gt;false&lt;/code&gt;. The default is
     * &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "properties.scmSiteAlsoStopped")
    private Boolean scmSiteAlsoStopped;

    /**
     * Specifies which deployment slot this app will swap into. Read-only.
     */
    @JsonProperty(value = "properties.targetSwapSlot", access = JsonProperty.Access.WRITE_ONLY)
    private String targetSwapSlot;

    /**
     * App Service Environment to use for the app.
     */
    @JsonProperty(value = "properties.hostingEnvironmentProfile")
    private HostingEnvironmentProfile hostingEnvironmentProfile;

    /**
     * Micro services like apps, logic apps.
     */
    @JsonProperty(value = "properties.microService")
    private String microService;

    /**
     * Name of gateway app associated with the app.
     */
    @JsonProperty(value = "properties.gatewaySiteName")
    private String gatewaySiteName;

    /**
     * &lt;code&gt;true&lt;/code&gt; to enable client affinity;
     * &lt;code&gt;false&lt;/code&gt; to stop sending session affinity
     * cookies, which route client requests in the same session to the same
     * instance. Default is &lt;code&gt;true&lt;/code&gt;.
     */
    @JsonProperty(value = "properties.clientAffinityEnabled")
    private Boolean clientAffinityEnabled;

    /**
     * &lt;code&gt;true&lt;/code&gt; to enable client certificate
     * authentication (TLS mutual authentication); otherwise,
     * &lt;code&gt;false&lt;/code&gt;. Default is
     * &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "properties.clientCertEnabled")
    private Boolean clientCertEnabled;

    /**
     * &lt;code&gt;true&lt;/code&gt; to disable the public hostnames of the
     * app; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * If &lt;code&gt;true&lt;/code&gt;, the app is only accessible via API
     * management process.
     */
    @JsonProperty(value = "properties.hostNamesDisabled")
    private Boolean hostNamesDisabled;

    /**
     * List of IP addresses that the app uses for outbound connections (e.g.
     * database access). Read-only.
     */
    @JsonProperty(value = "properties.outboundIpAddresses", access = JsonProperty.Access.WRITE_ONLY)
    private String outboundIpAddresses;

    /**
     * Size of the function container.
     */
    @JsonProperty(value = "properties.containerSize")
    private Integer containerSize;

    /**
     * Maximum allowed daily memory-time quota (applicable on dynamic apps
     * only).
     */
    @JsonProperty(value = "properties.dailyMemoryTimeQuota")
    private Integer dailyMemoryTimeQuota;

    /**
     * App suspended till in case memory-time quota is exceeded.
     */
    @JsonProperty(value = "properties.suspendedTill", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime suspendedTill;

    /**
     * Maximum number of workers.
     * This only applies to Functions container.
     */
    @JsonProperty(value = "properties.maxNumberOfWorkers", access = JsonProperty.Access.WRITE_ONLY)
    private Integer maxNumberOfWorkers;

    /**
     * If specified during app creation, the app is cloned from a source app.
     */
    @JsonProperty(value = "properties.cloningInfo")
    private CloningInfo cloningInfo;

    /**
     * Name of the resource group the app belongs to. Read-only.
     */
    @JsonProperty(value = "properties.resourceGroup", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGroup;

    /**
     * &lt;code&gt;true&lt;/code&gt; if the app is a default container;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "properties.isDefaultContainer", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isDefaultContainer;

    /**
     * Default hostname of the app. Read-only.
     */
    @JsonProperty(value = "properties.defaultHostName", access = JsonProperty.Access.WRITE_ONLY)
    private String defaultHostName;

    /**
     * Status of the last deployment slot swap operation.
     */
    @JsonProperty(value = "properties.slotSwapStatus", access = JsonProperty.Access.WRITE_ONLY)
    private SlotSwapStatus slotSwapStatus;

    /**
     * Get the state value.
     *
     * @return the state value
     */
    public String state() {
        return this.state;
    }

    /**
     * Get the hostNames value.
     *
     * @return the hostNames value
     */
    public List<String> hostNames() {
        return this.hostNames;
    }

    /**
     * Get the repositorySiteName value.
     *
     * @return the repositorySiteName value
     */
    public String repositorySiteName() {
        return this.repositorySiteName;
    }

    /**
     * Get the usageState value.
     *
     * @return the usageState value
     */
    public UsageState usageState() {
        return this.usageState;
    }

    /**
     * Get the enabled value.
     *
     * @return the enabled value
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled value.
     *
     * @param enabled the enabled value to set
     * @return the SiteInner object itself.
     */
    public SiteInner withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the enabledHostNames value.
     *
     * @return the enabledHostNames value
     */
    public List<String> enabledHostNames() {
        return this.enabledHostNames;
    }

    /**
     * Get the availabilityState value.
     *
     * @return the availabilityState value
     */
    public SiteAvailabilityState availabilityState() {
        return this.availabilityState;
    }

    /**
     * Get the hostNameSslStates value.
     *
     * @return the hostNameSslStates value
     */
    public List<HostNameSslState> hostNameSslStates() {
        return this.hostNameSslStates;
    }

    /**
     * Set the hostNameSslStates value.
     *
     * @param hostNameSslStates the hostNameSslStates value to set
     * @return the SiteInner object itself.
     */
    public SiteInner withHostNameSslStates(List<HostNameSslState> hostNameSslStates) {
        this.hostNameSslStates = hostNameSslStates;
        return this;
    }

    /**
     * Get the serverFarmId value.
     *
     * @return the serverFarmId value
     */
    public String serverFarmId() {
        return this.serverFarmId;
    }

    /**
     * Set the serverFarmId value.
     *
     * @param serverFarmId the serverFarmId value to set
     * @return the SiteInner object itself.
     */
    public SiteInner withServerFarmId(String serverFarmId) {
        this.serverFarmId = serverFarmId;
        return this;
    }

    /**
     * Get the reserved value.
     *
     * @return the reserved value
     */
    public Boolean reserved() {
        return this.reserved;
    }

    /**
     * Set the reserved value.
     *
     * @param reserved the reserved value to set
     * @return the SiteInner object itself.
     */
    public SiteInner withReserved(Boolean reserved) {
        this.reserved = reserved;
        return this;
    }

    /**
     * Get the lastModifiedTimeUtc value.
     *
     * @return the lastModifiedTimeUtc value
     */
    public DateTime lastModifiedTimeUtc() {
        return this.lastModifiedTimeUtc;
    }

    /**
     * Get the siteConfig value.
     *
     * @return the siteConfig value
     */
    public SiteConfigInner siteConfig() {
        return this.siteConfig;
    }

    /**
     * Set the siteConfig value.
     *
     * @param siteConfig the siteConfig value to set
     * @return the SiteInner object itself.
     */
    public SiteInner withSiteConfig(SiteConfigInner siteConfig) {
        this.siteConfig = siteConfig;
        return this;
    }

    /**
     * Get the trafficManagerHostNames value.
     *
     * @return the trafficManagerHostNames value
     */
    public List<String> trafficManagerHostNames() {
        return this.trafficManagerHostNames;
    }

    /**
     * Get the premiumAppDeployed value.
     *
     * @return the premiumAppDeployed value
     */
    public Boolean premiumAppDeployed() {
        return this.premiumAppDeployed;
    }

    /**
     * Get the scmSiteAlsoStopped value.
     *
     * @return the scmSiteAlsoStopped value
     */
    public Boolean scmSiteAlsoStopped() {
        return this.scmSiteAlsoStopped;
    }

    /**
     * Set the scmSiteAlsoStopped value.
     *
     * @param scmSiteAlsoStopped the scmSiteAlsoStopped value to set
     * @return the SiteInner object itself.
     */
    public SiteInner withScmSiteAlsoStopped(Boolean scmSiteAlsoStopped) {
        this.scmSiteAlsoStopped = scmSiteAlsoStopped;
        return this;
    }

    /**
     * Get the targetSwapSlot value.
     *
     * @return the targetSwapSlot value
     */
    public String targetSwapSlot() {
        return this.targetSwapSlot;
    }

    /**
     * Get the hostingEnvironmentProfile value.
     *
     * @return the hostingEnvironmentProfile value
     */
    public HostingEnvironmentProfile hostingEnvironmentProfile() {
        return this.hostingEnvironmentProfile;
    }

    /**
     * Set the hostingEnvironmentProfile value.
     *
     * @param hostingEnvironmentProfile the hostingEnvironmentProfile value to set
     * @return the SiteInner object itself.
     */
    public SiteInner withHostingEnvironmentProfile(HostingEnvironmentProfile hostingEnvironmentProfile) {
        this.hostingEnvironmentProfile = hostingEnvironmentProfile;
        return this;
    }

    /**
     * Get the microService value.
     *
     * @return the microService value
     */
    public String microService() {
        return this.microService;
    }

    /**
     * Set the microService value.
     *
     * @param microService the microService value to set
     * @return the SiteInner object itself.
     */
    public SiteInner withMicroService(String microService) {
        this.microService = microService;
        return this;
    }

    /**
     * Get the gatewaySiteName value.
     *
     * @return the gatewaySiteName value
     */
    public String gatewaySiteName() {
        return this.gatewaySiteName;
    }

    /**
     * Set the gatewaySiteName value.
     *
     * @param gatewaySiteName the gatewaySiteName value to set
     * @return the SiteInner object itself.
     */
    public SiteInner withGatewaySiteName(String gatewaySiteName) {
        this.gatewaySiteName = gatewaySiteName;
        return this;
    }

    /**
     * Get the clientAffinityEnabled value.
     *
     * @return the clientAffinityEnabled value
     */
    public Boolean clientAffinityEnabled() {
        return this.clientAffinityEnabled;
    }

    /**
     * Set the clientAffinityEnabled value.
     *
     * @param clientAffinityEnabled the clientAffinityEnabled value to set
     * @return the SiteInner object itself.
     */
    public SiteInner withClientAffinityEnabled(Boolean clientAffinityEnabled) {
        this.clientAffinityEnabled = clientAffinityEnabled;
        return this;
    }

    /**
     * Get the clientCertEnabled value.
     *
     * @return the clientCertEnabled value
     */
    public Boolean clientCertEnabled() {
        return this.clientCertEnabled;
    }

    /**
     * Set the clientCertEnabled value.
     *
     * @param clientCertEnabled the clientCertEnabled value to set
     * @return the SiteInner object itself.
     */
    public SiteInner withClientCertEnabled(Boolean clientCertEnabled) {
        this.clientCertEnabled = clientCertEnabled;
        return this;
    }

    /**
     * Get the hostNamesDisabled value.
     *
     * @return the hostNamesDisabled value
     */
    public Boolean hostNamesDisabled() {
        return this.hostNamesDisabled;
    }

    /**
     * Set the hostNamesDisabled value.
     *
     * @param hostNamesDisabled the hostNamesDisabled value to set
     * @return the SiteInner object itself.
     */
    public SiteInner withHostNamesDisabled(Boolean hostNamesDisabled) {
        this.hostNamesDisabled = hostNamesDisabled;
        return this;
    }

    /**
     * Get the outboundIpAddresses value.
     *
     * @return the outboundIpAddresses value
     */
    public String outboundIpAddresses() {
        return this.outboundIpAddresses;
    }

    /**
     * Get the containerSize value.
     *
     * @return the containerSize value
     */
    public Integer containerSize() {
        return this.containerSize;
    }

    /**
     * Set the containerSize value.
     *
     * @param containerSize the containerSize value to set
     * @return the SiteInner object itself.
     */
    public SiteInner withContainerSize(Integer containerSize) {
        this.containerSize = containerSize;
        return this;
    }

    /**
     * Get the dailyMemoryTimeQuota value.
     *
     * @return the dailyMemoryTimeQuota value
     */
    public Integer dailyMemoryTimeQuota() {
        return this.dailyMemoryTimeQuota;
    }

    /**
     * Set the dailyMemoryTimeQuota value.
     *
     * @param dailyMemoryTimeQuota the dailyMemoryTimeQuota value to set
     * @return the SiteInner object itself.
     */
    public SiteInner withDailyMemoryTimeQuota(Integer dailyMemoryTimeQuota) {
        this.dailyMemoryTimeQuota = dailyMemoryTimeQuota;
        return this;
    }

    /**
     * Get the suspendedTill value.
     *
     * @return the suspendedTill value
     */
    public DateTime suspendedTill() {
        return this.suspendedTill;
    }

    /**
     * Get the maxNumberOfWorkers value.
     *
     * @return the maxNumberOfWorkers value
     */
    public Integer maxNumberOfWorkers() {
        return this.maxNumberOfWorkers;
    }

    /**
     * Get the cloningInfo value.
     *
     * @return the cloningInfo value
     */
    public CloningInfo cloningInfo() {
        return this.cloningInfo;
    }

    /**
     * Set the cloningInfo value.
     *
     * @param cloningInfo the cloningInfo value to set
     * @return the SiteInner object itself.
     */
    public SiteInner withCloningInfo(CloningInfo cloningInfo) {
        this.cloningInfo = cloningInfo;
        return this;
    }

    /**
     * Get the resourceGroup value.
     *
     * @return the resourceGroup value
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Get the isDefaultContainer value.
     *
     * @return the isDefaultContainer value
     */
    public Boolean isDefaultContainer() {
        return this.isDefaultContainer;
    }

    /**
     * Get the defaultHostName value.
     *
     * @return the defaultHostName value
     */
    public String defaultHostName() {
        return this.defaultHostName;
    }

    /**
     * Get the slotSwapStatus value.
     *
     * @return the slotSwapStatus value
     */
    public SlotSwapStatus slotSwapStatus() {
        return this.slotSwapStatus;
    }

}
