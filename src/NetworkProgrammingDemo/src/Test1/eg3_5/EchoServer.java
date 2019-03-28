/*
package Test1.eg3_5;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
   private int port = 8000;
   private ServerSocket serverSocket;

   public EchoServer() throws IOException{
       serverSocket = new ServerSocket(port);
       System.out.println("服务器启动");
    }

    public void service(){
       while(true){
           Socket socket = null;
           try{
               socket = serverSocket.accept();
               Thread workThread = new Thread(new Handler(socket));
           }catch (IOException e){
               e.printStackTrace();
           }
       }
    }

    public static void main(String[] args) throws IOException{
        new EchoServer().service();
    }
}

class Handler implements Runnable{
    private Socket socket;
    public Handler(Socket socket){
        this.socket = socket;
    }

    private PrintWriter getWriter(){}

    @Override
    public void run() {

    }
}*/
