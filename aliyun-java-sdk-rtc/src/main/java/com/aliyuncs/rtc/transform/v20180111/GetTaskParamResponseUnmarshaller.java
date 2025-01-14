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

package com.aliyuncs.rtc.transform.v20180111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rtc.model.v20180111.GetTaskParamResponse;
import com.aliyuncs.rtc.model.v20180111.GetTaskParamResponse.MixPaneItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTaskParamResponseUnmarshaller {

	public static GetTaskParamResponse unmarshall(GetTaskParamResponse getTaskParamResponse, UnmarshallerContext _ctx) {
		
		getTaskParamResponse.setRequestId(_ctx.stringValue("GetTaskParamResponse.RequestId"));
		getTaskParamResponse.setChannelId(_ctx.stringValue("GetTaskParamResponse.ChannelId"));
		getTaskParamResponse.setTemplateId(_ctx.longValue("GetTaskParamResponse.TemplateId"));

		List<MixPaneItem> mixPane = new ArrayList<MixPaneItem>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskParamResponse.MixPane.Length"); i++) {
			MixPaneItem mixPaneItem = new MixPaneItem();
			mixPaneItem.setPaneId(_ctx.integerValue("GetTaskParamResponse.MixPane["+ i +"].PaneId"));
			mixPaneItem.setUserId(_ctx.stringValue("GetTaskParamResponse.MixPane["+ i +"].UserId"));
			mixPaneItem.setSourceType(_ctx.stringValue("GetTaskParamResponse.MixPane["+ i +"].SourceType"));

			mixPane.add(mixPaneItem);
		}
		getTaskParamResponse.setMixPane(mixPane);
	 
	 	return getTaskParamResponse;
	}
}