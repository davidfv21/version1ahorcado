/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado1;

import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author davidvargas
 */
public class ahorcado1 extends javax.swing.JFrame {
     private char[] palabra;
    private JLabel lb;
    private JTextField jt;
    private JLabel lb2;
    private boolean inicio;
    private boolean[] oculta;
    int intentos = 0;
    boolean cambios = false;
    public String[] palabras = {"canta", "lana", "reir",  "gana",   "come", "casa", "cama", "mota", "pasa", "liga", "gato", "sala", "beca"};

    /**
     * Creates new form ahorcado1
     */
    public ahorcado1() {
        initComponents();
    }
    
    
    
    public void evaluar(char plabra) {
        if (inicio) {
            String espacio = "";

            if (this.intentos == 6) {
                JOptionPane.showMessageDialog(null, "perdio");
            } else {
                
                for (int j = 0; j <= this.oculta.length - 1; j++) {
                    
                    if (this.oculta[j] == plabra) {
                        this.palabra[j] = plabra;
                        this.cambios = true;
                    }
                    espacio = espacio+ this.palabra[j];
                }
                
                if (this.cambios == false) {
                    this.intentos += 1; 

                    if (this.intentos < 6) {
                        JOptionPane.showMessageDialog(null, "  quedan " + (6 - this.intentos) + " intentos ");
                    }
                } else {
                    this.cambios = false;
                }
                this.jt.setText(espacio);
                
                gano();
            }
        }
    }

    public ahorcado1(JTextField texto) {

        this.oculta = Random[].toCharArray();
        String linea = "";
        //llena un string con "_"
        for (int i = 0; i <= this.oculta.length - 1; i++) {
            linea = linea + "_";
            System.out.print(this.oculta[i]);
        }

        this.palabra = linea.toCharArray();
        this.jt = texto;

        jt.setText(linea);

        this.inicio = true;
    }

    private void gano() {
        boolean ganos = false;
        for (int i = 0; i <= this.oculta.length - 1; i++) {
            if (this.palabra[i] == this.oculta[i]) {
                ganos = true;
            } else {
                ganos = false;
                break;
            }
        }
        if (ganos) {
            JOptionPane.showMessageDialog(null, "Gano \n ");

        }
    }

    /**
     *
     * @return
     */
    public String Random() {
        int num = (int) (Math.random() * (palabras.length));
        return palabras[num];
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textField1 = new java.awt.TextField();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textField1.setText("textField1");

        label1.setText("label1");

        label2.setText("label2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ahorcado1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ahorcado1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ahorcado1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ahorcado1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ahorcado1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables
}
