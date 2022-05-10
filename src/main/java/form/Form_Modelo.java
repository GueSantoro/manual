package form;

import controle.Controle_Modelo;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import util.ManipularImagem;

/**
 * @author INOVA
 */
public class Form_Modelo extends view.Form_Cadastro_Modelo {

    Controle_Modelo cm = new Controle_Modelo();
    BufferedImage imagem;

    public Form_Modelo() {
        setTitle(" CADASTRO DE MONTADORA MODELO E IMOBILIZADOR ");
        consultaTabela_Montadora();
        consultaTabela_Modelo();
        consultaTabela_Imobilizador();
        consultaTabela_Imagem();
    }

    /*
SALVAR
     */
    @Override
    public void salvarMontadora() {
        cm.salvaControleMontadora(
                id_Montadora.getText(),
                txtMontadora.getText()
        );
        System.out.println(" Salvo ");
    }

    @Override
    public void salvarModelo() {
        cm.salvaControleModelo(
                id_modelo.getText(),
                txtModelo.getText()
        );
        System.out.println(" Salvo ");
    }

    @Override
    public void salvarImobilizador() {
        cm.salvaControleImobilizador(
                id_imobilizador.getText(),
                txtImobilizador.getText()
        );
        System.out.println(" Salvo ");
    }

    /*
CONSULTAR
     */
    @Override
    public void consultaTabela_Montadora() {
        DefaultTableModel modelo_MT = (DefaultTableModel) tabelaMontadora.getModel();
        modelo_MT.setNumRows(0);
        cm.consultaControleMontadora(jConsultas_Modelo.getText(), modelo_MT);
    }

    @Override
    public void consultaTabela_Modelo() {
        DefaultTableModel modelo_MD = (DefaultTableModel) tabelaModelo.getModel();
        modelo_MD.setNumRows(0);
        cm.consultaControleModelo(jConsultas_Modelo.getText(), modelo_MD);
    }

    @Override
    public void consultaTabela_Imobilizador() {
        DefaultTableModel modelo_IM = (DefaultTableModel) tabelaImobilizador.getModel();
        modelo_IM.setNumRows(0);
        cm.consultaControleImobilizador(jConsultas_Modelo.getText(), modelo_IM);
    }

    @Override
    public void consultaTabela_Imagem() {

    }

    /*
CARREGAR
     */
    @Override
    public void Carregar_Tabela_Montadora() {
        int setar = tabelaMontadora.getSelectedRow();
        id_Montadora.setText(tabelaMontadora.getModel().getValueAt(setar, 0).toString());
        txtMontadora.setText(tabelaMontadora.getModel().getValueAt(setar, 1).toString());

    }

    @Override
    public void Carregar_Tabela_Modelo() {
        int setar = tabelaModelo.getSelectedRow();
        id_modelo.setText(tabelaModelo.getModel().getValueAt(setar, 0).toString());
        txtModelo.setText(tabelaModelo.getModel().getValueAt(setar, 1).toString());

    }

    @Override
    public void Carregar_Tabela_Imobilizador() {
        int setar = tabelaImobilizador.getSelectedRow();
        id_imobilizador.setText(tabelaImobilizador.getModel().getValueAt(setar, 0).toString());
        txtImobilizador.setText(tabelaImobilizador.getModel().getValueAt(setar, 1).toString());

    }

    /*
ALTERAR
     */
    public void Alterar_Montadora() {

    }
}
