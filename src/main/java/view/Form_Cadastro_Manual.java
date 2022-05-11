package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import controle.Controle_Manual;
import dao.ConexaoBanco;
import util.GerarPdf;

/**
 * @author INOVA GleSantoro
 */
abstract public class Form_Cadastro_Manual extends javax.swing.JInternalFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Controle_Manual cs = new Controle_Manual();
    ResultSet resultado;
    Connection conn;
    PreparedStatement stm;

    public Form_Cadastro_Manual() throws SQLException {
        initComponents();
        habilitarCampo(false);
        habilitarBotao(true);
        txtId.setEnabled(false);
        txtId_sinal.setEnabled(false);
        IdImagem.setEnabled(false);
        MostrarIDManual();
    }

    private void AlterarSinal() {
        if (check_alimentacao.isSelected()) {
            Alterar_Alimentacao();
        }
        if (check_sensor.isSelected()) {
            Alterar_Sensor();
        }
        if (check_sensor2.isSelected()) {
            Alterar_Sensor2();
        }

        if (check_atuador.isSelected()) {
            Alterar_Atuador();
        }

        if (check_atuador2.isSelected()) {
            Alterar_Atuador2();
        }

        if (check_alarme.isSelected()) {
            Alterar_Alarme();
        }

        if (check_comunicacao.isSelected()) {
            Alterar_Comunicacao();
        }

        if (check_injetor.isSelected()) {
            Alterar_Injetor();
        }

        if (check_pbi.isSelected()) {
            Alterar_PBI();
        }
    }

    private void ExcluirSinal() {
        if (check_alimentacao.isSelected()) {
            Apagar_Alimentacao();
        }
        if (check_sensor.isSelected()) {
            Apagar_Sensor();
        }
        if (check_sensor2.isSelected()) {
            Apagar_Sensor2();
        }

        if (check_atuador.isSelected()) {
            Apagar_Atuador();
        }

        if (check_atuador2.isSelected()) {
            Apagar_Atuador2();
        }

        if (check_alarme.isSelected()) {
            Apagar_Alarme();
        }

        if (check_comunicacao.isSelected()) {
            Apagar_Comunicacao();
        }

        if (check_injetor.isSelected()) {
            Apagar_Injetor();
        }

        if (check_pbi.isSelected()) {
            Apagar_PBI();
        }
    }

    private void AtualizarTabela() {
        if (check_alimentacao.isSelected()) {
            consultaTabela_Alimentacao();
        }
        if (check_sensor.isSelected()) {
            consultaTabela_Sensor();
        }
        if (check_sensor2.isSelected()) {
            consultaTabela_Sensor2();
        }

        if (check_atuador.isSelected()) {
            consultaTabela_Atuador();
        }

        if (check_atuador2.isSelected()) {
            consultaTabela_Atuador2();
        }

        if (check_alarme.isSelected()) {
            consultaTabela_Alarme();
        }

        if (check_comunicacao.isSelected()) {
            consultaTabela_Comunicacao();
        }

        if (check_injetor.isSelected()) {
            consultaTabela_Injetor();
        }

        if (check_pbi.isSelected()) {
            consultaTabela_PBI();
        }
    }

    /*
MODSTRAR ID
     */
    public void MostrarIDManual(Object... valor) throws SQLException {
        String SQL_ID = "SELECT max(id) from manual";
        conn = ConexaoBanco.abreConexao();
        stm = ConexaoBanco.abreConexao().prepareStatement(SQL_ID);
        try {
            resultado = stm.executeQuery();
            if (resultado.next()) {
                txtId.setText(resultado.getString(1));
            }
        } catch (Exception e) {
            System.out.println("erro + " + e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBotao = new javax.swing.JPanel();
        btnNovoCadastro = new javax.swing.JButton();
        btnAlterarCadastro = new javax.swing.JButton();
        btnExcluirCadastro = new javax.swing.JButton();
        btnVisualizarCadastro = new javax.swing.JButton();
        btnSalvarCadastro = new javax.swing.JButton();
        btnCancelarCadastro = new javax.swing.JButton();
        btnFecharCadastro = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        cbMontadora = new javax.swing.JComboBox<>();
        cbMontadora1 = new javax.swing.JComboBox<>();
        cbImobilizador = new javax.swing.JComboBox<>();
        cbGT = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        cbModelo = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtId_sinal = new javax.swing.JTextField();
        txtFuncao = new javax.swing.JTextField();
        txtReferencia = new javax.swing.JTextField();
        txtPino = new javax.swing.JTextField();
        txtGt3 = new javax.swing.JTextField();
        txtGt4 = new javax.swing.JTextField();
        btnAlterarPinosCentral = new javax.swing.JButton();
        btnCarregarTabelaSinal = new javax.swing.JButton();
        btnAdicionarTexto = new javax.swing.JButton();
        btnExcluirPinosCentral = new javax.swing.JButton();
        check_alimentacao = new javax.swing.JCheckBox();
        check_sensor = new javax.swing.JCheckBox();
        check_sensor2 = new javax.swing.JCheckBox();
        check_atuador = new javax.swing.JCheckBox();
        check_atuador2 = new javax.swing.JCheckBox();
        check_alarme = new javax.swing.JCheckBox();
        check_comunicacao = new javax.swing.JCheckBox();
        check_injetor = new javax.swing.JCheckBox();
        check_painel = new javax.swing.JCheckBox();
        check_bc = new javax.swing.JCheckBox();
        check_imobilizador = new javax.swing.JCheckBox();
        check_pbi = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        caixaObservacao = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jSConsultas1 = new javax.swing.JScrollPane();
        tabela_manualTotal = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jConsultas_manualTotal = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jSConsultas = new javax.swing.JScrollPane();
        tabela_Sinal = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jConsultas_manua = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jImagem = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        IdImagem = new javax.swing.JTextField();
        txtCaminho = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        jConsulta_Imagem1 = new javax.swing.JTextField();
        btnAlterarImagem = new javax.swing.JButton();
        btnExcluirImagem = new javax.swing.JButton();
        btnEnviarImagem = new javax.swing.JButton();
        btnAdicionarImagem = new javax.swing.JButton();
        jSConsultas3 = new javax.swing.JScrollPane();
        tabelaImagem = new javax.swing.JTable();
        txtSinal = new javax.swing.JTextField();
        btnSalvarCadastro1 = new javax.swing.JButton();

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

        btnExcluirCadastro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnExcluirCadastro.setForeground(new java.awt.Color(0, 0, 153));
        btnExcluirCadastro.setText("EXCLUIR");
        btnExcluirCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCadastroActionPerformed(evt);
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

        btnSalvarCadastro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSalvarCadastro.setForeground(new java.awt.Color(0, 0, 153));
        btnSalvarCadastro.setText("SALVAR");
        btnSalvarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCadastroActionPerformed(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterarCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExcluirCadastro)
                .addGap(50, 50, 50)
                .addComponent(btnVisualizarCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelarCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 385, Short.MAX_VALUE)
                .addComponent(btnFecharCadastro)
                .addGap(42, 42, 42))
        );
        jPanelBotaoLayout.setVerticalGroup(
            jPanelBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoCadastro)
                    .addComponent(btnAlterarCadastro)
                    .addComponent(btnExcluirCadastro)
                    .addComponent(btnVisualizarCadastro)
                    .addComponent(btnSalvarCadastro)
                    .addComponent(btnCancelarCadastro)
                    .addComponent(btnFecharCadastro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("ID");
        jLabel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Descrição Montadora");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Modelo/ Sistema Injeção");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Imobilizador");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Simulador");

        txtId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        cbMontadora.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbMontadora.setForeground(new java.awt.Color(153, 153, 153));
        cbMontadora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cbMontadora.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                cbMontadoraAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        cbMontadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMontadoraActionPerformed(evt);
            }
        });

        cbMontadora1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbMontadora1.setForeground(new java.awt.Color(153, 153, 153));
        cbMontadora1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        cbImobilizador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbImobilizador.setForeground(new java.awt.Color(153, 153, 153));
        cbImobilizador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        cbGT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbGT.setForeground(new java.awt.Color(153, 153, 153));
        cbGT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        cbModelo.setBackground(new java.awt.Color(153, 153, 153));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Referencia");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Função");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Pinos da Central");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Conector GT3");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Conector GT4");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("ID");
        jLabel12.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel12AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        txtId_sinal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtFuncao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtFuncao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFuncaoActionPerformed(evt);
            }
        });

        txtReferencia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtReferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReferenciaActionPerformed(evt);
            }
        });

        txtPino.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPinoActionPerformed(evt);
            }
        });

        txtGt3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtGt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGt3ActionPerformed(evt);
            }
        });

        txtGt4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtGt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGt4ActionPerformed(evt);
            }
        });

        btnAlterarPinosCentral.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAlterarPinosCentral.setForeground(new java.awt.Color(0, 0, 153));
        btnAlterarPinosCentral.setText("Alterar");
        btnAlterarPinosCentral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarPinosCentralActionPerformed(evt);
            }
        });

        btnCarregarTabelaSinal.setForeground(new java.awt.Color(0, 0, 153));
        btnCarregarTabelaSinal.setText("Carregar Tabela");
        btnCarregarTabelaSinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarTabelaSinalActionPerformed(evt);
            }
        });

        btnAdicionarTexto.setText("Adicionar texto");
        btnAdicionarTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarTextoActionPerformed(evt);
            }
        });

        btnExcluirPinosCentral.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnExcluirPinosCentral.setForeground(new java.awt.Color(0, 0, 153));
        btnExcluirPinosCentral.setText("Ecluir");
        btnExcluirPinosCentral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirPinosCentralActionPerformed(evt);
            }
        });

        check_alimentacao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        check_alimentacao.setText("ALIMENTAÇÃO");
        check_alimentacao.setAutoscrolls(true);

        check_sensor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        check_sensor.setText("SENSORES 1");

        check_sensor2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        check_sensor2.setText("SENSORES 2");

        check_atuador.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        check_atuador.setText("ATUADORES 1");

        check_atuador2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        check_atuador2.setText("ATUADORES 2");

        check_alarme.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        check_alarme.setText("ALARME");

        check_comunicacao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        check_comunicacao.setText("COMUNICAÇÃO");

        check_injetor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        check_injetor.setText("INJETOR DIESEL");

        check_painel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        check_painel.setText("PAINEL");

        check_bc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        check_bc.setText("BC");

        check_imobilizador.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        check_imobilizador.setText("IMOBILIZADOR");

        check_pbi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        check_pbi.setText("PAINEL / BC / IMOBILIZADOR");

        caixaObservacao.setColumns(20);
        caixaObservacao.setRows(5);
        jScrollPane2.setViewportView(caixaObservacao);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        tabela_manualTotal.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tabela_manualTotal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "MODELO", "MONTADORA", "IMOBILIZADOR", "SIMULADOR", "IMAGEM", "OBS:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_manualTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_manualTotalMouseClicked(evt);
            }
        });
        jSConsultas1.setViewportView(tabela_manualTotal);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Consulta");

        jConsultas_manualTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultas_manualTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jSConsultas1, javax.swing.GroupLayout.PREFERRED_SIZE, 1112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jConsultas_manualTotal)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jConsultas_manualTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSConsultas1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        tabela_Sinal.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tabela_Sinal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "FUNÇÃO", "PINOS DA CENTRAL", "REFERENCIA", "CONECTOR GT3", "CONECTOR GT4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_Sinal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_SinalMouseClicked(evt);
            }
        });
        jSConsultas.setViewportView(tabela_Sinal);

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Consulta");

        jConsultas_manua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultas_manuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(jConsultas_manua, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jConsultas_manua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSConsultas, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        jImagem.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Imagem");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("ID");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Caminho");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Nome");

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Consulta");

        txtCaminho.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCaminho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCaminhoActionPerformed(evt);
            }
        });

        txtNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jConsulta_Imagem1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jConsulta_Imagem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsulta_Imagem1ActionPerformed(evt);
            }
        });

        btnAlterarImagem.setText("Atualizar");
        btnAlterarImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarImagemActionPerformed(evt);
            }
        });

        btnExcluirImagem.setText("Excluir");
        btnExcluirImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirImagemActionPerformed(evt);
            }
        });

        btnEnviarImagem.setText("Enviar");
        btnEnviarImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarImagemActionPerformed(evt);
            }
        });

        btnAdicionarImagem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAdicionarImagem.setText("Adicionar");
        btnAdicionarImagem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdicionarImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarImagemActionPerformed(evt);
            }
        });

        tabelaImagem.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tabelaImagem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ARQUIVO", "IMAGEM"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaImagem.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabelaImagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaImagemMouseClicked(evt);
            }
        });
        jSConsultas3.setViewportView(tabelaImagem);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(25, 25, 25)
                        .addComponent(txtCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnEnviarImagem))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(IdImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel19)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAdicionarImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(45, 45, 45)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btnAlterarImagem))
                            .addComponent(btnExcluirImagem, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jConsulta_Imagem1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jSConsultas3, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(IdImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel23)
                    .addComponent(jConsulta_Imagem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionarImagem))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel22)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEnviarImagem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnExcluirImagem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAlterarImagem))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jSConsultas3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addGap(6, 6, 6))))
        );

        txtSinal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSinal.setForeground(new java.awt.Color(0, 51, 153));

        btnSalvarCadastro1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSalvarCadastro1.setForeground(new java.awt.Color(0, 0, 153));
        btnSalvarCadastro1.setText("SALVAR TABELA");
        btnSalvarCadastro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCadastro1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cbModeloLayout = new javax.swing.GroupLayout(cbModelo);
        cbModelo.setLayout(cbModeloLayout);
        cbModeloLayout.setHorizontalGroup(
            cbModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cbModeloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cbModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cbModeloLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cbModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cbModeloLayout.createSequentialGroup()
                                .addGroup(cbModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(cbModeloLayout.createSequentialGroup()
                                        .addComponent(check_alimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(check_atuador2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(cbModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cbModeloLayout.createSequentialGroup()
                                            .addComponent(check_sensor2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(check_comunicacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cbModeloLayout.createSequentialGroup()
                                            .addComponent(check_sensor, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(check_alarme, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(8, 8, 8)
                                .addGroup(cbModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(check_painel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(check_bc, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(check_imobilizador, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(141, 141, 141)
                                .addGroup(cbModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(cbModeloLayout.createSequentialGroup()
                                        .addComponent(jScrollPane2)
                                        .addGap(457, 457, 457))
                                    .addGroup(cbModeloLayout.createSequentialGroup()
                                        .addComponent(btnAdicionarTexto)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(cbModeloLayout.createSequentialGroup()
                                .addGroup(cbModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(cbModeloLayout.createSequentialGroup()
                                        .addComponent(check_atuador, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(check_injetor)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(check_pbi, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(cbModeloLayout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(txtId_sinal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCarregarTabelaSinal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtSinal, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSalvarCadastro1)))
                                .addContainerGap(620, Short.MAX_VALUE))))
                    .addGroup(cbModeloLayout.createSequentialGroup()
                        .addGroup(cbModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cbModeloLayout.createSequentialGroup()
                                .addGroup(cbModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(cbModeloLayout.createSequentialGroup()
                                        .addGroup(cbModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10))
                                        .addGap(22, 22, 22)
                                        .addGroup(cbModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtGt3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtGt4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cbModeloLayout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(btnExcluirPinosCentral)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                        .addComponent(btnAlterarPinosCentral))
                                    .addGroup(cbModeloLayout.createSequentialGroup()
                                        .addGroup(cbModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(cbModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtPino, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                            .addComponent(txtReferencia))))
                                .addGap(26, 26, 26)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        cbModeloLayout.setVerticalGroup(
            cbModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cbModeloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cbModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cbModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(check_painel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(cbModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(check_alimentacao)
                            .addComponent(check_atuador2)))
                    .addComponent(btnAdicionarTexto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cbModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cbModeloLayout.createSequentialGroup()
                        .addGroup(cbModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(check_sensor)
                            .addComponent(check_alarme)
                            .addComponent(check_bc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cbModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(check_sensor2)
                            .addComponent(check_comunicacao)
                            .addComponent(check_imobilizador))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cbModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(check_atuador)
                            .addComponent(check_injetor)
                            .addComponent(check_pbi)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(cbModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cbModeloLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(cbModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtId_sinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cbModeloLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cbModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCarregarTabelaSinal)
                            .addComponent(txtSinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalvarCadastro1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(cbModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cbModeloLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(cbModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cbModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtPino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(cbModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtGt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cbModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtGt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(cbModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAlterarPinosCentral, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcluirPinosCentral, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(316, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(cbModelo);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbMontadora, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cbMontadora1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbImobilizador, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbGT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(105, 105, 105)
                        .addComponent(jLabel4)
                        .addGap(176, 176, 176)
                        .addComponent(jLabel13)))
                .addContainerGap(346, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMontadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMontadora1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbImobilizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbGT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBotao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoCadastroActionPerformed
        habilitarCampo(true);
        habilitarBotao(false);
        txtId.setEnabled(false);
        btnExcluirCadastro.setEnabled(true);
        limpaTexto();
        try {
            MostrarIDManual();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnNovoCadastroActionPerformed

    private void btnAlterarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarCadastroActionPerformed
        habilitarCampo(true);
        habilitarBotao(false);
    }//GEN-LAST:event_btnAlterarCadastroActionPerformed

    private void btnExcluirCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCadastroActionPerformed

    }//GEN-LAST:event_btnExcluirCadastroActionPerformed

    private void btnVisualizarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarCadastroActionPerformed
        habilitarBotao(true);
        btnSalvarCadastro.setEnabled(true);
        try {
            GerarPdf pdf = new GerarPdf();
            pdf.getClass();
        } catch (Exception e) {
            System.out.println("Formulario Principal PDF " + e);
        }

//        try {
//            Form_GerarPdf pdf = new Form_GerarPdf();
//            pdf.getClass();
//        } catch (Exception e) {
//            System.out.println("Formulario Principal PDF " + e);
//        }
    }//GEN-LAST:event_btnVisualizarCadastroActionPerformed

    private void btnSalvarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCadastroActionPerformed
        habilitarBotao(true);
        btnSalvarCadastro.setEnabled(true);
        btnVisualizarCadastro.setEnabled(true);
        btnExcluirCadastro.setEnabled(true);
        consultaTabela_Manual();
        Salvar_Manual();
        try {
            MostrarIDManual();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " ID Manual" + e);
        }
    }//GEN-LAST:event_btnSalvarCadastroActionPerformed

    private void btnCancelarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCadastroActionPerformed
        habilitarBotao(true);
        btnSalvarCadastro.setEnabled(true);
        btnVisualizarCadastro.setEnabled(true);
        limpaTexto();
    }//GEN-LAST:event_btnCancelarCadastroActionPerformed

    private void btnFecharCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharCadastroActionPerformed
        dispose();
        limpaTexto();
    }//GEN-LAST:event_btnFecharCadastroActionPerformed

    private void jLabel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel1AncestorAdded

    }//GEN-LAST:event_jLabel1AncestorAdded

    private void txtFuncaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFuncaoActionPerformed

    }//GEN-LAST:event_txtFuncaoActionPerformed

    private void cbMontadoraAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cbMontadoraAncestorAdded

    }//GEN-LAST:event_cbMontadoraAncestorAdded

    private void txtPinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPinoActionPerformed

    private void txtGt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGt3ActionPerformed

    private void txtGt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGt4ActionPerformed

    private void btnAlterarPinosCentralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarPinosCentralActionPerformed
        AlterarSinal();
        btnAlterarPinosCentral.setEnabled(true);
        AtualizarTabela();
        LimparCampoSinal();
    }//GEN-LAST:event_btnAlterarPinosCentralActionPerformed

    private void jLabel12AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel12AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12AncestorAdded

    private void btnCarregarTabelaSinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarTabelaSinalActionPerformed
        DefaultTableModel modelo_AL = new DefaultTableModel();
        String texto;
        CarregarCampos();
        LimparCampoSinal();

        if (check_alimentacao.isSelected() == true) {
            JOptionPane.showMessageDialog(this, " Alimentação " + "\n " + modelo_AL.getDataVector());
            modelo_AL.setNumRows(0);
        }
    }//GEN-LAST:event_btnCarregarTabelaSinalActionPerformed

    private void jConsultas_manuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultas_manuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jConsultas_manuaActionPerformed

    private void tabela_SinalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_SinalMouseClicked
        CarregarCampoSinal();
    }//GEN-LAST:event_tabela_SinalMouseClicked

    private void btnAdicionarImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarImagemActionPerformed
        BuscarImagens();
    }//GEN-LAST:event_btnAdicionarImagemActionPerformed

    private void cbMontadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMontadoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMontadoraActionPerformed

    private void txtReferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReferenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReferenciaActionPerformed

    private void jConsultas_manualTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultas_manualTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jConsultas_manualTotalActionPerformed

    private void tabela_manualTotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_manualTotalMouseClicked
        Carregar_Tabela_Manual();
    }//GEN-LAST:event_tabela_manualTotalMouseClicked

    private void btnAdicionarTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdicionarTextoActionPerformed

    private void btnAlterarImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarImagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarImagemActionPerformed

    private void txtCaminhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCaminhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCaminhoActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnExcluirImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirImagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirImagemActionPerformed

    private void tabelaImagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaImagemMouseClicked
        Carregar_Tabela_Imagem();
    }//GEN-LAST:event_tabelaImagemMouseClicked

    private void jConsulta_Imagem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsulta_Imagem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jConsulta_Imagem1ActionPerformed

    private void btnEnviarImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarImagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnviarImagemActionPerformed

    private void btnExcluirPinosCentralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirPinosCentralActionPerformed
        ExcluirSinal();
        AtualizarTabela();
        LimparCampoSinal();
    }//GEN-LAST:event_btnExcluirPinosCentralActionPerformed

    private void btnSalvarCadastro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCadastro1ActionPerformed
        SalvarTabelaSinais();
    }//GEN-LAST:event_btnSalvarCadastro1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField IdImagem;
    private javax.swing.JButton btnAdicionarImagem;
    public javax.swing.JButton btnAdicionarTexto;
    private javax.swing.JButton btnAlterarCadastro;
    public javax.swing.JButton btnAlterarImagem;
    private javax.swing.JButton btnAlterarPinosCentral;
    private javax.swing.JButton btnCancelarCadastro;
    public javax.swing.JButton btnCarregarTabelaSinal;
    public javax.swing.JButton btnEnviarImagem;
    private javax.swing.JButton btnExcluirCadastro;
    public javax.swing.JButton btnExcluirImagem;
    private javax.swing.JButton btnExcluirPinosCentral;
    private javax.swing.JButton btnFecharCadastro;
    private javax.swing.JButton btnNovoCadastro;
    private javax.swing.JButton btnSalvarCadastro;
    private javax.swing.JButton btnSalvarCadastro1;
    private javax.swing.JButton btnVisualizarCadastro;
    public javax.swing.JTextArea caixaObservacao;
    public javax.swing.JComboBox<Object> cbGT;
    public javax.swing.JComboBox<Object> cbImobilizador;
    private javax.swing.JPanel cbModelo;
    public javax.swing.JComboBox<Object> cbMontadora;
    public javax.swing.JComboBox<Object> cbMontadora1;
    public javax.swing.JCheckBox check_alarme;
    public javax.swing.JCheckBox check_alimentacao;
    public javax.swing.JCheckBox check_atuador;
    public javax.swing.JCheckBox check_atuador2;
    public javax.swing.JCheckBox check_bc;
    public javax.swing.JCheckBox check_comunicacao;
    public javax.swing.JCheckBox check_imobilizador;
    public javax.swing.JCheckBox check_injetor;
    public javax.swing.JCheckBox check_painel;
    public javax.swing.JCheckBox check_pbi;
    public javax.swing.JCheckBox check_sensor;
    public javax.swing.JCheckBox check_sensor2;
    public javax.swing.JTextField jConsulta_Imagem1;
    public javax.swing.JTextField jConsultas_manua;
    public javax.swing.JTextField jConsultas_manualTotal;
    public javax.swing.JLabel jImagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelBotao;
    public javax.swing.JScrollPane jSConsultas;
    public javax.swing.JScrollPane jSConsultas1;
    public javax.swing.JScrollPane jSConsultas3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable tabelaImagem;
    public javax.swing.JTable tabela_Sinal;
    public javax.swing.JTable tabela_manualTotal;
    public javax.swing.JTextField txtCaminho;
    public javax.swing.JTextField txtFuncao;
    public javax.swing.JTextField txtGt3;
    public javax.swing.JTextField txtGt4;
    public javax.swing.JTextField txtId;
    public javax.swing.JTextField txtId_sinal;
    public javax.swing.JTextField txtNome;
    public javax.swing.JTextField txtPino;
    public javax.swing.JTextField txtReferencia;
    public javax.swing.JTextField txtSinal;
    // End of variables declaration//GEN-END:variables

    private void habilitarBotao(boolean estado) {
        btnNovoCadastro.setEnabled(estado);
        btnAlterarCadastro.setEnabled(estado);
        btnExcluirCadastro.setEnabled(estado);
        btnVisualizarCadastro.setEnabled(!estado);
        btnSalvarCadastro.setEnabled(!estado);
        btnCancelarCadastro.setEnabled(!estado);
        btnCarregarTabelaSinal.setEnabled(!estado);
        btnAlterarPinosCentral.setEnabled(!estado);
        btnExcluirPinosCentral.setEnabled(!estado);
        btnAdicionarTexto.setEnabled(!estado);
        btnAdicionarImagem.setEnabled(!estado);
        btnEnviarImagem.setEnabled(!estado);
        btnAlterarImagem.setEnabled(!estado);
        btnExcluirImagem.setEnabled(!estado);

    }

    public void habilitarBotaoSinal(boolean estado) {
        btnVisualizarCadastro.setEnabled(!estado);//Desativado
        btnSalvarCadastro.setEnabled(!estado);
        btnCancelarCadastro.setEnabled(!estado);
    }

    private void habilitarCampo(boolean estado) {
        txtPino.setEnabled(estado);
        txtGt4.setEnabled(estado);
        txtGt3.setEnabled(estado);
        txtFuncao.setEnabled(false);
        txtReferencia.setEnabled(false);
        txtCaminho.setEnabled(false);
        cbImobilizador.setEnabled(estado);
        cbModelo.setEnabled(estado);
        cbMontadora.setEnabled(estado);
        cbMontadora1.setEnabled(estado);
        cbGT.setEnabled(estado);
        check_alarme.setEnabled(estado);
        check_alimentacao.setEnabled(estado);
        check_atuador.setEnabled(estado);
        check_bc.setEnabled(estado);
        check_comunicacao.setEnabled(estado);
        check_imobilizador.setEnabled(estado);
        check_injetor.setEnabled(estado);
        check_painel.setEnabled(estado);
        check_pbi.setEnabled(estado);
        check_sensor.setEnabled(estado);
        check_sensor2.setEnabled(estado);
        check_atuador2.setEnabled(estado);
        caixaObservacao.setEnabled(estado);

    }

    private void limpaTexto() {
        txtId_sinal.setText("");
        txtFuncao.setText("");
        txtGt3.setText("");
        txtGt3.setText("");
        txtPino.setText("");
        txtGt4.setText("");
    }

    private void limpar() {
        IdImagem.setText("");
        txtCaminho.setText("");
        txtNome.setText("");
    }

    private void LimparCampoSinal() {
        txtId_sinal.setText("");
        txtFuncao.setText("");
        txtPino.setText("");
        txtReferencia.setText("");
        txtGt3.setText("");
        txtGt4.setText("");

    }

    private void CarregarCampoSinal() {
        int setar = tabela_Sinal.getSelectedRow();
        txtId_sinal.setText(tabela_Sinal.getModel().getValueAt(setar, 0).toString());
        txtFuncao.setText(tabela_Sinal.getModel().getValueAt(setar, 1).toString());
        txtPino.setText(tabela_Sinal.getModel().getValueAt(setar, 2).toString());
        txtReferencia.setText(tabela_Sinal.getModel().getValueAt(setar, 3).toString());
        txtGt3.setText(tabela_Sinal.getModel().getValueAt(setar, 4).toString());
        txtGt4.setText(tabela_Sinal.getModel().getValueAt(setar, 5).toString());
    }

    abstract public void UpdateManual();

    abstract public void Alterar_Alimentacao();

    abstract public void Alterar_Atuador();

    abstract public void Alterar_Atuador2();

    abstract public void Alterar_Sensor();

    abstract public void Alterar_Sensor2();

    abstract public void Alterar_Alarme();

    abstract public void Alterar_Comunicacao();

    abstract public void Alterar_Injetor();

    abstract public void Alterar_PBI();

    abstract public void consultaTabela_Alimentacao();

    abstract public void consultaTabela_Sensor();

    abstract public void consultaTabela_Sensor2();

    abstract public void consultaTabela_Atuador();

    abstract public void consultaTabela_Atuador2();

    abstract public void consultaTabela_Alarme();

    abstract public void consultaTabela_Comunicacao();

    abstract public void consultaTabela_Injetor();

    abstract public void consultaTabela_PBI();

    abstract public void Apagar_Alimentacao();

    abstract public void Apagar_Atuador();

    abstract public void Apagar_Atuador2();

    abstract public void Apagar_Sensor();

    abstract public void Apagar_Sensor2();

    abstract public void Apagar_Alarme();

    abstract public void Apagar_Comunicacao();

    abstract public void Apagar_Injetor();

    abstract public void Apagar_PBI();

    abstract public void ComboBox_Montadora();

    abstract public void ComboBox_Modelo();

    abstract public void ComboBox_Imobilizador();

    abstract public void ComboBox_Simulador();

    abstract public void CarregarCampos();

    abstract public void BuscarImagens();

    abstract public void consultaTabela_Manual();

    abstract public void Salvar_Manual();

    abstract public void EnviarImagemProjeto();

    abstract public void Salvar_Imagem();

    abstract public void consultaTabela_Imagem();

    abstract public void Carregar_Tabela_Imagem();

    abstract public void Carregar_Tabela_Manual();

    abstract public void SalvarTabelaSinais();
}
