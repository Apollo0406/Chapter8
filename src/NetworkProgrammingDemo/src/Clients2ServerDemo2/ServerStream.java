package Clients2ServerDemo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerStream implements Runnable {
    private Socket socket = null;
    private int num;

    public ServerStream(Socket socket, int num) {
        super();
        this.socket = socket;
        this.num = num;
    }

    @Override
    public void run() {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while(true){

            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
