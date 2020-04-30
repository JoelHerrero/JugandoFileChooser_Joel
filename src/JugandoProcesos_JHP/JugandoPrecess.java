/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JugandoProcesos_JHP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author Joel
 */
public class JugandoPrecess {

    private void ejecutaDir() throws IOException {
        Process p = Runtime.getRuntime().exec("cmd /c tasklist.exe");

        InputStream is = p.getInputStream();

        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String aux = br.readLine();

        while (aux != null) {
            System.out.println(aux);
            aux = br.readLine();

        }

    }

    public static void main(String[] args) throws IOException {

        JugandoPrecess obj = new JugandoPrecess();

        obj.ejecutaDir();

//        String programa = "C:\\Program Files\\Windows NT\\Accessories\\wordpad.exe";
//        Process p = Runtime.getRuntime().exec(programa);
//        p.waitFor();
//        
//        InputStream is = p.getInputStream();
//        
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));
//        
//        String aux = br.readLine();
//        
//        while (aux != null){
//            System.out.println(aux);
//            aux = br.readLine();
    }

}

//    }

