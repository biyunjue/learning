package com.yunfy.learning.patterns.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * 适配器对象，把记录日志到文件的功能适配成第二版需要的增删改查的功能
 *
 * @author yunfy
 * @create 2019-03-26 21:56
 **/
public class Adapter implements LogDbOperateApi {
    /**
     * 持有需要被适配的对象
     */
    private LogFileOperateApi adaptee;

    public Adapter(LogFileOperateApi adaptee) {
        this.adaptee = adaptee;
    }

    /**
     * 需要新增的日志对象
     *
     * @param lm 日志对象
     */
    @Override
    public void createLog(LogModel lm) {
        //1：先读取文件的内容
        List<LogModel> list = adaptee.readLogFile();
        //2：加入新的日志对象
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(lm);
        //3：重新写入文件
        adaptee.writeLogFile(list);
    }

    /**
     * 修改日志
     *
     * @param lm 需要修改的日志对象
     */
    @Override
    public void updateLog(LogModel lm) {
        //1：先读取文件的内容
        List<LogModel> list = adaptee.readLogFile();
        //2：修改相应的日志对象
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getLogId().equals(lm.getLogId())) {
                list.set(i, lm);
                break;
            }
        }
        //3：重新写入文件
        adaptee.writeLogFile(list);
    }

    /**
     * 删除日志
     *
     * @param lm 需要删除的日志对象
     */
    @Override
    public void removeLog(LogModel lm) {
        List<LogModel> list = adaptee.readLogFile();
        //2：删除相应的日志对象
        list.remove(lm);
        //3：重新写入文件
        adaptee.writeLogFile(list);
    }

    /**
     * 获取所有的日志
     *
     * @return 所有的日志对象
     */
    @Override
    public List<LogModel> getAllLog() {
        return adaptee.readLogFile();
    }
}
