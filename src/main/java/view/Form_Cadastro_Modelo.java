package view;

import controle.Controle_Modelo;
import dao.Dao_Modelo;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import javax.swing.JOptionPane;
import util.ManipularImagem;

/**
 * @author INOVA GleSantoro
 */
abstract public class Form_Cadastro_Modelo extends javax.swing.JInternalFrame {

    Controle_Modelo md = new Controle_Modelo();
    BufferedImage imagem;

    public Form_Cadastro_Modelo() {
        initComponents();
        habilitarCampo(false);
        DesabilitaId();
        txtModelo.setEnabled(false);
        txtImobilizador.setEnabled(false);

    }

    private void habilitarCampo(boolean estado) {
        id_Montadora.setEnabled(estado);
        id_modelo.setEnabled(estado);
        id_imobilizador.setEnabled(estado);
        txtMontadora.setEnabled(estado);
        txtModelo.setEnabled(estado);
        txtImobilizador.setEnabled(estado);
    }

    private void cursor() {
        txtMontadora.requestFocus();
    }

    private void DesabilitaId() {
        id_Montadora.setEnabled(false);
        id_modelo.setEnabled(false);
        id_imobilizador.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBotao = new javax.swing.JPanel();
        btnNovoCadastro = new javax.swing.JButton();
        btnAlterarCadastro = new javax.swing.JButton();
        btnVisualizarCadastro = new javax.swing.JButton();
        btnCancelarCadastro = new javax.swing.JButton();
        btnFecharCadastro = new javax.swing.JButton();
        jPanelBotao1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        id_Montadora = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMontadora = new javax.swing.JTextField();
        btnSalvarCadastro = new javax.swing.JButton();
        btnExcluirMontadora = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jConsultas_Modelo = new javax.swing.JTextField();
        jSConsultas2 = new javax.swing.JScrollPane();
        tabelaMontadora = new javax.swing.JTable();
        jSConsultas3 = new javax.swing.JScrollPane();
        tabelaImobilizador = new javax.swing.JTable();
        jSConsultas4 = new javax.swing.JScrollPane();
        tabelaModelo = new javax.swing.JTable();
        jSConsultas5 = new javax.swing.JScrollPane();
        tabelaSimulador = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        id_modelo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        btnSalvarCadastro1 = new javax.swing.JButton();
        btnExcluirMontadora1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtImobilizador = new javax.swing.JTextField();
        btnSalvarCadastro2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        id_imobilizador = new javax.swing.JTextField();
        btnExcluirMontadora2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtSimulador = new javax.swing.JTextField();
        btnSalvarCadastro3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        id_simulador = new javax.swing.JTextField();
        btnExcluirSimulador = new javax.swing.JButton();

        jPanelBotao.setBackground(new java.awt.Color(153, 153, 153));

        btnNovoCadastro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnNovoCadastro.setForeground(new java.awt.Color(0, 0, 153));
        btnNovoCadastro.setText("NOVO");
        btnNovoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoCadastroActionPerformed(evt);
            }
        });

        btnAlterarCadastro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAlterarCadastro.setForeground(new java.awt.Color(0, 0, 153));
        btnAlterarCadastro.setText("ALTERAR");
        btnAlterarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarCadastroActionPerformed(evt);
            }
        });

        btnVisualizarCadastro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnVisualizarCadastro.setForeground(new java.awt.Color(0, 0, 153));
        btnVisualizarCadastro.setText("VISUALIZAR");
        btnVisualizarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarCadastroActionPerformed(evt);
            }
        });

        btnCancelarCadastro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCancelarCadastro.setForeground(new java.awt.Color(0, 0, 153));
        btnCancelarCadastro.setText("CANCELAR");
        btnCancelarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCadastroActionPerformed(evt);
            }
        });

        btnFecharCadastro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnFecharCadastro.setForeground(new java.awt.Color(0, 0, 153));
        btnFecharCadastro.setText("FECHAR");
        btnFecharCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotaoLayout = new javax.swing.GroupLayout(jPanelBotao);
        jPanelBotao.setLayout(jPanelBotaoLayout);
        jPanelBotaoLayout.setHorizontalGroup(
            jPanelBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovoCadastro)
                .addGap(27, 27, 27)
                .addComponent(btnAlterarCadastro)
                .addGap(113, 113, 113)
                .addComponent(btnVisualizarCadastro)
                .addGap(29, 29, 29)
                .addComponent(btnCancelarCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFecharCadastro)
                .addGap(62, 62, 62))
        );
        jPanelBotaoLayout.setVerticalGroup(
            jPanelBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoCadastro)
                    .addComponent(btnAlterarCadastro)
                    .addComponent(btnVisualizarCadastro)
                    .addComponent(btnCancelarCadastro)
                    .addComponent(btnFecharCadastro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelBotao1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("ID");
        jLabel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nova Montadora");

        txtMontadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontadoraActionPerformed(evt);
            }
        });

        btnSalvarCadastro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSalvarCadastro.setForeground(new java.awt.Color(0, 0, 153));
        btnSalvarCadastro.setText("SALVAR");
        btnSalvarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCadastroActionPerformed(evt);
            }
        });

        btnExcluirMontadora.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnExcluirMontadora.setForeground(new java.awt.Color(0, 0, 153));
        btnExcluirMontadora.setText("EXCLUIR");
        btnExcluirMontadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirMontadoraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotao1Layout = new javax.swing.GroupLayout(jPanelBotao1);
        jPanelBotao1.setLayout(jPanelBotao1Layout);
        jPanelBotao1Layout.setHorizontalGroup(
            jPanelBotao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotao1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(id_Montadora, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(57, 57, 57)
                .addComponent(txtMontadora, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvarCadastro)
                .addGap(18, 18, 18)
                .addComponent(btnExcluirMontadora)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBotao1Layout.setVerticalGroup(
            jPanelBotao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotao1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBotao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_Montadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMontadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnSalvarCadastro)
                    .addComponent(btnExcluirMontadora)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Consulta");

        jConsultas_Modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultas_ModeloActionPerformed(evt);
            }
        });

        tabelaMontadora.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tabelaMontadora.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "MONTADORA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaMontadora.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabelaMontadora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMontadoraMouseClicked(evt);
            }
        });
        jSConsultas2.setViewportView(tabelaMontadora);

        tabelaImobilizador.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tabelaImobilizador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "IMOBILIZADOR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaImobilizador.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabelaImobilizador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaImobilizadorMouseClicked(evt);
            }
        });
        jSConsultas3.setViewportView(tabelaImobilizador);

        tabelaModelo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tabelaModelo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "MODELO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaModelo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabelaModelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaModeloMouseClicked(evt);
            }
        });
        jSConsultas4.setViewportView(tabelaModelo);

        tabelaSimulador.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tabelaSimulador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "IMOBILIZADOR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaSimulador.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabelaSimulador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaSimuladorMouseClicked(evt);
            }
        });
        jSConsultas5.setViewportView(tabelaSimulador);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jConsultas_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jSConsultas2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jSConsultas4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSConsultas3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSConsultas5, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jConsultas_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSConsultas4, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                    .addComponent(jSConsultas2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jSConsultas3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jSConsultas5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("ID ");
        jLabel7.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel7AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Modelo/ Sistema Injeção");

        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });

        btnSalvarCadastro1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSalvarCadastro1.setForeground(new java.awt.Color(0, 0, 153));
        btnSalvarCadastro1.setText("SALVAR");
        btnSalvarCadastro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCadastro1ActionPerformed(evt);
            }
        });

        btnExcluirMontadora1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnExcluirMontadora1.setForeground(new java.awt.Color(0, 0, 153));
        btnExcluirMontadora1.setText("EXCLUIR");
        btnExcluirMontadora1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirMontadora1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(id_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvarCadastro1)
                .addGap(18, 18, 18)
                .addComponent(btnExcluirMontadora1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(id_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarCadastro1)
                    .addComponent(btnExcluirMontadora1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Imobilizador");

        txtImobilizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImobilizadorActionPerformed(evt);
            }
        });

        btnSalvarCadastro2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSalvarCadastro2.setForeground(new java.awt.Color(0, 0, 153));
        btnSalvarCadastro2.setText("SALVAR");
        btnSalvarCadastro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCadastro2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("ID");
        jLabel8.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel8AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        btnExcluirMontadora2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnExcluirMontadora2.setForeground(new java.awt.Color(0, 0, 153));
        btnExcluirMontadora2.setText("EXCLUIR");
        btnExcluirMontadora2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirMontadora2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(id_imobilizador, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(85, 85, 85)
                .addComponent(txtImobilizador, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvarCadastro2)
                .addGap(18, 18, 18)
                .addComponent(btnExcluirMontadora2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(txtImobilizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_imobilizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarCadastro2)
                    .addComponent(btnExcluirMontadora2))
                .addGap(5, 5, 5))
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("SIMULADOR");

        txtSimulador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSimuladorActionPerformed(evt);
            }
        });

        btnSalvarCadastro3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSalvarCadastro3.setForeground(new java.awt.Color(0, 0, 153));
        btnSalvarCadastro3.setText("SALVAR");
        btnSalvarCadastro3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCadastro3ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("ID");
        jLabel9.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel9AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        btnExcluirSimulador.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnExcluirSimulador.setForeground(new java.awt.Color(0, 0, 153));
        btnExcluirSimulador.setText("EXCLUIR");
        btnExcluirSimulador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirSimuladorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(id_simulador, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(83, 83, 83)
                .addComponent(txtSimulador, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvarCadastro3)
                .addGap(18, 18, 18)
                .addComponent(btnExcluirSimulador)
                .addContainerGap(172, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(txtSimulador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_simulador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarCadastro3)
                    .addComponent(btnExcluirSimulador))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelBotao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelBotao1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelBotao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoCadastroActionPerformed
        habilitarCampo(true);
        DesabilitaId();
        cursor();
        id_Montadora.setText("");
        txtMontadora.setText("");
        id_modelo.setText("");
        txtModelo.setText("");
        id_imobilizador.setText("");
        txtImobilizador.setText("");
    }//GEN-LAST:event_btnNovoCadastroActionPerformed

    private void btnAlterarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarCadastroActionPerformed

    }//GEN-LAST:event_btnAlterarCadastroActionPerformed

    private void btnExcluirMontadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirMontadoraActionPerformed
        md.ExcluirControleMontadora(id_Montadora.getText());
        consultaTabela_Montadora();
        id_Montadora.setText("");
        txtMontadora.setText("");
    }//GEN-LAST:event_btnExcluirMontadoraActionPerformed

    private void btnVisualizarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarCadastroActionPerformed

    }//GEN-LAST:event_btnVisualizarCadastroActionPerformed

    private void btnSalvarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCadastroActionPerformed
        cursor();
        salvarMontadora();
        consultaTabela_Montadora();
        id_Montadora.setText("");
        txtMontadora.setText("");
    }//GEN-LAST:event_btnSalvarCadastroActionPerformed

    private void btnCancelarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCadastroActionPerformed
        id_Montadora.setText("");
        txtMontadora.setText("");
        id_modelo.setText("");
        txtModelo.setText("");
        id_imobilizador.setText("");
        txtImobilizador.setText("");

    }//GEN-LAST:event_btnCancelarCadastroActionPerformed

    private void btnFecharCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharCadastroActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharCadastroActionPerformed

    private void jLabel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel1AncestorAdded

    }//GEN-LAST:event_jLabel1AncestorAdded

    private void txtMontadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontadoraActionPerformed

    }//GEN-LAST:event_txtMontadoraActionPerformed

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed

    }//GEN-LAST:event_txtModeloActionPerformed

    private void txtImobilizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImobilizadorActionPerformed

    }//GEN-LAST:event_txtImobilizadorActionPerformed

    private void jConsultas_ModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultas_ModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jConsultas_ModeloActionPerformed

    private void jLabel7AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel7AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7AncestorAdded

    private void btnSalvarCadastro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCadastro1ActionPerformed
        cursor();
        salvarModelo();
        consultaTabela_Modelo();
        id_modelo.setText("");
        txtModelo.setText("");
    }//GEN-LAST:event_btnSalvarCadastro1ActionPerformed

    private void btnSalvarCadastro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCadastro2ActionPerformed
        cursor();
        salvarImobilizador();
        consultaTabela_Imobilizador();
        id_imobilizador.setText("");
        txtImobilizador.setText("");
    }//GEN-LAST:event_btnSalvarCadastro2ActionPerformed

    private void jLabel8AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel8AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8AncestorAdded

    private void btnExcluirMontadora1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirMontadora1ActionPerformed
        md.ExcluirControleModelo(id_modelo.getText());
        consultaTabela_Modelo();
        id_modelo.setText("");
        txtModelo.setText("");
    }//GEN-LAST:event_btnExcluirMontadora1ActionPerformed

    private void btnExcluirMontadora2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirMontadora2ActionPerformed
        md.ExcluirControleImbilizador(id_imobilizador.getText());
        consultaTabela_Imobilizador();
        id_imobilizador.setText("");
        txtImobilizador.setText("");
    }//GEN-LAST:event_btnExcluirMontadora2ActionPerformed

    private void tabelaMontadoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMontadoraMouseClicked
        Carregar_Tabela_Montadora();
    }//GEN-LAST:event_tabelaMontadoraMouseClicked

    private void tabelaImobilizadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaImobilizadorMouseClicked
        Carregar_Tabela_Imobilizador();
    }//GEN-LAST:event_tabelaImobilizadorMouseClicked

    private void tabelaModeloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaModeloMouseClicked
        Carregar_Tabela_Modelo();
    }//GEN-LAST:event_tabelaModeloMouseClicked

    private void txtSimuladorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSimuladorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSimuladorActionPerformed

    private void btnSalvarCadastro3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCadastro3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarCadastro3ActionPerformed

    private void jLabel9AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel9AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9AncestorAdded

    private void btnExcluirSimuladorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirSimuladorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirSimuladorActionPerformed

    private void tabelaSimuladorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaSimuladorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaSimuladorMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarCadastro;
    private javax.swing.JButton btnCancelarCadastro;
    private javax.swing.JButton btnExcluirMontadora;
    private javax.swing.JButton btnExcluirMontadora1;
    private javax.swing.JButton btnExcluirMontadora2;
    private javax.swing.JButton btnExcluirSimulador;
    private javax.swing.JButton btnFecharCadastro;
    private javax.swing.JButton btnNovoCadastro;
    private javax.swing.JButton btnSalvarCadastro;
    private javax.swing.JButton btnSalvarCadastro1;
    private javax.swing.JButton btnSalvarCadastro2;
    private javax.swing.JButton btnSalvarCadastro3;
    private javax.swing.JButton btnVisualizarCadastro;
    public javax.swing.JTextField id_Montadora;
    public javax.swing.JTextField id_imobilizador;
    public javax.swing.JTextField id_modelo;
    public javax.swing.JTextField id_simulador;
    public javax.swing.JTextField jConsultas_Modelo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelBotao;
    private javax.swing.JPanel jPanelBotao1;
    public javax.swing.JScrollPane jSConsultas2;
    public javax.swing.JScrollPane jSConsultas3;
    public javax.swing.JScrollPane jSConsultas4;
    public javax.swing.JScrollPane jSConsultas5;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tabelaImobilizador;
    public javax.swing.JTable tabelaModelo;
    public javax.swing.JTable tabelaMontadora;
    public javax.swing.JTable tabelaSimulador;
    public javax.swing.JTextField txtImobilizador;
    public javax.swing.JTextField txtModelo;
    public javax.swing.JTextField txtMontadora;
    public javax.swing.JTextField txtSimulador;
    // End of variables declaration//GEN-END:variables

    abstract public void salvarModelo();

    abstract public void salvarMontadora();

    abstract public void salvarImobilizador();

    abstract public void consultaTabela_Montadora();

    abstract public void consultaTabela_Modelo();

    abstract public void consultaTabela_Imobilizador();

    abstract public void consultaTabela_Imagem();

    abstract public void Carregar_Tabela_Montadora();

    abstract public void Carregar_Tabela_Modelo();

    abstract public void Carregar_Tabela_Imobilizador();
}
