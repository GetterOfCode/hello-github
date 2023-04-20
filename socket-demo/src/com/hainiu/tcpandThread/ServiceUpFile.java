package com.hainiu.tcpandThread;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ServiceUpFile {
    public static void main(String[] args)throws IOException {
        ServerSocket serverSocket = new ServerSocket(10086);
        ThreadPoolExecutor pool = new ThreadPoolExecutor(3,
                5,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
                );
        while(true){
            Socket socket = serverSocket.accept();
            pool.submit(new ServerThread(socket));

        }



    }
}
