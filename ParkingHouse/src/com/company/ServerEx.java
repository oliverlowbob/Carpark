package com.company;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {

    public static void main(String[] args){
            try{
                ServerSocket ss=new ServerSocket(6666);
                Socket s=ss.accept();//establishes connection
                DataInputStream dis=new DataInputStream(s.getInputStream());
                String str=(String)dis.readUTF();
                System.out.println("Du har så mange biler: "+ getNumCars(str));
                ss.close();
            }catch(Exception e){System.out.println(e);}
        }

        public static int getNumCars(String str)
        {
            return str.split(", ").length;

            }
        }
