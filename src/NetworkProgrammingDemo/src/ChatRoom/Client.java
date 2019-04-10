package ChatRoom;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //1.建立客户端socket
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
        System.out.println(msg);
    }
}
