package br.com.stock.view.produto;

import br.com.stock.BwStock;
import br.com.stock.control.ProdutoControl;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PainelProdutoBusca extends javax.swing.JFrame {

    ProdutoControl PRODUTO_CONTROL;

    public PainelProdutoBusca() throws Exception {
        initComponents();
        PRODUTO_CONTROL = new ProdutoControl();

        PRODUTO_CONTROL.atualizaDadosTabelaAction();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        painelFundo = new javax.swing.JPanel();
        painelFundoInferior = new javax.swing.JPanel();
        formBrancoInferior = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        formMenu = new javax.swing.JPanel();
        textoPesquisar = new javax.swing.JLabel();
        buttonPesquisar = new javax.swing.JButton();
        buttonNovo = new javax.swing.JButton();
        buttonExcluir = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        painelDeIcones = new javax.swing.JPanel();
        iconAtualizar = new javax.swing.JLabel();
        textoAtualizar = new javax.swing.JLabel();
        iconPincel = new javax.swing.JLabel();
        textoAtualizar1 = new javax.swing.JLabel();
        painelLogo = new javax.swing.JPanel();
        textoTitulo = new javax.swing.JLabel();
        painelHome = new javax.swing.JPanel();
        iconCasa = new javax.swing.JLabel();
        textoDescricaoEmpresa = new javax.swing.JLabel();
        textoLogoEmpresa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        painelFundo.setBackground(new java.awt.Color(45, 118, 232));

        painelFundoInferior.setBackground(new java.awt.Color(255, 255, 255));

        formBrancoInferior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tabelaProduto.setBackground(new java.awt.Color(204, 204, 204));
        tabelaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NOME", "CATEGORIA", "ESTOQUE", "PRECO UN", "EAN13", "ATIVO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaProduto);
        if (tabelaProduto.getColumnModel().getColumnCount() > 0) {
            tabelaProduto.getColumnModel().getColumn(0).setResizable(false);
            tabelaProduto.getColumnModel().getColumn(1).setResizable(false);
            tabelaProduto.getColumnModel().getColumn(2).setResizable(false);
            tabelaProduto.getColumnModel().getColumn(2).setPreferredWidth(15);
            tabelaProduto.getColumnModel().getColumn(3).setResizable(false);
            tabelaProduto.getColumnModel().getColumn(4).setResizable(false);
            tabelaProduto.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout formBrancoInferiorLayout = new javax.swing.GroupLayout(formBrancoInferior);
        formBrancoInferior.setLayout(formBrancoInferiorLayout);
        formBrancoInferiorLayout.setHorizontalGroup(
            formBrancoInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
        );
        formBrancoInferiorLayout.setVerticalGroup(
            formBrancoInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
        );

        formMenu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        formMenu.setLayout(new java.awt.GridBagLayout());

        textoPesquisar.setText("Pesquisar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        formMenu.add(textoPesquisar, gridBagConstraints);

        campoPesquisar.setColumns(15);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        formMenu.add(campoPesquisar, gridBagConstraints);

        buttonPesquisar.setBackground(javax.swing.UIManager.getDefaults().getColor("controlHighlight"));
        buttonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/stock/img/search_20px_1.png"))); // NOI18N
        buttonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPesquisarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        formMenu.add(buttonPesquisar, gridBagConstraints);

        buttonNovo.setText("Novo");
        buttonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(1, 46, 1, 1);
        formMenu.add(buttonNovo, gridBagConstraints);

        buttonExcluir.setText("Excluir");
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(1, 3, 1, 1);
        formMenu.add(buttonExcluir, gridBagConstraints);

        buttonEditar.setText("Editar");
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(1, 3, 1, 1);
        formMenu.add(buttonEditar, gridBagConstraints);

        painelDeIcones.setBackground(new java.awt.Color(255, 255, 255));

        iconAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/stock/img/update_24x24.png"))); // NOI18N
        iconAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconAtualizarMouseClicked(evt);
            }
        });

        textoAtualizar.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        textoAtualizar.setText("Limpar");

        iconPincel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/stock/img/pincel_32x32.png"))); // NOI18N
        iconPincel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconPincelMouseClicked(evt);
            }
        });

        textoAtualizar1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        textoAtualizar1.setText("Atualizar");

        javax.swing.GroupLayout painelDeIconesLayout = new javax.swing.GroupLayout(painelDeIcones);
        painelDeIcones.setLayout(painelDeIconesLayout);
        painelDeIconesLayout.setHorizontalGroup(
            painelDeIconesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDeIconesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(painelDeIconesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textoAtualizar)
                    .addComponent(iconPincel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelDeIconesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoAtualizar1)
                    .addGroup(painelDeIconesLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(iconAtualizar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelDeIconesLayout.setVerticalGroup(
            painelDeIconesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDeIconesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDeIconesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iconAtualizar)
                    .addComponent(iconPincel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDeIconesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoAtualizar1)
                    .addComponent(textoAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout painelFundoInferiorLayout = new javax.swing.GroupLayout(painelFundoInferior);
        painelFundoInferior.setLayout(painelFundoInferiorLayout);
        painelFundoInferiorLayout.setHorizontalGroup(
            painelFundoInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFundoInferiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(formMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelDeIcones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
            .addGroup(painelFundoInferiorLayout.createSequentialGroup()
                .addComponent(formBrancoInferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        painelFundoInferiorLayout.setVerticalGroup(
            painelFundoInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFundoInferiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelFundoInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelDeIcones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelFundoInferiorLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(formMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(formBrancoInferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        painelLogo.setBackground(new java.awt.Color(45, 118, 232));

        textoTitulo.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        textoTitulo.setForeground(new java.awt.Color(255, 255, 255));
        textoTitulo.setText("Busca de Produtos");

        painelHome.setPreferredSize(new java.awt.Dimension(133, 103));

        iconCasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/stock/img/home_48px.png"))); // NOI18N
        iconCasa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconCasaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelHomeLayout = new javax.swing.GroupLayout(painelHome);
        painelHome.setLayout(painelHomeLayout);
        painelHomeLayout.setHorizontalGroup(
            painelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconCasa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painelHomeLayout.setVerticalGroup(
            painelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelHomeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(iconCasa))
        );

        javax.swing.GroupLayout painelLogoLayout = new javax.swing.GroupLayout(painelLogo);
        painelLogo.setLayout(painelLogoLayout);
        painelLogoLayout.setHorizontalGroup(
            painelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLogoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(painelHome, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addComponent(textoTitulo)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        painelLogoLayout.setVerticalGroup(
            painelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLogoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(painelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelHome, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoTitulo))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        textoDescricaoEmpresa.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        textoDescricaoEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        textoDescricaoEmpresa.setText("Gerenciador de Estoque");

        textoLogoEmpresa.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        textoLogoEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        textoLogoEmpresa.setText("STOCK");

        javax.swing.GroupLayout painelFundoLayout = new javax.swing.GroupLayout(painelFundo);
        painelFundo.setLayout(painelFundoLayout);
        painelFundoLayout.setHorizontalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addComponent(painelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoDescricaoEmpresa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoLogoEmpresa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
            .addComponent(painelFundoInferior, javax.swing.GroupLayout.PREFERRED_SIZE, 703, Short.MAX_VALUE)
        );
        painelFundoLayout.setVerticalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFundoLayout.createSequentialGroup()
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(textoLogoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoDescricaoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelFundoInferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovoActionPerformed
            BwStock.JanelaProdutoCadastro();
    }//GEN-LAST:event_buttonNovoActionPerformed

    private void buttonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPesquisarActionPerformed
        // TODO add your handling code here:
        PRODUTO_CONTROL.pesquisarProdutoAction();


    }//GEN-LAST:event_buttonPesquisarActionPerformed

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
        // TODO add your handling code here:
        PRODUTO_CONTROL.excluirProdutoAction();
        PRODUTO_CONTROL.atualizaDadosTabelaAction();


    }//GEN-LAST:event_buttonExcluirActionPerformed

    private void iconAtualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconAtualizarMouseClicked
        // TODO add your handling code here:
        PRODUTO_CONTROL.atualizaDadosTabelaAction();

    }//GEN-LAST:event_iconAtualizarMouseClicked

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
        // TODO add your handling code here:
        PRODUTO_CONTROL.editarAction();
    }//GEN-LAST:event_buttonEditarActionPerformed

    private void iconPincelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconPincelMouseClicked
        // TODO add your handling code here:
        tabelaProduto.getSelectionModel().clearSelection();
    }//GEN-LAST:event_iconPincelMouseClicked

    private void iconCasaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconCasaMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        BwStock.JanelaPrincipal();
    }//GEN-LAST:event_iconCasaMouseClicked

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
            java.util.logging.Logger.getLogger(PainelProdutoBusca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PainelProdutoBusca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PainelProdutoBusca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PainelProdutoBusca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PainelProdutoBusca().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(PainelProdutoBusca.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JButton buttonNovo;
    private javax.swing.JButton buttonPesquisar;
    public static final javax.swing.JTextField campoPesquisar = new javax.swing.JTextField();
    private javax.swing.JPanel formBrancoInferior;
    private javax.swing.JPanel formMenu;
    private javax.swing.JLabel iconAtualizar;
    private javax.swing.JLabel iconCasa;
    private javax.swing.JLabel iconPincel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelDeIcones;
    private javax.swing.JPanel painelFundo;
    private javax.swing.JPanel painelFundoInferior;
    private javax.swing.JPanel painelHome;
    private javax.swing.JPanel painelLogo;
    public static final javax.swing.JTable tabelaProduto = new javax.swing.JTable();
    private javax.swing.JLabel textoAtualizar;
    private javax.swing.JLabel textoAtualizar1;
    private javax.swing.JLabel textoDescricaoEmpresa;
    private javax.swing.JLabel textoLogoEmpresa;
    private javax.swing.JLabel textoPesquisar;
    private javax.swing.JLabel textoTitulo;
    // End of variables declaration//GEN-END:variables

}
