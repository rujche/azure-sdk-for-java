/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package microsoft.azure.management.resources.models;

import Microsoft.Azure.Management.Resources.Models.BasicResourceGroup;

/**
* Resource group information.
*/
public class ResourceGroup extends BasicResourceGroup {
    private String id;
    
    /**
    * Optional. Gets or sets the ID of the resource group.
    * @return The Id value.
    */
    public String getId() {
        return this.id;
    }
    
    /**
    * Optional. Gets or sets the ID of the resource group.
    * @param idValue The Id value.
    */
    public void setId(final String idValue) {
        this.id = idValue;
    }
    
    private String name;
    
    /**
    * Optional. Gets or sets the Name of the resource group.
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Optional. Gets or sets the Name of the resource group.
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
}
