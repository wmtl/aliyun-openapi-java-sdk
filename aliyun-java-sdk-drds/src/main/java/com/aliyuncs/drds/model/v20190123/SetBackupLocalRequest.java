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
public class SetBackupLocalRequest extends RpcAcsRequest<SetBackupLocalResponse> {
	
	public SetBackupLocalRequest() {
		super("Drds", "2019-01-23", "SetBackupLocal", "drds");
	}

	private String localLogRetentionHours;

	private String highSpaceUsageProtection;

	private String localLogRetentionSpace;

	private String drdsInstanceId;

	public String getLocalLogRetentionHours() {
		return this.localLogRetentionHours;
	}

	public void setLocalLogRetentionHours(String localLogRetentionHours) {
		this.localLogRetentionHours = localLogRetentionHours;
		if(localLogRetentionHours != null){
			putQueryParameter("LocalLogRetentionHours", localLogRetentionHours);
		}
	}

	public String getHighSpaceUsageProtection() {
		return this.highSpaceUsageProtection;
	}

	public void setHighSpaceUsageProtection(String highSpaceUsageProtection) {
		this.highSpaceUsageProtection = highSpaceUsageProtection;
		if(highSpaceUsageProtection != null){
			putQueryParameter("HighSpaceUsageProtection", highSpaceUsageProtection);
		}
	}

	public String getLocalLogRetentionSpace() {
		return this.localLogRetentionSpace;
	}

	public void setLocalLogRetentionSpace(String localLogRetentionSpace) {
		this.localLogRetentionSpace = localLogRetentionSpace;
		if(localLogRetentionSpace != null){
			putQueryParameter("LocalLogRetentionSpace", localLogRetentionSpace);
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

	@Override
	public Class<SetBackupLocalResponse> getResponseClass() {
		return SetBackupLocalResponse.class;
	}

}
