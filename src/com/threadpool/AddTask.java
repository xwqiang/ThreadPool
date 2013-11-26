package com.threadpool;

import java.util.concurrent.TimeUnit;

public class AddTask extends Thread{
	ThreadPoolManager pool ;
	public AddTask(ThreadPoolManager pool){
		this.pool = pool;
	}
	public void run(){
		while(true){
			pool.addTask(new TaskUpload("ext task"+Math.random()*100));
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}