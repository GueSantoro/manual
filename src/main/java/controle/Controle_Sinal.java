package controle;

import dao.Dao_Sinal;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Modelo_Sinais;

/**
 * @author INOVA GleSantoro
 */
public class Controle_Sinal {

    Modelo_Sinais tm = new Modelo_Sinais();
    Dao_Sinal td = new Dao_Sinal();

    public Controle_Sinal() {
    }

    /**
     * *************************************************************
     * SALVAR SINAIS
     * **************************************************************
     */
    public void salvaControleAlimentacao(Object... valor) {
        //consulta ModeloVisao 
        try {
            if ("".equals(valor[0])) {
                tm.setID_ALIMENTACAO(0);
            } else {
                tm.setID_ALIMENTACAO((int) valor[0]);
            }
            tm.setFUNCAO_ALIMENTACAO((String) valor[1]);
            tm.setPINOS_ALIMENTACAO((String) valor[2]);
            tm.setREFERENCIA_ALIMENTACAO((String) valor[3]);
            tm.setCONECTOR_GT3_ALIMENTACAO((String) valor[4]);
            tm.setCONECTOR_GT4_ALIMENTACAO((String) valor[5]);

            td.salvaDaoAlimentacao(tm);
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar controle alimnetacao " + ex);
        }
    }

    public void salvaControleSensor(Object... valor) {

        try {
            if ("".equals(valor[0])) {
                tm.setID_SENSOR(0);
            } else {
                tm.setID_SENSOR((int) valor[0]);
            }
            tm.setFUNCAO_SENSOR((String) valor[1]);
            tm.setPINOS_SENSOR((String) valor[2]);
            tm.setREFERENCIA_SENSOR((String) valor[3]);
            tm.setCONECTOR_GT3_SENSOR((String) valor[4]);
            tm.setCONECTOR_GT4_SENSOR((String) valor[5]);

            td.salvaDaoSensor(tm);
        } catch (SQLException ex) {
        }
    }

    public void salvaControleSensor2(Object... valor) {

        try {
            if ("".equals(valor[0])) {
                tm.setID_SENSOR(20);
            } else {
                tm.setID_SENSOR2((int) valor[0]);
            }
            tm.setFUNCAO_SENSOR2((String) valor[1]);
            tm.setPINOS_SENSOR2((String) valor[2]);
            tm.setREFERENCIA_SENSOR2((String) valor[3]);
            tm.setCONECTOR_GT3_SENSOR2((String) valor[4]);
            tm.setCONECTOR_GT4_SENSOR2((String) valor[5]);

            td.salvaDaoSensor2(tm);
        } catch (SQLException ex) {
        }
    }

    public void salvaControleAtuador(Object... valor) {

        try {
            if ("".equals(valor[0])) {
                tm.setID_ATUADOR(0);
            } else {
                tm.setID_ATUADOR((int) valor[0]);
            }
            tm.setFUNCAO_ATUADOR((String) valor[1]);
            tm.setPINOS_ATUADOR((String) valor[2]);
            tm.setREFERENCIA_ATUADOR((String) valor[3]);
            tm.setCONECTOR_GT3_ATUADOR((String) valor[4]);
            tm.setCONECTOR_GT4_ATUADOR((String) valor[5]);

            td.salvaDaoAtuador(tm);
        } catch (SQLException ex) {
        }
    }

    public void salvaControleAtuador2(Object... valor) {

        try {
            if ("".equals(valor[0])) {
                tm.setID_ATUADOR2(0);
            } else {
                tm.setID_ATUADOR2((int) valor[0]);
            }
            tm.setFUNCAO_ATUADOR2((String) valor[1]);
            tm.setPINOS_ATUADOR2((String) valor[2]);
            tm.setREFERENCIA_ATUADOR2((String) valor[3]);
            tm.setCONECTOR_GT3_ATUADOR2((String) valor[4]);
            tm.setCONECTOR_GT4_ATUADOR2((String) valor[5]);

            td.salvaDaoAtuador2(tm);
        } catch (SQLException ex) {
        }
    }

    public void salvaControleAlarme(Object... valor) {

        try {
            if ("".equals(valor[0])) {
                tm.setID_ALARME(0);
            } else {
                tm.setID_ALARME((int) valor[0]);
            }
            tm.setFUNCAO_ALARME((String) valor[1]);
            tm.setPINOS_ALARME((String) valor[2]);
            tm.setREFERENCIA_ALARME((String) valor[3]);
            tm.setCONECTOR_GT3_ALARME((String) valor[4]);
            tm.setCONECTOR_GT4_ALARME((String) valor[5]);

            td.salvaDaoAlarme(tm);
        } catch (SQLException ex) {
        }
    }

    public void salvaControleComunicacao(Object... valor) {

        try {
            if ("".equals(valor[0])) {
                tm.setID_COMUNICACAO(0);
            } else {
                tm.setID_COMUNICACAO((int) valor[0]);
            }
            tm.setFUNCAO_COMUNICACAO((String) valor[1]);
            tm.setPINOS_COMUNICACAO((String) valor[2]);
            tm.setREFERENCIA_COMUNICACAO((String) valor[3]);
            tm.setCONECTOR_GT3_COMUNICACAO((String) valor[4]);
            tm.setCONECTOR_GT4_COMUNICACAO((String) valor[5]);

            td.salvaDaoComunicacao(tm);
        } catch (SQLException ex) {
        }
    }

    public void salvaControleInjetor(Object... valor) {

        try {
            if ("".equals(valor[0])) {
                tm.setID_INJETOR(0);
            } else {
                tm.setID_INJETOR((int) valor[0]);
            }
            tm.setFUNCAO_INJETOR((String) valor[1]);
            tm.setPINOS_INJETOR((String) valor[2]);
            tm.setREFERENCIA_INJETOR((String) valor[3]);
            tm.setCONECTOR_GT3_INJETOR((String) valor[4]);
            tm.setCONECTOR_GT4_INJETOR((String) valor[5]);

            td.salvaDaoInjetor(tm);
        } catch (SQLException ex) {
        }
    }

    public void salvaControlePbi(Object... valor) {

        try {
            if ("".equals(valor[0])) {
                tm.setID_PBI(0);
            } else {
                tm.setID_PBI((int) valor[0]);
            }
            tm.setFUNCAO_PBI((String) valor[1]);
            tm.setPINOS_PBI((String) valor[2]);
            tm.setREFERENCIA_PBI((String) valor[3]);
            tm.setCONECTOR_GT3_PBI((String) valor[4]);
            tm.setCONECTOR_GT4_PBI((String) valor[5]);

            td.salvaDaoPbi(tm);
        } catch (SQLException ex) {
        }
    }

    /**
     * *************************************************************
     * CONSULTAR SINAIS
     * **************************************************************
     */
    public void consultaControleAlimentacao(Object... valor) {
        try {
            td.consultaDaoAlimentacao(valor);
        } catch (SQLException e) {
            System.out.println("Controle Consulta Tabela Alimentação " + e);
        }
    }

    public void consultaControleSensor(Object... valor) {
        try {
            td.consultaDaoSensor(valor);
        } catch (SQLException e) {
            System.out.println("Controle Consulta Tabela Sensor " + e);
        }
    }

    public void consultaControleSensor2(Object... valor) {
        try {
            td.consultaDaoSensor2(valor);
        } catch (SQLException e) {
            System.out.println("Controle Consulta Tabela Sensor2 " + e);
        }
    }

    public void consultaControleAtuador(Object... valor) {
        try {
            td.consultaDaoAtuador(valor);
        } catch (SQLException e) {
            System.out.println("Controle Consulta Tabela Atuador " + e);
        }
    }

    public void consultaControleAtuador2(Object... valor) {
        try {
            td.consultaDaoAtuador2(valor);
        } catch (SQLException e) {
            System.out.println("Controle Consulta Tabela Atuador2 " + e);
        }
    }

    public void consultaControleAlarme(Object... valor) {
        try {
            td.consultaDaoAlarme(valor);
        } catch (SQLException e) {
            System.out.println("Controle Consulta Tabela Alarme " + e);
        }
    }

    public void consultaControleComunicacao(Object... valor) {
        try {
            td.consultaDaoComunicacao(valor);
        } catch (SQLException e) {
            System.out.println("Controle Consulta Tabela Comunicacao " + e);
        }
    }

    public void consultaControleInjetor(Object... valor) {
        try {
            td.consultaDaoInjetor(valor);
        } catch (SQLException e) {
            System.out.println("Controle Consulta Tabela Injetor " + e);
        }
    }

    public void consultaControlePBI(Object... valor) {
        try {
            td.consultaDaoPBI(valor);
        } catch (SQLException e) {
            System.out.println("Controle Consulta Tabela P.B.I " + e);
        }
    }

    /**
     * *************************************************************
     * EXCLUIR SINAIS
     * **************************************************************
     */
    public void ExcluirControleAlimentacao(Object... valor) {
        try {
            tm.setID_ALIMENTACAO(Integer.parseInt(valor[0].toString()));

            td.ExcluirDaoAlimentacao(tm);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro " + ex);
        }
    }

    public void ExcluirControleSensor(Object... valor) {
        try {
            tm.setID_SENSOR(Integer.parseInt(valor[0].toString()));

            td.ExcluirDaoSensor(tm);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro " + ex);
        }
    }

    public void ExcluirControleSensor2(Object... valor) {
        try {
            tm.setID_SENSOR2(Integer.parseInt(valor[0].toString()));

            td.ExcluirDaoSensor2(tm);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possvel excluir controle sinal " + ex);
        }
    }

    public void ExcluirControleAtuador(Object... valor) {
        try {
            tm.setID_ATUADOR(Integer.parseInt(valor[0].toString()));

            td.ExcluirDaoAtuador(tm);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possvel excluir controle sinal " + ex);
        }
    }

    public void ExcluirControleAtuador2(Object... valor) {
        try {
            tm.setID_ATUADOR2(Integer.parseInt(valor[0].toString()));

            td.ExcluirDaoAtuador2(tm);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possvel excluir controle sinal " + ex);
        }
    }

    public void ExcluirControleAlarme(Object... valor) {
        try {
            tm.setID_ALARME(Integer.parseInt(valor[0].toString()));

            td.ExcluirDaoAlarme(tm);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possvel excluir controle sinal " + ex);
        }
    }

    public void ExcluirControleComunicacao(Object... valor) {
        try {
            tm.setID_COMUNICACAO(Integer.parseInt(valor[0].toString()));

            td.ExcluirDaoComunicacao(tm);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possvel excluir controle sinal " + ex);
        }
    }

    public void ExcluirControleInjetor(Object... valor) {
        try {
            tm.setID_INJETOR(Integer.parseInt(valor[0].toString()));

            td.ExcluirDaoInjetor(tm);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possvel excluir controle sinal " + ex);
        }
    }

    public void ExcluirControlePbi(Object... valor) {
        try {
            tm.setID_PBI(Integer.parseInt(valor[0].toString()));

            td.ExcluirDaoPbi(tm);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possvel excluir controle sinal " + ex);
        }
    }

    /**
     * * *************************************************************
     * ALTERAR SINAIS
     * **************************************************************
     */
    public void AlterarControleAlimentacao(Object... valor) {
        try {
            tm.setFUNCAO_ALIMENTACAO((String) valor[1]);
            tm.setPINOS_ALIMENTACAO((String) valor[2]);
            tm.setREFERENCIA_ALIMENTACAO((String) valor[3]);
            tm.setCONECTOR_GT3_ALIMENTACAO((String) valor[4]);
            tm.setCONECTOR_GT4_ALIMENTACAO((String) valor[5]);
            tm.setID_ALIMENTACAO(Integer.parseInt(valor[0].toString()));

            td.AlterarDaoAlimentacao(tm);
            System.out.println("Controle Alterar Alimentação ok");
        } catch (SQLException ex) {
            System.out.println("erro ao alterar alimentcao " + ex);
        }
    }

 public void AlterarControleAtuador(Object... valor) {
        try {
            tm.setFUNCAO_ATUADOR((String) valor[1]);
            tm.setPINOS_ATUADOR((String) valor[2]);
            tm.setREFERENCIA_ATUADOR((String) valor[3]);
            tm.setCONECTOR_GT3_ATUADOR((String) valor[4]);
            tm.setCONECTOR_GT4_ATUADOR((String) valor[5]);
            tm.setID_ATUADOR(Integer.parseInt(valor[0].toString()));

            td.AlterarDaoAtuador(tm);
            System.out.println("Controle Alterar Atuador ok");
        } catch (SQLException ex) {
            System.out.println("erro ao alterar Atuador " + ex);
        }
    }

 public void AlterarControleAtuador2(Object... valor) {
        try {
            tm.setFUNCAO_ATUADOR2((String) valor[1]);
            tm.setPINOS_ATUADOR2((String) valor[2]);
            tm.setREFERENCIA_ATUADOR2((String) valor[3]);
            tm.setCONECTOR_GT3_ATUADOR2((String) valor[4]);
            tm.setCONECTOR_GT4_ATUADOR2((String) valor[5]);
            tm.setID_ATUADOR2(Integer.parseInt(valor[0].toString()));

            td.AlterarDaoAtuador2(tm);
            System.out.println("Controle Alterar Atuador2 ok");
        } catch (SQLException ex) {
            System.out.println("erro ao alterar Atuador2 " + ex);
        }
    }

 public void AlterarControleSensor(Object... valor) {
        try {
            tm.setFUNCAO_SENSOR((String) valor[1]);
            tm.setPINOS_SENSOR((String) valor[2]);
            tm.setREFERENCIA_SENSOR((String) valor[3]);
            tm.setCONECTOR_GT3_SENSOR((String) valor[4]);
            tm.setCONECTOR_GT4_SENSOR((String) valor[5]);
            tm.setID_SENSOR(Integer.parseInt(valor[0].toString()));

            td.AlterarDaoSensor(tm);
            System.out.println("Controle Alterar Sensor ok");
        } catch (SQLException ex) {
            System.out.println("erro ao alterar Sensor " + ex);
        }
    }

 public void AlterarControleSensor2(Object... valor) {
        try {
            tm.setFUNCAO_SENSOR2((String) valor[1]);
            tm.setPINOS_SENSOR2((String) valor[2]);
            tm.setREFERENCIA_SENSOR2((String) valor[3]);
            tm.setCONECTOR_GT3_SENSOR2((String) valor[4]);
            tm.setCONECTOR_GT4_SENSOR2((String) valor[5]);
            tm.setID_SENSOR2(Integer.parseInt(valor[0].toString()));

            td.AlterarDaoSensor2(tm);
            System.out.println("Controle Alterar Sensor ok");
        } catch (SQLException ex) {
            System.out.println("erro ao alterar Sensor " + ex);
        }
    }

 public void AlterarControleAlarme(Object... valor) {
        try {
            tm.setFUNCAO_ALARME((String) valor[1]);
            tm.setPINOS_ALARME((String) valor[2]);
            tm.setREFERENCIA_ALARME((String) valor[3]);
            tm.setCONECTOR_GT3_ALARME((String) valor[4]);
            tm.setCONECTOR_GT4_ALARME((String) valor[5]);
            tm.setID_ALARME(Integer.parseInt(valor[0].toString()));

            td.AlterarDaoAlarme(tm);
            System.out.println("Controle Alterar Alarme ok");
        } catch (SQLException ex) {
            System.out.println("erro ao alterar Alarme " + ex);
        }
    }

 public void AlterarControleComunicacao(Object... valor) {
        try {
            tm.setFUNCAO_COMUNICACAO((String) valor[1]);
            tm.setPINOS_COMUNICACAO((String) valor[2]);
            tm.setREFERENCIA_COMUNICACAO((String) valor[3]);
            tm.setCONECTOR_GT3_COMUNICACAO((String) valor[4]);
            tm.setCONECTOR_GT4_COMUNICACAO((String) valor[5]);
            tm.setID_COMUNICACAO(Integer.parseInt(valor[0].toString()));

            td.AlterarDaoComunicacao(tm);
            System.out.println("Controle Alterar Comunicacao ok");
        } catch (SQLException ex) {
            System.out.println("erro ao alterar Comunicacao " + ex);
        }
    }

 public void AlterarControleInjetor(Object... valor) {
        try {
            tm.setFUNCAO_INJETOR((String) valor[1]);
            tm.setPINOS_INJETOR((String) valor[2]);
            tm.setREFERENCIA_INJETOR((String) valor[3]);
            tm.setCONECTOR_GT3_INJETOR((String) valor[4]);
            tm.setCONECTOR_GT4_INJETOR((String) valor[5]);
            tm.setID_INJETOR(Integer.parseInt(valor[0].toString()));

            td.AlterarDaoIjetor(tm);
            System.out.println("Controle Alterar Injetor ok");
        } catch (SQLException ex) {
            System.out.println("erro ao alterar Injetor " + ex);
        }
    }


 public void AlterarControlePbi(Object... valor) {
        try {
            tm.setFUNCAO_PBI((String) valor[1]);
            tm.setPINOS_PBI((String) valor[2]);
            tm.setREFERENCIA_PBI((String) valor[3]);
            tm.setCONECTOR_GT3_PBI((String) valor[4]);
            tm.setCONECTOR_GT4_PBI((String) valor[5]);
            tm.setID_PBI(Integer.parseInt(valor[0].toString()));

            td.AlterarDaoPbi(tm);
            System.out.println("Controle Alterar P.B.I ok");
        } catch (SQLException ex) {
            System.out.println("erro ao alterar P.B.I " + ex);
        }
    }

}
