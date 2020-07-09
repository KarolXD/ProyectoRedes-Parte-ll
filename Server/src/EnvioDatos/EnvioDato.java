/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnvioDatos;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import server.Server;

/**
 *
 * @author Jahanel
 */
public class EnvioDato {

        
        
    public static void enviarDATOS(String directory) throws FileNotFoundException, IOException {
        String hostDomain = InetAddress.getLocalHost().getHostAddress();
        int port = 4400;

        File[] files = new File(directory).listFiles();

        Socket socket = new Socket(InetAddress.getByName(hostDomain), port);

        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        DataOutputStream dos = new DataOutputStream(bos);

        dos.writeInt(files.length);

        for (File file : files) {
            long length = file.length();
            dos.writeLong(length);

            String name = file.getName();
            dos.writeUTF(name);

            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(fis);

            int theByte = 0;
            while ((theByte = bis.read()) != -1) {
                bos.write(theByte);
            }

            bis.close();
        }

        dos.close();
    }
    public static void enviar() throws FileNotFoundException, IOException {
        String directory = "C:\\DropBox\\JAHA";
    
        File directorio = new File(directory);
        if (!directorio.exists()) {
            if (directorio.mkdirs()) {
                enviarDATOS(directorio.toString());
                System.out.println("Directorio creado");
            } else {
                System.out.println("Error al crear directorio");
            }
        }else{//SI EL DIRECTORIO EXISTE
            
            System.out.println("Directorio existente");
            enviarDATOS(directory);
        }

    }

    public static void main(String args[]) throws IOException, InterruptedException {
        while (true) {
            Thread.sleep(2000);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {

                        enviar();

                    } catch (IOException ex) {
                        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }).start();
        }
    }
}
