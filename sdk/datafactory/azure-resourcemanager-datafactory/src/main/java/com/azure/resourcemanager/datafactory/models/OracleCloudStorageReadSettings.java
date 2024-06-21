// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Oracle Cloud Storage read settings.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "type",
    defaultImpl = OracleCloudStorageReadSettings.class,
    visible = true)
@JsonTypeName("OracleCloudStorageReadSettings")
@Fluent
public final class OracleCloudStorageReadSettings extends StoreReadSettings {
    /*
     * The read setting type.
     */
    @JsonTypeId
    @JsonProperty(value = "type", required = true)
    private String type = "OracleCloudStorageReadSettings";

    /*
     * If true, files under the folder path will be read recursively. Default is true. Type: boolean (or Expression with
     * resultType boolean).
     */
    @JsonProperty(value = "recursive")
    private Object recursive;

    /*
     * Oracle Cloud Storage wildcardFolderPath. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "wildcardFolderPath")
    private Object wildcardFolderPath;

    /*
     * Oracle Cloud Storage wildcardFileName. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "wildcardFileName")
    private Object wildcardFileName;

    /*
     * The prefix filter for the Oracle Cloud Storage object name. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "prefix")
    private Object prefix;

    /*
     * Point to a text file that lists each file (relative path to the path configured in the dataset) that you want to
     * copy. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "fileListPath")
    private Object fileListPath;

    /*
     * Indicates whether to enable partition discovery. Type: boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "enablePartitionDiscovery")
    private Object enablePartitionDiscovery;

    /*
     * Specify the root path where partition discovery starts from. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "partitionRootPath")
    private Object partitionRootPath;

    /*
     * Indicates whether the source files need to be deleted after copy completion. Default is false. Type: boolean (or
     * Expression with resultType boolean).
     */
    @JsonProperty(value = "deleteFilesAfterCompletion")
    private Object deleteFilesAfterCompletion;

    /*
     * The start of file's modified datetime. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "modifiedDatetimeStart")
    private Object modifiedDatetimeStart;

    /*
     * The end of file's modified datetime. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "modifiedDatetimeEnd")
    private Object modifiedDatetimeEnd;

    /**
     * Creates an instance of OracleCloudStorageReadSettings class.
     */
    public OracleCloudStorageReadSettings() {
    }

    /**
     * Get the type property: The read setting type.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the recursive property: If true, files under the folder path will be read recursively. Default is true. Type:
     * boolean (or Expression with resultType boolean).
     * 
     * @return the recursive value.
     */
    public Object recursive() {
        return this.recursive;
    }

    /**
     * Set the recursive property: If true, files under the folder path will be read recursively. Default is true. Type:
     * boolean (or Expression with resultType boolean).
     * 
     * @param recursive the recursive value to set.
     * @return the OracleCloudStorageReadSettings object itself.
     */
    public OracleCloudStorageReadSettings withRecursive(Object recursive) {
        this.recursive = recursive;
        return this;
    }

    /**
     * Get the wildcardFolderPath property: Oracle Cloud Storage wildcardFolderPath. Type: string (or Expression with
     * resultType string).
     * 
     * @return the wildcardFolderPath value.
     */
    public Object wildcardFolderPath() {
        return this.wildcardFolderPath;
    }

    /**
     * Set the wildcardFolderPath property: Oracle Cloud Storage wildcardFolderPath. Type: string (or Expression with
     * resultType string).
     * 
     * @param wildcardFolderPath the wildcardFolderPath value to set.
     * @return the OracleCloudStorageReadSettings object itself.
     */
    public OracleCloudStorageReadSettings withWildcardFolderPath(Object wildcardFolderPath) {
        this.wildcardFolderPath = wildcardFolderPath;
        return this;
    }

    /**
     * Get the wildcardFileName property: Oracle Cloud Storage wildcardFileName. Type: string (or Expression with
     * resultType string).
     * 
     * @return the wildcardFileName value.
     */
    public Object wildcardFileName() {
        return this.wildcardFileName;
    }

    /**
     * Set the wildcardFileName property: Oracle Cloud Storage wildcardFileName. Type: string (or Expression with
     * resultType string).
     * 
     * @param wildcardFileName the wildcardFileName value to set.
     * @return the OracleCloudStorageReadSettings object itself.
     */
    public OracleCloudStorageReadSettings withWildcardFileName(Object wildcardFileName) {
        this.wildcardFileName = wildcardFileName;
        return this;
    }

    /**
     * Get the prefix property: The prefix filter for the Oracle Cloud Storage object name. Type: string (or Expression
     * with resultType string).
     * 
     * @return the prefix value.
     */
    public Object prefix() {
        return this.prefix;
    }

    /**
     * Set the prefix property: The prefix filter for the Oracle Cloud Storage object name. Type: string (or Expression
     * with resultType string).
     * 
     * @param prefix the prefix value to set.
     * @return the OracleCloudStorageReadSettings object itself.
     */
    public OracleCloudStorageReadSettings withPrefix(Object prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * Get the fileListPath property: Point to a text file that lists each file (relative path to the path configured in
     * the dataset) that you want to copy. Type: string (or Expression with resultType string).
     * 
     * @return the fileListPath value.
     */
    public Object fileListPath() {
        return this.fileListPath;
    }

    /**
     * Set the fileListPath property: Point to a text file that lists each file (relative path to the path configured in
     * the dataset) that you want to copy. Type: string (or Expression with resultType string).
     * 
     * @param fileListPath the fileListPath value to set.
     * @return the OracleCloudStorageReadSettings object itself.
     */
    public OracleCloudStorageReadSettings withFileListPath(Object fileListPath) {
        this.fileListPath = fileListPath;
        return this;
    }

    /**
     * Get the enablePartitionDiscovery property: Indicates whether to enable partition discovery. Type: boolean (or
     * Expression with resultType boolean).
     * 
     * @return the enablePartitionDiscovery value.
     */
    public Object enablePartitionDiscovery() {
        return this.enablePartitionDiscovery;
    }

    /**
     * Set the enablePartitionDiscovery property: Indicates whether to enable partition discovery. Type: boolean (or
     * Expression with resultType boolean).
     * 
     * @param enablePartitionDiscovery the enablePartitionDiscovery value to set.
     * @return the OracleCloudStorageReadSettings object itself.
     */
    public OracleCloudStorageReadSettings withEnablePartitionDiscovery(Object enablePartitionDiscovery) {
        this.enablePartitionDiscovery = enablePartitionDiscovery;
        return this;
    }

    /**
     * Get the partitionRootPath property: Specify the root path where partition discovery starts from. Type: string (or
     * Expression with resultType string).
     * 
     * @return the partitionRootPath value.
     */
    public Object partitionRootPath() {
        return this.partitionRootPath;
    }

    /**
     * Set the partitionRootPath property: Specify the root path where partition discovery starts from. Type: string (or
     * Expression with resultType string).
     * 
     * @param partitionRootPath the partitionRootPath value to set.
     * @return the OracleCloudStorageReadSettings object itself.
     */
    public OracleCloudStorageReadSettings withPartitionRootPath(Object partitionRootPath) {
        this.partitionRootPath = partitionRootPath;
        return this;
    }

    /**
     * Get the deleteFilesAfterCompletion property: Indicates whether the source files need to be deleted after copy
     * completion. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     * @return the deleteFilesAfterCompletion value.
     */
    public Object deleteFilesAfterCompletion() {
        return this.deleteFilesAfterCompletion;
    }

    /**
     * Set the deleteFilesAfterCompletion property: Indicates whether the source files need to be deleted after copy
     * completion. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     * @param deleteFilesAfterCompletion the deleteFilesAfterCompletion value to set.
     * @return the OracleCloudStorageReadSettings object itself.
     */
    public OracleCloudStorageReadSettings withDeleteFilesAfterCompletion(Object deleteFilesAfterCompletion) {
        this.deleteFilesAfterCompletion = deleteFilesAfterCompletion;
        return this;
    }

    /**
     * Get the modifiedDatetimeStart property: The start of file's modified datetime. Type: string (or Expression with
     * resultType string).
     * 
     * @return the modifiedDatetimeStart value.
     */
    public Object modifiedDatetimeStart() {
        return this.modifiedDatetimeStart;
    }

    /**
     * Set the modifiedDatetimeStart property: The start of file's modified datetime. Type: string (or Expression with
     * resultType string).
     * 
     * @param modifiedDatetimeStart the modifiedDatetimeStart value to set.
     * @return the OracleCloudStorageReadSettings object itself.
     */
    public OracleCloudStorageReadSettings withModifiedDatetimeStart(Object modifiedDatetimeStart) {
        this.modifiedDatetimeStart = modifiedDatetimeStart;
        return this;
    }

    /**
     * Get the modifiedDatetimeEnd property: The end of file's modified datetime. Type: string (or Expression with
     * resultType string).
     * 
     * @return the modifiedDatetimeEnd value.
     */
    public Object modifiedDatetimeEnd() {
        return this.modifiedDatetimeEnd;
    }

    /**
     * Set the modifiedDatetimeEnd property: The end of file's modified datetime. Type: string (or Expression with
     * resultType string).
     * 
     * @param modifiedDatetimeEnd the modifiedDatetimeEnd value to set.
     * @return the OracleCloudStorageReadSettings object itself.
     */
    public OracleCloudStorageReadSettings withModifiedDatetimeEnd(Object modifiedDatetimeEnd) {
        this.modifiedDatetimeEnd = modifiedDatetimeEnd;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OracleCloudStorageReadSettings withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OracleCloudStorageReadSettings withDisableMetricsCollection(Object disableMetricsCollection) {
        super.withDisableMetricsCollection(disableMetricsCollection);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
