package GUI;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class userRegisterServer {
    public static void main(String[] args) {
        try{
            ServerSocket serverSocket=new ServerSocket(5000);
            DataInputStream intputServer;
            DataOutputStream outputServer;
            while(true){
                Socket socket=serverSocket.accept();
                System.out.println("Connection successful");
                intputServer=new DataInputStream(socket.getInputStream());
                String name=intputServer.readLine();
                String phoneNumber=intputServer.readLine();
                String cccd=intputServer.readLine();
                String email=intputServer.readLine();
                QTMBusiness db=new QTMBusiness();
                int n = db.executeDB("INSERT INTO userregister(name, phoneNumber, cccd, email) VALUES ('" + name + "','" + phoneNumber + "','" + cccd + "','" + email + "')");
                if(n>0){
                    System.out.println("Successfully");
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
