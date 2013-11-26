package com.threadpool;

import java.util.concurrent.TimeUnit;

public class ThreadPoolManagerTest {

	
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Upload[] tasks = createBatchTask(7);
        ThreadPoolManager pool = ThreadPoolManager.getInstance();
        pool.BatchAddTask(tasks);
        AddTask a = new AddTask(pool);
        a.start();
//        pool.destory();
    }
    private static Upload[] createBatchTask(int n){
        Upload[] tasks = new TaskUpload[n];
        for(int i = 0;i<n ;i++ ){
            tasks[i] = new TaskUpload("task id is "+ i);
        }
        return tasks;
    }
}
