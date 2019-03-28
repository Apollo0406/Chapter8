package TCPSocketDemo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        //1.创建服务端套接字
        ServerSocket serverSocket = new ServerSocket(5558);
        //2.服务器监听，并得到套接字
        Socket socket = serverSocket.accept();
        System.out.println(socket.getInetAddress().getHostAddress()+"与服务器已经建立连接！");
        //3.通过Socket获得输入输出流
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        //4.利用流与客户端交互
        String line = null;
        //读取客户端的数据
        while ( (line = br.readLine()) != null){
            if(line.equals("over")){
                break;
            }
            System.out.println(line);  //把读到的内容写在控制台
            bw.write(line.toUpperCase());  //并转成大写写到客户端
            bw.newLine();  //换行符，让服务器知道输完一行了
            bw.flush(); //清缓存并把数据写出去
        }
        //如果客户端传了“over”，就结束
        bw.close();
        br.close();
        socket.close();
        serverSocket.close();
        System.out.println(serverSocket.getInetAddress().getHostAddress()+"与服务器已经断开连接");
    }
}
