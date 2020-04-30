/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JugandoSonidos;

import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Joel
 */
public class VentanaRepro extends javax.swing.JFrame {

    int seleccionado;

// metodo para poner imagenes escaladas abajo
    private void ponerImagenes() {
        ImageIcon insta = new ImageIcon(getClass().getResource("Imagenes\\insta.png"));
        Icon icono1 = new ImageIcon(insta.getImage().getScaledInstance(lblinsta.getWidth(), lblinsta.getHeight(), Image.SCALE_DEFAULT));
        lblinsta.setIcon(icono1);
        ImageIcon twitter = new ImageIcon(getClass().getResource("Imagenes\\twitt.jpg"));
        Icon icono2 = new ImageIcon(twitter.getImage().getScaledInstance(lbltwitt.getWidth(), lbltwitt.getHeight(), Image.SCALE_DEFAULT));
        lbltwitt.setIcon(icono2);
        ImageIcon spoty = new ImageIcon(getClass().getResource("Imagenes\\spoty.jpg"));
        Icon icono3 = new ImageIcon(spoty.getImage().getScaledInstance(lblspoty.getWidth(), lblspoty.getHeight(), Image.SCALE_DEFAULT));
        lblspoty.setIcon(icono3);

    }
    //Objeto para hacer el filtro de audio
    private FileNameExtensionFilter filtro = new FileNameExtensionFilter("Audios", "wav");
    // Boleano para saber si se esta reproduciendo el sonido
    boolean play = false;

    public VentanaRepro() {
        initComponents();
        ponerImagenes();
        actualizarImagenSonido();

    }

    public void actualizarImagenSonido() {
        if (play == false) {

            ImageIcon fotoSonido2 = new ImageIcon(getClass().getResource("Imagenes\\muted.png"));
            Icon icono5 = new ImageIcon(fotoSonido2.getImage().getScaledInstance(lblSonido.getWidth(), lblSonido.getHeight(), Image.SCALE_DEFAULT));
            lblSonido.setIcon(icono5);
            lblSonido.paintImmediately(lblSonido.getVisibleRect());
        } else {
            ImageIcon fotoSonido = new ImageIcon(getClass().getResource("Imagenes\\volumen.jpg"));
            Icon icono4 = new ImageIcon(fotoSonido.getImage().getScaledInstance(lblSonido.getWidth(), lblSonido.getHeight(), Image.SCALE_DEFAULT));
            lblSonido.setIcon(icono4);
            lblSonido.paintImmediately(lblSonido.getVisibleRect());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lblSonido = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblinsta = new javax.swing.JLabel();
        lbltwitt = new javax.swing.JLabel();
        lblspoty = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        lblRuta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Seleccionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Reproducir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Repetir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("REPRODUCTOR EMEPETRES");
        jLabel2.setBorder(new javax.swing.border.MatteBorder(null));

        lblinsta.setText("insta");
        lblinsta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblinstaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblinstaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblinstaMouseExited(evt);
            }
        });

        lbltwitt.setText("twitter");

        lblspoty.setText("spoty");

        jButton4.setText("Pausa");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        lblRuta.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton2)
                                .addComponent(jButton4))
                            .addGap(63, 63, 63)
                            .addComponent(lblSonido, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(81, 81, 81))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(55, 55, 55)
                            .addComponent(jLabel2)
                            .addGap(93, 93, 93)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(32, 32, 32)
                                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(lblRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblinsta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltwitt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblspoty, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addGap(54, 54, 54)
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblSonido, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblinsta, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbltwitt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblspoty, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// Con esto abrimos el filechooser
        JFileChooser filechooser = new JFileChooser("System.getProperty(“user.dir”)");
// Con esto desactivamos la opcion de todos los archivos
        filechooser.setAcceptAllFileFilterUsed(false);
// Con esto añadimos el filtro 
        filechooser.addChoosableFileFilter(filtro);

        seleccionado = filechooser.showOpenDialog(this);
        File archivoSeleccionado = new File(filechooser.getSelectedFile().toString());
        lblNombre.setText(archivoSeleccionado.getName());
        lblRuta.setText(archivoSeleccionado.toString());
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        
        
        try {
            play = true;

            Clip sonido = AudioSystem.getClip();
// Condición para evitar sobreponer los sonidos, dandole muchas veces a reproducir.

            if (play && !sonido.isRunning()) {

                try {
                    File ficheroaudio = new File(lblRuta.getText());

                    sonido.open(AudioSystem.getAudioInputStream(ficheroaudio));
                    sonido.start();

                    actualizarImagenSonido();

                    Thread.sleep(10);
                    while (sonido.isRunning()) {
                        Thread.sleep(100);
                    }
                    sonido.close();
                    play = false;
                    actualizarImagenSonido();

                } catch (LineUnavailableException | UnsupportedAudioFileException | IOException | InterruptedException ex ) {
                    Logger.getLogger(VentanaRepro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } catch (LineUnavailableException ex) {
            Logger.getLogger(VentanaRepro.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        play = true;
        try {
// Pedimos cuantas repeticiones hacer.
            int repeticiones = Integer.parseInt(JOptionPane.showInputDialog("Cuantas repeticiones desea realizar?: "));

            File ficheroaudio = new File(lblRuta.getText());
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(ficheroaudio));

// Mandamos repetir las veces del usuario -1 ya que siempre reproduce +1
            sonido.loop(repeticiones - 1);

            actualizarImagenSonido();

            Thread.sleep(10);
            while (sonido.isRunning()) {
                Thread.sleep(100);
            }

            sonido.close();
            play = false;
            actualizarImagenSonido();

        } catch (LineUnavailableException | UnsupportedAudioFileException | IOException | InterruptedException ex) {
            Logger.getLogger(VentanaRepro.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //Botón pausa


    }//GEN-LAST:event_jButton4ActionPerformed

    private void lblinstaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblinstaMouseClicked
        try {
            String url = "https://www.instagram.com/p/B_fFedOH2dn/";
            
            Desktop.getDesktop().browse(new URI(url));
        } catch (URISyntaxException ex) {
            Logger.getLogger(VentanaRepro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VentanaRepro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lblinstaMouseClicked

    private void lblinstaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblinstaMouseEntered
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lblinstaMouseEntered

    private void lblinstaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblinstaMouseExited
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_lblinstaMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaRepro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRepro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRepro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRepro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRepro().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRuta;
    private javax.swing.JLabel lblSonido;
    private javax.swing.JLabel lblinsta;
    private javax.swing.JLabel lblspoty;
    private javax.swing.JLabel lbltwitt;
    // End of variables declaration//GEN-END:variables
}
