package com.yunfy.learning.patterns.adapter;

import java.util.List;

/**
 * @author yunfy
 * @create 2019-03-26 21:45
 **/
public class Client {

    public static void main(String[] args) {
        LogModel model = new LogModel();
        model.setLogId("001");
        model.setOperateUser("admin");
        model.setOperateTime("2019-03-26 21:45");
        model.setLogContent("测试日志");

//        List<LogModel> list = new ArrayList<>();
//        list.add(model);

        LogFileOperateApi logFileOperateApi = new LogFileOperate("");
//        //保存
//        logFileOperateApi.writeLogFile(list);
//
//
//        //读取日志文件的内容
//        List<LogModel> readLog = logFileOperateApi.readLogFile();
//        System.out.println("readLog=" + readLog);

        //创建新版的操作日志的接口对象
        LogDbOperateApi api = new Adapter(logFileOperateApi);
        //保存日志文件
        api.createLog(model);
        //读取日志文件的内容
        List<LogModel> allLog = api.getAllLog();
        System.out.println("allLog=" + allLog);


    }
}
