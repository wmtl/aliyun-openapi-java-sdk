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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20180120.GetEdgeInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetEdgeInstanceResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String errorMessage;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String instanceId;

		private String name;

		private String tags;

		private Integer spec;

		private Boolean bizEnable;

		private String gmtCreate;

		private String gmtModified;

		private String roleArn;

		private String roleName;

		private String roleAttachTime;

		private Integer latestDeploymentStatus;

		private String latestDeploymentType;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getTags() {
			return this.tags;
		}

		public void setTags(String tags) {
			this.tags = tags;
		}

		public Integer getSpec() {
			return this.spec;
		}

		public void setSpec(Integer spec) {
			this.spec = spec;
		}

		public Boolean getBizEnable() {
			return this.bizEnable;
		}

		public void setBizEnable(Boolean bizEnable) {
			this.bizEnable = bizEnable;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getRoleArn() {
			return this.roleArn;
		}

		public void setRoleArn(String roleArn) {
			this.roleArn = roleArn;
		}

		public String getRoleName() {
			return this.roleName;
		}

		public void setRoleName(String roleName) {
			this.roleName = roleName;
		}

		public String getRoleAttachTime() {
			return this.roleAttachTime;
		}

		public void setRoleAttachTime(String roleAttachTime) {
			this.roleAttachTime = roleAttachTime;
		}

		public Integer getLatestDeploymentStatus() {
			return this.latestDeploymentStatus;
		}

		public void setLatestDeploymentStatus(Integer latestDeploymentStatus) {
			this.latestDeploymentStatus = latestDeploymentStatus;
		}

		public String getLatestDeploymentType() {
			return this.latestDeploymentType;
		}

		public void setLatestDeploymentType(String latestDeploymentType) {
			this.latestDeploymentType = latestDeploymentType;
		}
	}

	@Override
	public GetEdgeInstanceResponse getInstance(UnmarshallerContext context) {
		return	GetEdgeInstanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
