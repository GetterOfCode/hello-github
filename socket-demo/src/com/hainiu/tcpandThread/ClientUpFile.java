package com.hainiu.tcpandThread;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class ClientUpFile {
    public static void main(String[] args) throws IOException, InterruptedException {
        FileInputStream in = new FileInputStream("socket-demo\\mn.jpg");
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),10086);

        OutputStream outputStream = socket.getOutputStream();
        byte[] bytes = new byte[8192];
        int len;
        while ((len = in.read(bytes))!=-1) {
            outputStream.write(bytes, 0, len);
            Thread.sleep(10);
        }
        outputStream.flush();
        socket.shutdownOutput();
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String readLine = reader.readLine();
        System.out.println(readLine);
        reader.close();
        in.close();
        socket.close();


    }
}
