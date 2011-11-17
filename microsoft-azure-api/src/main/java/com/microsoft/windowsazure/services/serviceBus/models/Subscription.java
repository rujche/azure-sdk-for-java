package com.microsoft.windowsazure.services.serviceBus.models;

import javax.ws.rs.core.MediaType;
import javax.xml.datatype.Duration;

import com.microsoft.windowsazure.services.serviceBus.implementation.Content;
import com.microsoft.windowsazure.services.serviceBus.implementation.Entry;
import com.microsoft.windowsazure.services.serviceBus.implementation.EntryModel;
import com.microsoft.windowsazure.services.serviceBus.implementation.RuleDescription;
import com.microsoft.windowsazure.services.serviceBus.implementation.SubscriptionDescription;

/**
 * Represents a subscription.
 */
public class Subscription extends EntryModel<SubscriptionDescription> {

    /**
     * Creates an instance of the <code>Subscription</code> class.
     */
    public Subscription() {
        super(new Entry(), new SubscriptionDescription());
        getEntry().setContent(new Content());
        getEntry().getContent().setType(MediaType.APPLICATION_XML);
        getEntry().getContent().setSubscriptionDescription(getModel());
    }

    /**
     * Creates an instance of the <code>Subscription</code> class using the specified entry.
     * 
     * @param entry
     *            An <code>Entry</code> object.
     */
    public Subscription(Entry entry) {
        super(entry, entry.getContent().getSubscriptionDescription());
    }

    /**
     * Creates an instance of the <code>Subscription</code> class using the specified name.
     * 
     * @param name
     *            A <code>String</code> object that represents the name of the subscription.
     */
    public Subscription(String name) {
        this();
        setName(name);
    }

    /**
     * Returns the name of the subscription.
     * 
     * @return A <code>String</code> object that represents the name of the subscription.
     */
    public String getName() {
        return getEntry().getTitle();
    }

    /**
     * Sets the name of the subscription.
     * 
     * @param value
     *            A <code>String</code> that represents the name of the subscription.
     * 
     * @return A <code>Subscription</code> object that represents the updated subscription.
     */
    public Subscription setName(String value) {
        getEntry().setTitle(value);
        return this;
    }

    /**
     * Returns the duration of the lock.
     * 
     * @return A <code>Duration</code> object that represents the duration of the lock.
     */
    public Duration getLockDuration() {
        return getModel().getLockDuration();
    }

    /**
     * Sets the duration of the lock.
     * 
     * @param value
     *            The duration, in seconds, of the lock.
     * 
     * @return A <code>Subscription</code> object that represents the updated subscription.
     */
    public Subscription setLockDuration(Duration value) {
        getModel().setLockDuration(value);
        return this;
    }

    /**
     * Indicates whether the subscription is session-aware.
     * 
     * @return <code>true</code> if the subscription is session aware; otherwise, <code>false</code>.
     */
    public Boolean isRequiresSession() {
        return getModel().isRequiresSession();
    }

    /**
     * Specifies whether the subscription is session-aware.
     * 
     * @param value
     *            <code>true</code> if the subscription is session aware; otherwise, <code>false</code>.
     * 
     * @return A <code>Subscription</code> object that represents the updated subscription.
     */
    public Subscription setRequiresSession(Boolean value) {
        getModel().setRequiresSession(value);
        return this;
    }

    /**
     * Returns the default message time-to-live (TTL). This applies when dead
     * lettering is in effect.
     * 
     * @return A <code>Duration</code> object that represents the default message TTL.
     */
    public Duration getDefaultMessageTimeToLive() {
        return getModel().getDefaultMessageTimeToLive();
    }

    /**
     * Sets the default message time-to-live (TTL). This applies when dead lettering is in effect.
     * 
     * @param value
     *            A <code>Duration</code> object that represents the default message TTL.
     * 
     * @return A <code>Subscription</code> object that represents the updated subscription.
     */
    public Subscription setDefaultMessageTimeToLive(Duration value) {
        getModel().setDefaultMessageTimeToLive(value);
        return this;
    }

    /**
     * Indicates whether dead lettering is in effect upon message expiration.
     * 
     * @return <code>true</code> if dead lettering is in effect; otherwise, <code>false</code>.
     */
    public Boolean isDeadLetteringOnMessageExpiration() {
        return getModel().isDeadLetteringOnMessageExpiration();
    }

    /**
     * Specifies whether dead lettering is in effect upon message expiration.
     * 
     * @param value
     *            <code>true</code> if dead lettering is in effect; otherwise, <code>false</code>.
     * 
     * @return A <code>Subscription</code> object that represents the updated subscription.
     */
    public Subscription setDeadLetteringOnMessageExpiration(Boolean value) {
        getModel().setDeadLetteringOnMessageExpiration(value);
        return this;
    }

    /**
     * Indicates whether dead lettering is in effect when filter evaluation exceptions are encountered.
     * 
     * @return <code>true</code> if dead lettering is in effect; otherwise, <code>false</code>.
     */
    public Boolean isDeadLetteringOnFilterEvaluationExceptions() {
        return getModel().isDeadLetteringOnFilterEvaluationExceptions();
    }

    /**
     * Specifies whether dead lettering is in effect when filter evaluation exceptions are encountered.
     * 
     * @param value
     *            <code>true</code> if dead lettering is in effect; otherwise, <code>false</code>.
     * 
     * @return A <code>Subscription</code> object that represents the updated subscription.
     */
    public Subscription setDeadLetteringOnFilterEvaluationExceptions(Boolean value) {
        getModel().setDeadLetteringOnFilterEvaluationExceptions(value);
        return this;
    }

    /**
     * Returns the description of the default rule.
     * 
     * @return A <code>RuleDescription</code> object that represents the default rule description.
     */
    public RuleDescription getDefaultRuleDescription() {
        return getModel().getDefaultRuleDescription();
    }

    /**
     * Specifies the description for the default rule.
     * 
     * @param value
     *            A <code>RuleDescription</code> object that represents the default rule description.
     * 
     * @return A <code>Subscription</code> object that represents the updated subscription.
     */
    public Subscription setDefaultRuleDescription(RuleDescription value) {
        getModel().setDefaultRuleDescription(value);
        return this;
    }

    /**
     * Returns the number of messages in the subscription.
     * 
     * @return The number of messages in the subscription.
     */
    public Long getMessageCount() {
        return getModel().getMessageCount();
    }


    /**
     * Returns the maximum delivery count for the subscription.
     * 
     * @return The maximum delivery count.
     */
    public Integer getMaxDeliveryCount() {
        return getModel().getMaxDeliveryCount();
    }

    /**
     * Sets the maximum delivery count for the subscription.
     * 
     * @param value
     *            The maximum delivery count for the subscription.
     * 
     * @return A <code>Subscription</code> object that represents the updated subscription.
     */
    public Subscription setMaxDeliveryCount(Integer value) {
        getModel().setMaxDeliveryCount(value);
        return this;
    }

    /**
     * Indicates whether batch operations are enabled.
     * 
     * @return <code>true</code> if batch operations are enabled; otherwise, <code>false</code>.
     */
    public Boolean isEnableBatchedOperations() {
        return getModel().isEnableBatchedOperations();
    }

    /**
     * Specifies whether batch operations are enabled.
     * 
     * @param value
     *            <code>true</code> if batch operations are enabled; otherwise, <code>false</code>.
     * 
     * @return A <code>Subscription</code> object that represents the updated subscription.
     */
    public Subscription setEnableBatchedOperations(Boolean value) {
        getModel().setEnableBatchedOperations(value);
        return this;
    }
}
