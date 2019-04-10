package Test1.eg2_1;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

public class PortScanner {
    public static void main(String[] args) {
        String host = "localhost";
        if(args.length > 0)
            host=args[0];
        new PortScanner().scan(host);
    }
    private void scan(String host) {
        Socket socket = null;
        for(int port = 1;port < 1024;port++){
            try{
                //创建一个连接指定主机名称和端口的客户端socket
                socket = new Socket();
                SocketAddress socketAddress = new InetSocketAddress(host,port);
                socket.connect(socketAddress,2000);
                //如果连接成功，就一个Socket对象，并打印一下语句
                System.out.println("There is a server on port:"+port);
            } catch (IOException e) {
                System.err.println("Can't connect to port:"+port+e);
            } finally {
                try{
                    //强制关闭连接
                    if(socket !=null)
                        socket.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
