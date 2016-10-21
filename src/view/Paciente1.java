/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframetest;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Wendler
 */
public class Paciente extends javax.swing.JFrame {
private String nomePaciente, cpfPaciente;


    public String getCpfPaciente() {
        return cpfPaciente;
    }

    public void setCpfPaciente(String crfFuncionario) {
        this.cpfPaciente= crfFuncionario;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomeMedico) {
        this.nomePaciente = nomePaciente;
    }
    
    public Paciente() {
        initComponents();
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
        jTabbedPanePaciente = new javax.swing.JTabbedPane();
        jPanel11 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButtonAgendaConfirmaPaciente = new javax.swing.JButton();
        jButtonAgendaCancelarPaciente = new javax.swing.JButton();
        jComboBoxAgendaEspecialidadeFuncionario = new javax.swing.JComboBox();
        jLabelEspecialidadeFuncionario1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButtonConfirmaAlteraFuncionario = new javax.swing.JButton();
        jButtonCancelarAlteraFuncionario = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jTextFieldCrfFuncionario4 = new javax.swing.JTextField();
        jLabeCrfFuncionario3 = new javax.swing.JLabel();
        jButtonConfirmaFuncionario1 = new javax.swing.JButton();
        jButtonCancelarFuncionario1 = new javax.swing.JButton();
        jTextFieldCrfFuncionario5 = new javax.swing.JTextField();
        jLabeCrfFuncionario4 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Verificar Datas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonAgendaConfirmaPaciente.setText("Confirmar");
        jButtonAgendaConfirmaPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgendaConfirmaPacienteActionPerformed(evt);
            }
        });

        jButtonAgendaCancelarPaciente.setText("Cancelar");
        jButtonAgendaCancelarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgendaCancelarPacienteActionPerformed(evt);
            }
        });

        jComboBoxAgendaEspecialidadeFuncionario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Laura Miller - Muscular", "Lucas Ribeiro - Pilates", "Carla Roberta - Fisioterapeuta Manual", "Riana Stuart - Acunpultura" }));
        jComboBoxAgendaEspecialidadeFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAgendaEspecialidadeFuncionarioActionPerformed(evt);
            }
        });

        jLabelEspecialidadeFuncionario1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelEspecialidadeFuncionario1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEspecialidadeFuncionario1.setText("Selecione a Especialidade");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jButtonAgendaConfirmaPaciente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonAgendaCancelarPaciente))
                            .addComponent(jComboBoxAgendaEspecialidadeFuncionario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelEspecialidadeFuncionario1, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelEspecialidadeFuncionario1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxAgendaEspecialidadeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAgendaCancelarPaciente)
                    .addComponent(jButtonAgendaConfirmaPaciente))
                .addContainerGap())
        );

        jTabbedPanePaciente.addTab("Agendar", jPanel11);

        jButtonConfirmaAlteraFuncionario.setText("Alterar");
        jButtonConfirmaAlteraFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmaAlteraFuncionarioActionPerformed(evt);
            }
        });

        jButtonCancelarAlteraFuncionario.setText("Cancelar");
        jButtonCancelarAlteraFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarAlteraFuncionarioActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Horario Agendado:");

        jLabel5.setBackground(new java.awt.Color(51, 0, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(45, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("8:00");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Selecione um novo horario:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(79, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jButtonConfirmaAlteraFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonCancelarAlteraFuncionario))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConfirmaAlteraFuncionario)
                    .addComponent(jButtonCancelarAlteraFuncionario))
                .addGap(20, 20, 20))
        );

        jTabbedPanePaciente.addTab("Altera Hora Marcada", jPanel6);

        jTextFieldCrfFuncionario4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCrfFuncionario4ActionPerformed(evt);
            }
        });

        jLabeCrfFuncionario3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabeCrfFuncionario3.setText("Observações:");

        jButtonConfirmaFuncionario1.setText("Confirmar");
        jButtonConfirmaFuncionario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmaFuncionario1ActionPerformed(evt);
            }
        });

        jButtonCancelarFuncionario1.setText("Cancelar");
        jButtonCancelarFuncionario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarFuncionario1ActionPerformed(evt);
            }
        });

        jTextFieldCrfFuncionario5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCrfFuncionario5ActionPerformed(evt);
            }
        });

        jLabeCrfFuncionario4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabeCrfFuncionario4.setText("Digite o nome do funcionario:");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabeCrfFuncionario3)
                    .addComponent(jLabeCrfFuncionario4)
                    .addComponent(jTextFieldCrfFuncionario5, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel15Layout.createSequentialGroup()
                            .addComponent(jButtonConfirmaFuncionario1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCancelarFuncionario1))
                        .addComponent(jTextFieldCrfFuncionario4, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabeCrfFuncionario4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCrfFuncionario4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabeCrfFuncionario3)
                .addGap(7, 7, 7)
                .addComponent(jTextFieldCrfFuncionario5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConfirmaFuncionario1)
                    .addComponent(jButtonCancelarFuncionario1))
                .addGap(22, 22, 22))
        );

        jTabbedPanePaciente.addTab("Avaliação de Atendimento", jPanel15);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPanePaciente)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPanePaciente)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarAlteraFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarAlteraFuncionarioActionPerformed
        Fisioterapia TelaFisioterapia = new Fisioterapia();
        TelaFisioterapia.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarAlteraFuncionarioActionPerformed

    private void jButtonConfirmaAlteraFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmaAlteraFuncionarioActionPerformed
        Confirmacao confirmacao = new Confirmacao();
        confirmacao.setVisible(true);
        confirmacao.setLocationRelativeTo(null);
        confirmacao.setDefaultCloseOperation(confirmacao.DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_jButtonConfirmaAlteraFuncionarioActionPerformed

    private void jButtonCancelarFuncionario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarFuncionario1ActionPerformed
        Fisioterapia TelaFisioterapia = new Fisioterapia();
        TelaFisioterapia.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarFuncionario1ActionPerformed

    private void jButtonConfirmaFuncionario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmaFuncionario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonConfirmaFuncionario1ActionPerformed

    private void jTextFieldCrfFuncionario4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCrfFuncionario4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCrfFuncionario4ActionPerformed

    private void jComboBoxAgendaEspecialidadeFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAgendaEspecialidadeFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxAgendaEspecialidadeFuncionarioActionPerformed

    private void jButtonAgendaCancelarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgendaCancelarPacienteActionPerformed
        Fisioterapia TelaFisioterapia = new Fisioterapia();
        TelaFisioterapia.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonAgendaCancelarPacienteActionPerformed

    private void jButtonAgendaConfirmaPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgendaConfirmaPacienteActionPerformed
        String stringDoComboBox;
        stringDoComboBox = String.valueOf(jComboBoxAgendaEspecialidadeFuncionario.getSelectedItem());
    }//GEN-LAST:event_jButtonAgendaConfirmaPacienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        //new Picker().chamaCalendario(jTextFieldDataAgendarPaciente);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldCrfFuncionario5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCrfFuncionario5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCrfFuncionario5ActionPerformed

    
    
    public static void main(String args[]) {
 
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
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Paciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAgendaCancelarPaciente;
    private javax.swing.JButton jButtonAgendaConfirmaPaciente;
    private javax.swing.JButton jButtonCancelarAlteraFuncionario;
    private javax.swing.JButton jButtonCancelarFuncionario1;
    private javax.swing.JButton jButtonConfirmaAlteraFuncionario;
    private javax.swing.JButton jButtonConfirmaFuncionario1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBoxAgendaEspecialidadeFuncionario;
    private javax.swing.JLabel jLabeCrfFuncionario3;
    private javax.swing.JLabel jLabeCrfFuncionario4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelEspecialidadeFuncionario1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTabbedPane jTabbedPanePaciente;
    private javax.swing.JTextField jTextFieldCrfFuncionario4;
    private javax.swing.JTextField jTextFieldCrfFuncionario5;
    // End of variables declaration//GEN-END:variables

}