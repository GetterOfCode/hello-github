package com.hainiu.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SendDemo {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String data = "我是 ikun，你们都是小黑子！"+sdf.format(System.currentTimeMillis());
        byte[] bytes = data.getBytes();
        InetAddress address =InetAddress.getByName("255.255.255.255");
        DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length,address,10086);
        while (true){
            socket.send(datagramPacket);
            Thread.sleep(10);
        }
//        socket.close();
    }
}
