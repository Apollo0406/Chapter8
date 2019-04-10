package Clients2ServerDemo2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
    public static void main(String[] args) throws IOException {
        //1.创建服务端Socket并绑定要监听的端口
        ServerSocket serverSocket = new ServerSocket(8888);
        int num = 1;  //保存客户端的个数
        while (true){
            //2.开始监听，并返回Socket对象
            Socket socket = serverSocket.accept();
            System.out.println("客户端"+num+"已经成功连接!");
            num++;
        }

    }
}
