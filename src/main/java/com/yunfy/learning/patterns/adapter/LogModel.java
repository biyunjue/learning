package com.yunfy.learning.patterns.adapter;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author yunfy
 * @create 2019-03-26 21:40
 **/
public class LogModel implements Serializable {
    /**
     * 日志编号
     */
    private String logId;
    /**
     * 操作人员
     */
    private String operateUser;
    /**
     * 操作时间，以yyyy-MM-dd HH:mm:ss的格式记录
     */
    private String operateTime;
    /**
     * 日志内容
     */
    private String logContent;

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public String getOperateUser() {
        return operateUser;
    }

    public void setOperateUser(String operateUser) {
        this.operateUser = operateUser;
    }

    public String getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }

    public String getLogContent() {
        return logContent;
    }

    public void setLogContent(String logContent) {
        this.logContent = logContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LogModel model = (LogModel) o;
        return Objects.equals(logId, model.logId) &&
                Objects.equals(operateUser, model.operateUser) &&
                Objects.equals(operateTime, model.operateTime) &&
                Objects.equals(logContent, model.logContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logId, operateUser, operateTime, logContent);
    }

    @Override
    public String toString() {
        return "logId=" + logId + ",operateUser=" + operateUser + ",operateTime=" + operateTime + ",logContent=" + logContent;
    }
}
