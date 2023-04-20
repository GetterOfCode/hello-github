package com.hainiu.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ServiceDemo {
    public static void main(String[] args) throws Exception {
        int port = 10086;
        DatagramSocket socket = new DatagramSocket(port);
        byte[] bytes = new byte[8192];
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
        while (true){
            socket.receive(packet);
            String hostName = packet.getAddress().getHostName();
            int length = packet.getLength();
            String s = new String(bytes, 0, length);
            System.out.println(hostName+":"+s);
        }

    }
}
