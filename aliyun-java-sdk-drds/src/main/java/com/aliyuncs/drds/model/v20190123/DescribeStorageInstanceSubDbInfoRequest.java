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

package com.aliyuncs.drds.model.v20190123;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeStorageInstanceSubDbInfoRequest extends RpcAcsRequest<DescribeStorageInstanceSubDbInfoResponse> {
	
	public DescribeStorageInstanceSubDbInfoRequest() {
		super("Drds", "2019-01-23", "DescribeStorageInstanceSubDbInfo", "drds");
	}

	private String instanceId;

	private String dbName;

	private String drdsInstanceId;

	private String instType;

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getDbName() {
		return this.dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
		if(dbName != null){
			putQueryParameter("DbName", dbName);
		}
	}

	public String getDrdsInstanceId() {
		return this.drdsInstanceId;
	}

	public void setDrdsInstanceId(String drdsInstanceId) {
		this.drdsInstanceId = drdsInstanceId;
		if(drdsInstanceId != null){
			putQueryParameter("DrdsInstanceId", drdsInstanceId);
		}
	}

	public String getInstType() {
		return this.instType;
	}

	public void setInstType(String instType) {
		this.instType = instType;
		if(instType != null){
			putQueryParameter("InstType", instType);
		}
	}

	@Override
	public Class<DescribeStorageInstanceSubDbInfoResponse> getResponseClass() {
		return DescribeStorageInstanceSubDbInfoResponse.class;
	}

}
