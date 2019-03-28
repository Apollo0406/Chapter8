package TCPSocketDemo;

import java.io.*;
import java.net.Socket;
//读进来，写出去
public class Client {
    public static void main(String[] args) throws IOException {
        //1.创建套接字，与服务器建立连接
        Socket client = new Socket("192.168.1.205",5558);
        //2.建立输出输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
        //3.建立键盘输入流
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        //4.利用流与服务器交互
        while(true){
            String line = input.readLine();  //把键盘的输入读进来
            bw.write(line); //把数据写到服务端
            bw.newLine();
            bw.flush();
            //如果键盘输入"over"则结束
            if(line.equals("over")){
                    break;
            }
            //把服务端返回的数据写到控制台
            System.out.println(br.readLine());
        }
        input.close();
        br.close();
        bw.close();
        client.close();
    }
}
