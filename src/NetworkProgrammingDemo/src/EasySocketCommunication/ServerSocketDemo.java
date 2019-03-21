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
