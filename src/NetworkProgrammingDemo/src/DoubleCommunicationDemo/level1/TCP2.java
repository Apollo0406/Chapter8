package DoubleCommunicationDemo.level1;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP2 {

    //客户端
    @Test
    public void client() throws IOException {
        Socket socket = new Socket(InetAddress.getByName("192.168.1.205"),7777);
        OutputStream os = socket.getOutputStream();
        os.write("我是客户端".getBytes());
        socket.close();
    }

    //服务器端
    @Test
    public void server() throws IOException {
        ServerSocket ss = new ServerSocket(7777);
        Socket s = ss.accept();
        InputStream is = s.getInputStream();
        byte[] b= new byte[20];
        int len;
        while((len = is.read(b)) != -1){
            String str = new String(b,0,len);
            System.out.print(str);
        }
        s.close();
    }

}
