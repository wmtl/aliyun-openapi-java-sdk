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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.PreCheckCreateOrderForTempUpgradeResponse;
import com.aliyuncs.rds.model.v20140815.PreCheckCreateOrderForTempUpgradeResponse.FailuresItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class PreCheckCreateOrderForTempUpgradeResponseUnmarshaller {

	public static PreCheckCreateOrderForTempUpgradeResponse unmarshall(PreCheckCreateOrderForTempUpgradeResponse preCheckCreateOrderForTempUpgradeResponse, UnmarshallerContext _ctx) {
		
		preCheckCreateOrderForTempUpgradeResponse.setRequestId(_ctx.stringValue("PreCheckCreateOrderForTempUpgradeResponse.RequestId"));
		preCheckCreateOrderForTempUpgradeResponse.setPreCheckResult(_ctx.booleanValue("PreCheckCreateOrderForTempUpgradeResponse.PreCheckResult"));

		List<FailuresItem> failures = new ArrayList<FailuresItem>();
		for (int i = 0; i < _ctx.lengthValue("PreCheckCreateOrderForTempUpgradeResponse.Failures.Length"); i++) {
			FailuresItem failuresItem = new FailuresItem();
			failuresItem.setCode(_ctx.stringValue("PreCheckCreateOrderForTempUpgradeResponse.Failures["+ i +"].Code"));
			failuresItem.setMessage(_ctx.stringValue("PreCheckCreateOrderForTempUpgradeResponse.Failures["+ i +"].Message"));

			failures.add(failuresItem);
		}
		preCheckCreateOrderForTempUpgradeResponse.setFailures(failures);
	 
	 	return preCheckCreateOrderForTempUpgradeResponse;
	}
}