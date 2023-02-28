// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.CreateMode;
import com.azure.resourcemanager.recoveryservicesbackup.models.DpmProtectedItem;
import com.azure.resourcemanager.recoveryservicesbackup.models.DpmProtectedItemExtendedInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectedItemState;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DpmProtectedItemTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DpmProtectedItem model =
            BinaryData
                .fromString(
                    "{\"protectedItemType\":\"DPMProtectedItem\",\"friendlyName\":\"l\",\"backupEngineName\":\"crpfbcunez\",\"protectionState\":\"Protected\",\"extendedInfo\":{\"protectableObjectLoadPath\":{\"psihcla\":\"fwyfwlwxjwet\",\"tcmwqkchc\":\"zvaylptrsqqw\",\"xfdeqvhpsyl\":\"waxfewzjkj\",\"bffmbmxz\":\"ksh\"},\"protected\":true,\"isPresentOnCloud\":false,\"lastBackupStatus\":\"pgjxsnptfujgicga\",\"lastRefreshedAt\":\"2021-02-23T21:41:32Z\",\"oldestRecoveryPoint\":\"2021-09-03T16:23:29Z\",\"recoveryPointCount\":2074216887,\"onPremiseOldestRecoveryPoint\":\"2021-04-02T22:27:46Z\",\"onPremiseLatestRecoveryPoint\":\"2021-09-18T02:59:55Z\",\"onPremiseRecoveryPointCount\":1146878861,\"isCollocated\":true,\"protectionGroupName\":\"swvr\",\"diskStorageUsedInBytes\":\"nz\",\"totalDiskStorageSizeInBytes\":\"gehkfkimrtixokff\"},\"backupManagementType\":\"AzureBackupServer\",\"workloadType\":\"Exchange\",\"containerName\":\"qepqwhixmon\",\"sourceResourceId\":\"shiy\",\"policyId\":\"velfcldu\",\"lastRecoveryPoint\":\"2021-03-30T02:54:32Z\",\"backupSetName\":\"rds\",\"createMode\":\"Recover\",\"deferredDeleteTimeInUTC\":\"2021-02-26T01:35:32Z\",\"isScheduledForDeferredDelete\":false,\"deferredDeleteTimeRemaining\":\"gstmninwjizciln\",\"isDeferredDeleteScheduleUpcoming\":true,\"isRehydrate\":false,\"resourceGuardOperationRequests\":[\"jtbxqmuluxlx\",\"zvners\",\"ycucrwnamikzeb\",\"qbsms\"],\"isArchiveEnabled\":false,\"policyName\":\"gfuhokzrusw\",\"softDeleteRetentionPeriod\":1877932879}")
                .toObject(DpmProtectedItem.class);
        Assertions.assertEquals("qepqwhixmon", model.containerName());
        Assertions.assertEquals("shiy", model.sourceResourceId());
        Assertions.assertEquals("velfcldu", model.policyId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-30T02:54:32Z"), model.lastRecoveryPoint());
        Assertions.assertEquals("rds", model.backupSetName());
        Assertions.assertEquals(CreateMode.RECOVER, model.createMode());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-26T01:35:32Z"), model.deferredDeleteTimeInUtc());
        Assertions.assertEquals(false, model.isScheduledForDeferredDelete());
        Assertions.assertEquals("gstmninwjizciln", model.deferredDeleteTimeRemaining());
        Assertions.assertEquals(true, model.isDeferredDeleteScheduleUpcoming());
        Assertions.assertEquals(false, model.isRehydrate());
        Assertions.assertEquals("jtbxqmuluxlx", model.resourceGuardOperationRequests().get(0));
        Assertions.assertEquals(false, model.isArchiveEnabled());
        Assertions.assertEquals("gfuhokzrusw", model.policyName());
        Assertions.assertEquals(1877932879, model.softDeleteRetentionPeriod());
        Assertions.assertEquals("l", model.friendlyName());
        Assertions.assertEquals("crpfbcunez", model.backupEngineName());
        Assertions.assertEquals(ProtectedItemState.PROTECTED, model.protectionState());
        Assertions.assertEquals("fwyfwlwxjwet", model.extendedInfo().protectableObjectLoadPath().get("psihcla"));
        Assertions.assertEquals(true, model.extendedInfo().protectedProperty());
        Assertions.assertEquals(false, model.extendedInfo().isPresentOnCloud());
        Assertions.assertEquals("pgjxsnptfujgicga", model.extendedInfo().lastBackupStatus());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-23T21:41:32Z"), model.extendedInfo().lastRefreshedAt());
        Assertions
            .assertEquals(OffsetDateTime.parse("2021-09-03T16:23:29Z"), model.extendedInfo().oldestRecoveryPoint());
        Assertions.assertEquals(2074216887, model.extendedInfo().recoveryPointCount());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-04-02T22:27:46Z"), model.extendedInfo().onPremiseOldestRecoveryPoint());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-09-18T02:59:55Z"), model.extendedInfo().onPremiseLatestRecoveryPoint());
        Assertions.assertEquals(1146878861, model.extendedInfo().onPremiseRecoveryPointCount());
        Assertions.assertEquals(true, model.extendedInfo().isCollocated());
        Assertions.assertEquals("swvr", model.extendedInfo().protectionGroupName());
        Assertions.assertEquals("nz", model.extendedInfo().diskStorageUsedInBytes());
        Assertions.assertEquals("gehkfkimrtixokff", model.extendedInfo().totalDiskStorageSizeInBytes());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DpmProtectedItem model =
            new DpmProtectedItem()
                .withContainerName("qepqwhixmon")
                .withSourceResourceId("shiy")
                .withPolicyId("velfcldu")
                .withLastRecoveryPoint(OffsetDateTime.parse("2021-03-30T02:54:32Z"))
                .withBackupSetName("rds")
                .withCreateMode(CreateMode.RECOVER)
                .withDeferredDeleteTimeInUtc(OffsetDateTime.parse("2021-02-26T01:35:32Z"))
                .withIsScheduledForDeferredDelete(false)
                .withDeferredDeleteTimeRemaining("gstmninwjizciln")
                .withIsDeferredDeleteScheduleUpcoming(true)
                .withIsRehydrate(false)
                .withResourceGuardOperationRequests(Arrays.asList("jtbxqmuluxlx", "zvners", "ycucrwnamikzeb", "qbsms"))
                .withIsArchiveEnabled(false)
                .withPolicyName("gfuhokzrusw")
                .withSoftDeleteRetentionPeriod(1877932879)
                .withFriendlyName("l")
                .withBackupEngineName("crpfbcunez")
                .withProtectionState(ProtectedItemState.PROTECTED)
                .withExtendedInfo(
                    new DpmProtectedItemExtendedInfo()
                        .withProtectableObjectLoadPath(
                            mapOf(
                                "psihcla",
                                "fwyfwlwxjwet",
                                "tcmwqkchc",
                                "zvaylptrsqqw",
                                "xfdeqvhpsyl",
                                "waxfewzjkj",
                                "bffmbmxz",
                                "ksh"))
                        .withProtectedProperty(true)
                        .withIsPresentOnCloud(false)
                        .withLastBackupStatus("pgjxsnptfujgicga")
                        .withLastRefreshedAt(OffsetDateTime.parse("2021-02-23T21:41:32Z"))
                        .withOldestRecoveryPoint(OffsetDateTime.parse("2021-09-03T16:23:29Z"))
                        .withRecoveryPointCount(2074216887)
                        .withOnPremiseOldestRecoveryPoint(OffsetDateTime.parse("2021-04-02T22:27:46Z"))
                        .withOnPremiseLatestRecoveryPoint(OffsetDateTime.parse("2021-09-18T02:59:55Z"))
                        .withOnPremiseRecoveryPointCount(1146878861)
                        .withIsCollocated(true)
                        .withProtectionGroupName("swvr")
                        .withDiskStorageUsedInBytes("nz")
                        .withTotalDiskStorageSizeInBytes("gehkfkimrtixokff"));
        model = BinaryData.fromObject(model).toObject(DpmProtectedItem.class);
        Assertions.assertEquals("qepqwhixmon", model.containerName());
        Assertions.assertEquals("shiy", model.sourceResourceId());
        Assertions.assertEquals("velfcldu", model.policyId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-30T02:54:32Z"), model.lastRecoveryPoint());
        Assertions.assertEquals("rds", model.backupSetName());
        Assertions.assertEquals(CreateMode.RECOVER, model.createMode());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-26T01:35:32Z"), model.deferredDeleteTimeInUtc());
        Assertions.assertEquals(false, model.isScheduledForDeferredDelete());
        Assertions.assertEquals("gstmninwjizciln", model.deferredDeleteTimeRemaining());
        Assertions.assertEquals(true, model.isDeferredDeleteScheduleUpcoming());
        Assertions.assertEquals(false, model.isRehydrate());
        Assertions.assertEquals("jtbxqmuluxlx", model.resourceGuardOperationRequests().get(0));
        Assertions.assertEquals(false, model.isArchiveEnabled());
        Assertions.assertEquals("gfuhokzrusw", model.policyName());
        Assertions.assertEquals(1877932879, model.softDeleteRetentionPeriod());
        Assertions.assertEquals("l", model.friendlyName());
        Assertions.assertEquals("crpfbcunez", model.backupEngineName());
        Assertions.assertEquals(ProtectedItemState.PROTECTED, model.protectionState());
        Assertions.assertEquals("fwyfwlwxjwet", model.extendedInfo().protectableObjectLoadPath().get("psihcla"));
        Assertions.assertEquals(true, model.extendedInfo().protectedProperty());
        Assertions.assertEquals(false, model.extendedInfo().isPresentOnCloud());
        Assertions.assertEquals("pgjxsnptfujgicga", model.extendedInfo().lastBackupStatus());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-23T21:41:32Z"), model.extendedInfo().lastRefreshedAt());
        Assertions
            .assertEquals(OffsetDateTime.parse("2021-09-03T16:23:29Z"), model.extendedInfo().oldestRecoveryPoint());
        Assertions.assertEquals(2074216887, model.extendedInfo().recoveryPointCount());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-04-02T22:27:46Z"), model.extendedInfo().onPremiseOldestRecoveryPoint());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-09-18T02:59:55Z"), model.extendedInfo().onPremiseLatestRecoveryPoint());
        Assertions.assertEquals(1146878861, model.extendedInfo().onPremiseRecoveryPointCount());
        Assertions.assertEquals(true, model.extendedInfo().isCollocated());
        Assertions.assertEquals("swvr", model.extendedInfo().protectionGroupName());
        Assertions.assertEquals("nz", model.extendedInfo().diskStorageUsedInBytes());
        Assertions.assertEquals("gehkfkimrtixokff", model.extendedInfo().totalDiskStorageSizeInBytes());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
