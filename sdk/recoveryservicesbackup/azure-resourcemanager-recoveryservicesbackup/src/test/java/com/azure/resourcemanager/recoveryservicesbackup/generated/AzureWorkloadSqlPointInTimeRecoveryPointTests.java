// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureWorkloadSqlPointInTimeRecoveryPoint;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureWorkloadSqlRecoveryPointExtendedInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.PointInTimeRange;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointMoveReadinessInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointProperties;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointTierInformationV2;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointTierStatus;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointTierType;
import com.azure.resourcemanager.recoveryservicesbackup.models.RestorePointType;
import com.azure.resourcemanager.recoveryservicesbackup.models.SqlDataDirectory;
import com.azure.resourcemanager.recoveryservicesbackup.models.SqlDataDirectoryType;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AzureWorkloadSqlPointInTimeRecoveryPointTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureWorkloadSqlPointInTimeRecoveryPoint model =
            BinaryData
                .fromString(
                    "{\"objectType\":\"AzureWorkloadSQLPointInTimeRecoveryPoint\",\"timeRanges\":[{\"startTime\":\"2021-02-07T19:21:20Z\",\"endTime\":\"2021-02-12T09:43:23Z\"},{\"startTime\":\"2021-10-14T02:00Z\",\"endTime\":\"2021-01-16T11:09:38Z\"},{\"startTime\":\"2021-10-22T01:18:34Z\",\"endTime\":\"2021-07-25T19:24:32Z\"},{\"startTime\":\"2021-01-22T13:34:38Z\",\"endTime\":\"2021-01-11T14:04:16Z\"}],\"extendedInfo\":{\"dataDirectoryTimeInUTC\":\"2021-10-25T11:30:19Z\",\"dataDirectoryPaths\":[{\"type\":\"Invalid\",\"path\":\"e\",\"logicalName\":\"pmzznrtffya\"}]},\"recoveryPointTimeInUTC\":\"2021-03-06T13:50:38Z\",\"type\":\"Differential\",\"recoveryPointTierDetails\":[{\"type\":\"HardenedRP\",\"status\":\"Rehydrated\",\"extendedInfo\":{\"eufuqyrxpdlcgql\":\"v\",\"iosrsjuivfcdis\":\"ismjqfrddgamqu\",\"czexrxzbujrtrhqv\":\"irnxz\"}},{\"type\":\"Invalid\",\"status\":\"Valid\",\"extendedInfo\":{\"yw\":\"nlnzonzlrpi\"}},{\"type\":\"HardenedRP\",\"status\":\"Disabled\",\"extendedInfo\":{\"zehtdhgb\":\"cof\"}}],\"recoveryPointMoveReadinessInfo\":{\"mlovuanashcxl\":{\"isReadyForMove\":true,\"additionalInfo\":\"jeamurv\"},\"zsdbccxjmon\":{\"isReadyForMove\":true,\"additionalInfo\":\"rbdkelvidiz\"}},\"recoveryPointProperties\":{\"expiryTime\":\"nwncypuuw\",\"ruleName\":\"tvuqjctzenkeifzz\"}}")
                .toObject(AzureWorkloadSqlPointInTimeRecoveryPoint.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-06T13:50:38Z"), model.recoveryPointTimeInUtc());
        Assertions.assertEquals(RestorePointType.DIFFERENTIAL, model.type());
        Assertions.assertEquals(RecoveryPointTierType.HARDENED_RP, model.recoveryPointTierDetails().get(0).type());
        Assertions.assertEquals(RecoveryPointTierStatus.REHYDRATED, model.recoveryPointTierDetails().get(0).status());
        Assertions.assertEquals("v", model.recoveryPointTierDetails().get(0).extendedInfo().get("eufuqyrxpdlcgql"));
        Assertions.assertEquals(true, model.recoveryPointMoveReadinessInfo().get("mlovuanashcxl").isReadyForMove());
        Assertions
            .assertEquals("jeamurv", model.recoveryPointMoveReadinessInfo().get("mlovuanashcxl").additionalInfo());
        Assertions.assertEquals("nwncypuuw", model.recoveryPointProperties().expiryTime());
        Assertions.assertEquals("tvuqjctzenkeifzz", model.recoveryPointProperties().ruleName());
        Assertions
            .assertEquals(OffsetDateTime.parse("2021-10-25T11:30:19Z"), model.extendedInfo().dataDirectoryTimeInUtc());
        Assertions.assertEquals(SqlDataDirectoryType.INVALID, model.extendedInfo().dataDirectoryPaths().get(0).type());
        Assertions.assertEquals("e", model.extendedInfo().dataDirectoryPaths().get(0).path());
        Assertions.assertEquals("pmzznrtffya", model.extendedInfo().dataDirectoryPaths().get(0).logicalName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-07T19:21:20Z"), model.timeRanges().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-12T09:43:23Z"), model.timeRanges().get(0).endTime());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureWorkloadSqlPointInTimeRecoveryPoint model =
            new AzureWorkloadSqlPointInTimeRecoveryPoint()
                .withRecoveryPointTimeInUtc(OffsetDateTime.parse("2021-03-06T13:50:38Z"))
                .withType(RestorePointType.DIFFERENTIAL)
                .withRecoveryPointTierDetails(
                    Arrays
                        .asList(
                            new RecoveryPointTierInformationV2()
                                .withType(RecoveryPointTierType.HARDENED_RP)
                                .withStatus(RecoveryPointTierStatus.REHYDRATED)
                                .withExtendedInfo(
                                    mapOf(
                                        "eufuqyrxpdlcgql",
                                        "v",
                                        "iosrsjuivfcdis",
                                        "ismjqfrddgamqu",
                                        "czexrxzbujrtrhqv",
                                        "irnxz")),
                            new RecoveryPointTierInformationV2()
                                .withType(RecoveryPointTierType.INVALID)
                                .withStatus(RecoveryPointTierStatus.VALID)
                                .withExtendedInfo(mapOf("yw", "nlnzonzlrpi")),
                            new RecoveryPointTierInformationV2()
                                .withType(RecoveryPointTierType.HARDENED_RP)
                                .withStatus(RecoveryPointTierStatus.DISABLED)
                                .withExtendedInfo(mapOf("zehtdhgb", "cof"))))
                .withRecoveryPointMoveReadinessInfo(
                    mapOf(
                        "mlovuanashcxl",
                        new RecoveryPointMoveReadinessInfo().withIsReadyForMove(true).withAdditionalInfo("jeamurv"),
                        "zsdbccxjmon",
                        new RecoveryPointMoveReadinessInfo()
                            .withIsReadyForMove(true)
                            .withAdditionalInfo("rbdkelvidiz")))
                .withRecoveryPointProperties(
                    new RecoveryPointProperties().withExpiryTime("nwncypuuw").withRuleName("tvuqjctzenkeifzz"))
                .withExtendedInfo(
                    new AzureWorkloadSqlRecoveryPointExtendedInfo()
                        .withDataDirectoryTimeInUtc(OffsetDateTime.parse("2021-10-25T11:30:19Z"))
                        .withDataDirectoryPaths(
                            Arrays
                                .asList(
                                    new SqlDataDirectory()
                                        .withType(SqlDataDirectoryType.INVALID)
                                        .withPath("e")
                                        .withLogicalName("pmzznrtffya"))))
                .withTimeRanges(
                    Arrays
                        .asList(
                            new PointInTimeRange()
                                .withStartTime(OffsetDateTime.parse("2021-02-07T19:21:20Z"))
                                .withEndTime(OffsetDateTime.parse("2021-02-12T09:43:23Z")),
                            new PointInTimeRange()
                                .withStartTime(OffsetDateTime.parse("2021-10-14T02:00Z"))
                                .withEndTime(OffsetDateTime.parse("2021-01-16T11:09:38Z")),
                            new PointInTimeRange()
                                .withStartTime(OffsetDateTime.parse("2021-10-22T01:18:34Z"))
                                .withEndTime(OffsetDateTime.parse("2021-07-25T19:24:32Z")),
                            new PointInTimeRange()
                                .withStartTime(OffsetDateTime.parse("2021-01-22T13:34:38Z"))
                                .withEndTime(OffsetDateTime.parse("2021-01-11T14:04:16Z"))));
        model = BinaryData.fromObject(model).toObject(AzureWorkloadSqlPointInTimeRecoveryPoint.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-06T13:50:38Z"), model.recoveryPointTimeInUtc());
        Assertions.assertEquals(RestorePointType.DIFFERENTIAL, model.type());
        Assertions.assertEquals(RecoveryPointTierType.HARDENED_RP, model.recoveryPointTierDetails().get(0).type());
        Assertions.assertEquals(RecoveryPointTierStatus.REHYDRATED, model.recoveryPointTierDetails().get(0).status());
        Assertions.assertEquals("v", model.recoveryPointTierDetails().get(0).extendedInfo().get("eufuqyrxpdlcgql"));
        Assertions.assertEquals(true, model.recoveryPointMoveReadinessInfo().get("mlovuanashcxl").isReadyForMove());
        Assertions
            .assertEquals("jeamurv", model.recoveryPointMoveReadinessInfo().get("mlovuanashcxl").additionalInfo());
        Assertions.assertEquals("nwncypuuw", model.recoveryPointProperties().expiryTime());
        Assertions.assertEquals("tvuqjctzenkeifzz", model.recoveryPointProperties().ruleName());
        Assertions
            .assertEquals(OffsetDateTime.parse("2021-10-25T11:30:19Z"), model.extendedInfo().dataDirectoryTimeInUtc());
        Assertions.assertEquals(SqlDataDirectoryType.INVALID, model.extendedInfo().dataDirectoryPaths().get(0).type());
        Assertions.assertEquals("e", model.extendedInfo().dataDirectoryPaths().get(0).path());
        Assertions.assertEquals("pmzznrtffya", model.extendedInfo().dataDirectoryPaths().get(0).logicalName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-07T19:21:20Z"), model.timeRanges().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-12T09:43:23Z"), model.timeRanges().get(0).endTime());
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
