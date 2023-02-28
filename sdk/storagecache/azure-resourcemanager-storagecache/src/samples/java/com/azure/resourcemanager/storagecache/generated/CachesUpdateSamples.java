// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.generated;

import com.azure.resourcemanager.storagecache.models.Cache;
import com.azure.resourcemanager.storagecache.models.CacheActiveDirectorySettings;
import com.azure.resourcemanager.storagecache.models.CacheDirectorySettings;
import com.azure.resourcemanager.storagecache.models.CacheNetworkSettings;
import com.azure.resourcemanager.storagecache.models.CacheSecuritySettings;
import com.azure.resourcemanager.storagecache.models.CacheUpgradeSettings;
import com.azure.resourcemanager.storagecache.models.CacheUsernameDownloadSettings;
import com.azure.resourcemanager.storagecache.models.CacheUsernameDownloadSettingsCredentials;
import com.azure.resourcemanager.storagecache.models.NfsAccessPolicy;
import com.azure.resourcemanager.storagecache.models.NfsAccessRule;
import com.azure.resourcemanager.storagecache.models.NfsAccessRuleAccess;
import com.azure.resourcemanager.storagecache.models.NfsAccessRuleScope;
import com.azure.resourcemanager.storagecache.models.UsernameSource;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for Caches Update. */
public final class CachesUpdateSamples {
    /*
     * x-ms-original-file: specification/storagecache/resource-manager/Microsoft.StorageCache/stable/2023-01-01/examples/Caches_Update_ldap_only.json
     */
    /**
     * Sample code: Caches_Update_ldap_only.
     *
     * @param manager Entry point to StorageCacheManager.
     */
    public static void cachesUpdateLdapOnly(com.azure.resourcemanager.storagecache.StorageCacheManager manager) {
        Cache resource =
            manager
                .caches()
                .getByResourceGroupWithResponse("scgroup", "sc1", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withTags(mapOf("Dept", "Contoso"))
            .withUpgradeSettings(
                new CacheUpgradeSettings()
                    .withUpgradeScheduleEnabled(true)
                    .withScheduledTime(OffsetDateTime.parse("2022-04-26T18:25:43.511Z")))
            .withNetworkSettings(
                new CacheNetworkSettings()
                    .withMtu(1500)
                    .withDnsServers(Arrays.asList("10.1.22.33", "10.1.12.33"))
                    .withDnsSearchDomain("contoso.com")
                    .withNtpServer("time.contoso.com"))
            .withSecuritySettings(
                new CacheSecuritySettings()
                    .withAccessPolicies(
                        Arrays
                            .asList(
                                new NfsAccessPolicy()
                                    .withName("default")
                                    .withAccessRules(
                                        Arrays
                                            .asList(
                                                new NfsAccessRule()
                                                    .withScope(NfsAccessRuleScope.DEFAULT)
                                                    .withAccess(NfsAccessRuleAccess.RW)
                                                    .withSuid(false)
                                                    .withSubmountAccess(true)
                                                    .withRootSquash(false))),
                                new NfsAccessPolicy()
                                    .withName("restrictive")
                                    .withAccessRules(
                                        Arrays
                                            .asList(
                                                new NfsAccessRule()
                                                    .withScope(NfsAccessRuleScope.HOST)
                                                    .withFilter("10.99.3.145")
                                                    .withAccess(NfsAccessRuleAccess.RW)
                                                    .withSuid(true)
                                                    .withSubmountAccess(true)
                                                    .withRootSquash(false),
                                                new NfsAccessRule()
                                                    .withScope(NfsAccessRuleScope.NETWORK)
                                                    .withFilter("10.99.1.0/24")
                                                    .withAccess(NfsAccessRuleAccess.RW)
                                                    .withSuid(true)
                                                    .withSubmountAccess(true)
                                                    .withRootSquash(false),
                                                new NfsAccessRule()
                                                    .withScope(NfsAccessRuleScope.DEFAULT)
                                                    .withAccess(NfsAccessRuleAccess.NO)
                                                    .withSuid(false)
                                                    .withSubmountAccess(true)
                                                    .withRootSquash(true)
                                                    .withAnonymousUid("65534")
                                                    .withAnonymousGid("65534"))))))
            .withDirectoryServicesSettings(
                new CacheDirectorySettings()
                    .withUsernameDownload(
                        new CacheUsernameDownloadSettings()
                            .withExtendedGroups(true)
                            .withUsernameSource(UsernameSource.LDAP)
                            .withLdapServer("192.0.2.12")
                            .withLdapBaseDN("dc=contosoad,dc=contoso,dc=local")
                            .withCredentials(
                                new CacheUsernameDownloadSettingsCredentials()
                                    .withBindDn("cn=ldapadmin,dc=contosoad,dc=contoso,dc=local")
                                    .withBindPassword("fakeTokenPlaceholder"))))
            .apply();
    }

    /*
     * x-ms-original-file: specification/storagecache/resource-manager/Microsoft.StorageCache/stable/2023-01-01/examples/Caches_Update.json
     */
    /**
     * Sample code: Caches_Update.
     *
     * @param manager Entry point to StorageCacheManager.
     */
    public static void cachesUpdate(com.azure.resourcemanager.storagecache.StorageCacheManager manager) {
        Cache resource =
            manager
                .caches()
                .getByResourceGroupWithResponse("scgroup", "sc1", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withTags(mapOf("Dept", "Contoso"))
            .withUpgradeSettings(
                new CacheUpgradeSettings()
                    .withUpgradeScheduleEnabled(true)
                    .withScheduledTime(OffsetDateTime.parse("2022-04-26T18:25:43.511Z")))
            .withNetworkSettings(
                new CacheNetworkSettings()
                    .withMtu(1500)
                    .withDnsServers(Arrays.asList("10.1.22.33", "10.1.12.33"))
                    .withDnsSearchDomain("contoso.com")
                    .withNtpServer("time.contoso.com"))
            .withSecuritySettings(
                new CacheSecuritySettings()
                    .withAccessPolicies(
                        Arrays
                            .asList(
                                new NfsAccessPolicy()
                                    .withName("default")
                                    .withAccessRules(
                                        Arrays
                                            .asList(
                                                new NfsAccessRule()
                                                    .withScope(NfsAccessRuleScope.DEFAULT)
                                                    .withAccess(NfsAccessRuleAccess.RW)
                                                    .withSuid(false)
                                                    .withSubmountAccess(true)
                                                    .withRootSquash(false))),
                                new NfsAccessPolicy()
                                    .withName("restrictive")
                                    .withAccessRules(
                                        Arrays
                                            .asList(
                                                new NfsAccessRule()
                                                    .withScope(NfsAccessRuleScope.HOST)
                                                    .withFilter("10.99.3.145")
                                                    .withAccess(NfsAccessRuleAccess.RW)
                                                    .withSuid(true)
                                                    .withSubmountAccess(true)
                                                    .withRootSquash(false),
                                                new NfsAccessRule()
                                                    .withScope(NfsAccessRuleScope.NETWORK)
                                                    .withFilter("10.99.1.0/24")
                                                    .withAccess(NfsAccessRuleAccess.RW)
                                                    .withSuid(true)
                                                    .withSubmountAccess(true)
                                                    .withRootSquash(false),
                                                new NfsAccessRule()
                                                    .withScope(NfsAccessRuleScope.DEFAULT)
                                                    .withAccess(NfsAccessRuleAccess.NO)
                                                    .withSuid(false)
                                                    .withSubmountAccess(true)
                                                    .withRootSquash(true)
                                                    .withAnonymousUid("65534")
                                                    .withAnonymousGid("65534"))))))
            .withDirectoryServicesSettings(
                new CacheDirectorySettings()
                    .withActiveDirectory(
                        new CacheActiveDirectorySettings()
                            .withPrimaryDnsIpAddress("192.0.2.10")
                            .withSecondaryDnsIpAddress("192.0.2.11")
                            .withDomainName("contosoAd.contoso.local")
                            .withDomainNetBiosName("contosoAd")
                            .withCacheNetBiosName("contosoSmb"))
                    .withUsernameDownload(
                        new CacheUsernameDownloadSettings()
                            .withExtendedGroups(true)
                            .withUsernameSource(UsernameSource.AD)))
            .apply();
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
