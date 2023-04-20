package com.hainiu.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServiceUpFile {
    public static void main(String[] args)throws IOException {
        ServerSocket serverSocket = new ServerSocket(10021);
        Socket socket = serverSocket.accept();
        FileOutputStream fileOutputStream = new FileOutputStream("socket-demo\\mn1.jpg");
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[8192];
        int len;
        while ((len = inputStream.read(bytes))!=-1){
            fileOutputStream.write(bytes, 0, len);
        }
        fileOutputStream.flush();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        String str = "上传成功！";
        writer.write(str);
        writer.flush();
        writer.close();
        fileOutputStream.close();
        socket.close();


    }
}
