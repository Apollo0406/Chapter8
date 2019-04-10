package ChatRoom;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //1.建立服务端socket
        ServerSocket server = new ServerSocket(9999);
        //2.服务端监听端口
        Socket client = server.accept();

   /*     //3.建立输入流
        DataInputStream dis = new DataInputStream(client.getInputStream());
        //4.接收客户端传过来的数据
        String msg = dis.readUTF();
        //5.建立输出流
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        //6.把读进来的msg写到客户端
        dos.writeUTF("Server->"+msg);*/

        /**
         * 以上只能单次读取客户端的数据
         */

        DataInputStream dis = new DataInputStream(client.getInputStream());
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        while (true){
            String msg = dis.readUTF();
            dos.writeUTF(msg);
        }
    }
}
