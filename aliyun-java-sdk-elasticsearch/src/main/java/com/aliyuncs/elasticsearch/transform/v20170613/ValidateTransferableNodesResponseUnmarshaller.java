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

package com.aliyuncs.elasticsearch.transform.v20170613;

import com.aliyuncs.elasticsearch.model.v20170613.ValidateTransferableNodesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ValidateTransferableNodesResponseUnmarshaller {

	public static ValidateTransferableNodesResponse unmarshall(ValidateTransferableNodesResponse validateTransferableNodesResponse, UnmarshallerContext _ctx) {
		
		validateTransferableNodesResponse.setRequestId(_ctx.stringValue("ValidateTransferableNodesResponse.RequestId"));
		validateTransferableNodesResponse.setCode(_ctx.stringValue("ValidateTransferableNodesResponse.Code"));
		validateTransferableNodesResponse.setMessage(_ctx.stringValue("ValidateTransferableNodesResponse.Message"));
		validateTransferableNodesResponse.setResult(_ctx.booleanValue("ValidateTransferableNodesResponse.Result"));
	 
	 	return validateTransferableNodesResponse;
	}
}