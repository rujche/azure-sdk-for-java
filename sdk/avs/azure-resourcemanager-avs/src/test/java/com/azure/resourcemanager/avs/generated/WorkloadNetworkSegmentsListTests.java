// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.fluent.models.WorkloadNetworkSegmentInner;
import com.azure.resourcemanager.avs.models.WorkloadNetworkSegmentsList;
import com.azure.resourcemanager.avs.models.WorkloadNetworkSegmentSubnet;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class WorkloadNetworkSegmentsListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkloadNetworkSegmentsList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"displayName\":\"eafxtsgumhjglikk\",\"connectedGateway\":\"slol\",\"subnet\":{\"dhcpRanges\":[\"uzlm\",\"felfktg\"],\"gatewayAddress\":\"crpw\"},\"portVif\":[{\"portName\":\"noigbrnjwmwk\"},{\"portName\":\"bsazejjoqka\"}],\"status\":\"FAILURE\",\"provisioningState\":\"Succeeded\",\"revision\":1349265341310840343},\"id\":\"gzxnfaazpxdtnk\",\"name\":\"mkqjj\",\"type\":\"wuenvr\"},{\"properties\":{\"displayName\":\"ou\",\"connectedGateway\":\"bre\",\"subnet\":{\"dhcpRanges\":[\"ysjkixqtnqttez\",\"wfff\",\"akpjpqqmtedlt\",\"mjihyeozphv\"],\"gatewayAddress\":\"uyqncygupkvipmd\"},\"portVif\":[{\"portName\":\"qupevzh\"}],\"status\":\"FAILURE\",\"provisioningState\":\"Canceled\",\"revision\":5953574927577101427},\"id\":\"ujbypelmcuvhixb\",\"name\":\"xyfwnylrcool\",\"type\":\"ttpkiwkkbnujrywv\"},{\"properties\":{\"displayName\":\"bfpncurdo\",\"connectedGateway\":\"iithtywu\",\"subnet\":{\"dhcpRanges\":[\"ihwqknfdntwjchr\",\"goihx\",\"mwctondzjluudfd\"],\"gatewayAddress\":\"gg\"},\"portVif\":[{\"portName\":\"wtovvtgsein\"}],\"status\":\"FAILURE\",\"provisioningState\":\"Canceled\",\"revision\":3636581995811123220},\"id\":\"pirgnepttwq\",\"name\":\"sniffc\",\"type\":\"mqnrojlpijnkr\"}],\"nextLink\":\"rddh\"}")
            .toObject(WorkloadNetworkSegmentsList.class);
        Assertions.assertEquals("eafxtsgumhjglikk", model.value().get(0).displayName());
        Assertions.assertEquals("slol", model.value().get(0).connectedGateway());
        Assertions.assertEquals("uzlm", model.value().get(0).subnet().dhcpRanges().get(0));
        Assertions.assertEquals("crpw", model.value().get(0).subnet().gatewayAddress());
        Assertions.assertEquals(1349265341310840343L, model.value().get(0).revision());
        Assertions.assertEquals("rddh", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WorkloadNetworkSegmentsList model = new WorkloadNetworkSegmentsList().withValue(Arrays.asList(
            new WorkloadNetworkSegmentInner().withDisplayName("eafxtsgumhjglikk")
                .withConnectedGateway("slol")
                .withSubnet(new WorkloadNetworkSegmentSubnet().withDhcpRanges(Arrays.asList("uzlm", "felfktg"))
                    .withGatewayAddress("crpw"))
                .withRevision(1349265341310840343L),
            new WorkloadNetworkSegmentInner().withDisplayName("ou")
                .withConnectedGateway("bre")
                .withSubnet(new WorkloadNetworkSegmentSubnet()
                    .withDhcpRanges(Arrays.asList("ysjkixqtnqttez", "wfff", "akpjpqqmtedlt", "mjihyeozphv"))
                    .withGatewayAddress("uyqncygupkvipmd"))
                .withRevision(5953574927577101427L),
            new WorkloadNetworkSegmentInner().withDisplayName("bfpncurdo")
                .withConnectedGateway("iithtywu")
                .withSubnet(new WorkloadNetworkSegmentSubnet()
                    .withDhcpRanges(Arrays.asList("ihwqknfdntwjchr", "goihx", "mwctondzjluudfd"))
                    .withGatewayAddress("gg"))
                .withRevision(3636581995811123220L)))
            .withNextLink("rddh");
        model = BinaryData.fromObject(model).toObject(WorkloadNetworkSegmentsList.class);
        Assertions.assertEquals("eafxtsgumhjglikk", model.value().get(0).displayName());
        Assertions.assertEquals("slol", model.value().get(0).connectedGateway());
        Assertions.assertEquals("uzlm", model.value().get(0).subnet().dhcpRanges().get(0));
        Assertions.assertEquals("crpw", model.value().get(0).subnet().gatewayAddress());
        Assertions.assertEquals(1349265341310840343L, model.value().get(0).revision());
        Assertions.assertEquals("rddh", model.nextLink());
    }
}
