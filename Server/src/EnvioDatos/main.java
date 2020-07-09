/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnvioDatos;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import server.Server;

/**
 *
 * @author Jahanel
 */
public class main {

    public static void main(String args[]) throws IOException, InterruptedException {
       Servidor varios = new Servidor();
        while (true) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        varios.iniciar();
                    } catch (IOException ex) {
                        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (Exception ex) {
                        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }).start();
            Thread.sleep(2000);
        }
    }

}
