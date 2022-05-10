package view;

import controle.Controle_Sinal;

/**
 * @author INOVA GleSantoro
 */
abstract public class Form_Cadastro_Sinal extends javax.swing.JInternalFrame {

    Controle_Sinal cs = new Controle_Sinal();

    public Form_Cadastro_Sinal() {
        initComponents();
        DesabelitarCampoPino();
        DesbilitarId(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBotao = new javax.swing.JPanel();
        btnNovoCadastro = new javax.swing.JButton();
        btnVisualizarCadastro = new javax.swing.JButton();
        btnCancelarCadastro = new javax.swing.JButton();
        btnFecharCadastro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        JPAINEL_SINAIS = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jConsulta_Sinal = new javax.swing.JTextField();
        JPAINEL_ALIMENTACAO = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        idAlimentacao = new javax.swing.JTextField();
        funcaoAlimentacao = new javax.swing.JTextField();
        pinos_Alimentacao = new javax.swing.JTextField();
        referenciaAlimentacao = new javax.swing.JTextField();
        conectorGt3_Alimentacao = new javax.swing.JTextField();
        conectorGt4_Alimentacao = new javax.swing.JTextField();
        btnSalvarAlimentacao = new javax.swing.JButton();
        btnconcluidoAlimentacao = new javax.swing.JButton();
        btnAlterarAlimentacao = new javax.swing.JButton();
        btnExcluirAlimentacao = new javax.swing.JButton();
        jSConsultas10 = new javax.swing.JScrollPane();
        tabela_alimentacao = new javax.swing.JTable();
        JPAINEL_SENSOR = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        idAlimentacao1 = new javax.swing.JTextField();
        funcaoAlimentacao1 = new javax.swing.JTextField();
        pinos_Alimentacao1 = new javax.swing.JTextField();
        referenciaAlimentacao1 = new javax.swing.JTextField();
        conectorGt3_Alimentacao1 = new javax.swing.JTextField();
        conectorGt4_Alimentacao1 = new javax.swing.JTextField();
        btnSalvarAlimentacao1 = new javax.swing.JButton();
        btnconcluidoAlimentacao1 = new javax.swing.JButton();
        btnAlterarAlimentacao1 = new javax.swing.JButton();
        btnExcluirAlimentacao1 = new javax.swing.JButton();
        jSConsultas12 = new javax.swing.JScrollPane();
        tabela_sensor = new javax.swing.JTable();
        JPAINEL_SENSOR2 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idAlimentacao2 = new javax.swing.JTextField();
        funcaoAlimentacao2 = new javax.swing.JTextField();
        pinos_Alimentacao2 = new javax.swing.JTextField();
        referenciaAlimentacao2 = new javax.swing.JTextField();
        conectorGt3_Alimentacao2 = new javax.swing.JTextField();
        conectorGt4_Alimentacao2 = new javax.swing.JTextField();
        btnSalvarAlimentacao2 = new javax.swing.JButton();
        btnconcluidoAlimentacao2 = new javax.swing.JButton();
        btnAlterarAlimentacao2 = new javax.swing.JButton();
        btnExcluirAlimentacao2 = new javax.swing.JButton();
        jSConsultas13 = new javax.swing.JScrollPane();
        tabela_sensor2 = new javax.swing.JTable();
        JPAINEL_ATUADOR = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idAlimentacao3 = new javax.swing.JTextField();
        funcaoAlimentacao3 = new javax.swing.JTextField();
        pinos_Alimentacao3 = new javax.swing.JTextField();
        referenciaAlimentacao3 = new javax.swing.JTextField();
        conectorGt3_Alimentacao3 = new javax.swing.JTextField();
        conectorGt4_Alimentacao3 = new javax.swing.JTextField();
        btnSalvarAlimentacao3 = new javax.swing.JButton();
        btnconcluidoAlimentacao3 = new javax.swing.JButton();
        btnAlterarAlimentacao3 = new javax.swing.JButton();
        btnExcluirAlimentacao3 = new javax.swing.JButton();
        jSConsultas14 = new javax.swing.JScrollPane();
        tabela_atuador = new javax.swing.JTable();
        JPAINEL_ATUADOR2 = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        idAlimentacao4 = new javax.swing.JTextField();
        funcaoAlimentacao4 = new javax.swing.JTextField();
        pinos_Alimentacao4 = new javax.swing.JTextField();
        referenciaAlimentacao4 = new javax.swing.JTextField();
        conectorGt3_Alimentacao4 = new javax.swing.JTextField();
        conectorGt4_Alimentacao4 = new javax.swing.JTextField();
        btnSalvarAlimentacao4 = new javax.swing.JButton();
        btnconcluidoAlimentacao4 = new javax.swing.JButton();
        btnAlterarAlimentacao4 = new javax.swing.JButton();
        btnExcluirAlimentacao4 = new javax.swing.JButton();
        jSConsultas15 = new javax.swing.JScrollPane();
        tabela_atuador2 = new javax.swing.JTable();
        JPAINEL_ALARME = new javax.swing.JPanel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        idAlimentacao5 = new javax.swing.JTextField();
        funcaoAlimentacao5 = new javax.swing.JTextField();
        pinos_Alimentacao5 = new javax.swing.JTextField();
        referenciaAlimentacao5 = new javax.swing.JTextField();
        conectorGt3_Alimentacao5 = new javax.swing.JTextField();
        conectorGt4_Alimentacao5 = new javax.swing.JTextField();
        btnSalvarAlimentacao5 = new javax.swing.JButton();
        btnconcluidoAlimentacao5 = new javax.swing.JButton();
        btnAlterarAlimentacao5 = new javax.swing.JButton();
        btnExcluirAlimentacao5 = new javax.swing.JButton();
        jSConsultas16 = new javax.swing.JScrollPane();
        tabela_alarme = new javax.swing.JTable();
        JPAINEL_COMUNICACAO = new javax.swing.JPanel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        idAlimentacao6 = new javax.swing.JTextField();
        funcaoAlimentacao6 = new javax.swing.JTextField();
        pinos_Alimentacao6 = new javax.swing.JTextField();
        referenciaAlimentacao6 = new javax.swing.JTextField();
        conectorGt3_Alimentacao6 = new javax.swing.JTextField();
        conectorGt4_Alimentacao6 = new javax.swing.JTextField();
        btnSalvarAlimentacao6 = new javax.swing.JButton();
        btnconcluidoAlimentacao6 = new javax.swing.JButton();
        btnAlterarAlimentacao6 = new javax.swing.JButton();
        btnExcluirAlimentacao6 = new javax.swing.JButton();
        jSConsultas17 = new javax.swing.JScrollPane();
        tabela_comunicacao = new javax.swing.JTable();
        JPAINEL_INJETOR = new javax.swing.JPanel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        idAlimentacao7 = new javax.swing.JTextField();
        funcaoAlimentacao7 = new javax.swing.JTextField();
        pinos_Alimentacao7 = new javax.swing.JTextField();
        referenciaAlimentacao7 = new javax.swing.JTextField();
        conectorGt3_Alimentacao7 = new javax.swing.JTextField();
        conectorGt4_Alimentacao7 = new javax.swing.JTextField();
        btnSalvarAlimentacao7 = new javax.swing.JButton();
        btnconcluidoAlimentacao7 = new javax.swing.JButton();
        btnAlterarAlimentacao7 = new javax.swing.JButton();
        btnExcluirAlimentacao7 = new javax.swing.JButton();
        jSConsultas18 = new javax.swing.JScrollPane();
        tabela_injetor = new javax.swing.JTable();
        JPAINEL_PBI = new javax.swing.JPanel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        idAlimentacao8 = new javax.swing.JTextField();
        funcaoAlimentacao8 = new javax.swing.JTextField();
        pinos_Alimentacao8 = new javax.swing.JTextField();
        referenciaAlimentacao8 = new javax.swing.JTextField();
        conectorGt3_Alimentacao8 = new javax.swing.JTextField();
        conectorGt4_Alimentacao8 = new javax.swing.JTextField();
        btnSalvarAlimentacao8 = new javax.swing.JButton();
        btnconcluidoAlimentacao8 = new javax.swing.JButton();
        btnAlterarAlimentacao8 = new javax.swing.JButton();
        btnExcluirAlimentacao8 = new javax.swing.JButton();
        jSConsultas19 = new javax.swing.JScrollPane();
        tabela_pbi = new javax.swing.JTable();

        jPanelBotao.setBackground(new java.awt.Color(153, 153, 153));

        btnNovoCadastro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnNovoCadastro.setForeground(new java.awt.Color(0, 0, 153));
        btnNovoCadastro.setText("NOVO");
        btnNovoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoCadastroActionPerformed(evt);
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
                .addGap(42, 42, 42)
                .addComponent(btnNovoCadastro)
                .addGap(38, 38, 38)
                .addComponent(btnVisualizarCadastro)
                .addGap(34, 34, 34)
                .addComponent(btnCancelarCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFecharCadastro)
                .addGap(85, 85, 85))
        );
        jPanelBotaoLayout.setVerticalGroup(
            jPanelBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoCadastro)
                    .addComponent(btnVisualizarCadastro)
                    .addComponent(btnCancelarCadastro)
                    .addComponent(btnFecharCadastro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        JPAINEL_SINAIS.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout JPAINEL_SINAISLayout = new javax.swing.GroupLayout(JPAINEL_SINAIS);
        JPAINEL_SINAIS.setLayout(JPAINEL_SINAISLayout);
        JPAINEL_SINAISLayout.setHorizontalGroup(
            JPAINEL_SINAISLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3004, Short.MAX_VALUE)
        );
        JPAINEL_SINAISLayout.setVerticalGroup(
            JPAINEL_SINAISLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2736, Short.MAX_VALUE)
        );

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Consulta");

        JPAINEL_ALIMENTACAO.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("ALIMENTACAO");

        jLabel67.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel67.setText("ID");

        jLabel68.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel68.setText("Pinos da Central");

        jLabel69.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel69.setText("Referencia");

        jLabel70.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel70.setText("Conector GT3");

        jLabel71.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel71.setText("Conector GT4");

        jLabel72.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel72.setText("Funcao");

        funcaoAlimentacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcaoAlimentacaoActionPerformed(evt);
            }
        });

        pinos_Alimentacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinos_AlimentacaoActionPerformed(evt);
            }
        });

        referenciaAlimentacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                referenciaAlimentacaoActionPerformed(evt);
            }
        });

        conectorGt3_Alimentacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectorGt3_AlimentacaoActionPerformed(evt);
            }
        });

        conectorGt4_Alimentacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectorGt4_AlimentacaoActionPerformed(evt);
            }
        });

        btnSalvarAlimentacao.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSalvarAlimentacao.setForeground(new java.awt.Color(0, 0, 153));
        btnSalvarAlimentacao.setText("SALVAR");
        btnSalvarAlimentacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAlimentacaoActionPerformed(evt);
            }
        });

        btnconcluidoAlimentacao.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnconcluidoAlimentacao.setForeground(new java.awt.Color(0, 0, 153));
        btnconcluidoAlimentacao.setText("CONCLUIR");
        btnconcluidoAlimentacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconcluidoAlimentacaoActionPerformed(evt);
            }
        });

        btnAlterarAlimentacao.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAlterarAlimentacao.setForeground(new java.awt.Color(0, 0, 153));
        btnAlterarAlimentacao.setText("ALTERAR");
        btnAlterarAlimentacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarAlimentacaoActionPerformed(evt);
            }
        });

        btnExcluirAlimentacao.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnExcluirAlimentacao.setForeground(new java.awt.Color(0, 0, 153));
        btnExcluirAlimentacao.setText("EXCLUIR");
        btnExcluirAlimentacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirAlimentacaoActionPerformed(evt);
            }
        });

        tabela_alimentacao.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tabela_alimentacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "FUNCAO", "PINOS DA CENTRAL", "REFERENCIA", "CONECTOR GT3", "CONECTOR GT4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_alimentacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_alimentacaoMouseClicked(evt);
            }
        });
        jSConsultas10.setViewportView(tabela_alimentacao);

        javax.swing.GroupLayout JPAINEL_ALIMENTACAOLayout = new javax.swing.GroupLayout(JPAINEL_ALIMENTACAO);
        JPAINEL_ALIMENTACAO.setLayout(JPAINEL_ALIMENTACAOLayout);
        JPAINEL_ALIMENTACAOLayout.setHorizontalGroup(
            JPAINEL_ALIMENTACAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPAINEL_ALIMENTACAOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPAINEL_ALIMENTACAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPAINEL_ALIMENTACAOLayout.createSequentialGroup()
                        .addGroup(JPAINEL_ALIMENTACAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel68)
                            .addComponent(jLabel69)
                            .addComponent(jLabel70)
                            .addComponent(jLabel71))
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_ALIMENTACAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPAINEL_ALIMENTACAOLayout.createSequentialGroup()
                                .addComponent(conectorGt4_Alimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnconcluidoAlimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPAINEL_ALIMENTACAOLayout.createSequentialGroup()
                                .addGroup(JPAINEL_ALIMENTACAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(conectorGt3_Alimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(referenciaAlimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(JPAINEL_ALIMENTACAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAlterarAlimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnExcluirAlimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(JPAINEL_ALIMENTACAOLayout.createSequentialGroup()
                                .addComponent(pinos_Alimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalvarAlimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(JPAINEL_ALIMENTACAOLayout.createSequentialGroup()
                        .addComponent(jLabel67)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idAlimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel72)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(funcaoAlimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jSConsultas10, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        JPAINEL_ALIMENTACAOLayout.setVerticalGroup(
            JPAINEL_ALIMENTACAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPAINEL_ALIMENTACAOLayout.createSequentialGroup()
                .addGroup(JPAINEL_ALIMENTACAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPAINEL_ALIMENTACAOLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_ALIMENTACAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel67)
                            .addComponent(idAlimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel72)
                            .addComponent(funcaoAlimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_ALIMENTACAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel68)
                            .addComponent(pinos_Alimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalvarAlimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_ALIMENTACAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel69)
                            .addComponent(referenciaAlimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAlterarAlimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_ALIMENTACAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel70)
                            .addComponent(conectorGt3_Alimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcluirAlimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_ALIMENTACAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel71)
                            .addGroup(JPAINEL_ALIMENTACAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(conectorGt4_Alimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnconcluidoAlimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPAINEL_ALIMENTACAOLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSConsultas10, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        JPAINEL_SENSOR.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("SENSOR");

        jLabel79.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel79.setText("ID");

        jLabel80.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel80.setText("Pinos da Central");

        jLabel81.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel81.setText("Referencia");

        jLabel82.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel82.setText("Conector GT3");

        jLabel83.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel83.setText("Conector GT4");

        jLabel84.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel84.setText("Funcao");

        funcaoAlimentacao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcaoAlimentacao1ActionPerformed(evt);
            }
        });

        pinos_Alimentacao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinos_Alimentacao1ActionPerformed(evt);
            }
        });

        referenciaAlimentacao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                referenciaAlimentacao1ActionPerformed(evt);
            }
        });

        conectorGt3_Alimentacao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectorGt3_Alimentacao1ActionPerformed(evt);
            }
        });

        conectorGt4_Alimentacao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectorGt4_Alimentacao1ActionPerformed(evt);
            }
        });

        btnSalvarAlimentacao1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSalvarAlimentacao1.setForeground(new java.awt.Color(0, 0, 153));
        btnSalvarAlimentacao1.setText("SALVAR");
        btnSalvarAlimentacao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAlimentacao1ActionPerformed(evt);
            }
        });

        btnconcluidoAlimentacao1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnconcluidoAlimentacao1.setForeground(new java.awt.Color(0, 0, 153));
        btnconcluidoAlimentacao1.setText("CONCLUIR");
        btnconcluidoAlimentacao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconcluidoAlimentacao1ActionPerformed(evt);
            }
        });

        btnAlterarAlimentacao1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAlterarAlimentacao1.setForeground(new java.awt.Color(0, 0, 153));
        btnAlterarAlimentacao1.setText("ALTERAR");
        btnAlterarAlimentacao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarAlimentacao1ActionPerformed(evt);
            }
        });

        btnExcluirAlimentacao1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnExcluirAlimentacao1.setForeground(new java.awt.Color(0, 0, 153));
        btnExcluirAlimentacao1.setText("EXCLUIR");
        btnExcluirAlimentacao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirAlimentacao1ActionPerformed(evt);
            }
        });

        tabela_sensor.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tabela_sensor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "FUNCAO", "PINOS DA CENTRAL", "REFERENCIA", "CONECTOR GT3", "CONECTOR GT4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_sensor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_sensorMouseClicked(evt);
            }
        });
        jSConsultas12.setViewportView(tabela_sensor);

        javax.swing.GroupLayout JPAINEL_SENSORLayout = new javax.swing.GroupLayout(JPAINEL_SENSOR);
        JPAINEL_SENSOR.setLayout(JPAINEL_SENSORLayout);
        JPAINEL_SENSORLayout.setHorizontalGroup(
            JPAINEL_SENSORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPAINEL_SENSORLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPAINEL_SENSORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPAINEL_SENSORLayout.createSequentialGroup()
                        .addGroup(JPAINEL_SENSORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel80)
                            .addComponent(jLabel81)
                            .addComponent(jLabel82)
                            .addComponent(jLabel83))
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_SENSORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPAINEL_SENSORLayout.createSequentialGroup()
                                .addComponent(conectorGt4_Alimentacao1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnconcluidoAlimentacao1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPAINEL_SENSORLayout.createSequentialGroup()
                                .addGroup(JPAINEL_SENSORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(conectorGt3_Alimentacao1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(referenciaAlimentacao1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(JPAINEL_SENSORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAlterarAlimentacao1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnExcluirAlimentacao1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(JPAINEL_SENSORLayout.createSequentialGroup()
                                .addComponent(pinos_Alimentacao1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalvarAlimentacao1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(JPAINEL_SENSORLayout.createSequentialGroup()
                        .addComponent(jLabel79)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idAlimentacao1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel84)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(funcaoAlimentacao1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jSConsultas12, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        JPAINEL_SENSORLayout.setVerticalGroup(
            JPAINEL_SENSORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPAINEL_SENSORLayout.createSequentialGroup()
                .addGroup(JPAINEL_SENSORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPAINEL_SENSORLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_SENSORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel79)
                            .addComponent(idAlimentacao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel84)
                            .addComponent(funcaoAlimentacao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_SENSORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel80)
                            .addComponent(pinos_Alimentacao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalvarAlimentacao1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_SENSORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel81)
                            .addComponent(referenciaAlimentacao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAlterarAlimentacao1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_SENSORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel82)
                            .addComponent(conectorGt3_Alimentacao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcluirAlimentacao1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_SENSORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel83)
                            .addGroup(JPAINEL_SENSORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(conectorGt4_Alimentacao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnconcluidoAlimentacao1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPAINEL_SENSORLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSConsultas12, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        JPAINEL_SENSOR2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel85.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel85.setText("ID");

        jLabel86.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel86.setText("Pinos da Central");

        jLabel87.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel87.setText("Referencia");

        jLabel88.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel88.setText("Conector GT3");

        jLabel89.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel89.setText("Conector GT4");

        jLabel90.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel90.setText("Funcao");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("SENSOR2");

        funcaoAlimentacao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcaoAlimentacao2ActionPerformed(evt);
            }
        });

        pinos_Alimentacao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinos_Alimentacao2ActionPerformed(evt);
            }
        });

        referenciaAlimentacao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                referenciaAlimentacao2ActionPerformed(evt);
            }
        });

        conectorGt3_Alimentacao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectorGt3_Alimentacao2ActionPerformed(evt);
            }
        });

        conectorGt4_Alimentacao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectorGt4_Alimentacao2ActionPerformed(evt);
            }
        });

        btnSalvarAlimentacao2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSalvarAlimentacao2.setForeground(new java.awt.Color(0, 0, 153));
        btnSalvarAlimentacao2.setText("SALVAR");
        btnSalvarAlimentacao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAlimentacao2ActionPerformed(evt);
            }
        });

        btnconcluidoAlimentacao2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnconcluidoAlimentacao2.setForeground(new java.awt.Color(0, 0, 153));
        btnconcluidoAlimentacao2.setText("CONCLUIR");
        btnconcluidoAlimentacao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconcluidoAlimentacao2ActionPerformed(evt);
            }
        });

        btnAlterarAlimentacao2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAlterarAlimentacao2.setForeground(new java.awt.Color(0, 0, 153));
        btnAlterarAlimentacao2.setText("ALTERAR");
        btnAlterarAlimentacao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarAlimentacao2ActionPerformed(evt);
            }
        });

        btnExcluirAlimentacao2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnExcluirAlimentacao2.setForeground(new java.awt.Color(0, 0, 153));
        btnExcluirAlimentacao2.setText("EXCLUIR");
        btnExcluirAlimentacao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirAlimentacao2ActionPerformed(evt);
            }
        });

        tabela_sensor2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tabela_sensor2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "FUNCAO", "PINOS DA CENTRAL", "REFERENCIA", "CONECTOR GT3", "CONECTOR GT4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_sensor2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_sensor2MouseClicked(evt);
            }
        });
        jSConsultas13.setViewportView(tabela_sensor2);

        javax.swing.GroupLayout JPAINEL_SENSOR2Layout = new javax.swing.GroupLayout(JPAINEL_SENSOR2);
        JPAINEL_SENSOR2.setLayout(JPAINEL_SENSOR2Layout);
        JPAINEL_SENSOR2Layout.setHorizontalGroup(
            JPAINEL_SENSOR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPAINEL_SENSOR2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPAINEL_SENSOR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPAINEL_SENSOR2Layout.createSequentialGroup()
                        .addGroup(JPAINEL_SENSOR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel86)
                            .addComponent(jLabel87)
                            .addComponent(jLabel88)
                            .addComponent(jLabel89))
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_SENSOR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPAINEL_SENSOR2Layout.createSequentialGroup()
                                .addComponent(conectorGt4_Alimentacao2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnconcluidoAlimentacao2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPAINEL_SENSOR2Layout.createSequentialGroup()
                                .addGroup(JPAINEL_SENSOR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(conectorGt3_Alimentacao2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(referenciaAlimentacao2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(JPAINEL_SENSOR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAlterarAlimentacao2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnExcluirAlimentacao2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(JPAINEL_SENSOR2Layout.createSequentialGroup()
                                .addComponent(pinos_Alimentacao2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalvarAlimentacao2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(JPAINEL_SENSOR2Layout.createSequentialGroup()
                        .addComponent(jLabel85)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idAlimentacao2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel90)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(funcaoAlimentacao2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jSConsultas13, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        JPAINEL_SENSOR2Layout.setVerticalGroup(
            JPAINEL_SENSOR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPAINEL_SENSOR2Layout.createSequentialGroup()
                .addGroup(JPAINEL_SENSOR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPAINEL_SENSOR2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_SENSOR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel85)
                            .addComponent(idAlimentacao2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel90)
                            .addComponent(funcaoAlimentacao2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_SENSOR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel86)
                            .addComponent(pinos_Alimentacao2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalvarAlimentacao2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_SENSOR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel87)
                            .addComponent(referenciaAlimentacao2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAlterarAlimentacao2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_SENSOR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel88)
                            .addComponent(conectorGt3_Alimentacao2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcluirAlimentacao2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_SENSOR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel89)
                            .addGroup(JPAINEL_SENSOR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(conectorGt4_Alimentacao2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnconcluidoAlimentacao2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPAINEL_SENSOR2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSConsultas13, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        JPAINEL_ATUADOR.setBackground(new java.awt.Color(204, 204, 204));

        jLabel91.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel91.setText("ID");

        jLabel92.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel92.setText("Pinos da Central");

        jLabel93.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel93.setText("Referencia");

        jLabel94.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel94.setText("Conector GT3");

        jLabel95.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel95.setText("Conector GT4");

        jLabel96.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel96.setText("Funcao");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("ATUADOR");

        funcaoAlimentacao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcaoAlimentacao3ActionPerformed(evt);
            }
        });

        pinos_Alimentacao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinos_Alimentacao3ActionPerformed(evt);
            }
        });

        referenciaAlimentacao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                referenciaAlimentacao3ActionPerformed(evt);
            }
        });

        conectorGt3_Alimentacao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectorGt3_Alimentacao3ActionPerformed(evt);
            }
        });

        conectorGt4_Alimentacao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectorGt4_Alimentacao3ActionPerformed(evt);
            }
        });

        btnSalvarAlimentacao3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSalvarAlimentacao3.setForeground(new java.awt.Color(0, 0, 153));
        btnSalvarAlimentacao3.setText("SALVAR");
        btnSalvarAlimentacao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAlimentacao3ActionPerformed(evt);
            }
        });

        btnconcluidoAlimentacao3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnconcluidoAlimentacao3.setForeground(new java.awt.Color(0, 0, 153));
        btnconcluidoAlimentacao3.setText("CONCLUIR");
        btnconcluidoAlimentacao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconcluidoAlimentacao3ActionPerformed(evt);
            }
        });

        btnAlterarAlimentacao3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAlterarAlimentacao3.setForeground(new java.awt.Color(0, 0, 153));
        btnAlterarAlimentacao3.setText("ALTERAR");
        btnAlterarAlimentacao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarAlimentacao3ActionPerformed(evt);
            }
        });

        btnExcluirAlimentacao3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnExcluirAlimentacao3.setForeground(new java.awt.Color(0, 0, 153));
        btnExcluirAlimentacao3.setText("EXCLUIR");
        btnExcluirAlimentacao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirAlimentacao3ActionPerformed(evt);
            }
        });

        tabela_atuador.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tabela_atuador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "FUNCAO", "PINOS DA CENTRAL", "REFERENCIA", "CONECTOR GT3", "CONECTOR GT4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_atuador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_atuadorMouseClicked(evt);
            }
        });
        jSConsultas14.setViewportView(tabela_atuador);

        javax.swing.GroupLayout JPAINEL_ATUADORLayout = new javax.swing.GroupLayout(JPAINEL_ATUADOR);
        JPAINEL_ATUADOR.setLayout(JPAINEL_ATUADORLayout);
        JPAINEL_ATUADORLayout.setHorizontalGroup(
            JPAINEL_ATUADORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPAINEL_ATUADORLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPAINEL_ATUADORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPAINEL_ATUADORLayout.createSequentialGroup()
                        .addGroup(JPAINEL_ATUADORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel92)
                            .addComponent(jLabel93)
                            .addComponent(jLabel94)
                            .addComponent(jLabel95))
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_ATUADORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPAINEL_ATUADORLayout.createSequentialGroup()
                                .addComponent(conectorGt4_Alimentacao3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnconcluidoAlimentacao3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPAINEL_ATUADORLayout.createSequentialGroup()
                                .addGroup(JPAINEL_ATUADORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(conectorGt3_Alimentacao3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(referenciaAlimentacao3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(JPAINEL_ATUADORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAlterarAlimentacao3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnExcluirAlimentacao3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(JPAINEL_ATUADORLayout.createSequentialGroup()
                                .addComponent(pinos_Alimentacao3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalvarAlimentacao3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(JPAINEL_ATUADORLayout.createSequentialGroup()
                        .addComponent(jLabel91)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idAlimentacao3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel96)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(funcaoAlimentacao3, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jSConsultas14, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        JPAINEL_ATUADORLayout.setVerticalGroup(
            JPAINEL_ATUADORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPAINEL_ATUADORLayout.createSequentialGroup()
                .addGroup(JPAINEL_ATUADORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPAINEL_ATUADORLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_ATUADORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel91)
                            .addComponent(idAlimentacao3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel96)
                            .addComponent(funcaoAlimentacao3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_ATUADORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel92)
                            .addComponent(pinos_Alimentacao3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalvarAlimentacao3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_ATUADORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel93)
                            .addComponent(referenciaAlimentacao3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAlterarAlimentacao3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_ATUADORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel94)
                            .addComponent(conectorGt3_Alimentacao3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcluirAlimentacao3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_ATUADORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel95)
                            .addGroup(JPAINEL_ATUADORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(conectorGt4_Alimentacao3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnconcluidoAlimentacao3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPAINEL_ATUADORLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSConsultas14, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        JPAINEL_ATUADOR2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel97.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel97.setText("ID");

        jLabel98.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel98.setText("Pinos da Central");

        jLabel99.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel99.setText("Referencia");

        jLabel100.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel100.setText("Conector GT3");

        jLabel101.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel101.setText("Conector GT4");

        jLabel102.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel102.setText("Funcao");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("ATUADOR2");

        funcaoAlimentacao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcaoAlimentacao4ActionPerformed(evt);
            }
        });

        pinos_Alimentacao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinos_Alimentacao4ActionPerformed(evt);
            }
        });

        referenciaAlimentacao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                referenciaAlimentacao4ActionPerformed(evt);
            }
        });

        conectorGt3_Alimentacao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectorGt3_Alimentacao4ActionPerformed(evt);
            }
        });

        conectorGt4_Alimentacao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectorGt4_Alimentacao4ActionPerformed(evt);
            }
        });

        btnSalvarAlimentacao4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSalvarAlimentacao4.setForeground(new java.awt.Color(0, 0, 153));
        btnSalvarAlimentacao4.setText("SALVAR");
        btnSalvarAlimentacao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAlimentacao4ActionPerformed(evt);
            }
        });

        btnconcluidoAlimentacao4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnconcluidoAlimentacao4.setForeground(new java.awt.Color(0, 0, 153));
        btnconcluidoAlimentacao4.setText("CONCLUIR");
        btnconcluidoAlimentacao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconcluidoAlimentacao4ActionPerformed(evt);
            }
        });

        btnAlterarAlimentacao4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAlterarAlimentacao4.setForeground(new java.awt.Color(0, 0, 153));
        btnAlterarAlimentacao4.setText("ALTERAR");
        btnAlterarAlimentacao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarAlimentacao4ActionPerformed(evt);
            }
        });

        btnExcluirAlimentacao4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnExcluirAlimentacao4.setForeground(new java.awt.Color(0, 0, 153));
        btnExcluirAlimentacao4.setText("EXCLUIR");
        btnExcluirAlimentacao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirAlimentacao4ActionPerformed(evt);
            }
        });

        tabela_atuador2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tabela_atuador2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "FUNCAO", "PINOS DA CENTRAL", "REFERENCIA", "CONECTOR GT3", "CONECTOR GT4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_atuador2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_atuador2MouseClicked(evt);
            }
        });
        jSConsultas15.setViewportView(tabela_atuador2);

        javax.swing.GroupLayout JPAINEL_ATUADOR2Layout = new javax.swing.GroupLayout(JPAINEL_ATUADOR2);
        JPAINEL_ATUADOR2.setLayout(JPAINEL_ATUADOR2Layout);
        JPAINEL_ATUADOR2Layout.setHorizontalGroup(
            JPAINEL_ATUADOR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPAINEL_ATUADOR2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPAINEL_ATUADOR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPAINEL_ATUADOR2Layout.createSequentialGroup()
                        .addGroup(JPAINEL_ATUADOR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel98)
                            .addComponent(jLabel99)
                            .addComponent(jLabel100)
                            .addComponent(jLabel101))
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_ATUADOR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPAINEL_ATUADOR2Layout.createSequentialGroup()
                                .addComponent(conectorGt4_Alimentacao4, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnconcluidoAlimentacao4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPAINEL_ATUADOR2Layout.createSequentialGroup()
                                .addGroup(JPAINEL_ATUADOR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(conectorGt3_Alimentacao4, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(referenciaAlimentacao4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(JPAINEL_ATUADOR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAlterarAlimentacao4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnExcluirAlimentacao4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(JPAINEL_ATUADOR2Layout.createSequentialGroup()
                                .addComponent(pinos_Alimentacao4, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalvarAlimentacao4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(JPAINEL_ATUADOR2Layout.createSequentialGroup()
                        .addComponent(jLabel97)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idAlimentacao4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel102)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(funcaoAlimentacao4, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jSConsultas15, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        JPAINEL_ATUADOR2Layout.setVerticalGroup(
            JPAINEL_ATUADOR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPAINEL_ATUADOR2Layout.createSequentialGroup()
                .addGroup(JPAINEL_ATUADOR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPAINEL_ATUADOR2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_ATUADOR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel97)
                            .addComponent(idAlimentacao4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel102)
                            .addComponent(funcaoAlimentacao4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_ATUADOR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel98)
                            .addComponent(pinos_Alimentacao4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalvarAlimentacao4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_ATUADOR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel99)
                            .addComponent(referenciaAlimentacao4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAlterarAlimentacao4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_ATUADOR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel100)
                            .addComponent(conectorGt3_Alimentacao4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcluirAlimentacao4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_ATUADOR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel101)
                            .addGroup(JPAINEL_ATUADOR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(conectorGt4_Alimentacao4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnconcluidoAlimentacao4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPAINEL_ATUADOR2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSConsultas15, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        JPAINEL_ALARME.setBackground(new java.awt.Color(204, 204, 204));

        jLabel103.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel103.setText("ID");

        jLabel104.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel104.setText("Pinos da Central");

        jLabel105.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel105.setText("Referencia");

        jLabel106.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel106.setText("Conector GT3");

        jLabel107.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel107.setText("Conector GT4");

        jLabel108.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel108.setText("Funcao");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("ALARME");

        funcaoAlimentacao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcaoAlimentacao5ActionPerformed(evt);
            }
        });

        pinos_Alimentacao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinos_Alimentacao5ActionPerformed(evt);
            }
        });

        referenciaAlimentacao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                referenciaAlimentacao5ActionPerformed(evt);
            }
        });

        conectorGt3_Alimentacao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectorGt3_Alimentacao5ActionPerformed(evt);
            }
        });

        conectorGt4_Alimentacao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectorGt4_Alimentacao5ActionPerformed(evt);
            }
        });

        btnSalvarAlimentacao5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSalvarAlimentacao5.setForeground(new java.awt.Color(0, 0, 153));
        btnSalvarAlimentacao5.setText("SALVAR");
        btnSalvarAlimentacao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAlimentacao5ActionPerformed(evt);
            }
        });

        btnconcluidoAlimentacao5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnconcluidoAlimentacao5.setForeground(new java.awt.Color(0, 0, 153));
        btnconcluidoAlimentacao5.setText("CONCLUIR");
        btnconcluidoAlimentacao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconcluidoAlimentacao5ActionPerformed(evt);
            }
        });

        btnAlterarAlimentacao5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAlterarAlimentacao5.setForeground(new java.awt.Color(0, 0, 153));
        btnAlterarAlimentacao5.setText("ALTERAR");
        btnAlterarAlimentacao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarAlimentacao5ActionPerformed(evt);
            }
        });

        btnExcluirAlimentacao5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnExcluirAlimentacao5.setForeground(new java.awt.Color(0, 0, 153));
        btnExcluirAlimentacao5.setText("EXCLUIR");
        btnExcluirAlimentacao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirAlimentacao5ActionPerformed(evt);
            }
        });

        tabela_alarme.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tabela_alarme.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "FUNCAO", "PINOS DA CENTRAL", "REFERENCIA", "CONECTOR GT3", "CONECTOR GT4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_alarme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_alarmeMouseClicked(evt);
            }
        });
        jSConsultas16.setViewportView(tabela_alarme);

        javax.swing.GroupLayout JPAINEL_ALARMELayout = new javax.swing.GroupLayout(JPAINEL_ALARME);
        JPAINEL_ALARME.setLayout(JPAINEL_ALARMELayout);
        JPAINEL_ALARMELayout.setHorizontalGroup(
            JPAINEL_ALARMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPAINEL_ALARMELayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPAINEL_ALARMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPAINEL_ALARMELayout.createSequentialGroup()
                        .addGroup(JPAINEL_ALARMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel104)
                            .addComponent(jLabel105)
                            .addComponent(jLabel106)
                            .addComponent(jLabel107))
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_ALARMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPAINEL_ALARMELayout.createSequentialGroup()
                                .addComponent(conectorGt4_Alimentacao5, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnconcluidoAlimentacao5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPAINEL_ALARMELayout.createSequentialGroup()
                                .addGroup(JPAINEL_ALARMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(conectorGt3_Alimentacao5, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(referenciaAlimentacao5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(JPAINEL_ALARMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAlterarAlimentacao5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnExcluirAlimentacao5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(JPAINEL_ALARMELayout.createSequentialGroup()
                                .addComponent(pinos_Alimentacao5, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalvarAlimentacao5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(JPAINEL_ALARMELayout.createSequentialGroup()
                        .addComponent(jLabel103)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idAlimentacao5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel108)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(funcaoAlimentacao5, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jSConsultas16, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        JPAINEL_ALARMELayout.setVerticalGroup(
            JPAINEL_ALARMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPAINEL_ALARMELayout.createSequentialGroup()
                .addGroup(JPAINEL_ALARMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPAINEL_ALARMELayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_ALARMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel103)
                            .addComponent(idAlimentacao5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel108)
                            .addComponent(funcaoAlimentacao5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_ALARMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel104)
                            .addComponent(pinos_Alimentacao5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalvarAlimentacao5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_ALARMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel105)
                            .addComponent(referenciaAlimentacao5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAlterarAlimentacao5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_ALARMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel106)
                            .addComponent(conectorGt3_Alimentacao5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcluirAlimentacao5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_ALARMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel107)
                            .addGroup(JPAINEL_ALARMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(conectorGt4_Alimentacao5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnconcluidoAlimentacao5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPAINEL_ALARMELayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSConsultas16, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        JPAINEL_COMUNICACAO.setBackground(new java.awt.Color(204, 204, 204));

        jLabel109.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel109.setText("ID");

        jLabel110.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel110.setText("Pinos da Central");

        jLabel111.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel111.setText("Referencia");

        jLabel112.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel112.setText("Conector GT3");

        jLabel113.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel113.setText("Conector GT4");

        jLabel114.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel114.setText("Funcao");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("COUNICAÇÃO");

        funcaoAlimentacao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcaoAlimentacao6ActionPerformed(evt);
            }
        });

        pinos_Alimentacao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinos_Alimentacao6ActionPerformed(evt);
            }
        });

        referenciaAlimentacao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                referenciaAlimentacao6ActionPerformed(evt);
            }
        });

        conectorGt3_Alimentacao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectorGt3_Alimentacao6ActionPerformed(evt);
            }
        });

        conectorGt4_Alimentacao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectorGt4_Alimentacao6ActionPerformed(evt);
            }
        });

        btnSalvarAlimentacao6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSalvarAlimentacao6.setForeground(new java.awt.Color(0, 0, 153));
        btnSalvarAlimentacao6.setText("SALVAR");
        btnSalvarAlimentacao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAlimentacao6ActionPerformed(evt);
            }
        });

        btnconcluidoAlimentacao6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnconcluidoAlimentacao6.setForeground(new java.awt.Color(0, 0, 153));
        btnconcluidoAlimentacao6.setText("CONCLUIR");
        btnconcluidoAlimentacao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconcluidoAlimentacao6ActionPerformed(evt);
            }
        });

        btnAlterarAlimentacao6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAlterarAlimentacao6.setForeground(new java.awt.Color(0, 0, 153));
        btnAlterarAlimentacao6.setText("ALTERAR");
        btnAlterarAlimentacao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarAlimentacao6ActionPerformed(evt);
            }
        });

        btnExcluirAlimentacao6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnExcluirAlimentacao6.setForeground(new java.awt.Color(0, 0, 153));
        btnExcluirAlimentacao6.setText("EXCLUIR");
        btnExcluirAlimentacao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirAlimentacao6ActionPerformed(evt);
            }
        });

        tabela_comunicacao.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tabela_comunicacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "FUNCAO", "PINOS DA CENTRAL", "REFERENCIA", "CONECTOR GT3", "CONECTOR GT4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_comunicacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_comunicacaoMouseClicked(evt);
            }
        });
        jSConsultas17.setViewportView(tabela_comunicacao);

        javax.swing.GroupLayout JPAINEL_COMUNICACAOLayout = new javax.swing.GroupLayout(JPAINEL_COMUNICACAO);
        JPAINEL_COMUNICACAO.setLayout(JPAINEL_COMUNICACAOLayout);
        JPAINEL_COMUNICACAOLayout.setHorizontalGroup(
            JPAINEL_COMUNICACAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPAINEL_COMUNICACAOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPAINEL_COMUNICACAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPAINEL_COMUNICACAOLayout.createSequentialGroup()
                        .addGroup(JPAINEL_COMUNICACAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel110)
                            .addComponent(jLabel111)
                            .addComponent(jLabel112)
                            .addComponent(jLabel113))
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_COMUNICACAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPAINEL_COMUNICACAOLayout.createSequentialGroup()
                                .addComponent(conectorGt4_Alimentacao6, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnconcluidoAlimentacao6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPAINEL_COMUNICACAOLayout.createSequentialGroup()
                                .addGroup(JPAINEL_COMUNICACAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(conectorGt3_Alimentacao6, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(referenciaAlimentacao6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(JPAINEL_COMUNICACAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAlterarAlimentacao6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnExcluirAlimentacao6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(JPAINEL_COMUNICACAOLayout.createSequentialGroup()
                                .addComponent(pinos_Alimentacao6, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalvarAlimentacao6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(JPAINEL_COMUNICACAOLayout.createSequentialGroup()
                        .addComponent(jLabel109)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idAlimentacao6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel114)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(funcaoAlimentacao6, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(jSConsultas17, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        JPAINEL_COMUNICACAOLayout.setVerticalGroup(
            JPAINEL_COMUNICACAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPAINEL_COMUNICACAOLayout.createSequentialGroup()
                .addGroup(JPAINEL_COMUNICACAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPAINEL_COMUNICACAOLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_COMUNICACAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel109)
                            .addComponent(idAlimentacao6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel114)
                            .addComponent(funcaoAlimentacao6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_COMUNICACAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel110)
                            .addComponent(pinos_Alimentacao6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalvarAlimentacao6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_COMUNICACAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel111)
                            .addComponent(referenciaAlimentacao6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAlterarAlimentacao6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_COMUNICACAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel112)
                            .addComponent(conectorGt3_Alimentacao6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcluirAlimentacao6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_COMUNICACAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel113)
                            .addGroup(JPAINEL_COMUNICACAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(conectorGt4_Alimentacao6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnconcluidoAlimentacao6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPAINEL_COMUNICACAOLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSConsultas17, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        JPAINEL_INJETOR.setBackground(new java.awt.Color(204, 204, 204));

        jLabel115.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel115.setText("ID");

        jLabel116.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel116.setText("Pinos da Central");

        jLabel117.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel117.setText("Referencia");

        jLabel118.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel118.setText("Conector GT3");

        jLabel119.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel119.setText("Conector GT4");

        jLabel120.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel120.setText("Funcao");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("INJETOR DIESEL");

        funcaoAlimentacao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcaoAlimentacao7ActionPerformed(evt);
            }
        });

        pinos_Alimentacao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinos_Alimentacao7ActionPerformed(evt);
            }
        });

        referenciaAlimentacao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                referenciaAlimentacao7ActionPerformed(evt);
            }
        });

        conectorGt3_Alimentacao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectorGt3_Alimentacao7ActionPerformed(evt);
            }
        });

        conectorGt4_Alimentacao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectorGt4_Alimentacao7ActionPerformed(evt);
            }
        });

        btnSalvarAlimentacao7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSalvarAlimentacao7.setForeground(new java.awt.Color(0, 0, 153));
        btnSalvarAlimentacao7.setText("SALVAR");
        btnSalvarAlimentacao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAlimentacao7ActionPerformed(evt);
            }
        });

        btnconcluidoAlimentacao7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnconcluidoAlimentacao7.setForeground(new java.awt.Color(0, 0, 153));
        btnconcluidoAlimentacao7.setText("CONCLUIR");
        btnconcluidoAlimentacao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconcluidoAlimentacao7ActionPerformed(evt);
            }
        });

        btnAlterarAlimentacao7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAlterarAlimentacao7.setForeground(new java.awt.Color(0, 0, 153));
        btnAlterarAlimentacao7.setText("ALTERAR");
        btnAlterarAlimentacao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarAlimentacao7ActionPerformed(evt);
            }
        });

        btnExcluirAlimentacao7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnExcluirAlimentacao7.setForeground(new java.awt.Color(0, 0, 153));
        btnExcluirAlimentacao7.setText("EXCLUIR");
        btnExcluirAlimentacao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirAlimentacao7ActionPerformed(evt);
            }
        });

        tabela_injetor.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tabela_injetor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "FUNCAO", "PINOS DA CENTRAL", "REFERENCIA", "CONECTOR GT3", "CONECTOR GT4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_injetor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_injetorMouseClicked(evt);
            }
        });
        jSConsultas18.setViewportView(tabela_injetor);

        javax.swing.GroupLayout JPAINEL_INJETORLayout = new javax.swing.GroupLayout(JPAINEL_INJETOR);
        JPAINEL_INJETOR.setLayout(JPAINEL_INJETORLayout);
        JPAINEL_INJETORLayout.setHorizontalGroup(
            JPAINEL_INJETORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPAINEL_INJETORLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPAINEL_INJETORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPAINEL_INJETORLayout.createSequentialGroup()
                        .addGroup(JPAINEL_INJETORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel116)
                            .addComponent(jLabel117)
                            .addComponent(jLabel118)
                            .addComponent(jLabel119))
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_INJETORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPAINEL_INJETORLayout.createSequentialGroup()
                                .addComponent(conectorGt4_Alimentacao7, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnconcluidoAlimentacao7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPAINEL_INJETORLayout.createSequentialGroup()
                                .addGroup(JPAINEL_INJETORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(conectorGt3_Alimentacao7, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(referenciaAlimentacao7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(JPAINEL_INJETORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAlterarAlimentacao7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnExcluirAlimentacao7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(JPAINEL_INJETORLayout.createSequentialGroup()
                                .addComponent(pinos_Alimentacao7, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalvarAlimentacao7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(JPAINEL_INJETORLayout.createSequentialGroup()
                        .addComponent(jLabel115)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idAlimentacao7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel120)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(funcaoAlimentacao7, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(jSConsultas18, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        JPAINEL_INJETORLayout.setVerticalGroup(
            JPAINEL_INJETORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPAINEL_INJETORLayout.createSequentialGroup()
                .addGroup(JPAINEL_INJETORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPAINEL_INJETORLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_INJETORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel115)
                            .addComponent(idAlimentacao7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel120)
                            .addComponent(funcaoAlimentacao7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_INJETORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel116)
                            .addComponent(pinos_Alimentacao7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalvarAlimentacao7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_INJETORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel117)
                            .addComponent(referenciaAlimentacao7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAlterarAlimentacao7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_INJETORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel118)
                            .addComponent(conectorGt3_Alimentacao7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcluirAlimentacao7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_INJETORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel119)
                            .addGroup(JPAINEL_INJETORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(conectorGt4_Alimentacao7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnconcluidoAlimentacao7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPAINEL_INJETORLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSConsultas18, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        JPAINEL_PBI.setBackground(new java.awt.Color(204, 204, 204));

        jLabel121.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel121.setText("ID");

        jLabel122.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel122.setText("Pinos da Central");

        jLabel123.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel123.setText("Referencia");

        jLabel124.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel124.setText("Conector GT3");

        jLabel125.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel125.setText("Conector GT4");

        jLabel126.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel126.setText("Funcao");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("PAINEL / BC / IMOB");

        funcaoAlimentacao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcaoAlimentacao8ActionPerformed(evt);
            }
        });

        pinos_Alimentacao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinos_Alimentacao8ActionPerformed(evt);
            }
        });

        referenciaAlimentacao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                referenciaAlimentacao8ActionPerformed(evt);
            }
        });

        conectorGt3_Alimentacao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectorGt3_Alimentacao8ActionPerformed(evt);
            }
        });

        conectorGt4_Alimentacao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectorGt4_Alimentacao8ActionPerformed(evt);
            }
        });

        btnSalvarAlimentacao8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSalvarAlimentacao8.setForeground(new java.awt.Color(0, 0, 153));
        btnSalvarAlimentacao8.setText("SALVAR");
        btnSalvarAlimentacao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAlimentacao8ActionPerformed(evt);
            }
        });

        btnconcluidoAlimentacao8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnconcluidoAlimentacao8.setForeground(new java.awt.Color(0, 0, 153));
        btnconcluidoAlimentacao8.setText("CONCLUIR");
        btnconcluidoAlimentacao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconcluidoAlimentacao8ActionPerformed(evt);
            }
        });

        btnAlterarAlimentacao8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAlterarAlimentacao8.setForeground(new java.awt.Color(0, 0, 153));
        btnAlterarAlimentacao8.setText("ALTERAR");
        btnAlterarAlimentacao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarAlimentacao8ActionPerformed(evt);
            }
        });

        btnExcluirAlimentacao8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnExcluirAlimentacao8.setForeground(new java.awt.Color(0, 0, 153));
        btnExcluirAlimentacao8.setText("EXCLUIR");
        btnExcluirAlimentacao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirAlimentacao8ActionPerformed(evt);
            }
        });

        tabela_pbi.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tabela_pbi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "FUNCAO", "PINOS DA CENTRAL", "REFERENCIA", "CONECTOR GT3", "CONECTOR GT4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_pbi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_pbiMouseClicked(evt);
            }
        });
        jSConsultas19.setViewportView(tabela_pbi);

        javax.swing.GroupLayout JPAINEL_PBILayout = new javax.swing.GroupLayout(JPAINEL_PBI);
        JPAINEL_PBI.setLayout(JPAINEL_PBILayout);
        JPAINEL_PBILayout.setHorizontalGroup(
            JPAINEL_PBILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPAINEL_PBILayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPAINEL_PBILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPAINEL_PBILayout.createSequentialGroup()
                        .addGroup(JPAINEL_PBILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel122)
                            .addComponent(jLabel123)
                            .addComponent(jLabel124)
                            .addComponent(jLabel125))
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_PBILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPAINEL_PBILayout.createSequentialGroup()
                                .addComponent(conectorGt4_Alimentacao8, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnconcluidoAlimentacao8, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPAINEL_PBILayout.createSequentialGroup()
                                .addGroup(JPAINEL_PBILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(conectorGt3_Alimentacao8, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(referenciaAlimentacao8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(JPAINEL_PBILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAlterarAlimentacao8, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnExcluirAlimentacao8, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(JPAINEL_PBILayout.createSequentialGroup()
                                .addComponent(pinos_Alimentacao8, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalvarAlimentacao8, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(JPAINEL_PBILayout.createSequentialGroup()
                        .addComponent(jLabel121)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idAlimentacao8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel126)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(funcaoAlimentacao8, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addComponent(jSConsultas19, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        JPAINEL_PBILayout.setVerticalGroup(
            JPAINEL_PBILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPAINEL_PBILayout.createSequentialGroup()
                .addGroup(JPAINEL_PBILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPAINEL_PBILayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_PBILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel121)
                            .addComponent(idAlimentacao8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel126)
                            .addComponent(funcaoAlimentacao8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_PBILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel122)
                            .addComponent(pinos_Alimentacao8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalvarAlimentacao8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_PBILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel123)
                            .addComponent(referenciaAlimentacao8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAlterarAlimentacao8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_PBILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel124)
                            .addComponent(conectorGt3_Alimentacao8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcluirAlimentacao8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPAINEL_PBILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel125)
                            .addGroup(JPAINEL_PBILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(conectorGt4_Alimentacao8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnconcluidoAlimentacao8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPAINEL_PBILayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSConsultas19, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JPAINEL_SENSOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JPAINEL_SENSOR2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JPAINEL_ATUADOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JPAINEL_ATUADOR2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JPAINEL_ALARME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JPAINEL_COMUNICACAO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JPAINEL_INJETOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JPAINEL_PBI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JPAINEL_SINAIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jConsulta_Sinal, javax.swing.GroupLayout.PREFERRED_SIZE, 1068, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JPAINEL_ALIMENTACAO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jConsulta_Sinal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JPAINEL_ALIMENTACAO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(JPAINEL_SINAIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(JPAINEL_SENSOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JPAINEL_SENSOR2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JPAINEL_ATUADOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JPAINEL_ATUADOR2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(JPAINEL_ALARME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JPAINEL_COMUNICACAO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JPAINEL_INJETOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JPAINEL_PBI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(264, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBotao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoCadastroActionPerformed
        habilitarTextoAla();
        habilitarTextoAli();
        habilitarTextoAtu();
        habilitarTextoAtu2();
        habilitarTextoCom();
        habilitarTextoInj();
        habilitarTextoPbi();
        habilitarTextoSen();
        habilitarTextoSen2();
        limpaTexto();
        cursor();
    }//GEN-LAST:event_btnNovoCadastroActionPerformed

    private void btnVisualizarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarCadastroActionPerformed

    }//GEN-LAST:event_btnVisualizarCadastroActionPerformed

    private void btnCancelarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCadastroActionPerformed
        btnSalvarAlimentacao.setEnabled(true);
        btnVisualizarCadastro.setEnabled(true);
        limpaTexto();
    }//GEN-LAST:event_btnCancelarCadastroActionPerformed

    private void btnFecharCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharCadastroActionPerformed
        dispose();
        limpaTexto();
    }//GEN-LAST:event_btnFecharCadastroActionPerformed

    private void btnExcluirAlimentacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirAlimentacaoActionPerformed
        cs.ExcluirControleAlimentacao(idAlimentacao.getText());
        consultaTabela_Alimentacao();
        limpaTexto();
    }//GEN-LAST:event_btnExcluirAlimentacaoActionPerformed

    private void btnAlterarAlimentacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarAlimentacaoActionPerformed
        Alterar_Alimentacao();
        consultaTabela_Alimentacao();
        limpaTexto();
    }//GEN-LAST:event_btnAlterarAlimentacaoActionPerformed

    private void btnconcluidoAlimentacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconcluidoAlimentacaoActionPerformed
        funcaoAlimentacao.setEnabled(false);
        pinos_Alimentacao.setEnabled(false);
        referenciaAlimentacao.setEnabled(false);
        conectorGt3_Alimentacao.setEnabled(false);
        conectorGt4_Alimentacao.setEnabled(false);
        limpaTexto();
    }//GEN-LAST:event_btnconcluidoAlimentacaoActionPerformed

    private void tabela_alimentacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_alimentacaoMouseClicked
        Carregar_Tabela_Alimentacao();
        habilitarTextoAli();

    }//GEN-LAST:event_tabela_alimentacaoMouseClicked

    private void btnSalvarAlimentacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAlimentacaoActionPerformed
        Salvar_Alimentacao();
        consultaTabela_Alimentacao();
        limpaTexto();
    }//GEN-LAST:event_btnSalvarAlimentacaoActionPerformed

    private void conectorGt4_AlimentacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectorGt4_AlimentacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conectorGt4_AlimentacaoActionPerformed

    private void conectorGt3_AlimentacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectorGt3_AlimentacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conectorGt3_AlimentacaoActionPerformed

    private void referenciaAlimentacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_referenciaAlimentacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_referenciaAlimentacaoActionPerformed

    private void pinos_AlimentacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinos_AlimentacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinos_AlimentacaoActionPerformed

    private void funcaoAlimentacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcaoAlimentacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_funcaoAlimentacaoActionPerformed

    private void tabela_sensorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_sensorMouseClicked
        Carregar_Tabela_sensor();
        habilitarTextoSen();
    }//GEN-LAST:event_tabela_sensorMouseClicked

    private void btnExcluirAlimentacao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirAlimentacao1ActionPerformed
        cs.ExcluirControleSensor(idAlimentacao1.getText());
        consultaTabela_Sensor();
        limpaTexto();
    }//GEN-LAST:event_btnExcluirAlimentacao1ActionPerformed

    private void btnAlterarAlimentacao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarAlimentacao1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarAlimentacao1ActionPerformed

    private void btnconcluidoAlimentacao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconcluidoAlimentacao1ActionPerformed
        funcaoAlimentacao1.setEnabled(false);
        pinos_Alimentacao1.setEnabled(false);
        referenciaAlimentacao1.setEnabled(false);
        conectorGt3_Alimentacao1.setEnabled(false);
        conectorGt4_Alimentacao1.setEnabled(false);
        limpaTexto();
    }//GEN-LAST:event_btnconcluidoAlimentacao1ActionPerformed

    private void btnSalvarAlimentacao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAlimentacao1ActionPerformed
        Salvar_Sensor();
        consultaTabela_Sensor();
        limpaTexto();
    }//GEN-LAST:event_btnSalvarAlimentacao1ActionPerformed

    private void conectorGt4_Alimentacao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectorGt4_Alimentacao1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conectorGt4_Alimentacao1ActionPerformed

    private void conectorGt3_Alimentacao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectorGt3_Alimentacao1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conectorGt3_Alimentacao1ActionPerformed

    private void referenciaAlimentacao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_referenciaAlimentacao1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_referenciaAlimentacao1ActionPerformed

    private void pinos_Alimentacao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinos_Alimentacao1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinos_Alimentacao1ActionPerformed

    private void funcaoAlimentacao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcaoAlimentacao1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_funcaoAlimentacao1ActionPerformed

    private void funcaoAlimentacao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcaoAlimentacao2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_funcaoAlimentacao2ActionPerformed

    private void pinos_Alimentacao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinos_Alimentacao2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinos_Alimentacao2ActionPerformed

    private void referenciaAlimentacao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_referenciaAlimentacao2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_referenciaAlimentacao2ActionPerformed

    private void conectorGt3_Alimentacao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectorGt3_Alimentacao2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conectorGt3_Alimentacao2ActionPerformed

    private void conectorGt4_Alimentacao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectorGt4_Alimentacao2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conectorGt4_Alimentacao2ActionPerformed

    private void btnSalvarAlimentacao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAlimentacao2ActionPerformed
        Salvar_Sensor2();
        consultaTabela_Sensor2();
        limpaTexto();
    }//GEN-LAST:event_btnSalvarAlimentacao2ActionPerformed

    private void btnconcluidoAlimentacao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconcluidoAlimentacao2ActionPerformed
        funcaoAlimentacao2.setEnabled(false);
        pinos_Alimentacao2.setEnabled(false);
        referenciaAlimentacao2.setEnabled(false);
        conectorGt3_Alimentacao2.setEnabled(false);
        conectorGt4_Alimentacao2.setEnabled(false);
        limpaTexto();
    }//GEN-LAST:event_btnconcluidoAlimentacao2ActionPerformed

    private void btnAlterarAlimentacao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarAlimentacao2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarAlimentacao2ActionPerformed

    private void btnExcluirAlimentacao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirAlimentacao2ActionPerformed
        cs.ExcluirControleSensor2(idAlimentacao2.getText());
        consultaTabela_Sensor2();
        limpaTexto();
    }//GEN-LAST:event_btnExcluirAlimentacao2ActionPerformed

    private void tabela_sensor2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_sensor2MouseClicked
        Carregar_Tabela_sensor2();
        habilitarTextoSen2();
    }//GEN-LAST:event_tabela_sensor2MouseClicked

    private void funcaoAlimentacao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcaoAlimentacao3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_funcaoAlimentacao3ActionPerformed

    private void pinos_Alimentacao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinos_Alimentacao3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinos_Alimentacao3ActionPerformed

    private void referenciaAlimentacao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_referenciaAlimentacao3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_referenciaAlimentacao3ActionPerformed

    private void conectorGt3_Alimentacao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectorGt3_Alimentacao3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conectorGt3_Alimentacao3ActionPerformed

    private void conectorGt4_Alimentacao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectorGt4_Alimentacao3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conectorGt4_Alimentacao3ActionPerformed

    private void btnSalvarAlimentacao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAlimentacao3ActionPerformed
        Salvar_Atuador();
        consultaTabela_Atuador();
        limpaTexto();
    }//GEN-LAST:event_btnSalvarAlimentacao3ActionPerformed

    private void btnconcluidoAlimentacao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconcluidoAlimentacao3ActionPerformed
        funcaoAlimentacao3.setEnabled(false);
        pinos_Alimentacao3.setEnabled(false);
        referenciaAlimentacao3.setEnabled(false);
        conectorGt3_Alimentacao3.setEnabled(false);
        conectorGt4_Alimentacao3.setEnabled(false);
        limpaTexto();
    }//GEN-LAST:event_btnconcluidoAlimentacao3ActionPerformed

    private void btnAlterarAlimentacao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarAlimentacao3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarAlimentacao3ActionPerformed

    private void btnExcluirAlimentacao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirAlimentacao3ActionPerformed
        cs.ExcluirControleAtuador(idAlimentacao3.getText());
        consultaTabela_Atuador();
        limpaTexto();
    }//GEN-LAST:event_btnExcluirAlimentacao3ActionPerformed

    private void tabela_atuadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_atuadorMouseClicked
        Carregar_Tabela_atuador();
        habilitarTextoAtu();
    }//GEN-LAST:event_tabela_atuadorMouseClicked

    private void funcaoAlimentacao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcaoAlimentacao4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_funcaoAlimentacao4ActionPerformed

    private void pinos_Alimentacao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinos_Alimentacao4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinos_Alimentacao4ActionPerformed

    private void referenciaAlimentacao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_referenciaAlimentacao4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_referenciaAlimentacao4ActionPerformed

    private void conectorGt3_Alimentacao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectorGt3_Alimentacao4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conectorGt3_Alimentacao4ActionPerformed

    private void conectorGt4_Alimentacao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectorGt4_Alimentacao4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conectorGt4_Alimentacao4ActionPerformed

    private void btnSalvarAlimentacao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAlimentacao4ActionPerformed
        Salvar_Atuador2();
        consultaTabela_Atuador2();
        limpaTexto();
    }//GEN-LAST:event_btnSalvarAlimentacao4ActionPerformed

    private void btnconcluidoAlimentacao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconcluidoAlimentacao4ActionPerformed
        funcaoAlimentacao4.setEnabled(false);
        pinos_Alimentacao4.setEnabled(false);
        referenciaAlimentacao4.setEnabled(false);
        conectorGt3_Alimentacao4.setEnabled(false);
        conectorGt4_Alimentacao4.setEnabled(false);
        limpaTexto();
    }//GEN-LAST:event_btnconcluidoAlimentacao4ActionPerformed

    private void btnAlterarAlimentacao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarAlimentacao4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarAlimentacao4ActionPerformed

    private void btnExcluirAlimentacao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirAlimentacao4ActionPerformed
        cs.ExcluirControleAtuador2(idAlimentacao4.getText());
        consultaTabela_Atuador2();
        limpaTexto();
    }//GEN-LAST:event_btnExcluirAlimentacao4ActionPerformed

    private void tabela_atuador2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_atuador2MouseClicked
        Carregar_Tabela_atuador2();
        habilitarTextoAtu2();
    }//GEN-LAST:event_tabela_atuador2MouseClicked

    private void funcaoAlimentacao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcaoAlimentacao5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_funcaoAlimentacao5ActionPerformed

    private void pinos_Alimentacao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinos_Alimentacao5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinos_Alimentacao5ActionPerformed

    private void referenciaAlimentacao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_referenciaAlimentacao5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_referenciaAlimentacao5ActionPerformed

    private void conectorGt3_Alimentacao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectorGt3_Alimentacao5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conectorGt3_Alimentacao5ActionPerformed

    private void conectorGt4_Alimentacao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectorGt4_Alimentacao5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conectorGt4_Alimentacao5ActionPerformed

    private void btnSalvarAlimentacao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAlimentacao5ActionPerformed
        Salvar_Alarme();
        consultaTabela_alarme();
        limpaTexto();
    }//GEN-LAST:event_btnSalvarAlimentacao5ActionPerformed

    private void btnconcluidoAlimentacao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconcluidoAlimentacao5ActionPerformed
        funcaoAlimentacao5.setEnabled(false);
        pinos_Alimentacao5.setEnabled(false);
        referenciaAlimentacao5.setEnabled(false);
        conectorGt3_Alimentacao5.setEnabled(false);
        conectorGt4_Alimentacao5.setEnabled(false);
        limpaTexto();
    }//GEN-LAST:event_btnconcluidoAlimentacao5ActionPerformed

    private void btnAlterarAlimentacao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarAlimentacao5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarAlimentacao5ActionPerformed

    private void btnExcluirAlimentacao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirAlimentacao5ActionPerformed
        cs.ExcluirControleAlarme(idAlimentacao5.getText());
        consultaTabela_alarme();
        limpaTexto();
    }//GEN-LAST:event_btnExcluirAlimentacao5ActionPerformed

    private void tabela_alarmeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_alarmeMouseClicked
        Carregar_Tabela_alarme();
        habilitarTextoAla();
    }//GEN-LAST:event_tabela_alarmeMouseClicked

    private void funcaoAlimentacao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcaoAlimentacao6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_funcaoAlimentacao6ActionPerformed

    private void pinos_Alimentacao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinos_Alimentacao6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinos_Alimentacao6ActionPerformed

    private void referenciaAlimentacao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_referenciaAlimentacao6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_referenciaAlimentacao6ActionPerformed

    private void conectorGt3_Alimentacao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectorGt3_Alimentacao6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conectorGt3_Alimentacao6ActionPerformed

    private void conectorGt4_Alimentacao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectorGt4_Alimentacao6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conectorGt4_Alimentacao6ActionPerformed

    private void btnSalvarAlimentacao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAlimentacao6ActionPerformed
        Salvar_Comunicacao();
        consultaTabela_comunicacao();
        limpaTexto();
    }//GEN-LAST:event_btnSalvarAlimentacao6ActionPerformed

    private void btnconcluidoAlimentacao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconcluidoAlimentacao6ActionPerformed
        funcaoAlimentacao6.setEnabled(false);
        pinos_Alimentacao6.setEnabled(false);
        referenciaAlimentacao6.setEnabled(false);
        conectorGt3_Alimentacao6.setEnabled(false);
        conectorGt4_Alimentacao6.setEnabled(false);
        limpaTexto();
    }//GEN-LAST:event_btnconcluidoAlimentacao6ActionPerformed

    private void btnAlterarAlimentacao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarAlimentacao6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarAlimentacao6ActionPerformed

    private void btnExcluirAlimentacao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirAlimentacao6ActionPerformed
        cs.ExcluirControleComunicacao(idAlimentacao6.getText());
        consultaTabela_comunicacao();
        limpaTexto();
    }//GEN-LAST:event_btnExcluirAlimentacao6ActionPerformed

    private void tabela_comunicacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_comunicacaoMouseClicked
        Carregar_Tabela_comunicacao();
        habilitarTextoCom();
    }//GEN-LAST:event_tabela_comunicacaoMouseClicked

    private void funcaoAlimentacao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcaoAlimentacao7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_funcaoAlimentacao7ActionPerformed

    private void pinos_Alimentacao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinos_Alimentacao7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinos_Alimentacao7ActionPerformed

    private void referenciaAlimentacao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_referenciaAlimentacao7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_referenciaAlimentacao7ActionPerformed

    private void conectorGt3_Alimentacao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectorGt3_Alimentacao7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conectorGt3_Alimentacao7ActionPerformed

    private void conectorGt4_Alimentacao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectorGt4_Alimentacao7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conectorGt4_Alimentacao7ActionPerformed

    private void btnSalvarAlimentacao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAlimentacao7ActionPerformed
        Salvar_Injetor();
        consultaTabela_Injetor();
        limpaTexto();
    }//GEN-LAST:event_btnSalvarAlimentacao7ActionPerformed

    private void btnconcluidoAlimentacao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconcluidoAlimentacao7ActionPerformed
        funcaoAlimentacao7.setEnabled(false);
        pinos_Alimentacao7.setEnabled(false);
        referenciaAlimentacao7.setEnabled(false);
        conectorGt3_Alimentacao7.setEnabled(false);
        conectorGt4_Alimentacao7.setEnabled(false);
        limpaTexto();
    }//GEN-LAST:event_btnconcluidoAlimentacao7ActionPerformed

    private void btnAlterarAlimentacao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarAlimentacao7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarAlimentacao7ActionPerformed

    private void btnExcluirAlimentacao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirAlimentacao7ActionPerformed
        cs.ExcluirControleInjetor(idAlimentacao7.getText());
        consultaTabela_Injetor();
        limpaTexto();
    }//GEN-LAST:event_btnExcluirAlimentacao7ActionPerformed

    private void tabela_injetorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_injetorMouseClicked
        Carregar_Tabela_injetor();
        habilitarTextoInj();
    }//GEN-LAST:event_tabela_injetorMouseClicked

    private void funcaoAlimentacao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcaoAlimentacao8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_funcaoAlimentacao8ActionPerformed

    private void pinos_Alimentacao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinos_Alimentacao8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinos_Alimentacao8ActionPerformed

    private void referenciaAlimentacao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_referenciaAlimentacao8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_referenciaAlimentacao8ActionPerformed

    private void conectorGt3_Alimentacao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectorGt3_Alimentacao8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conectorGt3_Alimentacao8ActionPerformed

    private void conectorGt4_Alimentacao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectorGt4_Alimentacao8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conectorGt4_Alimentacao8ActionPerformed

    private void btnSalvarAlimentacao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAlimentacao8ActionPerformed
        Salvar_PBI();
        consultaTabela_PBI();
        limpaTexto();
    }//GEN-LAST:event_btnSalvarAlimentacao8ActionPerformed

    private void btnconcluidoAlimentacao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconcluidoAlimentacao8ActionPerformed
        funcaoAlimentacao8.setEnabled(false);
        pinos_Alimentacao8.setEnabled(false);
        referenciaAlimentacao8.setEnabled(false);
        conectorGt3_Alimentacao8.setEnabled(false);
        conectorGt4_Alimentacao8.setEnabled(false);
        limpaTexto();
    }//GEN-LAST:event_btnconcluidoAlimentacao8ActionPerformed

    private void btnAlterarAlimentacao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarAlimentacao8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarAlimentacao8ActionPerformed

    private void btnExcluirAlimentacao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirAlimentacao8ActionPerformed
        cs.ExcluirControlePbi(idAlimentacao8.getText());
        consultaTabela_PBI();
        limpaTexto();
    }//GEN-LAST:event_btnExcluirAlimentacao8ActionPerformed

    private void tabela_pbiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_pbiMouseClicked
        Carregar_Tabela_pbi();
        habilitarTextoPbi();
    }//GEN-LAST:event_tabela_pbiMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel JPAINEL_ALARME;
    public javax.swing.JPanel JPAINEL_ALIMENTACAO;
    public javax.swing.JPanel JPAINEL_ATUADOR;
    public javax.swing.JPanel JPAINEL_ATUADOR2;
    public javax.swing.JPanel JPAINEL_COMUNICACAO;
    public javax.swing.JPanel JPAINEL_INJETOR;
    public javax.swing.JPanel JPAINEL_PBI;
    public javax.swing.JPanel JPAINEL_SENSOR;
    public javax.swing.JPanel JPAINEL_SENSOR2;
    private javax.swing.JPanel JPAINEL_SINAIS;
    private javax.swing.JButton btnAlterarAlimentacao;
    private javax.swing.JButton btnAlterarAlimentacao1;
    private javax.swing.JButton btnAlterarAlimentacao2;
    private javax.swing.JButton btnAlterarAlimentacao3;
    private javax.swing.JButton btnAlterarAlimentacao4;
    private javax.swing.JButton btnAlterarAlimentacao5;
    private javax.swing.JButton btnAlterarAlimentacao6;
    private javax.swing.JButton btnAlterarAlimentacao7;
    private javax.swing.JButton btnAlterarAlimentacao8;
    private javax.swing.JButton btnCancelarCadastro;
    private javax.swing.JButton btnExcluirAlimentacao;
    private javax.swing.JButton btnExcluirAlimentacao1;
    private javax.swing.JButton btnExcluirAlimentacao2;
    private javax.swing.JButton btnExcluirAlimentacao3;
    private javax.swing.JButton btnExcluirAlimentacao4;
    private javax.swing.JButton btnExcluirAlimentacao5;
    private javax.swing.JButton btnExcluirAlimentacao6;
    private javax.swing.JButton btnExcluirAlimentacao7;
    private javax.swing.JButton btnExcluirAlimentacao8;
    private javax.swing.JButton btnFecharCadastro;
    private javax.swing.JButton btnNovoCadastro;
    private javax.swing.JButton btnSalvarAlimentacao;
    private javax.swing.JButton btnSalvarAlimentacao1;
    private javax.swing.JButton btnSalvarAlimentacao2;
    private javax.swing.JButton btnSalvarAlimentacao3;
    private javax.swing.JButton btnSalvarAlimentacao4;
    private javax.swing.JButton btnSalvarAlimentacao5;
    private javax.swing.JButton btnSalvarAlimentacao6;
    private javax.swing.JButton btnSalvarAlimentacao7;
    private javax.swing.JButton btnSalvarAlimentacao8;
    private javax.swing.JButton btnVisualizarCadastro;
    private javax.swing.JButton btnconcluidoAlimentacao;
    private javax.swing.JButton btnconcluidoAlimentacao1;
    private javax.swing.JButton btnconcluidoAlimentacao2;
    private javax.swing.JButton btnconcluidoAlimentacao3;
    private javax.swing.JButton btnconcluidoAlimentacao4;
    private javax.swing.JButton btnconcluidoAlimentacao5;
    private javax.swing.JButton btnconcluidoAlimentacao6;
    private javax.swing.JButton btnconcluidoAlimentacao7;
    private javax.swing.JButton btnconcluidoAlimentacao8;
    public javax.swing.JTextField conectorGt3_Alimentacao;
    public javax.swing.JTextField conectorGt3_Alimentacao1;
    public javax.swing.JTextField conectorGt3_Alimentacao2;
    public javax.swing.JTextField conectorGt3_Alimentacao3;
    public javax.swing.JTextField conectorGt3_Alimentacao4;
    public javax.swing.JTextField conectorGt3_Alimentacao5;
    public javax.swing.JTextField conectorGt3_Alimentacao6;
    public javax.swing.JTextField conectorGt3_Alimentacao7;
    public javax.swing.JTextField conectorGt3_Alimentacao8;
    public javax.swing.JTextField conectorGt4_Alimentacao;
    public javax.swing.JTextField conectorGt4_Alimentacao1;
    public javax.swing.JTextField conectorGt4_Alimentacao2;
    public javax.swing.JTextField conectorGt4_Alimentacao3;
    public javax.swing.JTextField conectorGt4_Alimentacao4;
    public javax.swing.JTextField conectorGt4_Alimentacao5;
    public javax.swing.JTextField conectorGt4_Alimentacao6;
    public javax.swing.JTextField conectorGt4_Alimentacao7;
    public javax.swing.JTextField conectorGt4_Alimentacao8;
    public javax.swing.JTextField funcaoAlimentacao;
    public javax.swing.JTextField funcaoAlimentacao1;
    public javax.swing.JTextField funcaoAlimentacao2;
    public javax.swing.JTextField funcaoAlimentacao3;
    public javax.swing.JTextField funcaoAlimentacao4;
    public javax.swing.JTextField funcaoAlimentacao5;
    public javax.swing.JTextField funcaoAlimentacao6;
    public javax.swing.JTextField funcaoAlimentacao7;
    public javax.swing.JTextField funcaoAlimentacao8;
    public javax.swing.JTextField idAlimentacao;
    public javax.swing.JTextField idAlimentacao1;
    public javax.swing.JTextField idAlimentacao2;
    public javax.swing.JTextField idAlimentacao3;
    public javax.swing.JTextField idAlimentacao4;
    public javax.swing.JTextField idAlimentacao5;
    public javax.swing.JTextField idAlimentacao6;
    public javax.swing.JTextField idAlimentacao7;
    public javax.swing.JTextField idAlimentacao8;
    public javax.swing.JTextField jConsulta_Sinal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBotao;
    public javax.swing.JScrollPane jSConsultas10;
    public javax.swing.JScrollPane jSConsultas12;
    public javax.swing.JScrollPane jSConsultas13;
    public javax.swing.JScrollPane jSConsultas14;
    public javax.swing.JScrollPane jSConsultas15;
    public javax.swing.JScrollPane jSConsultas16;
    public javax.swing.JScrollPane jSConsultas17;
    public javax.swing.JScrollPane jSConsultas18;
    public javax.swing.JScrollPane jSConsultas19;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField pinos_Alimentacao;
    public javax.swing.JTextField pinos_Alimentacao1;
    public javax.swing.JTextField pinos_Alimentacao2;
    public javax.swing.JTextField pinos_Alimentacao3;
    public javax.swing.JTextField pinos_Alimentacao4;
    public javax.swing.JTextField pinos_Alimentacao5;
    public javax.swing.JTextField pinos_Alimentacao6;
    public javax.swing.JTextField pinos_Alimentacao7;
    public javax.swing.JTextField pinos_Alimentacao8;
    public javax.swing.JTextField referenciaAlimentacao;
    public javax.swing.JTextField referenciaAlimentacao1;
    public javax.swing.JTextField referenciaAlimentacao2;
    public javax.swing.JTextField referenciaAlimentacao3;
    public javax.swing.JTextField referenciaAlimentacao4;
    public javax.swing.JTextField referenciaAlimentacao5;
    public javax.swing.JTextField referenciaAlimentacao6;
    public javax.swing.JTextField referenciaAlimentacao7;
    public javax.swing.JTextField referenciaAlimentacao8;
    public javax.swing.JTable tabela_alarme;
    public javax.swing.JTable tabela_alimentacao;
    public javax.swing.JTable tabela_atuador;
    public javax.swing.JTable tabela_atuador2;
    public javax.swing.JTable tabela_comunicacao;
    public javax.swing.JTable tabela_injetor;
    public javax.swing.JTable tabela_pbi;
    public javax.swing.JTable tabela_sensor;
    public javax.swing.JTable tabela_sensor2;
    // End of variables declaration//GEN-END:variables

    abstract public void Salvar_Alimentacao();

    abstract public void Salvar_Atuador();

    abstract public void Salvar_Sensor();

    abstract public void Salvar_Atuador2();

    abstract public void Salvar_Sensor2();

    abstract public void Salvar_Alarme();

    abstract public void Salvar_Comunicacao();

    abstract public void Salvar_Injetor();

    abstract public void Salvar_PBI();

    abstract public void Carregar_Tabela_Alimentacao();

    abstract public void Carregar_Tabela_atuador();

    abstract public void Carregar_Tabela_atuador2();

    abstract public void Carregar_Tabela_injetor();

    abstract public void Carregar_Tabela_sensor();

    abstract public void Carregar_Tabela_sensor2();

    abstract public void Carregar_Tabela_alarme();

    abstract public void Carregar_Tabela_comunicacao();

    abstract public void Carregar_Tabela_pbi();

    abstract public void consultaTabela_Alimentacao();

    abstract public void consultaTabela_Sensor();

    abstract public void consultaTabela_Atuador();

    abstract public void consultaTabela_Sensor2();

    abstract public void consultaTabela_Atuador2();

    abstract public void consultaTabela_alarme();

    abstract public void consultaTabela_comunicacao();

    abstract public void consultaTabela_Injetor();

    abstract public void consultaTabela_PBI();

    abstract public void Alterar_Alimentacao();

    abstract public void Alterar_Atuador();

    abstract public void Alterar_Atuador2();

    abstract public void Alterar_Sensor();

    abstract public void Alterar_Sensor2();

    abstract public void Alterar_Alarme();

    abstract public void Alterar_Comunicacao();

    abstract public void Alterar_Injetor();

    abstract public void Alterar_PBI();

    private void DesabelitarCampoPino() {
        pinos_Alimentacao.setEnabled(false);
        pinos_Alimentacao1.setEnabled(false);
        pinos_Alimentacao2.setEnabled(false);
        pinos_Alimentacao3.setEnabled(false);
        pinos_Alimentacao4.setEnabled(false);
        pinos_Alimentacao5.setEnabled(false);
        pinos_Alimentacao6.setEnabled(false);
        pinos_Alimentacao7.setEnabled(false);
        pinos_Alimentacao8.setEnabled(false);
    }

    private void habilitarTextoAli() {

        funcaoAlimentacao.setEnabled(true);
        referenciaAlimentacao.setEnabled(true);
        conectorGt3_Alimentacao.setEnabled(true);
        conectorGt4_Alimentacao.setEnabled(true);
    }

    private void habilitarTextoSen() {
        funcaoAlimentacao1.setEnabled(true);
        referenciaAlimentacao1.setEnabled(true);
        conectorGt3_Alimentacao1.setEnabled(true);
        conectorGt4_Alimentacao1.setEnabled(true);
    }

    private void habilitarTextoSen2() {
        funcaoAlimentacao2.setEnabled(true);
        referenciaAlimentacao2.setEnabled(true);
        conectorGt3_Alimentacao2.setEnabled(true);
        conectorGt4_Alimentacao2.setEnabled(true);
    }

    private void habilitarTextoAtu() {
        funcaoAlimentacao3.setEnabled(true);
        referenciaAlimentacao3.setEnabled(true);
        conectorGt3_Alimentacao3.setEnabled(true);
        conectorGt4_Alimentacao3.setEnabled(true);
    }

    private void habilitarTextoAtu2() {
        funcaoAlimentacao4.setEnabled(true);
        referenciaAlimentacao4.setEnabled(true);
        conectorGt3_Alimentacao4.setEnabled(true);
        conectorGt4_Alimentacao4.setEnabled(true);
    }

    private void habilitarTextoAla() {
        funcaoAlimentacao5.setEnabled(true);
        referenciaAlimentacao5.setEnabled(true);
        conectorGt3_Alimentacao5.setEnabled(true);
        conectorGt4_Alimentacao5.setEnabled(true);
    }

    private void habilitarTextoCom() {
        funcaoAlimentacao6.setEnabled(true);
        referenciaAlimentacao6.setEnabled(true);
        conectorGt3_Alimentacao6.setEnabled(true);
        conectorGt4_Alimentacao6.setEnabled(true);
    }

    private void habilitarTextoInj() {
        funcaoAlimentacao7.setEnabled(true);
        referenciaAlimentacao7.setEnabled(true);
        conectorGt3_Alimentacao7.setEnabled(true);
        conectorGt4_Alimentacao7.setEnabled(true);
    }

    private void habilitarTextoPbi() {
        funcaoAlimentacao8.setEnabled(true);
        referenciaAlimentacao8.setEnabled(true);
        conectorGt3_Alimentacao8.setEnabled(true);
        conectorGt4_Alimentacao8.setEnabled(true);

    }

    private void limpaTexto() {
        idAlimentacao.setText("");
        idAlimentacao1.setText("");
        idAlimentacao2.setText("");
        idAlimentacao3.setText("");
        idAlimentacao4.setText("");
        idAlimentacao5.setText("");
        idAlimentacao6.setText("");
        idAlimentacao7.setText("");
        idAlimentacao8.setText("");

        funcaoAlimentacao.setText("");
        funcaoAlimentacao1.setText("");
        funcaoAlimentacao2.setText("");
        funcaoAlimentacao3.setText("");
        funcaoAlimentacao4.setText("");
        funcaoAlimentacao5.setText("");
        funcaoAlimentacao6.setText("");
        funcaoAlimentacao7.setText("");
        funcaoAlimentacao8.setText("");

        referenciaAlimentacao.setText("");
        referenciaAlimentacao1.setText("");
        referenciaAlimentacao2.setText("");
        referenciaAlimentacao3.setText("");
        referenciaAlimentacao4.setText("");
        referenciaAlimentacao5.setText("");
        referenciaAlimentacao6.setText("");
        referenciaAlimentacao7.setText("");
        referenciaAlimentacao8.setText("");

        conectorGt3_Alimentacao.setText("");
        conectorGt3_Alimentacao1.setText("");
        conectorGt3_Alimentacao2.setText("");
        conectorGt3_Alimentacao3.setText("");
        conectorGt3_Alimentacao4.setText("");
        conectorGt3_Alimentacao5.setText("");
        conectorGt3_Alimentacao6.setText("");
        conectorGt3_Alimentacao7.setText("");
        conectorGt3_Alimentacao8.setText("");

        conectorGt4_Alimentacao.setText("");
        conectorGt4_Alimentacao1.setText("");
        conectorGt4_Alimentacao2.setText("");
        conectorGt4_Alimentacao3.setText("");
        conectorGt4_Alimentacao4.setText("");
        conectorGt4_Alimentacao5.setText("");
        conectorGt4_Alimentacao6.setText("");
        conectorGt4_Alimentacao7.setText("");
        conectorGt4_Alimentacao8.setText("");

    }

    private void cursor() {
        funcaoAlimentacao.requestFocus();
        funcaoAlimentacao1.requestFocus();
        funcaoAlimentacao2.requestFocus();
        funcaoAlimentacao3.requestFocus();
        funcaoAlimentacao4.requestFocus();
        funcaoAlimentacao5.requestFocus();
        funcaoAlimentacao6.requestFocus();
        funcaoAlimentacao7.requestFocus();
        funcaoAlimentacao8.requestFocus();
    }

    private void DesbilitarId(boolean estado) {
        idAlimentacao.setEnabled(estado);
        idAlimentacao1.setEnabled(estado);
        idAlimentacao2.setEnabled(estado);
        idAlimentacao3.setEnabled(estado);
        idAlimentacao4.setEnabled(estado);
        idAlimentacao5.setEnabled(estado);
        idAlimentacao6.setEnabled(estado);
        idAlimentacao7.setEnabled(estado);
        idAlimentacao8.setEnabled(estado);

    }
}
