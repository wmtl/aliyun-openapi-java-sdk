/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.bssopenapi.model.v20171214;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateCostUnitRequest extends RpcAcsRequest<CreateCostUnitResponse> {
	   

	private List<UnitEntityList> unitEntityLists;
	public CreateCostUnitRequest() {
		super("BssOpenApi", "2017-12-14", "CreateCostUnit");
		setMethod(MethodType.POST);
	}

	public List<UnitEntityList> getUnitEntityLists() {
		return this.unitEntityLists;
	}

	public void setUnitEntityLists(List<UnitEntityList> unitEntityLists) {
		this.unitEntityLists = unitEntityLists;	
		if (unitEntityLists != null) {
			for (int depth1 = 0; depth1 < unitEntityLists.size(); depth1++) {
				putQueryParameter("UnitEntityList." + (depth1 + 1) + ".UnitName" , unitEntityLists.get(depth1).getUnitName());
				putQueryParameter("UnitEntityList." + (depth1 + 1) + ".ParentUnitId" , unitEntityLists.get(depth1).getParentUnitId());
				putQueryParameter("UnitEntityList." + (depth1 + 1) + ".OwnerUid" , unitEntityLists.get(depth1).getOwnerUid());
			}
		}	
	}

	public static class UnitEntityList {

		private String unitName;

		private Long parentUnitId;

		private Long ownerUid;

		public String getUnitName() {
			return this.unitName;
		}

		public void setUnitName(String unitName) {
			this.unitName = unitName;
		}

		public Long getParentUnitId() {
			return this.parentUnitId;
		}

		public void setParentUnitId(Long parentUnitId) {
			this.parentUnitId = parentUnitId;
		}

		public Long getOwnerUid() {
			return this.ownerUid;
		}

		public void setOwnerUid(Long ownerUid) {
			this.ownerUid = ownerUid;
		}
	}

	@Override
	public Class<CreateCostUnitResponse> getResponseClass() {
		return CreateCostUnitResponse.class;
	}

}
