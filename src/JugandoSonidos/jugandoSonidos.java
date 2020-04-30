/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JugandoSonidos;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Joel
 */
public class jugandoSonidos {

    public static void main(String args[]) throws IOException, InterruptedException {

        try {
//            AudioFileFormat.Type[] tipos = AudioSystem.getAudioFileTypes();

//            for (AudioFileFormat.Type tipo : tipos) {
//                System.out.println(tipo.getExtension());
//
//            }

            Clip sonido = AudioSystem.getClip();

            File ficheroaudio = new File("C:\\Users\\Joel\\Documents\\Alien.wav");
            sonido.open(AudioSystem.getAudioInputStream(ficheroaudio));
            System.out.println("Inicio repro");
            sonido.start();

            while (!sonido.isRunning()) {
                System.out.println("Reproduciendo");
                Thread.sleep(10);
            }
            while (sonido.isRunning()) {
                System.out.println("Reproduciendo...");
                Thread.sleep(1000);
            }
            System.out.println("Final repro");

        } catch (LineUnavailableException ex) {
            Logger.getLogger(jugandoSonidos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(jugandoSonidos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
