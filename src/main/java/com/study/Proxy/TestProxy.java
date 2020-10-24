package com.study.Proxy;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class TestProxy {
    public static void main(String[] args) {
        //  Proxy.newProxyInstance()
        Lock l = new ReentrantLock();
        ReentrantReadWriteLock loc = new ReentrantReadWriteLock();
        loc.readLock();
    }
}
