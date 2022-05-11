package view;

import javax.swing.JFrame;

import form.Form_Manual;
import form.Form_Modelo;
import form.Form_Sinais;
import util.GerarPdf;
import util.PosicaoFormulario;

/**
 * @author INOVA GleSantoro
 */
public class Principal extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	PosicaoFormulario form = new PosicaoFormulario();

    public Principal() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    private void initComponents() {

        jDescktop = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        jArquivo = new javax.swing.JMenu();
        itemNovo = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator17 = new javax.swing.JPopupMenu.Separator();
        jSeparator20 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator21 = new javax.swing.JPopupMenu.Separator();
        jSeparator22 = new javax.swing.JPopupMenu.Separator();
        itemBuscar = new javax.swing.JMenuItem();
        jSeparator18 = new javax.swing.JPopupMenu.Separator();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        itemFechar = new javax.swing.JMenuItem();
        jSeparator23 = new javax.swing.JPopupMenu.Separator();
        jRelatorio = new javax.swing.JMenu();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        itemPDf = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator13 = new javax.swing.JPopupMenu.Separator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MANUAL INOVA AUTOLEAP");

        javax.swing.GroupLayout jDescktopLayout = new javax.swing.GroupLayout(jDescktop);
        jDescktop.setLayout(jDescktopLayout);
        jDescktopLayout.setHorizontalGroup(
            jDescktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1352, Short.MAX_VALUE)
        );
        jDescktopLayout.setVerticalGroup(
            jDescktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );

        jMenuBar2.setPreferredSize(new java.awt.Dimension(240, 40));

        jArquivo.setBackground(new java.awt.Color(102, 102, 102));
        jArquivo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jArquivo.setForeground(new java.awt.Color(0, 0, 153));
        jArquivo.setText("Arquivo");
        jArquivo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jArquivo.setPreferredSize(new java.awt.Dimension(120, 30));

        itemNovo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemNovo.setText("Novo Cadastro Manual");
        itemNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					itemNovoActionPerformed(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        jArquivo.add(itemNovo);
        jArquivo.add(jSeparator1);
        jArquivo.add(jSeparator2);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem2.setText("Cadastrar Montadora");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jArquivo.add(jMenuItem2);
        jArquivo.add(jSeparator17);
        jArquivo.add(jSeparator20);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem4.setText("Cadastrar  Sinais");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jArquivo.add(jMenuItem4);
        jArquivo.add(jSeparator21);
        jArquivo.add(jSeparator22);

        itemBuscar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemBuscar.setText("Buscar Montadoras");
        itemBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBuscarActionPerformed(evt);
            }
        });
        jArquivo.add(itemBuscar);
        jArquivo.add(jSeparator18);
        jArquivo.add(jSeparator4);

        itemFechar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemFechar.setText("Sair");
        itemFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemFecharActionPerformed(evt);
            }
        });
        jArquivo.add(itemFechar);
        jArquivo.add(jSeparator23);

        jMenuBar2.add(jArquivo);

        jRelatorio.setBackground(new java.awt.Color(102, 102, 102));
        jRelatorio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jRelatorio.setForeground(new java.awt.Color(0, 0, 153));
        jRelatorio.setText("Relatorio");
        jRelatorio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRelatorio.setPreferredSize(new java.awt.Dimension(120, 30));
        jRelatorio.add(jSeparator3);

        jMenuItem1.setText("Abrir Relatorio");
        jRelatorio.add(jMenuItem1);
        jRelatorio.add(jSeparator8);
        jRelatorio.add(jSeparator9);

        jMenuItem3.setText("Imprimir Relatorio");
        jRelatorio.add(jMenuItem3);
        jRelatorio.add(jSeparator5);
        jRelatorio.add(jSeparator10);

        itemPDf.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.ALT_DOWN_MASK));
        itemPDf.setText("Abrir Pdf");
        itemPDf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPDfActionPerformed(evt);
            }
        });
        jRelatorio.add(itemPDf);
        jRelatorio.add(jSeparator11);
        jRelatorio.add(jSeparator12);

        jMenuItem5.setText("Visualizar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jRelatorio.add(jMenuItem5);
        jRelatorio.add(jSeparator13);

        jMenuBar2.add(jRelatorio);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDescktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDescktop)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void itemPDfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPDfActionPerformed
        // TODO add your handling code here:
        try {
            GerarPdf pdf = new GerarPdf();
            pdf.getClass();
        } catch (Exception e) {
            System.out.println("Formulario Principal PDF " + e);
        }
    }//GEN-LAST:event_itemPDfActionPerformed

    private void itemFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemFecharActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_itemFecharActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Form_Sinais tela;
        form.abrirFormulario(tela = new Form_Sinais(), jDescktop);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        Form_Modelo tela;
        form.abrirFormulario(tela = new Form_Modelo(), jDescktop);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void itemBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBuscarActionPerformed
        FormBusca tela;
        form.abrirFormulario(tela = new FormBusca(), jDescktop);
    }//GEN-LAST:event_itemBuscarActionPerformed

    private void itemNovoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {//GEN-FIRST:event_itemNovoActionPerformed
        Form_Manual tela;
        form.abrirFormulario(tela = new Form_Manual(), jDescktop);
    }//GEN-LAST:event_itemNovoActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemBuscar;
    private javax.swing.JMenuItem itemFechar;
    private javax.swing.JMenuItem itemNovo;
    private javax.swing.JMenuItem itemPDf;
    private javax.swing.JMenu jArquivo;
    private javax.swing.JDesktopPane jDescktop;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenu jRelatorio;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator13;
    private javax.swing.JPopupMenu.Separator jSeparator17;
    private javax.swing.JPopupMenu.Separator jSeparator18;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator20;
    private javax.swing.JPopupMenu.Separator jSeparator21;
    private javax.swing.JPopupMenu.Separator jSeparator22;
    private javax.swing.JPopupMenu.Separator jSeparator23;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    // End of variables declaration//GEN-END:variables
}
