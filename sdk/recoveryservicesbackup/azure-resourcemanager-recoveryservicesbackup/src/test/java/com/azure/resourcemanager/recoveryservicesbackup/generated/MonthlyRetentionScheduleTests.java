// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.DailyRetentionFormat;
import com.azure.resourcemanager.recoveryservicesbackup.models.Day;
import com.azure.resourcemanager.recoveryservicesbackup.models.DayOfWeek;
import com.azure.resourcemanager.recoveryservicesbackup.models.MonthlyRetentionSchedule;
import com.azure.resourcemanager.recoveryservicesbackup.models.RetentionDuration;
import com.azure.resourcemanager.recoveryservicesbackup.models.RetentionDurationType;
import com.azure.resourcemanager.recoveryservicesbackup.models.RetentionScheduleFormat;
import com.azure.resourcemanager.recoveryservicesbackup.models.WeekOfMonth;
import com.azure.resourcemanager.recoveryservicesbackup.models.WeeklyRetentionFormat;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class MonthlyRetentionScheduleTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MonthlyRetentionSchedule model =
            BinaryData
                .fromString(
                    "{\"retentionScheduleFormatType\":\"Invalid\",\"retentionScheduleDaily\":{\"daysOfTheMonth\":[{\"date\":1828577256,\"isLast\":false},{\"date\":15341893,\"isLast\":false}]},\"retentionScheduleWeekly\":{\"daysOfTheWeek\":[\"Monday\",\"Wednesday\",\"Saturday\"],\"weeksOfTheMonth\":[\"Fourth\",\"Third\",\"Fourth\",\"Second\"]},\"retentionTimes\":[\"2021-01-30T05:37:02Z\"],\"retentionDuration\":{\"count\":1115717793,\"durationType\":\"Years\"}}")
                .toObject(MonthlyRetentionSchedule.class);
        Assertions.assertEquals(RetentionScheduleFormat.INVALID, model.retentionScheduleFormatType());
        Assertions.assertEquals(1828577256, model.retentionScheduleDaily().daysOfTheMonth().get(0).date());
        Assertions.assertEquals(false, model.retentionScheduleDaily().daysOfTheMonth().get(0).isLast());
        Assertions.assertEquals(DayOfWeek.MONDAY, model.retentionScheduleWeekly().daysOfTheWeek().get(0));
        Assertions.assertEquals(WeekOfMonth.FOURTH, model.retentionScheduleWeekly().weeksOfTheMonth().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-30T05:37:02Z"), model.retentionTimes().get(0));
        Assertions.assertEquals(1115717793, model.retentionDuration().count());
        Assertions.assertEquals(RetentionDurationType.YEARS, model.retentionDuration().durationType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MonthlyRetentionSchedule model =
            new MonthlyRetentionSchedule()
                .withRetentionScheduleFormatType(RetentionScheduleFormat.INVALID)
                .withRetentionScheduleDaily(
                    new DailyRetentionFormat()
                        .withDaysOfTheMonth(
                            Arrays
                                .asList(
                                    new Day().withDate(1828577256).withIsLast(false),
                                    new Day().withDate(15341893).withIsLast(false))))
                .withRetentionScheduleWeekly(
                    new WeeklyRetentionFormat()
                        .withDaysOfTheWeek(Arrays.asList(DayOfWeek.MONDAY, DayOfWeek.WEDNESDAY, DayOfWeek.SATURDAY))
                        .withWeeksOfTheMonth(
                            Arrays
                                .asList(WeekOfMonth.FOURTH, WeekOfMonth.THIRD, WeekOfMonth.FOURTH, WeekOfMonth.SECOND)))
                .withRetentionTimes(Arrays.asList(OffsetDateTime.parse("2021-01-30T05:37:02Z")))
                .withRetentionDuration(
                    new RetentionDuration().withCount(1115717793).withDurationType(RetentionDurationType.YEARS));
        model = BinaryData.fromObject(model).toObject(MonthlyRetentionSchedule.class);
        Assertions.assertEquals(RetentionScheduleFormat.INVALID, model.retentionScheduleFormatType());
        Assertions.assertEquals(1828577256, model.retentionScheduleDaily().daysOfTheMonth().get(0).date());
        Assertions.assertEquals(false, model.retentionScheduleDaily().daysOfTheMonth().get(0).isLast());
        Assertions.assertEquals(DayOfWeek.MONDAY, model.retentionScheduleWeekly().daysOfTheWeek().get(0));
        Assertions.assertEquals(WeekOfMonth.FOURTH, model.retentionScheduleWeekly().weeksOfTheMonth().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-30T05:37:02Z"), model.retentionTimes().get(0));
        Assertions.assertEquals(1115717793, model.retentionDuration().count());
        Assertions.assertEquals(RetentionDurationType.YEARS, model.retentionDuration().durationType());
    }
}
