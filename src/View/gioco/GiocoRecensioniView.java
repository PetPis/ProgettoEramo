/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.gioco;

import Model.Gioco;
import Controller.GiocoController;
import Model.Recensione;
import Model.Utente;
import java.util.ArrayList;

public class GiocoRecensioniView extends javax.swing.JFrame {

    private Utente utente;
    private Gioco gioco;

    /**
     * Creates new form GiocoRecensioniVie
     */
    public GiocoRecensioniView(Utente utente, Gioco gioco) {
        this.utente = utente;
        this.gioco = gioco;
        initComps();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        recensioni = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        jLabel1.setText("Lista Recensioni");

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        recensioni.setEditable(false);
        recensioni.setColumns(20);
        recensioni.setRows(5);
        jScrollPane3.setViewportView(recensioni);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(back)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(190, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(181, 181, 181))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(back)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initComps() {
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        recensioni = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ArrayList<Recensione> al = new GiocoController(gioco).allReviews();
        for (Recensione r : al) {
            recensioni.setText(recensioni.getText() + "  - " + r.getTesto() + "\n\n");}

            jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
            jLabel1.setText("Review List for "+ gioco.getNome());

            back.setText("Back");
            back.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    backActionPerformed(evt);
                }
            });

            recensioni.setEditable(false);
            recensioni.setColumns(20);
            recensioni.setRows(5);
            jScrollPane3.setViewportView(recensioni);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addGap(229, 229, 229)
                                    .addComponent(back)
                                    .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap(190, Short.MAX_VALUE)
                                    .addComponent(jLabel1)
                                    .addGap(181, 181, 181))
                            .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jScrollPane3)
                                    .addContainerGap())
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(back)
                                    .addContainerGap(27, Short.MAX_VALUE))
            );

            pack();
        }

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.setVisible(false);
        new GiocoView(gioco, utente).setVisible(true);
    }//GEN-LAST:event_backActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea recensioni;
    // End of variables declaration//GEN-END:variables
}
