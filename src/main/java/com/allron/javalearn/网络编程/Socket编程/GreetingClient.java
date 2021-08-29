package com.allron.javalearn.网络编程.Socket编程;

import java.io.*;
import java.net.Socket;

/**
 * Socket客户端
 *
 * @author Allron
 * @date 2019/09/03
 **/
public class GreetingClient {
    public static void main(String [] args)
    {
        String serverName = "localhost";
        int port = 6066;
        try
        {
            System.out.println("连接到主机：" + serverName + " ，端口号：" + port);
            Socket client = new Socket(serverName, port);
            System.out.println("远程主机地址：" + client.getRemoteSocketAddress());
            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);

            out.writeUTF("Hello from " + client.getLocalSocketAddress());
            InputStream inFromServer = client.getInputStream();
            DataInputStream in = new DataInputStream(inFromServer);
            System.out.println("服务器响应： " + in.readUTF());
            client.close();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
