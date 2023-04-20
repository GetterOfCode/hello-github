package com.hainiu.tcpandThread;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class ServerThread implements Runnable {
    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }


    @Override
    public void run() {
        try (FileOutputStream fileOutputStream = new FileOutputStream("socket-demo\\"+ UUID.randomUUID().toString().replaceAll("-","")+"mn1.jpg");
             InputStream inputStream = socket.getInputStream();){

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

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
