package ChatRoom;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * 创建一个发送线程，用来发送数据
 */
public class Send implements Runnable {
    private BufferedReader console;
    private DataOutputStream dos;
    private Boolean isRunning = true;

    public Send(){
        console = new BufferedReader(new InputStreamReader(System.in));
    }

    public Send(Socket client){
        this();
        try{
            dos = new DataOutputStream(client.getOutputStream());
        }catch (IOException e){
            isRunning = false;
            CloseUtil.closeAll(dos,console);
        }
    }

    //从控制台接收数据
    private String getMsgFromConsole() {
        try {
            return console.readLine();
        } catch (IOException e) {
        }
        return "";
    }

    @Override
    public void run() {
        while(isRunning){
            send();
        }
    }

    private void send() {
        String msg = getMsgFromConsole();
        try{
            if(null != msg && msg.equals("")){
                dos.writeUTF(msg);
            }
        }catch (IOException e){
            isRunning = false;
            CloseUtil.closeAll(dos,console);
        }
    }
}
