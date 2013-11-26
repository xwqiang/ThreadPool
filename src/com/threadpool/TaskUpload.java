package com.threadpool;

public class TaskUpload extends Upload {
    
    public TaskUpload(String info){
        this.info = info;
    }
    public String getInfo(){
        return info;
    }
    @Override
    public boolean uploadPic()  {
        System.out.println(info+":uploading files ....");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(info+":uploading files finished ....");
        return false;
    }
}
