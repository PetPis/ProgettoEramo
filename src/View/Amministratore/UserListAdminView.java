/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Amministratore;

import Controller.AmministratoreController;
import Controller.GestioneUtenza;
import Controller.ModeratoreController;
import Model.Utente;
import java.util.List;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class UserListAdminView extends javax.swing.JFrame {

    private Utente utente;

    /**
     * Creates new form UserListAdminView
     * @param utente current user
     */
    public UserListAdminView(Utente utente) {
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
        jList1 = new javax.swing.JList<>();
        Promote = new javax.swing.JButton();
        Demote = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        jLabel1.setText("Users List");

        jScrollPane2.setViewportView(jList1);

        Promote.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        Promote.setText("Promote");
        Promote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PromoteActionPerformed(evt);
            }
        });

        Demote.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        Demote.setText("Demote");
        Demote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DemoteActionPerformed(evt);
            }
        });

        Delete.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Back.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(Promote)
                        .addGap(0, 0, 0)
                        .addComponent(Demote, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Promote)
                        .addComponent(Demote)
                        .addComponent(Delete))
                    .addComponent(Back))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initComps() {
        this.setLocation(650,300);
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        Promote = new javax.swing.JButton();
        Demote = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jList1.setFont(new java.awt.Font("Comic Sans MS", 0, 16));
        List<Utente> lU = new ModeratoreController().usersList();
        int n = new ModeratoreController().NumberOfUsers();
        String[] jl = new String[n];
        int i = 0;
        for (Utente g : lU) {
            jl[i] = g.getUsername();
            i++;
        }
        jList1 = new JList(jl);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        jLabel1.setText("Users List");

        jScrollPane2.setViewportView(jList1);

        Promote.setText("Promote");
        Promote.setFont(new java.awt.Font("Comic Sans MS", 0, 16));
        Promote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PromoteActionPerformed(evt);
            }
        });

        Demote.setText("Demote");
        Demote.setFont(new java.awt.Font("Comic Sans MS", 0, 16));
        Demote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DemoteActionPerformed(evt);
            }
        });

        Delete.setText("Delete");
        Delete.setFont(new java.awt.Font("Comic Sans MS", 0, 16));
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Back.setText("Back");
        Back.setFont(new java.awt.Font("Comic Sans MS", 0, 16));
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(214, 214, 214)
                                                                .addComponent(jLabel1))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(Promote)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(Demote, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 184, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Promote)
                                        .addComponent(Demote)
                                        .addComponent(Delete)
                                        .addComponent(Back))
                                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        this.setVisible(false);
        new AmministratoreView(utente).setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        if (jList1.getSelectedValue() == null) {
            JOptionPane.showMessageDialog(rootPane, "Select one review", "Selection Failed", JOptionPane.ERROR_MESSAGE);
        } else {
            Utente utente = new GestioneUtenza().findUser(jList1.getSelectedValue());
            new AmministratoreController(utente).deleteUser();
            this.setVisible(false);
            new UserListAdminView(utente).setVisible(true);
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void DemoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DemoteActionPerformed
        if (jList1.getSelectedValue() == null) {
            JOptionPane.showMessageDialog(rootPane, "Select one review", "Selection Failed", JOptionPane.ERROR_MESSAGE);
        } else {
            Utente utente = new GestioneUtenza().findUser(jList1.getSelectedValue());
            if (utente.getTipo().equals("utente")) {
                JOptionPane.showMessageDialog(rootPane, "The user can not be demoted under user type");

            } else {
                new ModeratoreController(utente).demote();
                JOptionPane.showMessageDialog(rootPane, "User Demoted!");
            }
        }
    }//GEN-LAST:event_DemoteActionPerformed

    private void PromoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PromoteActionPerformed
        if (jList1.getSelectedValue() == null) {
            JOptionPane.showMessageDialog(rootPane, "Select one review", "Selection Failed", JOptionPane.ERROR_MESSAGE);
        } else {
            Utente utente = new GestioneUtenza().findUser(jList1.getSelectedValue());
            if (utente.getTipo().equals("moderatore")) {
                JOptionPane.showMessageDialog(rootPane, "The user is already a moderator");
            } else {
                new ModeratoreController(utente).promote();
                JOptionPane.showMessageDialog(rootPane, "User Promoted!");
            }
        }
    }//GEN-LAST:event_PromoteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Demote;
    private javax.swing.JButton Promote;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
