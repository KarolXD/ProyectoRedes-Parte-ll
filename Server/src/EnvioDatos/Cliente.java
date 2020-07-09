/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnvioDatos;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jahanel
 */
public class Cliente {

    ServerSocket serverSocket = null;

    public Cliente() throws IOException {
        
        serverSocket = new ServerSocket(4400);
        
        
    }

    
    public void iniciarServer(String dirPath) throws IOException {
    Socket socket = serverSocket.accept();

        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        DataInputStream dis = new DataInputStream(bis);

        int filesCount = dis.readInt();
        File[] files = new File[filesCount];

        System.out.println("entro al for");
        for (int i = 0; i < filesCount; i++) {
            long fileLength = dis.readLong();
            String fileName = dis.readUTF();

            files[i] = new File(dirPath + "\\" + fileName);

            FileOutputStream fos = new FileOutputStream(files[i]);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            for (int j = 0; j < fileLength; j++) {
                bos.write(bis.read());
            }

            bos.close();
        }

        dis.close();
    }
    public void iniciar() throws IOException {
        System.out.println("entro");
        String directory = "C:\\DropBox\\Servers\\Usuarios\\karol";//"C:\\Users\\Jahanel\\Desktop\\archivos\\servidor";
        //    String directory = "C:\\DropBox\\JAHA";
    
        File directorio = new File(directory);
        if (!directorio.exists()) {
            if (directorio.mkdirs()) {
                iniciarServer(directorio.toString());
                System.out.println("Directorio creado");
            } else {
                System.out.println("Error al crear directorio");
            }
        }else{//SI EL DIRECTORIO EXISTE
            
            System.out.println("Directorio existente");
            iniciarServer(directory);
        }
    }   
}
