// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Purchasing 3rd Party product for one Azure Spring Apps instance.
 */
@Fluent
public final class MarketplaceResource {
    /*
     * The plan id of the 3rd Party Artifact that is being procured.
     */
    @JsonProperty(value = "plan")
    private String plan;

    /*
     * The publisher id of the 3rd Party Artifact that is being bought.
     */
    @JsonProperty(value = "publisher")
    private String publisher;

    /*
     * The 3rd Party artifact that is being procured.
     */
    @JsonProperty(value = "product")
    private String product;

    /**
     * Creates an instance of MarketplaceResource class.
     */
    public MarketplaceResource() {
    }

    /**
     * Get the plan property: The plan id of the 3rd Party Artifact that is being procured.
     * 
     * @return the plan value.
     */
    public String plan() {
        return this.plan;
    }

    /**
     * Set the plan property: The plan id of the 3rd Party Artifact that is being procured.
     * 
     * @param plan the plan value to set.
     * @return the MarketplaceResource object itself.
     */
    public MarketplaceResource withPlan(String plan) {
        this.plan = plan;
        return this;
    }

    /**
     * Get the publisher property: The publisher id of the 3rd Party Artifact that is being bought.
     * 
     * @return the publisher value.
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Set the publisher property: The publisher id of the 3rd Party Artifact that is being bought.
     * 
     * @param publisher the publisher value to set.
     * @return the MarketplaceResource object itself.
     */
    public MarketplaceResource withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Get the product property: The 3rd Party artifact that is being procured.
     * 
     * @return the product value.
     */
    public String product() {
        return this.product;
    }

    /**
     * Set the product property: The 3rd Party artifact that is being procured.
     * 
     * @param product the product value to set.
     * @return the MarketplaceResource object itself.
     */
    public MarketplaceResource withProduct(String product) {
        this.product = product;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
