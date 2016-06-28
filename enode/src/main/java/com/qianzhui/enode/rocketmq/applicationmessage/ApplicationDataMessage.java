package com.qianzhui.enode.rocketmq.applicationmessage;

/**
 * Created by junbo_xu on 2016/6/3.
 */
public class ApplicationDataMessage {
    private String applicationMessageData;
    private String applicationMessageType;

    public ApplicationDataMessage(String applicationMessageData, String applicationMessageType) {
        this.applicationMessageData = applicationMessageData;
        this.applicationMessageType = applicationMessageType;
    }

    public String getApplicationMessageData() {
        return applicationMessageData;
    }

    public void setApplicationMessageData(String applicationMessageData) {
        this.applicationMessageData = applicationMessageData;
    }

    public String getApplicationMessageType() {
        return applicationMessageType;
    }

    public void setApplicationMessageType(String applicationMessageType) {
        this.applicationMessageType = applicationMessageType;
    }
}
