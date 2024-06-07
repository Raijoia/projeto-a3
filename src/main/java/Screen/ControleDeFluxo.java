/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Screen;

import TAD.Fila;
import TAD.Pilha;
import java.util.*;

/**
 *
 * @author raijo
 */
public class ControleDeFluxo extends javax.swing.JFrame {

    /**
     * Creates new form ControleDeFluxo
     */
    public ControleDeFluxo() {
        initComponents();
        notFita.setVisible(false);
    }
    
    public void analisarFita(String fita) {
        try {
            Fila fila = new Fila();
            Pilha pilha = new Pilha();
            String[] splitFita = fita.split("");
            int estado = 0;

            for (int i = 0; i < fita.length(); i++) {
                fila.inserir(splitFita[i]);
            }

            for (int i = 0; i < fita.length(); i++) {
                if(estado == 0 && pilha.mostrarAtual() == null && fila.mostrarPrimeiro().equals("a") ||
                   estado == 0 && pilha.mostrarAtual() == null && fila.mostrarPrimeiro().equals("b")){
                    pilha.inserir(fila.mostrarPrimeiro());
                    fila.remover();
                    System.out.println("aceito");
                } else if (estado == 0 && pilha.mostrarAtual() == null && fila.mostrarPrimeiro().equals("c")) {
                    fila.remover();
                    estado = 1;
                    System.out.println("aceito");
                } else if (estado == 0 && pilha.mostrarAtual().equals("a") && fila.mostrarPrimeiro().equals("a") || 
                   estado == 0 && pilha.mostrarAtual().equals("b") && fila.mostrarPrimeiro().equals("a") ||
                   estado == 0 && pilha.mostrarAtual().equals("a") && fila.mostrarPrimeiro().equals("b") ||
                   estado == 0 && pilha.mostrarAtual().equals("b") && fila.mostrarPrimeiro().equals("b")){
                    pilha.inserir(fila.mostrarPrimeiro());
                    fila.remover();
                    System.out.println("aceito");
                } else if(estado == 0 && pilha.mostrarAtual().equals("a") && fila.mostrarPrimeiro().equals("c")) {
                    estado = 1;
                    pilha.inserir("a");
                    fila.remover();
                    System.out.println("aceito");
                } else if(estado == 0 && pilha.mostrarAtual().equals("b") && fila.mostrarPrimeiro().equals("c")) {
                    estado = 1;
                    pilha.inserir("b");
                    fila.remover();
                    System.out.println("aceito");
                } else if(estado == 1 && pilha.mostrarAtual().equals("a") && fila.mostrarPrimeiro().equals("a") ||
                          estado == 1 && pilha.mostrarAtual().equals("b") && fila.mostrarPrimeiro().equals("b")) {
                    pilha.remover();
                    System.out.println("aceito");
                } else {
                    System.out.println("Nao aceito fila: " + fila.mostrarPrimeiro() + " pilha: " + pilha.mostrarAtual() + " estado: " + estado);
                    notFita.setVisible(true);
                    revalidate();
                    repaint();
                }
            }
        } catch (Exception e) {
            notFita.setVisible(true);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textFita = new javax.swing.JTextField();
        checkFita = new javax.swing.JButton();
        notFita = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textFita.setText("Digite a fita");
        textFita.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Fita")));

        checkFita.setText("Verificar FIta");
        checkFita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkFitaMouseClicked(evt);
            }
        });

        notFita.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        notFita.setText("FITA NAO ACEITA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textFita)
                    .addComponent(checkFita, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(notFita, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(textFita, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(checkFita, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(notFita, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkFitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkFitaMouseClicked
        String fita = textFita.getText();
        analisarFita(fita);
    }//GEN-LAST:event_checkFitaMouseClicked

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
            java.util.logging.Logger.getLogger(ControleDeFluxo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControleDeFluxo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControleDeFluxo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControleDeFluxo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControleDeFluxo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkFita;
    private javax.swing.JTextField notFita;
    private javax.swing.JTextField textFita;
    // End of variables declaration//GEN-END:variables
}
