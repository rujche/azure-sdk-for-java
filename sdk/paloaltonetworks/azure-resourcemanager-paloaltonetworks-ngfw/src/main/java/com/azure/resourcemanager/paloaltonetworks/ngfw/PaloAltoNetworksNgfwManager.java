// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw;

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
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.PaloAltoNetworksCloudngfw;
import com.azure.resourcemanager.paloaltonetworks.ngfw.implementation.CertificateObjectGlobalRulestacksImpl;
import com.azure.resourcemanager.paloaltonetworks.ngfw.implementation.CertificateObjectLocalRulestacksImpl;
import com.azure.resourcemanager.paloaltonetworks.ngfw.implementation.FirewallStatusImpl;
import com.azure.resourcemanager.paloaltonetworks.ngfw.implementation.FirewallsImpl;
import com.azure.resourcemanager.paloaltonetworks.ngfw.implementation.FqdnListGlobalRulestacksImpl;
import com.azure.resourcemanager.paloaltonetworks.ngfw.implementation.FqdnListLocalRulestacksImpl;
import com.azure.resourcemanager.paloaltonetworks.ngfw.implementation.GlobalRulestacksImpl;
import com.azure.resourcemanager.paloaltonetworks.ngfw.implementation.LocalRulesImpl;
import com.azure.resourcemanager.paloaltonetworks.ngfw.implementation.LocalRulestacksImpl;
import com.azure.resourcemanager.paloaltonetworks.ngfw.implementation.OperationsImpl;
import com.azure.resourcemanager.paloaltonetworks.ngfw.implementation.PaloAltoNetworksCloudngfwBuilder;
import com.azure.resourcemanager.paloaltonetworks.ngfw.implementation.PostRulesImpl;
import com.azure.resourcemanager.paloaltonetworks.ngfw.implementation.PreRulesImpl;
import com.azure.resourcemanager.paloaltonetworks.ngfw.implementation.PrefixListGlobalRulestacksImpl;
import com.azure.resourcemanager.paloaltonetworks.ngfw.implementation.PrefixListLocalRulestacksImpl;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.CertificateObjectGlobalRulestacks;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.CertificateObjectLocalRulestacks;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.FirewallStatus;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.Firewalls;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.FqdnListGlobalRulestacks;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.FqdnListLocalRulestacks;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.GlobalRulestacks;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.LocalRules;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.LocalRulestacks;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.Operations;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.PostRules;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.PreRules;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.PrefixListGlobalRulestacks;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.PrefixListLocalRulestacks;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Entry point to PaloAltoNetworksNgfwManager.
 */
public final class PaloAltoNetworksNgfwManager {
    private GlobalRulestacks globalRulestacks;

    private CertificateObjectGlobalRulestacks certificateObjectGlobalRulestacks;

    private FqdnListGlobalRulestacks fqdnListGlobalRulestacks;

    private PostRules postRules;

    private PrefixListGlobalRulestacks prefixListGlobalRulestacks;

    private PreRules preRules;

    private Operations operations;

    private Firewalls firewalls;

    private LocalRulestacks localRulestacks;

    private FirewallStatus firewallStatus;

    private CertificateObjectLocalRulestacks certificateObjectLocalRulestacks;

    private FqdnListLocalRulestacks fqdnListLocalRulestacks;

    private LocalRules localRules;

    private PrefixListLocalRulestacks prefixListLocalRulestacks;

    private final PaloAltoNetworksCloudngfw clientObject;

    private PaloAltoNetworksNgfwManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject = new PaloAltoNetworksCloudngfwBuilder().pipeline(httpPipeline)
            .endpoint(profile.getEnvironment().getResourceManagerEndpoint()).subscriptionId(profile.getSubscriptionId())
            .defaultPollInterval(defaultPollInterval).buildClient();
    }

    /**
     * Creates an instance of PaloAlto Networks Ngfw service API entry point.
     * 
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the PaloAlto Networks Ngfw service API instance.
     */
    public static PaloAltoNetworksNgfwManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Creates an instance of PaloAlto Networks Ngfw service API entry point.
     * 
     * @param httpPipeline the {@link HttpPipeline} configured with Azure authentication credential.
     * @param profile the Azure profile for client.
     * @return the PaloAlto Networks Ngfw service API instance.
     */
    public static PaloAltoNetworksNgfwManager authenticate(HttpPipeline httpPipeline, AzureProfile profile) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return new PaloAltoNetworksNgfwManager(httpPipeline, profile, null);
    }

    /**
     * Gets a Configurable instance that can be used to create PaloAltoNetworksNgfwManager with optional configuration.
     * 
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new PaloAltoNetworksNgfwManager.Configurable();
    }

    /**
     * The Configurable allowing configurations to be set.
     */
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
         * <p>
         * This setting has no effect, if retry policy is set via {@link #withRetryPolicy(RetryPolicy)}.
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
            this.defaultPollInterval
                = Objects.requireNonNull(defaultPollInterval, "'defaultPollInterval' cannot be null.");
            if (this.defaultPollInterval.isNegative()) {
                throw LOGGER
                    .logExceptionAsError(new IllegalArgumentException("'defaultPollInterval' cannot be negative"));
            }
            return this;
        }

        /**
         * Creates an instance of PaloAlto Networks Ngfw service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the PaloAlto Networks Ngfw service API instance.
         */
        public PaloAltoNetworksNgfwManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder.append("azsdk-java").append("-").append("com.azure.resourcemanager.paloaltonetworks.ngfw")
                .append("/").append("1.1.0");
            if (!Configuration.getGlobalConfiguration().get("AZURE_TELEMETRY_DISABLED", false)) {
                userAgentBuilder.append(" (").append(Configuration.getGlobalConfiguration().get("java.version"))
                    .append("; ").append(Configuration.getGlobalConfiguration().get("os.name")).append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.version")).append("; auto-generated)");
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
            policies.addAll(this.policies.stream().filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_CALL)
                .collect(Collectors.toList()));
            HttpPolicyProviders.addBeforeRetryPolicies(policies);
            policies.add(retryPolicy);
            policies.add(new AddDatePolicy());
            policies.add(new ArmChallengeAuthenticationPolicy(credential, scopes.toArray(new String[0])));
            policies.addAll(this.policies.stream()
                .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_RETRY).collect(Collectors.toList()));
            HttpPolicyProviders.addAfterRetryPolicies(policies);
            policies.add(new HttpLoggingPolicy(httpLogOptions));
            HttpPipeline httpPipeline = new HttpPipelineBuilder().httpClient(httpClient)
                .policies(policies.toArray(new HttpPipelinePolicy[0])).build();
            return new PaloAltoNetworksNgfwManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /**
     * Gets the resource collection API of GlobalRulestacks.
     * 
     * @return Resource collection API of GlobalRulestacks.
     */
    public GlobalRulestacks globalRulestacks() {
        if (this.globalRulestacks == null) {
            this.globalRulestacks = new GlobalRulestacksImpl(clientObject.getGlobalRulestacks(), this);
        }
        return globalRulestacks;
    }

    /**
     * Gets the resource collection API of CertificateObjectGlobalRulestacks.
     * 
     * @return Resource collection API of CertificateObjectGlobalRulestacks.
     */
    public CertificateObjectGlobalRulestacks certificateObjectGlobalRulestacks() {
        if (this.certificateObjectGlobalRulestacks == null) {
            this.certificateObjectGlobalRulestacks
                = new CertificateObjectGlobalRulestacksImpl(clientObject.getCertificateObjectGlobalRulestacks(), this);
        }
        return certificateObjectGlobalRulestacks;
    }

    /**
     * Gets the resource collection API of FqdnListGlobalRulestacks.
     * 
     * @return Resource collection API of FqdnListGlobalRulestacks.
     */
    public FqdnListGlobalRulestacks fqdnListGlobalRulestacks() {
        if (this.fqdnListGlobalRulestacks == null) {
            this.fqdnListGlobalRulestacks
                = new FqdnListGlobalRulestacksImpl(clientObject.getFqdnListGlobalRulestacks(), this);
        }
        return fqdnListGlobalRulestacks;
    }

    /**
     * Gets the resource collection API of PostRules.
     * 
     * @return Resource collection API of PostRules.
     */
    public PostRules postRules() {
        if (this.postRules == null) {
            this.postRules = new PostRulesImpl(clientObject.getPostRules(), this);
        }
        return postRules;
    }

    /**
     * Gets the resource collection API of PrefixListGlobalRulestacks.
     * 
     * @return Resource collection API of PrefixListGlobalRulestacks.
     */
    public PrefixListGlobalRulestacks prefixListGlobalRulestacks() {
        if (this.prefixListGlobalRulestacks == null) {
            this.prefixListGlobalRulestacks
                = new PrefixListGlobalRulestacksImpl(clientObject.getPrefixListGlobalRulestacks(), this);
        }
        return prefixListGlobalRulestacks;
    }

    /**
     * Gets the resource collection API of PreRules.
     * 
     * @return Resource collection API of PreRules.
     */
    public PreRules preRules() {
        if (this.preRules == null) {
            this.preRules = new PreRulesImpl(clientObject.getPreRules(), this);
        }
        return preRules;
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
     * Gets the resource collection API of Firewalls. It manages FirewallResource.
     * 
     * @return Resource collection API of Firewalls.
     */
    public Firewalls firewalls() {
        if (this.firewalls == null) {
            this.firewalls = new FirewallsImpl(clientObject.getFirewalls(), this);
        }
        return firewalls;
    }

    /**
     * Gets the resource collection API of LocalRulestacks. It manages LocalRulestackResource.
     * 
     * @return Resource collection API of LocalRulestacks.
     */
    public LocalRulestacks localRulestacks() {
        if (this.localRulestacks == null) {
            this.localRulestacks = new LocalRulestacksImpl(clientObject.getLocalRulestacks(), this);
        }
        return localRulestacks;
    }

    /**
     * Gets the resource collection API of FirewallStatus.
     * 
     * @return Resource collection API of FirewallStatus.
     */
    public FirewallStatus firewallStatus() {
        if (this.firewallStatus == null) {
            this.firewallStatus = new FirewallStatusImpl(clientObject.getFirewallStatus(), this);
        }
        return firewallStatus;
    }

    /**
     * Gets the resource collection API of CertificateObjectLocalRulestacks. It manages
     * CertificateObjectLocalRulestackResource.
     * 
     * @return Resource collection API of CertificateObjectLocalRulestacks.
     */
    public CertificateObjectLocalRulestacks certificateObjectLocalRulestacks() {
        if (this.certificateObjectLocalRulestacks == null) {
            this.certificateObjectLocalRulestacks
                = new CertificateObjectLocalRulestacksImpl(clientObject.getCertificateObjectLocalRulestacks(), this);
        }
        return certificateObjectLocalRulestacks;
    }

    /**
     * Gets the resource collection API of FqdnListLocalRulestacks. It manages FqdnListLocalRulestackResource.
     * 
     * @return Resource collection API of FqdnListLocalRulestacks.
     */
    public FqdnListLocalRulestacks fqdnListLocalRulestacks() {
        if (this.fqdnListLocalRulestacks == null) {
            this.fqdnListLocalRulestacks
                = new FqdnListLocalRulestacksImpl(clientObject.getFqdnListLocalRulestacks(), this);
        }
        return fqdnListLocalRulestacks;
    }

    /**
     * Gets the resource collection API of LocalRules. It manages LocalRulesResource.
     * 
     * @return Resource collection API of LocalRules.
     */
    public LocalRules localRules() {
        if (this.localRules == null) {
            this.localRules = new LocalRulesImpl(clientObject.getLocalRules(), this);
        }
        return localRules;
    }

    /**
     * Gets the resource collection API of PrefixListLocalRulestacks. It manages PrefixListResource.
     * 
     * @return Resource collection API of PrefixListLocalRulestacks.
     */
    public PrefixListLocalRulestacks prefixListLocalRulestacks() {
        if (this.prefixListLocalRulestacks == null) {
            this.prefixListLocalRulestacks
                = new PrefixListLocalRulestacksImpl(clientObject.getPrefixListLocalRulestacks(), this);
        }
        return prefixListLocalRulestacks;
    }

    /**
     * Gets wrapped service client PaloAltoNetworksCloudngfw providing direct access to the underlying auto-generated
     * API implementation, based on Azure REST API.
     * 
     * @return Wrapped service client PaloAltoNetworksCloudngfw.
     */
    public PaloAltoNetworksCloudngfw serviceClient() {
        return this.clientObject;
    }
}
