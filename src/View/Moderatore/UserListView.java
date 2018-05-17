/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Moderatore;

import Controller.GestioneUtenza;
import javax.swing.JOptionPane;
import Controller.ModeratoreController;
import Model.Utente;
import java.util.List;
import javax.swing.JList;

public class UserListView extends javax.swing.JFrame {

    private Utente utente;

    /**
     * Creates new form UserListView
     */
    public UserListView(Utente utente) {
        this.utente = utente;
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
        jScrollPane2 = new javax.swing.JScrollPane();
        userList = new javax.swing.JList<>();
        Promote = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Demote = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        jLabel1.setText("Users List");

        jScrollPane2.setViewportView(userList);

        Promote.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        Promote.setText("Promote");
        Promote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PromoteActionPerformed(evt);
            }
        });

        Back.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        Demote.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        Demote.setText("Demote");
        Demote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DemoteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Promote, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(Demote, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(162, 162, 162)
                                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(jLabel1)))
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back)
                    .addComponent(Promote)
                    .addComponent(Demote))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initComps() {
        this.setLocation(650,300);
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        userList = new javax.swing.JList<>();
        Promote = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Demote = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        List<Utente> lU = new ModeratoreController().usersList();
        int n = new ModeratoreController().NumberOfUsers();
        String[] jl = new String[n];
        int i = 0;
        for (Utente g : lU) {
                 jl[i] = g.getUsername();
            i++;
        }
        userList = new JList(jl);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        jLabel1.setText("Users List");

        jScrollPane2.setViewportView(userList);

        Promote.setText("Promote");
        Promote.setFont(new java.awt.Font("Comic Sans MS", 0, 16));
        Promote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PromoteActionPerformed(evt);
            }
        });

        Back.setText("Back");
        Back.setFont(new java.awt.Font("Comic Sans MS", 0, 16));
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        Demote.setText("Demote");
        Demote.setFont(new java.awt.Font("Comic Sans MS", 0, 16));
        Demote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DemoteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(212, 212, 212)
                                                                .addComponent(jLabel1))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(Promote, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(Demote, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 197, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Promote)
                                        .addComponent(Back)
                                        .addComponent(Demote))
                                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        this.setVisible(false);
        new ModeratoreView(utente).setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    private void PromoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PromoteActionPerformed
        if (userList.getSelectedValue() == null) {
            JOptionPane.showMessageDialog(rootPane, "Select one review", "Selection Failed", JOptionPane.ERROR_MESSAGE);
        } else {
            Utente utente = new GestioneUtenza().findUser(userList.getSelectedValue());
            if (utente.getTipo().equals("moderatore")) {
                JOptionPane.showMessageDialog(rootPane, "The user is already a moderator");
            } else {
                new ModeratoreController(utente).promote();
                JOptionPane.showMessageDialog(rootPane, "User Promoted!");
            }
        }
    }//GEN-LAST:event_PromoteActionPerformed

    private void DemoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DemoteActionPerformed
        if (userList.getSelectedValue() == null) {
            JOptionPane.showMessageDialog(rootPane, "Select one review", "Selection Failed", JOptionPane.ERROR_MESSAGE);
        } else {
            Utente utente = new GestioneUtenza().findUser(userList.getSelectedValue());
            if (utente.getTipo().equals("utente")) {
                JOptionPane.showMessageDialog(rootPane, "The user can not be demoted under user type");
            } else {
                new ModeratoreController(utente).demote();
                JOptionPane.showMessageDialog(rootPane, "User Demoted!");
            }
        }
    }//GEN-LAST:event_DemoteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Demote;
    private javax.swing.JButton Promote;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> userList;
    // End of variables declaration//GEN-END:variables
}
