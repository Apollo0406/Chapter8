package ChatRoom;

import java.io.Closeable;

public class CloseUtil {
    public static void closeAll(Closeable... io) {
        for(Closeable temp : io){
            try{
                if(temp != null){
                    temp.close();
                }
            }catch (Exception e){

            }
        }
    }
}
