package ChatRoom;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * 建立一个接收线程
 */
public class Receive implements Runnable{
    private DataInputStream dis;
    private Boolean isRunning = true;

    public Receive(){
    }

    public Receive(Socket client){
        try{
            dis = new DataInputStream(client.getInputStream());
        }catch (IOException e){
            isRunning = false;
            CloseUtil.closeAll(dis);
        }
    }

    //接收数据
    public String receive(){
        String msg = "";
        try{
            msg = dis.readUTF();
        }catch (IOException e){
            isRunning = false;
            CloseUtil.closeAll(dis);
        }
        return msg;
    }

    @Override
    public void run() {
        while (isRunning){
            System.out.println(receive());
        }
    }
}
