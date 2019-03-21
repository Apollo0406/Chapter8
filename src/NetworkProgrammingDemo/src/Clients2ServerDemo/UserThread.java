package Clients2ServerDemo;

import java.io.*;
import java.net.Socket;

public class UserThread implements Runnable {
    private Socket s;
    public UserThread(Socket s){
        this.s = s;
    }
    @Override
    public void run() {
        try{
            //把输入流封装到缓冲流
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintStream ps = new PrintStream(new BufferedOutputStream(s.getOutputStream()));
            String info = br.readLine();
            System.out.print(info);
            ps.println("echo:"+info);
            ps.flush();
            ps.close();
            br.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
