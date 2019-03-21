package EasySocketCommunication;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketDemo {
    public static void main(String[] args) {
        ServerSocket server;
        try{
            //1.创建绑定到指定端口的服务器套接字。
            server = new ServerSocket(2020);
            //2.侦听要连接到此套接字并接受它。
            Socket sk = server.accept();
            System.out.println("客户端连接成功！");
            //3.得到套接字的输出流
            //4.创建一个新的数据输出流，以将数据写入指定的底层输出流。
            DataOutputStream dos = new DataOutputStream(sk.getOutputStream());
            //5.使用 modified UTF-8编码以机器无关的方式将字符串写入基础输出流。
            dos.writeUTF("你已连接成功");
            dos.writeUTF("再见！");
            dos.close();
            server.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}

/**
 * 简单Socket通信
 * 首先服务器端：
 * 1.指定要监听的端口： ServerSocket server = new ServerSocket(2020);
 * 2.通过ServerSocket.accept侦听并创建Socket: Socket sk = server.accept();
 * 3.建立连接之后，准备往客户端发送数据。则要建立输出流
 *  3.1得到输出流： server.getOutputStream
 *  3.2创建数据输出流： DataOutputStream dos = new DataOutputStream(server.getOutputStream());
 * 4.向客户端发送数据：dos.writeUTF("要发送的内容");
 * 5.关闭流：dos.close()
 * 6.关闭连接：server.close()
 */