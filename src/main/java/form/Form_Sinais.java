package form;

import controle.Controle_Sinal;
import dao.ConexaoBanco;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
import modelo.Modelo_Sinais;
import view.Form_Cadastro_Sinal;

/**
 * @author INOVA GleSantoro
 */
public class Form_Sinais extends Form_Cadastro_Sinal {

    Controle_Sinal cs = new Controle_Sinal();

    DefaultTableModel modelo_AL = (DefaultTableModel) tabela_alimentacao.getModel();
    DefaultTableModel modelo_AT = (DefaultTableModel) tabela_sensor.getModel();
    DefaultTableModel modelo_I = (DefaultTableModel) tabela_injetor.getModel();
    DefaultTableModel modelo_S = (DefaultTableModel) tabela_sensor2.getModel();
    DefaultTableModel modelo_PBI = (DefaultTableModel) tabela_pbi.getModel();

    public Form_Sinais() {
        setTitle(" EDITAR DESCRIÇÃO ALIMENTAÇÃO/ SENSOR / ATUADOR / INJETOR / E PAINEL / BC / IMOBILIZADOR");
        consultaTabela_Alimentacao();
        consultaTabela_Atuador();
        consultaTabela_Atuador2();
        consultaTabela_Sensor();
        consultaTabela_Sensor2();
        consultaTabela_alarme();
        consultaTabela_comunicacao();
        consultaTabela_Injetor();
        consultaTabela_PBI();
    }

    /*
SALVAR
     */
    @Override
    public void Salvar_Alimentacao() {

        cs.salvaControleAlimentacao(
                idAlimentacao.getText(),
                funcaoAlimentacao.getText(),
                pinos_Alimentacao.getText(),
                referenciaAlimentacao.getText(),
                conectorGt3_Alimentacao.getText(),
                conectorGt4_Alimentacao.getText()
        );
    }

    @Override
    public void Salvar_Sensor() {

        cs.salvaControleSensor(
                idAlimentacao1.getText(),
                funcaoAlimentacao1.getText(),
                pinos_Alimentacao1.getText(),
                referenciaAlimentacao1.getText(),
                conectorGt3_Alimentacao1.getText(),
                conectorGt4_Alimentacao1.getText()
        );

    }

    @Override
    public void Salvar_Atuador() {

        cs.salvaControleAtuador(
                idAlimentacao3.getText(),
                funcaoAlimentacao3.getText(),
                pinos_Alimentacao3.getText(),
                referenciaAlimentacao3.getText(),
                conectorGt3_Alimentacao3.getText(),
                conectorGt4_Alimentacao3.getText()
        );

    }

    @Override
    public void Salvar_Injetor() {

        cs.salvaControleInjetor(
                idAlimentacao7.getText(),
                funcaoAlimentacao7.getText(),
                pinos_Alimentacao7.getText(),
                referenciaAlimentacao7.getText(),
                conectorGt3_Alimentacao7.getText(),
                conectorGt4_Alimentacao7.getText()
        );
    }

    @Override
    public void Salvar_PBI() {

        cs.salvaControlePbi(
                idAlimentacao8.getText(),
                funcaoAlimentacao8.getText(),
                pinos_Alimentacao8.getText(),
                referenciaAlimentacao8.getText(),
                conectorGt3_Alimentacao8.getText(),
                conectorGt4_Alimentacao8.getText()
        );

    }

    @Override
    public void Salvar_Sensor2() {
        cs.salvaControleSensor2(
                idAlimentacao2.getText(),
                funcaoAlimentacao2.getText(),
                pinos_Alimentacao2.getText(),
                referenciaAlimentacao2.getText(),
                conectorGt3_Alimentacao2.getText(),
                conectorGt4_Alimentacao2.getText()
        );
    }

    @Override
    public void Salvar_Atuador2() {
        cs.salvaControleAtuador2(
                idAlimentacao4.getText(),
                funcaoAlimentacao4.getText(),
                pinos_Alimentacao4.getText(),
                referenciaAlimentacao4.getText(),
                conectorGt3_Alimentacao4.getText(),
                conectorGt4_Alimentacao4.getText()
        );
    }

    @Override
    public void Salvar_Alarme() {
        cs.salvaControleAlarme(
                idAlimentacao5.getText(),
                funcaoAlimentacao5.getText(),
                pinos_Alimentacao5.getText(),
                referenciaAlimentacao5.getText(),
                conectorGt3_Alimentacao5.getText(),
                conectorGt4_Alimentacao5.getText()
        );
    }

    @Override
    public void Salvar_Comunicacao() {
        cs.salvaControleComunicacao(
                idAlimentacao6.getText(),
                funcaoAlimentacao6.getText(),
                pinos_Alimentacao6.getText(),
                referenciaAlimentacao6.getText(),
                conectorGt3_Alimentacao6.getText(),
                conectorGt4_Alimentacao6.getText()
        );
    }

    /*
CONSULTAR
     */
    @Override
    public void consultaTabela_Alimentacao() {
        DefaultTableModel modelo_AL = (DefaultTableModel) tabela_alimentacao.getModel();
        modelo_AL.setNumRows(0);
        cs.consultaControleAlimentacao(jConsulta_Sinal.getText(), modelo_AL);
    }

    @Override
    public void consultaTabela_Sensor() {
        DefaultTableModel modelo_S = (DefaultTableModel) tabela_sensor.getModel();
        modelo_S.setNumRows(0);
        cs.consultaControleSensor(jConsulta_Sinal.getText(), modelo_S);
    }

    @Override
    public void consultaTabela_Atuador() {
        DefaultTableModel modelo_AT = (DefaultTableModel) tabela_atuador.getModel();
        modelo_AT.setNumRows(0);
        cs.consultaControleAtuador(jConsulta_Sinal.getText(), modelo_AT);
    }

    @Override
    public void consultaTabela_Injetor() {
        DefaultTableModel modelo_I = (DefaultTableModel) tabela_injetor.getModel();
        modelo_I.setNumRows(0);
        cs.consultaControleInjetor(jConsulta_Sinal.getText(), modelo_I);
    }

    @Override
    public void consultaTabela_PBI() {
        DefaultTableModel modelo_PBI = (DefaultTableModel) tabela_pbi.getModel();
        modelo_PBI.setNumRows(0);
        cs.consultaControlePBI(jConsulta_Sinal.getText(), modelo_PBI);
    }

    @Override
    public void consultaTabela_Sensor2() {
        DefaultTableModel modelo_Sen2 = (DefaultTableModel) tabela_sensor2.getModel();
        modelo_Sen2.setNumRows(0);
        cs.consultaControleSensor2(jConsulta_Sinal.getText(), modelo_Sen2);
    }

    @Override
    public void consultaTabela_Atuador2() {
        DefaultTableModel modelo_At2 = (DefaultTableModel) tabela_atuador2.getModel();
        modelo_At2.setNumRows(0);
        cs.consultaControleAtuador2(jConsulta_Sinal.getText(), modelo_At2);
    }

    @Override
    public void consultaTabela_alarme() {
        DefaultTableModel modelo_ala = (DefaultTableModel) tabela_alarme.getModel();
        modelo_ala.setNumRows(0);
        cs.consultaControleAlarme(jConsulta_Sinal.getText(), modelo_ala);
    }

    @Override
    public void consultaTabela_comunicacao() {
        DefaultTableModel modelo_com = (DefaultTableModel) tabela_comunicacao.getModel();
        modelo_com.setNumRows(0);
        cs.consultaControleComunicacao(jConsulta_Sinal.getText(), modelo_com);
    }

    /*
CARREGAR
     */
    @Override
    public void Carregar_Tabela_Alimentacao() {
        int setar = tabela_alimentacao.getSelectedRow();
        idAlimentacao.setText(tabela_alimentacao.getModel().getValueAt(setar, 0).toString());
        funcaoAlimentacao.setText(tabela_alimentacao.getModel().getValueAt(setar, 1).toString());
        referenciaAlimentacao.setText(tabela_alimentacao.getModel().getValueAt(setar, 3).toString());
        conectorGt3_Alimentacao.setText(tabela_alimentacao.getModel().getValueAt(setar, 4).toString());
        conectorGt4_Alimentacao.setText(tabela_alimentacao.getModel().getValueAt(setar, 5).toString());
    }

    @Override
    public void Carregar_Tabela_atuador() {
        int setar = tabela_atuador.getSelectedRow();
        idAlimentacao3.setText(tabela_atuador.getModel().getValueAt(setar, 0).toString());
        funcaoAlimentacao3.setText(tabela_atuador.getModel().getValueAt(setar, 1).toString());
        referenciaAlimentacao3.setText(tabela_atuador.getModel().getValueAt(setar, 3).toString());
        conectorGt3_Alimentacao3.setText(tabela_atuador.getModel().getValueAt(setar, 4).toString());
        conectorGt4_Alimentacao3.setText(tabela_atuador.getModel().getValueAt(setar, 5).toString());

    }

    @Override
    public void Carregar_Tabela_injetor() {
        int setar = tabela_injetor.getSelectedRow();
        idAlimentacao7.setText(tabela_injetor.getModel().getValueAt(setar, 0).toString());
        funcaoAlimentacao7.setText(tabela_injetor.getModel().getValueAt(setar, 1).toString());
        referenciaAlimentacao7.setText(tabela_injetor.getModel().getValueAt(setar, 3).toString());
        conectorGt3_Alimentacao7.setText(tabela_injetor.getModel().getValueAt(setar, 4).toString());
        conectorGt4_Alimentacao7.setText(tabela_injetor.getModel().getValueAt(setar, 5).toString());
    }

    @Override
    public void Carregar_Tabela_sensor() {
        int setar = tabela_sensor.getSelectedRow();
        idAlimentacao1.setText(tabela_sensor.getModel().getValueAt(setar, 0).toString());
        funcaoAlimentacao1.setText(tabela_sensor.getModel().getValueAt(setar, 1).toString());
        referenciaAlimentacao1.setText(tabela_sensor.getModel().getValueAt(setar, 3).toString());
        conectorGt3_Alimentacao1.setText(tabela_sensor.getModel().getValueAt(setar, 4).toString());
        conectorGt4_Alimentacao1.setText(tabela_sensor.getModel().getValueAt(setar, 5).toString());
    }

    @Override
    public void Carregar_Tabela_pbi() {
        int setar = tabela_pbi.getSelectedRow();
        idAlimentacao8.setText(tabela_pbi.getModel().getValueAt(setar, 0).toString());
        funcaoAlimentacao8.setText(tabela_pbi.getModel().getValueAt(setar, 1).toString());
        referenciaAlimentacao8.setText(tabela_pbi.getModel().getValueAt(setar, 3).toString());
        conectorGt3_Alimentacao8.setText(tabela_pbi.getModel().getValueAt(setar, 4).toString());
        conectorGt4_Alimentacao8.setText(tabela_pbi.getModel().getValueAt(setar, 5).toString());
    }

    @Override
    public void Carregar_Tabela_atuador2() {
        int setar = tabela_atuador2.getSelectedRow();
        idAlimentacao4.setText(tabela_atuador2.getModel().getValueAt(setar, 0).toString());
        funcaoAlimentacao4.setText(tabela_atuador2.getModel().getValueAt(setar, 1).toString());
        referenciaAlimentacao4.setText(tabela_atuador2.getModel().getValueAt(setar, 3).toString());
        conectorGt3_Alimentacao4.setText(tabela_atuador2.getModel().getValueAt(setar, 4).toString());
        conectorGt4_Alimentacao4.setText(tabela_atuador2.getModel().getValueAt(setar, 5).toString());
    }

    @Override
    public void Carregar_Tabela_sensor2() {
        int setar = tabela_sensor2.getSelectedRow();
        idAlimentacao2.setText(tabela_sensor2.getModel().getValueAt(setar, 0).toString());
        funcaoAlimentacao2.setText(tabela_sensor2.getModel().getValueAt(setar, 1).toString());
        referenciaAlimentacao2.setText(tabela_sensor2.getModel().getValueAt(setar, 3).toString());
        conectorGt3_Alimentacao2.setText(tabela_sensor2.getModel().getValueAt(setar, 4).toString());
        conectorGt4_Alimentacao2.setText(tabela_sensor2.getModel().getValueAt(setar, 5).toString());
    }

    @Override
    public void Carregar_Tabela_alarme() {
        int setar = tabela_alarme.getSelectedRow();
        idAlimentacao5.setText(tabela_alarme.getModel().getValueAt(setar, 0).toString());
        funcaoAlimentacao5.setText(tabela_alarme.getModel().getValueAt(setar, 1).toString());
        referenciaAlimentacao5.setText(tabela_alarme.getModel().getValueAt(setar, 3).toString());
        conectorGt3_Alimentacao5.setText(tabela_alarme.getModel().getValueAt(setar, 4).toString());
        conectorGt4_Alimentacao5.setText(tabela_alarme.getModel().getValueAt(setar, 5).toString());
    }

    @Override
    public void Carregar_Tabela_comunicacao() {
        int setar = tabela_comunicacao.getSelectedRow();
        idAlimentacao6.setText(tabela_comunicacao.getModel().getValueAt(setar, 0).toString());
        funcaoAlimentacao6.setText(tabela_comunicacao.getModel().getValueAt(setar, 1).toString());
        referenciaAlimentacao6.setText(tabela_comunicacao.getModel().getValueAt(setar, 3).toString());
        conectorGt3_Alimentacao6.setText(tabela_comunicacao.getModel().getValueAt(setar, 4).toString());
        conectorGt4_Alimentacao6.setText(tabela_comunicacao.getModel().getValueAt(setar, 5).toString());
    }

    /*
ALTERAR SINAL
     */
    @Override
    public void Alterar_Alimentacao() {
        cs.AlterarControleAlimentacao(
                idAlimentacao.getText(),
                funcaoAlimentacao.getText(),
                pinos_Alimentacao.getText(),
                referenciaAlimentacao.getText(),
                conectorGt3_Alimentacao.getText(),
                conectorGt4_Alimentacao.getText()
        );
    }

    @Override
    public void Alterar_Atuador() {
        cs.AlterarControleAtuador(
                idAlimentacao3.getText(),
                funcaoAlimentacao3.getText(),
                pinos_Alimentacao3.getText(),
                referenciaAlimentacao3.getText(),
                conectorGt3_Alimentacao3.getText(),
                conectorGt4_Alimentacao3.getText()
        );
    }

    @Override
    public void Alterar_Atuador2() {
        cs.AlterarControleAtuador2(
                idAlimentacao4.getText(),
                funcaoAlimentacao4.getText(),
                pinos_Alimentacao4.getText(),
                referenciaAlimentacao4.getText(),
                conectorGt3_Alimentacao4.getText(),
                conectorGt4_Alimentacao4.getText()
        );
    }

    @Override
    public void Alterar_Sensor() {
        cs.AlterarControleSensor(
                idAlimentacao1.getText(),
                funcaoAlimentacao1.getText(),
                pinos_Alimentacao1.getText(),
                referenciaAlimentacao1.getText(),
                conectorGt3_Alimentacao1.getText(),
                conectorGt4_Alimentacao1.getText()
        );
    }

    @Override
    public void Alterar_Sensor2() {
        cs.AlterarControleSensor2(
                idAlimentacao2.getText(),
                funcaoAlimentacao2.getText(),
                pinos_Alimentacao2.getText(),
                referenciaAlimentacao2.getText(),
                conectorGt3_Alimentacao2.getText(),
                conectorGt4_Alimentacao2.getText()
        );
    }

    @Override
    public void Alterar_Alarme() {
        cs.AlterarControleAlarme(
                idAlimentacao5.getText(),
                funcaoAlimentacao5.getText(),
                pinos_Alimentacao5.getText(),
                referenciaAlimentacao5.getText(),
                conectorGt3_Alimentacao5.getText(),
                conectorGt4_Alimentacao5.getText()
        );
    }

    @Override
    public void Alterar_Comunicacao() {
        cs.AlterarControleComunicacao(
                idAlimentacao6.getText(),
                funcaoAlimentacao6.getText(),
                pinos_Alimentacao6.getText(),
                referenciaAlimentacao6.getText(),
                conectorGt3_Alimentacao6.getText(),
                conectorGt4_Alimentacao6.getText()
        );
    }

    @Override
    public void Alterar_Injetor() {
        cs.AlterarControleInjetor(
                idAlimentacao7.getText(),
                funcaoAlimentacao7.getText(),
                pinos_Alimentacao7.getText(),
                referenciaAlimentacao7.getText(),
                conectorGt3_Alimentacao7.getText(),
                conectorGt4_Alimentacao7.getText()
        );
    }

    @Override
    public void Alterar_PBI() {
        cs.AlterarControlePbi(
                idAlimentacao8.getText(),
                funcaoAlimentacao8.getText(),
                pinos_Alimentacao8.getText(),
                referenciaAlimentacao8.getText(),
                conectorGt3_Alimentacao8.getText(),
                conectorGt4_Alimentacao8.getText()
        );
    }
}
