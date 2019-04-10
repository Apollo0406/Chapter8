package ChatRoom;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
       /* //1.建立客户端socket
        Socket client = new Socket("DESKTOP-AL7IU8R",9999);

        //2.控制台输入流
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String info = console.readLine();

        //2.建立输出流
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        dos.writeUTF(info);
        dos.flush();

        //3.建立输入流
        DataInputStream dis = new DataInputStream(client.getInputStream());
        //4.用流把数据读进来
        String msg = dis.readUTF();
        //5.把读进来的数据打印在输出台
        System.out.println(msg);*/

        /**
         * 以上代码只能实现客户端单词发送数据，要想多次发送数据，
         * 考虑使用循环
         */
      /*  //1.建立客户端socket
        Socket client = new Socket("DESKTOP-AL7IU8R",9999);
        //2.控制台输入流
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        //3.输入流
        DataInputStream dis = new DataInputStream(client.getInputStream());
        //4.输出流
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());

        //5.循环输出数据
        while (true){
            String out = console.readLine();
            dos.writeUTF(out);
            dos.flush();

            String in = dis.readUTF();
            System.out.println("server->"+in);
        }*/

        /**
         * 上述代码只能实现多次输出输入，下面我们使用线程
         */
        /*Socket client = new Socket("DESKTOP-AL7IU8R",9999);
        new Thread(new Send(client)).start();

        DataInputStream dis = new DataInputStream(client.getInputStream());

        while(true){
            String msg = dis.readUTF();
            System.out.println(msg);
        }*/

        /**
         * 接受也线程实现
         */
        Socket client = new Socket("DESKTOP-AL7IU8R",9999);
        new Thread(new Send(client)).start();
        new Thread(new Receive(client)).start();
    }
}
