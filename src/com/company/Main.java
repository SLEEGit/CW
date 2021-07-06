package com.company;

import java.util.concurrent.locks.Lock;
import java.util.Scanner;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.holdsLock;

public class Main {

    public static void main(String[] args) {
	Thread thread = currentThread();
	System.out.println(thread.getState());
        thread.setName("jaabanga");
        thread.setPriority(1);
        System.out.println(thread.toString());
        String s = new String();
        Object synch = new Object();
        Lock lock;
        }
}
