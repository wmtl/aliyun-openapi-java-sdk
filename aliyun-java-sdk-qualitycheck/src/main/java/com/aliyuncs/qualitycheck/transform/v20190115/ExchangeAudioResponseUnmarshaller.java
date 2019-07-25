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

package com.aliyuncs.qualitycheck.transform.v20190115;

import com.aliyuncs.qualitycheck.model.v20190115.ExchangeAudioResponse;
import com.aliyuncs.qualitycheck.model.v20190115.ExchangeAudioResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExchangeAudioResponseUnmarshaller {

	public static ExchangeAudioResponse unmarshall(ExchangeAudioResponse exchangeAudioResponse, UnmarshallerContext _ctx) {
		
		exchangeAudioResponse.setRequestId(_ctx.stringValue("ExchangeAudioResponse.RequestId"));
		exchangeAudioResponse.setSuccess(_ctx.booleanValue("ExchangeAudioResponse.Success"));
		exchangeAudioResponse.setCode(_ctx.stringValue("ExchangeAudioResponse.Code"));
		exchangeAudioResponse.setMessage(_ctx.stringValue("ExchangeAudioResponse.Message"));

		Data data = new Data();
		data.setAudioName(_ctx.stringValue("ExchangeAudioResponse.Data.AudioName"));
		data.setIsCovertContext(_ctx.booleanValue("ExchangeAudioResponse.Data.IsCovertContext"));
		data.setIsOnlyFile(_ctx.booleanValue("ExchangeAudioResponse.Data.IsOnlyFile"));
		data.setSetId(_ctx.longValue("ExchangeAudioResponse.Data.SetId"));
		data.setTaskAsrResqusetId(_ctx.stringValue("ExchangeAudioResponse.Data.TaskAsrResqusetId"));
		exchangeAudioResponse.setData(data);
	 
	 	return exchangeAudioResponse;
	}
}