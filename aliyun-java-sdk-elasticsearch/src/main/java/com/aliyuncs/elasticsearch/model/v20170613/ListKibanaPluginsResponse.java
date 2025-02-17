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

package com.aliyuncs.elasticsearch.model.v20170613;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.elasticsearch.transform.v20170613.ListKibanaPluginsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListKibanaPluginsResponse extends AcsResponse {

	private String requestId;

	private List<PluginItem> result;

	private Headers headers;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<PluginItem> getResult() {
		return this.result;
	}

	public void setResult(List<PluginItem> result) {
		this.result = result;
	}

	public Headers getBizHeaders() {
		return this.headers;
	}

	public void setBizHeaders(Headers headers) {
		this.headers = headers;
	}

	/**
	 * @deprecated use getBizHeaders instead of this.
	 */
	@Deprecated
	public Headers getHeaders() {
		return this.headers;
	}

	/**
	 * @deprecated use setBizHeaders instead of this.
	 */
	@Deprecated
	public void setHeaders(Headers headers) {
		this.headers = headers;
	}

	public static class PluginItem {

		private String name;

		private String state;

		private String source;

		private String description;

		private String specificationUrl;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getSpecificationUrl() {
			return this.specificationUrl;
		}

		public void setSpecificationUrl(String specificationUrl) {
			this.specificationUrl = specificationUrl;
		}
	}

	public static class Headers {

		private Integer xTotalCount;

		public Integer getXTotalCount() {
			return this.xTotalCount;
		}

		public void setXTotalCount(Integer xTotalCount) {
			this.xTotalCount = xTotalCount;
		}
	}

	@Override
	public ListKibanaPluginsResponse getInstance(UnmarshallerContext context) {
		return	ListKibanaPluginsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
