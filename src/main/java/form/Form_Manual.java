package form;

import controle.Controle_Manual;
import controle.Controle_Sinal;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import view.Form_Cadastro_Manual;

/**
 * @author INOVA
 */
public class Form_Manual extends Form_Cadastro_Manual {

    Controle_Manual tm = new Controle_Manual();
    Controle_Sinal ts = new Controle_Sinal();
    JFileChooser fc = new JFileChooser();
    BufferedImage imagem;

    public Form_Manual() {
        setTitle(" EDITOR DO MANUAL ");
        ComboBox_Montadora();
        ComboBox_Modelo();
        ComboBox_Imobilizador();
        ComboBox_Simulador();
        consultaTabela_Imagem();
        consultaTabela_Manual();
    }

    /*
SALVAR
     */
    @Override
    public void Salvar_Imagem() {

        tm.SalvarControleImagem(
                IdImagem.getText(),
                txtCaminho.getText(),
                txtNome.getText()
        );
    }

    @Override
    public void Salvar_Manual() {
        tm.salvaControleManual(
                txtId.getText(),
                cbMontadora.getSelectedItem(),
                cbMontadora1.getSelectedItem(),
                cbImobilizador.getSelectedItem(),
                cbGT.getSelectedItem(),
                txtCaminho.getText(),
                caixaObservacao.getText()
        );
    }


    /*
CONSULTA
     */
    @Override
    public void consultaTabela_Imagem() {
        DefaultTableModel modelo = (DefaultTableModel) tabelaImagem.getModel();
        modelo.setNumRows(0);
        tm.consultaControleImagem(jConsulta_Imagem1.getText(), modelo);
    }

    @Override
    public void consultaTabela_Manual() {
        DefaultTableModel modelo = (DefaultTableModel) tabela_manualTotal.getModel();
        modelo.setNumRows(0);
        tm.consultaControleManual(jConsultas_manualTotal.getText(), modelo);
    }

    /*
CONSULTAR SINAIS
     */
    @Override
    public void consultaTabela_Alimentacao() {
        DefaultTableModel modelo_AL = (DefaultTableModel) tabela_Sinal.getModel();
        modelo_AL.setNumRows(0);
        ts.consultaControleAlimentacao(jConsultas_manua.getText(), modelo_AL);
    }

    @Override
    public void consultaTabela_Sensor() {
        DefaultTableModel modelo_S = (DefaultTableModel) tabela_Sinal.getModel();
        modelo_S.setNumRows(0);
        ts.consultaControleSensor(jConsultas_manua.getText(), modelo_S);
    }

    @Override
    public void consultaTabela_Sensor2() {
        DefaultTableModel modelo_S2 = (DefaultTableModel) tabela_Sinal.getModel();
        modelo_S2.setNumRows(0);
        ts.consultaControleSensor2(jConsultas_manua.getText(), modelo_S2);
    }

    @Override
    public void consultaTabela_Atuador() {
        DefaultTableModel modelo_AT = (DefaultTableModel) tabela_Sinal.getModel();
        modelo_AT.setNumRows(0);
        ts.consultaControleAtuador(jConsultas_manua.getText(), modelo_AT);
    }

    @Override
    public void consultaTabela_Atuador2() {
        DefaultTableModel modelo_AT2 = (DefaultTableModel) tabela_Sinal.getModel();
        modelo_AT2.setNumRows(0);
        ts.consultaControleAtuador2(jConsultas_manua.getText(), modelo_AT2);
    }

    @Override
    public void consultaTabela_Alarme() {
        DefaultTableModel modelo_AM = (DefaultTableModel) tabela_Sinal.getModel();
        modelo_AM.setNumRows(0);
        ts.consultaControleAlarme(jConsultas_manua.getText(), modelo_AM);
    }

    @Override
    public void consultaTabela_Comunicacao() {
        DefaultTableModel modelo_CO = (DefaultTableModel) tabela_Sinal.getModel();
        modelo_CO.setNumRows(0);
        ts.consultaControleComunicacao(jConsultas_manua.getText(), modelo_CO);
    }

    @Override
    public void consultaTabela_Injetor() {
        DefaultTableModel modelo_I = (DefaultTableModel) tabela_Sinal.getModel();
        modelo_I.setNumRows(0);
        ts.consultaControleInjetor(jConsultas_manua.getText(), modelo_I);
    }

    @Override
    public void consultaTabela_PBI() {
        DefaultTableModel modelo_PBI = (DefaultTableModel) tabela_Sinal.getModel();
        modelo_PBI.setNumRows(0);
        ts.consultaControlePBI(jConsultas_manua.getText(), modelo_PBI);
    }

    /*
APAGAR
     */
    @Override
    public void Apagar_Alimentacao() {
        ts.ExcluirControleAlimentacao(
                txtId_sinal.getText()
        );
    }

    @Override
    public void Apagar_Atuador() {
        ts.ExcluirControleAlimentacao(
                txtId_sinal.getText()
        );
    }

    @Override
    public void Apagar_Atuador2() {
        ts.ExcluirControleAtuador2(
                txtId_sinal.getText()
        );
    }

    @Override
    public void Apagar_Sensor() {
        ts.ExcluirControleAlimentacao(
                txtId_sinal.getText()
        );
    }

    @Override
    public void Apagar_Sensor2() {
        ts.ExcluirControleSensor2(
                txtId_sinal.getText()
        );
    }

    @Override
    public void Apagar_Alarme() {
        ts.ExcluirControleAlarme(
                txtId_sinal.getText()
        );
    }

    @Override
    public void Apagar_Comunicacao() {
        ts.ExcluirControleComunicacao(
                txtId_sinal.getText()
        );
    }

    @Override
    public void Apagar_Injetor() {
        ts.ExcluirControleAlimentacao(
                txtId_sinal.getText()
        );
    }

    @Override
    public void Apagar_PBI() {
        ts.ExcluirControleAlimentacao(
                txtId_sinal.getText()
        );
    }

    /*
COMBOBOX
     */
    @Override
    public void ComboBox_Montadora() {
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cbMontadora.getModel();
        modelo.addElement(1);
        tm.comboBoxControleMontadora(cbMontadora.getItemAt(1), modelo);
    }

    @Override
    public void ComboBox_Modelo() {
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cbMontadora1.getModel();
        modelo.addElement(1);
        tm.comboBoxControleModelo(cbMontadora1.getItemAt(1), modelo);
    }

    @Override
    public void ComboBox_Imobilizador() {
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cbImobilizador.getModel();
        modelo.addElement(1);
        tm.comboBoxControleImobilizador(cbImobilizador.getItemAt(1), modelo);
    }

    @Override
    public void ComboBox_Simulador() {
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cbGT.getModel();
        modelo.addElement(1);
        tm.comboBoxControleSimulador(cbGT.getItemAt(1), modelo);

    }

    /*
CARREGAR TABELA
     */
    @Override
    public void Carregar_Tabela_Imagem() {
        int setar = tabelaImagem.getSelectedRow();
        IdImagem.setText(tabelaImagem.getModel().getValueAt(setar, 0).toString());
        txtCaminho.setText(tabelaImagem.getModel().getValueAt(setar, 1).toString());
        txtNome.setText(tabelaImagem.getModel().getValueAt(setar, 2).toString());
        ImageIcon img = new ImageIcon(txtCaminho.getText());
        jImagem.setIcon(new ImageIcon(img.getImage().getScaledInstance(jImagem.getWidth(), jImagem.getHeight(), Image.SCALE_DEFAULT)));

    }

    @Override
    public void Carregar_Tabela_Manual() {
        int setar = tabela_manualTotal.getSelectedRow();
        txtId.setText(tabela_manualTotal.getModel().getValueAt(setar, 0).toString());
        cbMontadora.setSelectedItem(tabela_manualTotal.getModel().getValueAt(setar, 1).toString());
        cbMontadora1.setSelectedItem(tabela_manualTotal.getModel().getValueAt(setar, 2).toString());
        cbImobilizador.setSelectedItem(tabela_manualTotal.getModel().getValueAt(setar, 3).toString());
        cbGT.setSelectedItem(tabela_manualTotal.getModel().getValueAt(setar, 4).toString());
        ImageIcon img = new ImageIcon(txtCaminho.getText());
        jImagem.setIcon(new ImageIcon(img.getImage().getScaledInstance(jImagem.getWidth(), jImagem.getHeight(), Image.SCALE_DEFAULT)));
        caixaObservacao.setText(tabela_manualTotal.getModel().getValueAt(setar, 9).toString());

    }

    /*
IMAGEM
     */
    @Override
    public void BuscarImagens() {
        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("Selecione uma foto ");
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int res = fc.showOpenDialog(this);

        if (res == JFileChooser.APPROVE_OPTION) {
            File file = new File("");
            file = fc.getSelectedFile();
            String fileName = file.getAbsolutePath();
            txtCaminho.setText(fileName);
            try {
                ImageIcon img = new ImageIcon(txtCaminho.getText());
                jImagem.setIcon(new ImageIcon(img.getImage().getScaledInstance(jImagem.getWidth(), jImagem.getHeight(), Image.SCALE_DEFAULT)));
            } catch (Exception ex) {
            }
        } else {
            JOptionPane.showMessageDialog(null, "Voce nao selecionou nenhum arquivo.");
        }
    }

    @Override
    public void EnviarImagemProjeto() {
        try {
            // TODO add your handling code here:
            String caminho = getClass().getResource("./image/").toString().substring(5);
            File outputfile = new File(caminho + " imagem.png");
            ImageIO.write(imagem, "png", outputfile);
            JOptionPane.showMessageDialog(rootPane, "Imagem enviada com sucesso");
        } catch (IOException ex) {
            System.out.println("Erro ao enviar Imagem " + ex);
        }
    }


    /*
ALTERAR
     */
    @Override
    public void UpdateManual() {
        tm.AlterarControleManual(
                txtId.getText(),
                cbMontadora.getSelectedIndex(),
                cbMontadora1.getSelectedIndex(),
                cbImobilizador.getSelectedIndex(),
                check_alimentacao.isSelected(),
                check_sensor.isSelected(),
                check_sensor2.isSelected(),
                check_atuador.isSelected(),
                check_atuador2.isSelected(),
                check_alarme.isSelected(),
                check_comunicacao.isSelected(),
                check_injetor.isSelected(),
                check_pbi.isSelected(),
                caixaObservacao.getText()
        );
        System.out.println("Formulario Update manual");
    }

    @Override
    public void Alterar_Alimentacao() {
        ts.AlterarControleAlimentacao(
                txtId_sinal.getText(),
                txtFuncao.getText(),
                txtPino.getText(),
                txtReferencia.getText(),
                txtGt3.getText(),
                txtGt4.getText()
        );
    }

    @Override
    public void Alterar_Atuador() {
        ts.AlterarControleAtuador(
                txtId_sinal.getText(),
                txtFuncao.getText(),
                txtPino.getText(),
                txtReferencia.getText(),
                txtGt3.getText(),
                txtGt4.getText()
        );
    }

    @Override
    public void Alterar_Atuador2() {
        ts.AlterarControleAtuador2(
                txtId_sinal.getText(),
                txtFuncao.getText(),
                txtPino.getText(),
                txtReferencia.getText(),
                txtGt3.getText(),
                txtGt4.getText()
        );
    }

    @Override
    public void Alterar_Sensor() {
        ts.AlterarControleSensor(
                txtId_sinal.getText(),
                txtFuncao.getText(),
                txtPino.getText(),
                txtReferencia.getText(),
                txtGt3.getText(),
                txtGt4.getText()
        );
    }

    @Override
    public void Alterar_Sensor2() {
        ts.AlterarControleSensor2(
                txtId_sinal.getText(),
                txtFuncao.getText(),
                txtPino.getText(),
                txtReferencia.getText(),
                txtGt3.getText(),
                txtGt4.getText()
        );
    }

    @Override
    public void Alterar_Alarme() {
        ts.AlterarControleAlarme(
                txtId_sinal.getText(),
                txtFuncao.getText(),
                txtPino.getText(),
                txtReferencia.getText(),
                txtGt3.getText(),
                txtGt4.getText()
        );
    }

    @Override
    public void Alterar_Comunicacao() {
        ts.AlterarControleComunicacao(
                txtId_sinal.getText(),
                txtFuncao.getText(),
                txtPino.getText(),
                txtReferencia.getText(),
                txtGt3.getText(),
                txtGt4.getText()
        );
    }

    @Override
    public void Alterar_Injetor() {
        ts.AlterarControleInjetor(
                txtId_sinal.getText(),
                txtFuncao.getText(),
                txtPino.getText(),
                txtReferencia.getText(),
                txtGt3.getText(),
                txtGt4.getText()
        );
    }

    @Override
    public void Alterar_PBI() {
        ts.AlterarControlePbi(
                txtId_sinal.getText(),
                txtFuncao.getText(),
                txtPino.getText(),
                txtCaminho.getText(),
                txtGt3.getText(),
                txtGt4.getText()
        );
    }

//SALVAR SINAL 
    public void Salvar_Sinal_0() {
        DefaultTableModel modelo = (DefaultTableModel) tabela_Sinal.getModel();
        if (modelo.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Tabela Vazia ");
        } else {

            for (int i = 0; i < modelo.getRowCount(); i++) {
                tm.SalvarControleTabelaSinal_0(
                        txtId_sinal.getText(),
                        txtSinal.getText(),
                        modelo.getValueAt(i, 1).toString(),
                        modelo.getValueAt(i, 2).toString(),
                        modelo.getValueAt(i, 3).toString(),
                        modelo.getValueAt(i, 4).toString(),
                        modelo.getValueAt(i, 5).toString(),
                        txtId.getText()
                );
            }
        }
    }

    public void Salvar_Sinal_1() {
        DefaultTableModel modelo = (DefaultTableModel) tabela_Sinal.getModel();
        if (modelo.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Tabela Vazia ");
        } else {

            for (int i = 0; i < modelo.getRowCount(); i++) {
                tm.SalvarControleTabelaSinal_1(
                        txtId_sinal.getText(),
                        txtSinal.getText(),
                        modelo.getValueAt(i, 1).toString(),
                        modelo.getValueAt(i, 2).toString(),
                        modelo.getValueAt(i, 3).toString(),
                        modelo.getValueAt(i, 4).toString(),
                        modelo.getValueAt(i, 5).toString(),
                        txtId.getText()
                );
            }
        }
    }

    public void Salvar_Sinal_2() {
        DefaultTableModel modelo = (DefaultTableModel) tabela_Sinal.getModel();
        if (modelo.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Tabela Vazia ");
        } else {

            for (int i = 0; i < modelo.getRowCount(); i++) {
                tm.SalvarControleTabelaSinal_2(
                        txtId_sinal.getText(),
                        txtSinal.getText(),
                        modelo.getValueAt(i, 1).toString(),
                        modelo.getValueAt(i, 2).toString(),
                        modelo.getValueAt(i, 3).toString(),
                        modelo.getValueAt(i, 4).toString(),
                        modelo.getValueAt(i, 5).toString(),
                        txtId.getText()
                );
            }
        }
    }

    public void Salvar_Sinal_3() {
        DefaultTableModel modelo = (DefaultTableModel) tabela_Sinal.getModel();
        if (modelo.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Tabela Vazia ");
        } else {

            for (int i = 0; i < modelo.getRowCount(); i++) {
                tm.SalvarControleTabelaSinal_3(
                        txtId_sinal.getText(),
                        txtSinal.getText(),
                        modelo.getValueAt(i, 1).toString(),
                        modelo.getValueAt(i, 2).toString(),
                        modelo.getValueAt(i, 3).toString(),
                        modelo.getValueAt(i, 4).toString(),
                        modelo.getValueAt(i, 5).toString(),
                        txtId.getText()
                );
            }
        }
    }

    public void Salvar_Sinal_4() {
        DefaultTableModel modelo = (DefaultTableModel) tabela_Sinal.getModel();
        if (modelo.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Tabela Vazia ");
        } else {

            for (int i = 0; i < modelo.getRowCount(); i++) {
                tm.SalvarControleTabelaSinal_4(
                        txtId_sinal.getText(),
                        txtSinal.getText(),
                        modelo.getValueAt(i, 1).toString(),
                        modelo.getValueAt(i, 2).toString(),
                        modelo.getValueAt(i, 3).toString(),
                        modelo.getValueAt(i, 4).toString(),
                        modelo.getValueAt(i, 5).toString(),
                        txtId.getText()
                );
            }
        }
    }

    public void Salvar_Sinal_5() {
        DefaultTableModel modelo = (DefaultTableModel) tabela_Sinal.getModel();
        if (modelo.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Tabela Vazia ");
        } else {

            for (int i = 0; i < modelo.getRowCount(); i++) {
                tm.SalvarControleTabelaSinal_5(
                        txtId_sinal.getText(),
                        txtSinal.getText(),
                        modelo.getValueAt(i, 1).toString(),
                        modelo.getValueAt(i, 2).toString(),
                        modelo.getValueAt(i, 3).toString(),
                        modelo.getValueAt(i, 4).toString(),
                        modelo.getValueAt(i, 5).toString(),
                        txtId.getText()
                );
            }
        }
    }

    public void Salvar_Sinal_6() {
        DefaultTableModel modelo = (DefaultTableModel) tabela_Sinal.getModel();
        if (modelo.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Tabela Vazia ");
        } else {

            for (int i = 0; i < modelo.getRowCount(); i++) {
                tm.SalvarControleTabelaSinal_6(
                        txtId_sinal.getText(),
                        txtSinal.getText(),
                        modelo.getValueAt(i, 1).toString(),
                        modelo.getValueAt(i, 2).toString(),
                        modelo.getValueAt(i, 3).toString(),
                        modelo.getValueAt(i, 4).toString(),
                        modelo.getValueAt(i, 5).toString(),
                        txtId.getText()
                );
            }
        }
    }

    public void Salvar_Sinal_7() {
        DefaultTableModel modelo = (DefaultTableModel) tabela_Sinal.getModel();
        if (modelo.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Tabela Vazia ");
        } else {

            for (int i = 0; i < modelo.getRowCount(); i++) {
                tm.SalvarControleTabelaSinal_7(
                        txtId_sinal.getText(),
                        txtSinal.getText(),
                        modelo.getValueAt(i, 1).toString(),
                        modelo.getValueAt(i, 2).toString(),
                        modelo.getValueAt(i, 3).toString(),
                        modelo.getValueAt(i, 4).toString(),
                        modelo.getValueAt(i, 5).toString(),
                        txtId.getText()
                );
            }
        }
    }

    public void Salvar_Sinal_8() {
        DefaultTableModel modelo = (DefaultTableModel) tabela_Sinal.getModel();
        if (modelo.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Tabela Vazia ");
        } else {

            for (int i = 0; i < modelo.getRowCount(); i++) {
                tm.SalvarControleTabelaSinal_8(
                        txtId_sinal.getText(),
                        txtSinal.getText(),
                        modelo.getValueAt(i, 1).toString(),
                        modelo.getValueAt(i, 2).toString(),
                        modelo.getValueAt(i, 3).toString(),
                        modelo.getValueAt(i, 4).toString(),
                        modelo.getValueAt(i, 5).toString(),
                        txtId.getText()
                );
            }
        }
    }

    /*
CARREGAR CAMPO CHECKBOX
     */
    @Override
    public void CarregarCampos() {

        if (check_alimentacao.isSelected()) {
            consultaTabela_Alimentacao();
            txtSinal.setText("Alimentação");
        }
        if (check_sensor.isSelected()) {
            consultaTabela_Sensor();
            txtSinal.setText("Sensor");

        }
        if (check_sensor2.isSelected()) {
            consultaTabela_Sensor2();
            txtSinal.setText("Sensor2");
        }

        if (check_atuador.isSelected()) {
            consultaTabela_Atuador();
            txtSinal.setText("Atuador");

        }

        if (check_atuador2.isSelected()) {
            consultaTabela_Atuador2();
            txtSinal.setText("Atuador2z");

        }

        if (check_alarme.isSelected()) {
            consultaTabela_Alarme();
            txtSinal.setText("Alarme");

        }

        if (check_comunicacao.isSelected()) {
            consultaTabela_Comunicacao();
            txtSinal.setText("Comunicação");
        }

        if (check_injetor.isSelected()) {
            consultaTabela_Injetor();
            txtSinal.setText("Injetor Diesel");
        }

        if (check_pbi.isSelected()) {
            consultaTabela_PBI();
            txtSinal.setText("Painel / BC/ IMOB");

        }
    }

//CHECKBOX SINAIS
    @Override
    public void SalvarTabelaSinais() {

        if (check_alimentacao.isSelected()) {
            Salvar_Sinal_0();
        }
        if (check_sensor.isSelected()) {
            Salvar_Sinal_1();
        }
        if (check_sensor2.isSelected()) {
            Salvar_Sinal_2();
        }
        if (check_atuador.isSelected()) {
            Salvar_Sinal_3();
        }
        if (check_atuador2.isSelected()) {
            Salvar_Sinal_4();
        }
        if (check_alarme.isSelected()) {
            Salvar_Sinal_5();
        }
        if (check_comunicacao.isSelected()) {
            Salvar_Sinal_6();
        }
        if (check_injetor.isSelected()) {
            Salvar_Sinal_7();
        }
        if (check_pbi.isSelected()) {
            Salvar_Sinal_8();
        }

    }

}

/*
PDF NOME E TABELA ALTERADA COMPLETA.
https://www.youtube.com/watch?v=lg-0LyVymQ8&list=PLbEOwbQR9lqxsTusvu8wfkUECrmcV81MU&index=33
 */
