package Clients2ServerDemo;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MutilServerDemo {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);
        try{
            ServerSocket server = new ServerSocket(6666);
            System.out.println("服务器已经启动，正在等待连接.....");
            while(true){
                Socket s = server.accept();
                System.out.println(s.getInetAddress().getHostAddress());
                es.execute(new UserThread(s));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
