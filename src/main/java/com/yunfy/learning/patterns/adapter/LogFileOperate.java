package com.yunfy.learning.patterns.adapter;

import java.io.*;
import java.util.List;

/**
 * 实现对日志文件的操作
 *
 * @author yunfy
 * @create 2019-03-26 21:42
 **/
public class LogFileOperate implements LogFileOperateApi {

    /**
     * 日志文件的路径和文件名称，默认是当前项目的根下的AdapterLog.log
     */
    private String logFilePathName = "AdapterLog.log";

    /**
     * 传入文件的路径和名称
     *
     * @param logFilePathName
     */
    public LogFileOperate(String logFilePathName) {

        //先判断是否传入了文件的路径和名称，如果是，
        //就重新设置操作的日志文件的路径和名称
        if (logFilePathName != null && logFilePathName.trim().length() > 0) {
            this.logFilePathName = logFilePathName;
        }
    }

    /**
     * 读取日志文件，从文件里面获取存储的日志列表对象
     * 存储的日志列表对象
     */
    @Override
    public List<LogModel> readLogFile() {
        List<LogModel> list = null;
        ObjectInputStream oin = null;
        try {
            File f = new File(logFilePathName);
            if (f.exists()) {
                oin = new ObjectInputStream(new BufferedInputStream(new FileInputStream(f)));
                list = (List<LogModel>) oin.readObject();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (oin != null) {
                    oin.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    /**
     * 写日志文件，把日志列表写出到日志文件中去
     * 要写到日志文件的日志列表
     *
     * @param list
     */
    @Override
    public void writeLogFile(List<LogModel> list) {
        File f = new File(logFilePathName);
        ObjectOutputStream oout = null;
        try {
            oout = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f)));
            oout.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oout != null) {
                    oout.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
