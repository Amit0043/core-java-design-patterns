package com.java.design.pattern;

public class SingletonService {
    private static SingletonService instance = null;
    public String data;
    private SingletonService(){
        data = "Singleton initialized";
    }

    public static synchronized SingletonService getInstance(){
        if(instance == null)
            instance = new SingletonService();
        return instance;
    }

    public String getData(){
        return data;
    }

    public void setData(String data){
        this.data = data;
    }
}
