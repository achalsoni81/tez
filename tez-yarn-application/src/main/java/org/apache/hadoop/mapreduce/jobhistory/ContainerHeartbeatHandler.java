/**
* Licensed to the Apache Software Foundation (ASF) under one
* or more contributor license agreements.  See the NOTICE file
* distributed with this work for additional information
* regarding copyright ownership.  The ASF licenses this file
* to you under the Apache License, Version 2.0 (the
* "License"); you may not use this file except in compliance
* with the License.  You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package org.apache.hadoop.mapreduce.jobhistory;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.mapreduce.MRJobConfig;
import org.apache.hadoop.mapreduce.v2.app2.AppContext;
import org.apache.hadoop.mapreduce.v2.app2.rm.container.AMContainerEvent;
import org.apache.hadoop.mapreduce.v2.app2.rm.container.AMContainerEventType;
import org.apache.hadoop.yarn.api.records.ContainerId;

public class ContainerHeartbeatHandler extends
    HeartbeatHandlerBase<ContainerId> {

 
  public ContainerHeartbeatHandler(AppContext context, 
      int numThreads) {
    super(context, numThreads, "ContainerHeartbeatHandler");
  }

  @Override
  protected int getConfiguredTimeout(Configuration conf) {
    // TODO Maybe define separate timeouts for Containers and tasks.
    return conf.getInt(MRJobConfig.TASK_TIMEOUT, 5 * 60 * 1000);
  }

  @Override
  protected int getConfiguredTimeoutCheckInterval(Configuration conf) {
    return conf.getInt(MRJobConfig.TASK_TIMEOUT_CHECK_INTERVAL_MS, 30 * 1000);
  }

  @Override
  protected boolean hasTimedOut(ReportTime report, long currentTime) {
    return (timeOut > 0) && (currentTime > report.getLastPing() + timeOut);

  }

  @SuppressWarnings("unchecked")
  @Override
  protected void handleTimeOut(ContainerId containerId) {
    eventHandler.handle(new AMContainerEvent(containerId,
        AMContainerEventType.C_TIMED_OUT));
  }

}
