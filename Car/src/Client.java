import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class Client {

    public static void main(String[] args) {

        ArrayList<Car> carBucket = Car.makeCars(30);
        String carsToBeSend = "";
        for(int i = 0; i<carBucket.size(); i++)
        {
            carsToBeSend+=carBucket.get(i).toString();
        }



        try{
            Socket s=new Socket("localhost",6666);
            DataOutputStream
                    dout=new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Biler:" + carsToBeSend);
            dout.flush();
            dout.close();
            s.close();
        }
        catch(Exception e){System.out.println(e);}
    }

}