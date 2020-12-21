/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_09_01.implementation;

import com.microsoft.azure.management.netapp.v2020_09_01.SnapshotPolicyVolumeList;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;

class SnapshotPolicyVolumeListImpl extends WrapperImpl<SnapshotPolicyVolumeListInner> implements SnapshotPolicyVolumeList {
    private final NetAppManager manager;
    SnapshotPolicyVolumeListImpl(SnapshotPolicyVolumeListInner inner, NetAppManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public NetAppManager manager() {
        return this.manager;
    }

    @Override
    public List<Object> value() {
        return this.inner().value();
    }

}
