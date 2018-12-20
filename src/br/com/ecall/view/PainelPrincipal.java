package br.com.ecall.view;

import br.com.ecall.Ecall;

public class PainelPrincipal extends javax.swing.JFrame {

    public PainelPrincipal() {
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

        painelFundo = new javax.swing.JPanel();
        painelFundoInferior = new javax.swing.JPanel();
        panelAtendimento = new javax.swing.JPanel();
        textoAtendimento = new javax.swing.JLabel();
        iconAtendimento = new javax.swing.JLabel();
        panelOcorrencia = new javax.swing.JPanel();
        textoOcorrencia = new javax.swing.JLabel();
        iconOcorrencia = new javax.swing.JLabel();
        panelTelefone = new javax.swing.JPanel();
        textoTelefone = new javax.swing.JLabel();
        iconTelefone = new javax.swing.JLabel();
        panelEmail = new javax.swing.JPanel();
        textoEmail = new javax.swing.JLabel();
        iconEmail = new javax.swing.JLabel();
        panelUsuario = new javax.swing.JPanel();
        textoUsuario = new javax.swing.JLabel();
        iconUsuario = new javax.swing.JLabel();
        panelLogoEmpresa = new javax.swing.JPanel();
        textoLogoEmpresa = new javax.swing.JLabel();
        textoDescricaoEmpresa = new javax.swing.JLabel();
        imagemLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        painelFundo.setBackground(new java.awt.Color(45, 118, 232));

        painelFundoInferior.setBackground(new java.awt.Color(255, 255, 255));

        panelAtendimento.setPreferredSize(new java.awt.Dimension(133, 103));
        panelAtendimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelAtendimentoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelAtendimentoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelAtendimentoMousePressed(evt);
            }
        });

        textoAtendimento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textoAtendimento.setForeground(new java.awt.Color(45, 118, 232));
        textoAtendimento.setText("Atendimento");

        iconAtendimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ecall/img/atendimento_48x48.png"))); // NOI18N

        javax.swing.GroupLayout panelAtendimentoLayout = new javax.swing.GroupLayout(panelAtendimento);
        panelAtendimento.setLayout(panelAtendimentoLayout);
        panelAtendimentoLayout.setHorizontalGroup(
            panelAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAtendimentoLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(textoAtendimento)
                .addGap(30, 30, 30))
            .addGroup(panelAtendimentoLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(iconAtendimento)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAtendimentoLayout.setVerticalGroup(
            panelAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAtendimentoLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(iconAtendimento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoAtendimento)
                .addGap(18, 18, 18))
        );

        panelOcorrencia.setPreferredSize(new java.awt.Dimension(133, 103));
        panelOcorrencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelOcorrenciaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelOcorrenciaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelOcorrenciaMousePressed(evt);
            }
        });

        textoOcorrencia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textoOcorrencia.setForeground(new java.awt.Color(45, 118, 232));
        textoOcorrencia.setText("Ocorrencia");

        iconOcorrencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ecall/img/ocorrencia_48x48.png"))); // NOI18N

        javax.swing.GroupLayout panelOcorrenciaLayout = new javax.swing.GroupLayout(panelOcorrencia);
        panelOcorrencia.setLayout(panelOcorrenciaLayout);
        panelOcorrenciaLayout.setHorizontalGroup(
            panelOcorrenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOcorrenciaLayout.createSequentialGroup()
                .addGroup(panelOcorrenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelOcorrenciaLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(iconOcorrencia))
                    .addGroup(panelOcorrenciaLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(textoOcorrencia)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        panelOcorrenciaLayout.setVerticalGroup(
            panelOcorrenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOcorrenciaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconOcorrencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoOcorrencia)
                .addGap(18, 18, 18))
        );

        panelTelefone.setPreferredSize(new java.awt.Dimension(133, 103));
        panelTelefone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelTelefoneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelTelefoneMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelTelefoneMousePressed(evt);
            }
        });

        textoTelefone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textoTelefone.setForeground(new java.awt.Color(45, 118, 232));
        textoTelefone.setText("Telefone");

        iconTelefone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ecall/img/telefone_48x48.png"))); // NOI18N

        javax.swing.GroupLayout panelTelefoneLayout = new javax.swing.GroupLayout(panelTelefone);
        panelTelefone.setLayout(panelTelefoneLayout);
        panelTelefoneLayout.setHorizontalGroup(
            panelTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTelefoneLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(panelTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoTelefone)
                    .addComponent(iconTelefone))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        panelTelefoneLayout.setVerticalGroup(
            panelTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTelefoneLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(iconTelefone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoTelefone)
                .addGap(18, 18, 18))
        );

        panelEmail.setPreferredSize(new java.awt.Dimension(133, 103));
        panelEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelEmailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelEmailMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelEmailMousePressed(evt);
            }
        });

        textoEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textoEmail.setForeground(new java.awt.Color(45, 118, 232));
        textoEmail.setText("E-Mail");

        iconEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        iconEmail.setForeground(new java.awt.Color(45, 118, 232));
        iconEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ecall/img/email_48x48.png"))); // NOI18N

        javax.swing.GroupLayout panelEmailLayout = new javax.swing.GroupLayout(panelEmail);
        panelEmail.setLayout(panelEmailLayout);
        panelEmailLayout.setHorizontalGroup(
            panelEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmailLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(panelEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconEmail)
                    .addGroup(panelEmailLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(textoEmail)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        panelEmailLayout.setVerticalGroup(
            panelEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmailLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(iconEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoEmail)
                .addGap(18, 18, 18))
        );

        panelUsuario.setPreferredSize(new java.awt.Dimension(133, 103));
        panelUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelUsuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelUsuarioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelUsuarioMousePressed(evt);
            }
        });

        textoUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textoUsuario.setForeground(new java.awt.Color(45, 118, 232));
        textoUsuario.setText("Usuario");

        iconUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ecall/img/usuario_48x48.png"))); // NOI18N

        javax.swing.GroupLayout panelUsuarioLayout = new javax.swing.GroupLayout(panelUsuario);
        panelUsuario.setLayout(panelUsuarioLayout);
        panelUsuarioLayout.setHorizontalGroup(
            panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuarioLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconUsuario)
                    .addComponent(textoUsuario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelUsuarioLayout.setVerticalGroup(
            panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUsuarioLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(iconUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoUsuario)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout painelFundoInferiorLayout = new javax.swing.GroupLayout(painelFundoInferior);
        painelFundoInferior.setLayout(painelFundoInferiorLayout);
        painelFundoInferiorLayout.setHorizontalGroup(
            painelFundoInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFundoInferiorLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(painelFundoInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelAtendimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(panelOcorrencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );
        painelFundoInferiorLayout.setVerticalGroup(
            painelFundoInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFundoInferiorLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(painelFundoInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(panelTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(panelAtendimento, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(panelOcorrencia, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(panelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        panelLogoEmpresa.setBackground(new java.awt.Color(45, 118, 232));

        textoLogoEmpresa.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        textoLogoEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        textoLogoEmpresa.setText("E-Call");

        textoDescricaoEmpresa.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        textoDescricaoEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        textoDescricaoEmpresa.setText("Gerenciamento de Atendimentos");

        imagemLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ecall/img/navigation.png"))); // NOI18N

        javax.swing.GroupLayout panelLogoEmpresaLayout = new javax.swing.GroupLayout(panelLogoEmpresa);
        panelLogoEmpresa.setLayout(panelLogoEmpresaLayout);
        panelLogoEmpresaLayout.setHorizontalGroup(
            panelLogoEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLogoEmpresaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagemLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLogoEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoLogoEmpresa)
                    .addComponent(textoDescricaoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        panelLogoEmpresaLayout.setVerticalGroup(
            panelLogoEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLogoEmpresaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textoLogoEmpresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoDescricaoEmpresa)
                .addGap(36, 36, 36))
            .addGroup(panelLogoEmpresaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(imagemLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelFundoLayout = new javax.swing.GroupLayout(painelFundo);
        painelFundo.setLayout(painelFundoLayout);
        painelFundoLayout.setHorizontalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundoInferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addComponent(panelLogoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        painelFundoLayout.setVerticalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFundoLayout.createSequentialGroup()
                .addComponent(panelLogoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelFundoInferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelAtendimentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAtendimentoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_panelAtendimentoMouseEntered

    private void panelAtendimentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAtendimentoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_panelAtendimentoMouseExited

    private void panelAtendimentoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAtendimentoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_panelAtendimentoMousePressed

    private void panelOcorrenciaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOcorrenciaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_panelOcorrenciaMouseEntered

    private void panelOcorrenciaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOcorrenciaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_panelOcorrenciaMouseExited

    private void panelOcorrenciaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOcorrenciaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_panelOcorrenciaMousePressed

    private void panelTelefoneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelTelefoneMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_panelTelefoneMouseEntered

    private void panelTelefoneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelTelefoneMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_panelTelefoneMouseExited

    private void panelTelefoneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelTelefoneMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_panelTelefoneMousePressed

    private void panelEmailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEmailMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_panelEmailMouseEntered

    private void panelEmailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEmailMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_panelEmailMouseExited

    private void panelEmailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEmailMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_panelEmailMousePressed

    private void panelUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelUsuarioMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_panelUsuarioMouseEntered

    private void panelUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelUsuarioMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_panelUsuarioMouseExited

    private void panelUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelUsuarioMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_panelUsuarioMousePressed

    private void panelUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelUsuarioMouseClicked
        Ecall.JanelaUsuario();
    }//GEN-LAST:event_panelUsuarioMouseClicked

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
            java.util.logging.Logger.getLogger(PainelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PainelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PainelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PainelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PainelPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconAtendimento;
    private javax.swing.JLabel iconEmail;
    private javax.swing.JLabel iconOcorrencia;
    private javax.swing.JLabel iconTelefone;
    private javax.swing.JLabel iconUsuario;
    private javax.swing.JLabel imagemLogo;
    private javax.swing.JPanel painelFundo;
    private javax.swing.JPanel painelFundoInferior;
    private javax.swing.JPanel panelAtendimento;
    private javax.swing.JPanel panelEmail;
    private javax.swing.JPanel panelLogoEmpresa;
    private javax.swing.JPanel panelOcorrencia;
    private javax.swing.JPanel panelTelefone;
    private javax.swing.JPanel panelUsuario;
    private javax.swing.JLabel textoAtendimento;
    private javax.swing.JLabel textoDescricaoEmpresa;
    private javax.swing.JLabel textoEmail;
    private javax.swing.JLabel textoLogoEmpresa;
    private javax.swing.JLabel textoOcorrencia;
    private javax.swing.JLabel textoTelefone;
    private javax.swing.JLabel textoUsuario;
    // End of variables declaration//GEN-END:variables
}
