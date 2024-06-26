// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.HttpPipelinePosition;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.AddHeadersFromContextPolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryOptions;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.http.policy.ArmChallengeAuthenticationPolicy;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Configuration;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.azurestackhci.fluent.AzureStackHciClient;
import com.azure.resourcemanager.azurestackhci.implementation.AzureStackHciClientBuilder;
import com.azure.resourcemanager.azurestackhci.implementation.GalleryImagesOperationsImpl;
import com.azure.resourcemanager.azurestackhci.implementation.GuestAgentsImpl;
import com.azure.resourcemanager.azurestackhci.implementation.GuestAgentsOperationsImpl;
import com.azure.resourcemanager.azurestackhci.implementation.HybridIdentityMetadatasImpl;
import com.azure.resourcemanager.azurestackhci.implementation.LogicalNetworksOperationsImpl;
import com.azure.resourcemanager.azurestackhci.implementation.MarketplaceGalleryImagesOperationsImpl;
import com.azure.resourcemanager.azurestackhci.implementation.NetworkInterfacesOperationsImpl;
import com.azure.resourcemanager.azurestackhci.implementation.OperationsImpl;
import com.azure.resourcemanager.azurestackhci.implementation.StorageContainersOperationsImpl;
import com.azure.resourcemanager.azurestackhci.implementation.VirtualHardDisksOperationsImpl;
import com.azure.resourcemanager.azurestackhci.implementation.VirtualMachineInstancesImpl;
import com.azure.resourcemanager.azurestackhci.models.GalleryImagesOperations;
import com.azure.resourcemanager.azurestackhci.models.GuestAgents;
import com.azure.resourcemanager.azurestackhci.models.GuestAgentsOperations;
import com.azure.resourcemanager.azurestackhci.models.HybridIdentityMetadatas;
import com.azure.resourcemanager.azurestackhci.models.LogicalNetworksOperations;
import com.azure.resourcemanager.azurestackhci.models.MarketplaceGalleryImagesOperations;
import com.azure.resourcemanager.azurestackhci.models.NetworkInterfacesOperations;
import com.azure.resourcemanager.azurestackhci.models.Operations;
import com.azure.resourcemanager.azurestackhci.models.StorageContainersOperations;
import com.azure.resourcemanager.azurestackhci.models.VirtualHardDisksOperations;
import com.azure.resourcemanager.azurestackhci.models.VirtualMachineInstances;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/** Entry point to AzureStackHciManager. Azure Stack HCI management service. */
public final class AzureStackHciManager {
    private GalleryImagesOperations galleryImagesOperations;

    private Operations operations;

    private LogicalNetworksOperations logicalNetworksOperations;

    private MarketplaceGalleryImagesOperations marketplaceGalleryImagesOperations;

    private NetworkInterfacesOperations networkInterfacesOperations;

    private StorageContainersOperations storageContainersOperations;

    private VirtualHardDisksOperations virtualHardDisksOperations;

    private VirtualMachineInstances virtualMachineInstances;

    private HybridIdentityMetadatas hybridIdentityMetadatas;

    private GuestAgents guestAgents;

    private GuestAgentsOperations guestAgentsOperations;

    private final AzureStackHciClient clientObject;

    private AzureStackHciManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new AzureStackHciClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of AzureStackHci service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the AzureStackHci service API instance.
     */
    public static AzureStackHciManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Creates an instance of AzureStackHci service API entry point.
     *
     * @param httpPipeline the {@link HttpPipeline} configured with Azure authentication credential.
     * @param profile the Azure profile for client.
     * @return the AzureStackHci service API instance.
     */
    public static AzureStackHciManager authenticate(HttpPipeline httpPipeline, AzureProfile profile) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return new AzureStackHciManager(httpPipeline, profile, null);
    }

    /**
     * Gets a Configurable instance that can be used to create AzureStackHciManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new AzureStackHciManager.Configurable();
    }

    /** The Configurable allowing configurations to be set. */
    public static final class Configurable {
        private static final ClientLogger LOGGER = new ClientLogger(Configurable.class);

        private HttpClient httpClient;
        private HttpLogOptions httpLogOptions;
        private final List<HttpPipelinePolicy> policies = new ArrayList<>();
        private final List<String> scopes = new ArrayList<>();
        private RetryPolicy retryPolicy;
        private RetryOptions retryOptions;
        private Duration defaultPollInterval;

        private Configurable() {
        }

        /**
         * Sets the http client.
         *
         * @param httpClient the HTTP client.
         * @return the configurable object itself.
         */
        public Configurable withHttpClient(HttpClient httpClient) {
            this.httpClient = Objects.requireNonNull(httpClient, "'httpClient' cannot be null.");
            return this;
        }

        /**
         * Sets the logging options to the HTTP pipeline.
         *
         * @param httpLogOptions the HTTP log options.
         * @return the configurable object itself.
         */
        public Configurable withLogOptions(HttpLogOptions httpLogOptions) {
            this.httpLogOptions = Objects.requireNonNull(httpLogOptions, "'httpLogOptions' cannot be null.");
            return this;
        }

        /**
         * Adds the pipeline policy to the HTTP pipeline.
         *
         * @param policy the HTTP pipeline policy.
         * @return the configurable object itself.
         */
        public Configurable withPolicy(HttpPipelinePolicy policy) {
            this.policies.add(Objects.requireNonNull(policy, "'policy' cannot be null."));
            return this;
        }

        /**
         * Adds the scope to permission sets.
         *
         * @param scope the scope.
         * @return the configurable object itself.
         */
        public Configurable withScope(String scope) {
            this.scopes.add(Objects.requireNonNull(scope, "'scope' cannot be null."));
            return this;
        }

        /**
         * Sets the retry policy to the HTTP pipeline.
         *
         * @param retryPolicy the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryPolicy(RetryPolicy retryPolicy) {
            this.retryPolicy = Objects.requireNonNull(retryPolicy, "'retryPolicy' cannot be null.");
            return this;
        }

        /**
         * Sets the retry options for the HTTP pipeline retry policy.
         *
         * <p>This setting has no effect, if retry policy is set via {@link #withRetryPolicy(RetryPolicy)}.
         *
         * @param retryOptions the retry options for the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryOptions(RetryOptions retryOptions) {
            this.retryOptions = Objects.requireNonNull(retryOptions, "'retryOptions' cannot be null.");
            return this;
        }

        /**
         * Sets the default poll interval, used when service does not provide "Retry-After" header.
         *
         * @param defaultPollInterval the default poll interval.
         * @return the configurable object itself.
         */
        public Configurable withDefaultPollInterval(Duration defaultPollInterval) {
            this.defaultPollInterval =
                Objects.requireNonNull(defaultPollInterval, "'defaultPollInterval' cannot be null.");
            if (this.defaultPollInterval.isNegative()) {
                throw LOGGER
                    .logExceptionAsError(new IllegalArgumentException("'defaultPollInterval' cannot be negative"));
            }
            return this;
        }

        /**
         * Creates an instance of AzureStackHci service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the AzureStackHci service API instance.
         */
        public AzureStackHciManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.azurestackhci")
                .append("/")
                .append("1.0.0-beta.4");
            if (!Configuration.getGlobalConfiguration().get("AZURE_TELEMETRY_DISABLED", false)) {
                userAgentBuilder
                    .append(" (")
                    .append(Configuration.getGlobalConfiguration().get("java.version"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.name"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.version"))
                    .append("; auto-generated)");
            } else {
                userAgentBuilder.append(" (auto-generated)");
            }

            if (scopes.isEmpty()) {
                scopes.add(profile.getEnvironment().getManagementEndpoint() + "/.default");
            }
            if (retryPolicy == null) {
                if (retryOptions != null) {
                    retryPolicy = new RetryPolicy(retryOptions);
                } else {
                    retryPolicy = new RetryPolicy("Retry-After", ChronoUnit.SECONDS);
                }
            }
            List<HttpPipelinePolicy> policies = new ArrayList<>();
            policies.add(new UserAgentPolicy(userAgentBuilder.toString()));
            policies.add(new AddHeadersFromContextPolicy());
            policies.add(new RequestIdPolicy());
            policies
                .addAll(
                    this
                        .policies
                        .stream()
                        .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_CALL)
                        .collect(Collectors.toList()));
            HttpPolicyProviders.addBeforeRetryPolicies(policies);
            policies.add(retryPolicy);
            policies.add(new AddDatePolicy());
            policies.add(new ArmChallengeAuthenticationPolicy(credential, scopes.toArray(new String[0])));
            policies
                .addAll(
                    this
                        .policies
                        .stream()
                        .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_RETRY)
                        .collect(Collectors.toList()));
            HttpPolicyProviders.addAfterRetryPolicies(policies);
            policies.add(new HttpLoggingPolicy(httpLogOptions));
            HttpPipeline httpPipeline =
                new HttpPipelineBuilder()
                    .httpClient(httpClient)
                    .policies(policies.toArray(new HttpPipelinePolicy[0]))
                    .build();
            return new AzureStackHciManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /**
     * Gets the resource collection API of GalleryImagesOperations. It manages GalleryImages.
     *
     * @return Resource collection API of GalleryImagesOperations.
     */
    public GalleryImagesOperations galleryImagesOperations() {
        if (this.galleryImagesOperations == null) {
            this.galleryImagesOperations =
                new GalleryImagesOperationsImpl(clientObject.getGalleryImagesOperations(), this);
        }
        return galleryImagesOperations;
    }

    /**
     * Gets the resource collection API of Operations.
     *
     * @return Resource collection API of Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /**
     * Gets the resource collection API of LogicalNetworksOperations. It manages LogicalNetworks.
     *
     * @return Resource collection API of LogicalNetworksOperations.
     */
    public LogicalNetworksOperations logicalNetworksOperations() {
        if (this.logicalNetworksOperations == null) {
            this.logicalNetworksOperations =
                new LogicalNetworksOperationsImpl(clientObject.getLogicalNetworksOperations(), this);
        }
        return logicalNetworksOperations;
    }

    /**
     * Gets the resource collection API of MarketplaceGalleryImagesOperations. It manages MarketplaceGalleryImages.
     *
     * @return Resource collection API of MarketplaceGalleryImagesOperations.
     */
    public MarketplaceGalleryImagesOperations marketplaceGalleryImagesOperations() {
        if (this.marketplaceGalleryImagesOperations == null) {
            this.marketplaceGalleryImagesOperations =
                new MarketplaceGalleryImagesOperationsImpl(clientObject.getMarketplaceGalleryImagesOperations(), this);
        }
        return marketplaceGalleryImagesOperations;
    }

    /**
     * Gets the resource collection API of NetworkInterfacesOperations. It manages NetworkInterfaces.
     *
     * @return Resource collection API of NetworkInterfacesOperations.
     */
    public NetworkInterfacesOperations networkInterfacesOperations() {
        if (this.networkInterfacesOperations == null) {
            this.networkInterfacesOperations =
                new NetworkInterfacesOperationsImpl(clientObject.getNetworkInterfacesOperations(), this);
        }
        return networkInterfacesOperations;
    }

    /**
     * Gets the resource collection API of StorageContainersOperations. It manages StorageContainers.
     *
     * @return Resource collection API of StorageContainersOperations.
     */
    public StorageContainersOperations storageContainersOperations() {
        if (this.storageContainersOperations == null) {
            this.storageContainersOperations =
                new StorageContainersOperationsImpl(clientObject.getStorageContainersOperations(), this);
        }
        return storageContainersOperations;
    }

    /**
     * Gets the resource collection API of VirtualHardDisksOperations. It manages VirtualHardDisks.
     *
     * @return Resource collection API of VirtualHardDisksOperations.
     */
    public VirtualHardDisksOperations virtualHardDisksOperations() {
        if (this.virtualHardDisksOperations == null) {
            this.virtualHardDisksOperations =
                new VirtualHardDisksOperationsImpl(clientObject.getVirtualHardDisksOperations(), this);
        }
        return virtualHardDisksOperations;
    }

    /**
     * Gets the resource collection API of VirtualMachineInstances.
     *
     * @return Resource collection API of VirtualMachineInstances.
     */
    public VirtualMachineInstances virtualMachineInstances() {
        if (this.virtualMachineInstances == null) {
            this.virtualMachineInstances =
                new VirtualMachineInstancesImpl(clientObject.getVirtualMachineInstances(), this);
        }
        return virtualMachineInstances;
    }

    /**
     * Gets the resource collection API of HybridIdentityMetadatas.
     *
     * @return Resource collection API of HybridIdentityMetadatas.
     */
    public HybridIdentityMetadatas hybridIdentityMetadatas() {
        if (this.hybridIdentityMetadatas == null) {
            this.hybridIdentityMetadatas =
                new HybridIdentityMetadatasImpl(clientObject.getHybridIdentityMetadatas(), this);
        }
        return hybridIdentityMetadatas;
    }

    /**
     * Gets the resource collection API of GuestAgents.
     *
     * @return Resource collection API of GuestAgents.
     */
    public GuestAgents guestAgents() {
        if (this.guestAgents == null) {
            this.guestAgents = new GuestAgentsImpl(clientObject.getGuestAgents(), this);
        }
        return guestAgents;
    }

    /**
     * Gets the resource collection API of GuestAgentsOperations.
     *
     * @return Resource collection API of GuestAgentsOperations.
     */
    public GuestAgentsOperations guestAgentsOperations() {
        if (this.guestAgentsOperations == null) {
            this.guestAgentsOperations = new GuestAgentsOperationsImpl(clientObject.getGuestAgentsOperations(), this);
        }
        return guestAgentsOperations;
    }

    /**
     * Gets wrapped service client AzureStackHciClient providing direct access to the underlying auto-generated API
     * implementation, based on Azure REST API.
     *
     * @return Wrapped service client AzureStackHciClient.
     */
    public AzureStackHciClient serviceClient() {
        return this.clientObject;
    }
}
