/*
 *
 *  Copyright (c) 2014, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 * /
 */
package com.wso2telco.dep.mediator.entity.smsmessaging;

import javax.xml.bind.annotation.XmlRootElement;

 
// TODO: Auto-generated Javadoc

/**
 * The Class inboundSMSMessageNotification.
 */
@XmlRootElement(name = "inboundSMSMessageNotification")
public class InboundSMSMessageNotification {
    
    /** The callback data. */
    private String callbackData = "";
    
    /** The inbound sms message. */
    private InboundSMSMessage inboundSMSMessage;
    
    /**
     * Instantiates a new inbound sms message notification.
     */
    public InboundSMSMessageNotification() {
    }
    
    /**
     * Gets the callback data.
     *
     * @return the callback data
     */
    public String getcallbackData() {
            return callbackData;
    }

    /**
     * Sets the callback data.
     *
     * @param callbackData the new callback data
     */
    public void setCallbackData(String callbackData) {
            this.callbackData = callbackData;
    }
    
    /**
     * Gets the inbound sms message.
     *
     * @return the inbound sms message
     */
    public InboundSMSMessage getInboundSMSMessage() {
            return inboundSMSMessage;
    }
    
    /**
     * Sets the inbound sms message.
     *
     * @param inboundSMSMessage the new inbound sms message
     */
    public void setInboundSMSMessage (InboundSMSMessage inboundSMSMessage) {
            this.inboundSMSMessage = inboundSMSMessage;
    }
    
}
