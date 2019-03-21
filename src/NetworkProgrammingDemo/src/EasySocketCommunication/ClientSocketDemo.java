package EasySocketCommunication;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientSocketDemo {
    public static void main(String[] args) {
        //1.定义客户端Socket
        Socket client;
        try{
            //2.创建流套接字并将其连接到指定主机上的指定端口号。
            client = new Socket("192.168.1.205",2020);
            //3.返回此套接字的输入流。
            //4.创建使用指定的底层InputStream的DataInputStream。
            DataInputStream dis = new DataInputStream(client.getInputStream());
            //5.读取已使用 modified UTF-8格式编码的字符串。
            System.out.println("来自服务器："+dis.readUTF());
            System.out.println("来自服务器："+dis.readUTF());
            //6.关闭此套接字
            client.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}

/**
 *简单Socket通信
 * 接着客户端：（在服务器开始监听端口可以建立连接之后）
 * 1.创建客户端Socket: Socket client = new Socket("xx.xx.xx.x",2020);
 * 2.创建输入流准备接收服务器端发来的数据
 *  2.1先得到输入流 ：client.getInputStream
 *  2.2创建数据输入流： DataInputStream dis = new DataInputStream(client.getInputStream);
 * 3.读取数据并打印在控制台：dis.readUTF();
 * 4.关闭连接：client.close()
 */