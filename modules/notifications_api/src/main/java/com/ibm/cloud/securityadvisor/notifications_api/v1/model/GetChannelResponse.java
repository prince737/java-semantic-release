/*
 * (C) Copyright IBM Corp. 2020.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.cloud.securityadvisor.notifications_api.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Response of get channel.
 */
public class GetChannelResponse extends GenericModel {

  protected GetChannelResponseChannel channel;

  /**
   * Gets the channel.
   *
   * Response including channels.
   *
   * @return the channel
   */
  public GetChannelResponseChannel getChannel() {
    return channel;
  }
}

