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

package com.aliyuncs.vs.model.v20181212;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDeviceRequest extends RpcAcsRequest<CreateDeviceResponse> {
	   

	private String gbId;

	private String description;

	private String type;

	private Boolean autoStart;

	private String parentId;

	private String password;

	private String vendor;

	private String directoryId;

	private String groupId;

	private String ip;

	private Long ownerId;

	private String url;

	private Long port;

	private String name;

	private String username;
	public CreateDeviceRequest() {
		super("vs", "2018-12-12", "CreateDevice", "vs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getGbId() {
		return this.gbId;
	}

	public void setGbId(String gbId) {
		this.gbId = gbId;
		if(gbId != null){
			putQueryParameter("GbId", gbId);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public Boolean getAutoStart() {
		return this.autoStart;
	}

	public void setAutoStart(Boolean autoStart) {
		this.autoStart = autoStart;
		if(autoStart != null){
			putQueryParameter("AutoStart", autoStart.toString());
		}
	}

	public String getParentId() {
		return this.parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
		if(parentId != null){
			putQueryParameter("ParentId", parentId);
		}
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putQueryParameter("Password", password);
		}
	}

	public String getVendor() {
		return this.vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
		if(vendor != null){
			putQueryParameter("Vendor", vendor);
		}
	}

	public String getDirectoryId() {
		return this.directoryId;
	}

	public void setDirectoryId(String directoryId) {
		this.directoryId = directoryId;
		if(directoryId != null){
			putQueryParameter("DirectoryId", directoryId);
		}
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
		}
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
		if(ip != null){
			putQueryParameter("Ip", ip);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
		if(url != null){
			putQueryParameter("Url", url);
		}
	}

	public Long getPort() {
		return this.port;
	}

	public void setPort(Long port) {
		this.port = port;
		if(port != null){
			putQueryParameter("Port", port.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
		if(username != null){
			putQueryParameter("Username", username);
		}
	}

	@Override
	public Class<CreateDeviceResponse> getResponseClass() {
		return CreateDeviceResponse.class;
	}

}
