package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Modelo_Modelo;
import modelo.Modelo_Sinais;

/**
 * @author INOVA GleSantoro
 */
public class Dao_Sinal {

    Modelo_Sinais tm = new Modelo_Sinais();
    Modelo_Modelo mm = new Modelo_Modelo();
    ResultSet resultado;
    Connection conn;
    PreparedStatement stm;

    /*
SALVAR
     */
    public void salvaDaoAlimentacao(Object... valor) throws SQLException {
        String SQL_ali = "INSERT INTO manual_gt4.alimentacao ("
                + "funcao, "
                + "pinos_central, "
                + "referencia, "
                + "conectorgt3, "
                + "conectorgt4) "
                + "VALUES(?,?,?,?,?)";
        tm = (Modelo_Sinais) valor[0];
        conn = ConexaoBanco.abreConexao();
        stm = (PreparedStatement) conn.prepareStatement(SQL_ali);

        try {
            stm.setString(1, tm.getFUNCAO_ALIMENTACAO());
            stm.setString(2, tm.getPINOS_ALIMENTACAO());
            stm.setString(3, tm.getREFERENCIA_ALIMENTACAO());
            stm.setString(4, tm.getCONECTOR_GT3_ALIMENTACAO());
            stm.setString(5, tm.getCONECTOR_GT4_ALIMENTACAO());

            stm.execute();
            JOptionPane.showMessageDialog(null, "Linha da Tabela Alimentação, Salvo com sucesso!");

        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                if (stm != null) {
                    stm.close();
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }

    public void salvaDaoAtuador(Object... valor) throws SQLException {
        String SQL_atu = "INSERT INTO manual_gt4.atuador ("
                + "funcao, "
                + "pinos_central, "
                + "referencia, "
                + "conectorgt3, "
                + "conectorgt4) "
                + "VALUES(?,?,?,?,?)";
        tm = (Modelo_Sinais) valor[0];
        conn = ConexaoBanco.abreConexao();
        stm = (PreparedStatement) conn.prepareStatement(SQL_atu);

        try {
            stm.setString(1, tm.getFUNCAO_ATUADOR());
            stm.setString(2, tm.getPINOS_ATUADOR());
            stm.setString(3, tm.getREFERENCIA_ATUADOR());
            stm.setString(4, tm.getCONECTOR_GT3_ATUADOR());
            stm.setString(5, tm.getCONECTOR_GT4_ATUADOR());
//            stm.setInt(6, tm.getID_MODELO_ATUADOR());

            stm.execute();
            JOptionPane.showMessageDialog(null, "Linha da Tabela Atuador, Salvo com sucesso!");

        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                if (stm != null) {
                    stm.close();
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }

    public void salvaDaoAtuador2(Object... valor) throws SQLException {
        String SQL_atu2 = "INSERT INTO manual_gt4.atuador2 ("
                + "funcao, "
                + "pinos_central, "
                + "referencia, "
                + "conectorgt3, "
                + "conectorgt4) "
                + "VALUES(?,?,?,?,?)";
        tm = (Modelo_Sinais) valor[0];
        conn = ConexaoBanco.abreConexao();
        stm = (PreparedStatement) conn.prepareStatement(SQL_atu2);

        try {
            stm.setString(1, tm.getFUNCAO_ATUADOR2());
            stm.setString(2, tm.getPINOS_ATUADOR2());
            stm.setString(3, tm.getREFERENCIA_ATUADOR2());
            stm.setString(4, tm.getCONECTOR_GT3_ATUADOR2());
            stm.setString(5, tm.getCONECTOR_GT4_ATUADOR2());;

            stm.execute();
            JOptionPane.showMessageDialog(null, "Linha da Tabela Atuador2, Salvo com sucesso!");

        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                if (stm != null) {
                    stm.close();
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }

    public void salvaDaoAlarme(Object... valor) throws SQLException {
        String SQL_ala = "INSERT INTO manual_gt4.alarme ("
                + "funcao, "
                + "pinos_central, "
                + "referencia, "
                + "conectorgt3, "
                + "conectorgt4) "
                + "VALUES(?,?,?,?,?)";
        tm = (Modelo_Sinais) valor[0];
        conn = ConexaoBanco.abreConexao();
        stm = (PreparedStatement) conn.prepareStatement(SQL_ala);

        try {
            stm.setString(1, tm.getFUNCAO_ALARME());
            stm.setString(2, tm.getPINOS_ALARME());
            stm.setString(3, tm.getREFERENCIA_ALARME());
            stm.setString(4, tm.getCONECTOR_GT3_ALARME());
            stm.setString(5, tm.getCONECTOR_GT4_ALARME());;

            stm.execute();
            JOptionPane.showMessageDialog(null, "Linha da Tabela Alarme, Salvo com sucesso!");

        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                if (stm != null) {
                    stm.close();
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }

    public void salvaDaoComunicacao(Object... valor) throws SQLException {
        String SQL_com = "INSERT INTO manual_gt4.comunicacao("
                + "funcao, "
                + "pinos_central, "
                + "referencia, "
                + "conectorgt3, "
                + "conectorgt4) "
                + "VALUES(?,?,?,?,?)";
        tm = (Modelo_Sinais) valor[0];
        conn = ConexaoBanco.abreConexao();
        stm = (PreparedStatement) conn.prepareStatement(SQL_com);

        try {
            stm.setString(1, tm.getFUNCAO_COMUNICACAO());
            stm.setString(2, tm.getPINOS_COMUNICACAO());
            stm.setString(3, tm.getREFERENCIA_COMUNICACAO());
            stm.setString(4, tm.getCONECTOR_GT3_COMUNICACAO());
            stm.setString(5, tm.getCONECTOR_GT4_COMUNICACAO());;

            stm.execute();
            JOptionPane.showMessageDialog(null, "Linha da Tabela Comunicação, Salvo com sucesso!");

        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                if (stm != null) {
                    stm.close();
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }

    public void salvaDaoInjetor(Object... valor) throws SQLException {
        String SQL_inj = "INSERT INTO manual_gt4.injetor ("
                + "funcao, "
                + "pinos_central, "
                + "referencia, "
                + "conectorgt3, "
                + "conectorgt4 ) "
                + "VALUES(?,?,?,?,?)";
        tm = (Modelo_Sinais) valor[0];
        conn = ConexaoBanco.abreConexao();
        stm = (PreparedStatement) conn.prepareStatement(SQL_inj);

        try {
            stm.setString(1, tm.getFUNCAO_INJETOR());
            stm.setString(2, tm.getPINOS_INJETOR());
            stm.setString(3, tm.getREFERENCIA_INJETOR());
            stm.setString(4, tm.getCONECTOR_GT3_INJETOR());
            stm.setString(5, tm.getCONECTOR_GT4_INJETOR());

            stm.execute();
            JOptionPane.showMessageDialog(null, "Linha da Tabela Injetor, Salvo com sucesso!");

        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                if (stm != null) {
                    stm.close();
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }

    public void salvaDaoSensor(Object... valor) throws SQLException {
        String SQL_sen = "INSERT INTO manual_gt4.sensor ("
                + "funcao, "
                + "pinos_central, "
                + "referencia, "
                + "conectorgt3, "
                + "conectorgt4) "
                + "VALUES(?,?,?,?,?)";
        tm = (Modelo_Sinais) valor[0];
        conn = ConexaoBanco.abreConexao();
        stm = (PreparedStatement) conn.prepareStatement(SQL_sen);

        try {
            stm.setString(1, tm.getFUNCAO_SENSOR());
            stm.setString(2, tm.getPINOS_SENSOR());
            stm.setString(3, tm.getREFERENCIA_SENSOR());
            stm.setString(4, tm.getCONECTOR_GT3_SENSOR());
            stm.setString(5, tm.getCONECTOR_GT4_SENSOR());

            stm.execute();
            JOptionPane.showMessageDialog(null, "Linha da Tabela Sensor, Salvo com sucesso!");

        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                if (stm != null) {
                    stm.close();
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }

    public void salvaDaoSensor2(Object... valor) throws SQLException {
        String SQL_sen2 = "INSERT INTO manual_gt4.sensor2 ("
                + "funcao, "
                + "pinos_central, "
                + "referencia, "
                + "conectorgt3, "
                + "conectorgt4) "
                + "VALUES(?,?,?,?,?)";
        tm = (Modelo_Sinais) valor[0];
        conn = ConexaoBanco.abreConexao();
        stm = (PreparedStatement) conn.prepareStatement(SQL_sen2);

        try {
            stm.setString(1, tm.getFUNCAO_SENSOR2());
            stm.setString(2, tm.getPINOS_SENSOR2());
            stm.setString(3, tm.getREFERENCIA_SENSOR2());
            stm.setString(4, tm.getCONECTOR_GT3_SENSOR2());
            stm.setString(5, tm.getCONECTOR_GT4_SENSOR2());

            stm.execute();
            JOptionPane.showMessageDialog(null, "Linha da Tabela Sensor2, Salvo com sucesso!");

        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                if (stm != null) {
                    stm.close();
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }

    public void salvaDaoPbi(Object... valor) throws SQLException {
        String SQL_pbi = "INSERT INTO manual_gt4.pbi ("
                + "funcao, "
                + "pinos_central, "
                + "referencia, "
                + "conectorgt3, "
                + "conectorgt4 ) "
                + "VALUES(?,?,?,?,?)";
        tm = (Modelo_Sinais) valor[0];
        conn = ConexaoBanco.abreConexao();
        stm = (PreparedStatement) conn.prepareStatement(SQL_pbi);

        try {
            stm.setString(1, tm.getFUNCAO_PBI());
            stm.setString(2, tm.getPINOS_PBI());
            stm.setString(3, tm.getREFERENCIA_PBI());
            stm.setString(4, tm.getCONECTOR_GT3_PBI());
            stm.setString(5, tm.getCONECTOR_GT4_PBI());

            stm.execute();
            JOptionPane.showMessageDialog(null, "Linha da Tabela, Salvo com sucesso!");

        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                if (stm != null) {
                    stm.close();
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }

    /*
EXCLUIR
     */
    public void ExcluirDaoAlimentacao(Object... valor) {
        String Del_ALIMENTACAO = "DELETE FROM manual_gt4.alimentacao WHERE id = ?";
        tm = (Modelo_Sinais) valor[0];
        conn = ConexaoBanco.abreConexao();
        try {
            stm = (PreparedStatement) conn.prepareStatement(Del_ALIMENTACAO);
            stm.setInt(1, tm.getID_ALIMENTACAO());

            stm.execute();
            JOptionPane.showConfirmDialog(null, "Deseja apagar essa linha? ");
        } catch (SQLException e) {
            System.out.println("Dao Excluir " + e);
        }

    }

    public void ExcluirDaoSensor(Object... valor) {
        String Del_SENSOR = "DELETE FROM manual_gt4.sensor WHERE id = ?";
        tm = (Modelo_Sinais) valor[0];
        conn = ConexaoBanco.abreConexao();
        try {
            stm = (PreparedStatement) conn.prepareStatement(Del_SENSOR);
            stm.setInt(1, tm.getID_SENSOR());

            stm.execute();
            JOptionPane.showConfirmDialog(null, "Deseja apagar essa linha? ");
        } catch (SQLException e) {
            System.out.println("Dao Excluir " + e);
        }

    }

    public void ExcluirDaoSensor2(Object... valor) {
        String Del_SENSOR2 = "DELETE FROM manual_gt4.sensor2 WHERE id = ?";
        tm = (Modelo_Sinais) valor[0];
        conn = ConexaoBanco.abreConexao();
        try {
            stm = (PreparedStatement) conn.prepareStatement(Del_SENSOR2);
            stm.setInt(1, tm.getID_SENSOR2());

            stm.execute();
            JOptionPane.showConfirmDialog(null, "Deseja apagar essa linha? ");
        } catch (SQLException e) {
            System.out.println("Dao Excluir " + e);
        }

    }

    public void ExcluirDaoAtuador(Object... valor) {
        String Del_ATUADOR = "DELETE FROM manual_gt4.atuador WHERE id = ?";
        tm = (Modelo_Sinais) valor[0];
        conn = ConexaoBanco.abreConexao();
        try {
            stm = (PreparedStatement) conn.prepareStatement(Del_ATUADOR);
            stm.setInt(1, tm.getID_ATUADOR());

            stm.execute();
            JOptionPane.showConfirmDialog(null, "Deseja apagar essa linha? ");
        } catch (SQLException e) {
            System.out.println("Dao Excluir " + e);
        }

    }

    public void ExcluirDaoAtuador2(Object... valor) {
        String Del_ATUADOR2 = "DELETE FROM manual_gt4.atuador2 WHERE id = ?";
        tm = (Modelo_Sinais) valor[0];
        conn = ConexaoBanco.abreConexao();
        try {
            stm = (PreparedStatement) conn.prepareStatement(Del_ATUADOR2);
            stm.setInt(1, tm.getID_ATUADOR2());

            stm.execute();
            JOptionPane.showConfirmDialog(null, "Deseja apagar essa linha? ");
        } catch (SQLException e) {
            System.out.println("Dao Excluir " + e);
        }

    }

    public void ExcluirDaoAlarme(Object... valor) {
        String Del_ALARME = "DELETE FROM manual_gt4.alarme WHERE id = ?";
        tm = (Modelo_Sinais) valor[0];
        conn = ConexaoBanco.abreConexao();
        try {
            stm = (PreparedStatement) conn.prepareStatement(Del_ALARME);
            stm.setInt(1, tm.getID_ALARME());

            stm.execute();
            JOptionPane.showConfirmDialog(null, "Deseja apagar essa linha? ");
        } catch (SQLException e) {
            System.out.println("Dao Excluir " + e);
        }

    }

    public void ExcluirDaoComunicacao(Object... valor) {
        String Del_COMUNICACAO = "DELETE FROM manual_gt4.comunicacao WHERE id = ?";
        tm = (Modelo_Sinais) valor[0];
        conn = ConexaoBanco.abreConexao();
        try {
            stm = (PreparedStatement) conn.prepareStatement(Del_COMUNICACAO);
            stm.setInt(1, tm.getID_COMUNICACAO());

            stm.execute();
            JOptionPane.showConfirmDialog(null, "Deseja apagar essa linha? ");
        } catch (SQLException e) {
            System.out.println("Dao Excluir " + e);
        }

    }

    public void ExcluirDaoInjetor(Object... valor) {
        String Del_INJETOR = "DELETE FROM manual_gt4.injetor WHERE id = ?";
        tm = (Modelo_Sinais) valor[0];
        conn = ConexaoBanco.abreConexao();
        try {
            stm = (PreparedStatement) conn.prepareStatement(Del_INJETOR);
            stm.setInt(1, tm.getID_INJETOR());

            stm.execute();
            JOptionPane.showConfirmDialog(null, "Deseja apagar essa linha? ");
        } catch (SQLException e) {
            System.out.println("Dao Excluir " + e);
        }

    }

    public void ExcluirDaoPbi(Object... valor) {
        String Del_PBI = "DELETE FROM manual_gt4.pbi WHERE id = ?";
        tm = (Modelo_Sinais) valor[0];
        conn = ConexaoBanco.abreConexao();
        try {
            stm = (PreparedStatement) conn.prepareStatement(Del_PBI);
            stm.setInt(1, tm.getID_PBI());

            stm.execute();
            JOptionPane.showConfirmDialog(null, "Deseja apagar essa linha? ");
        } catch (SQLException e) {
            System.out.println("Dao Excluir " + e);
        }

    }

    /*
CONSULTAR
     */
    public void consultaDaoAlimentacao(Object... valor) throws SQLException {
        String SQL_DB9 = "SELECT * FROM manual_gt4.alimentacao";
        DefaultTableModel tabela_Alimentacao = (DefaultTableModel) valor[1];
        conn = ConexaoBanco.abreConexao();
        try {
            stm = ConexaoBanco.abreConexao().prepareStatement(SQL_DB9);
            resultado = stm.executeQuery();

            if ("".equals((String) valor[0])) {
                SQL_DB9 = "SELECT * FROM manual_gt4.alimentacao";
            } else {
                SQL_DB9 = "SELECT * FROM manual_gt4.alimentacao WHERE funcao LIKE '%" + valor[0] + "%' ";
            }

            while (resultado.next()) {
                tabela_Alimentacao.addRow(
                        new Object[]{
                            resultado.getInt("id"),
                            resultado.getString("funcao"),
                            resultado.getString("pinos_central"),
                            resultado.getString("referencia"),
                            resultado.getString("conectorgt3"),
                            resultado.getString("conectorgt4")
                        });
            }
            stm.close();

        } catch (SQLException e) {
            System.out.println("DAO Consulta Tabela Alimentação " + e);
        }

    }

    public void consultaDaoSensor(Object... valor) throws SQLException {
        String SQL_DB25M = "SELECT * FROM manual_gt4.sensor";
        DefaultTableModel tabela_Sensor = (DefaultTableModel) valor[1];
        conn = ConexaoBanco.abreConexao();
        try {
            stm = ConexaoBanco.abreConexao().prepareStatement(SQL_DB25M);
            resultado = stm.executeQuery();

            if ("".equals((String) valor[0])) {
                SQL_DB25M = "SELECT * FROM manual_gt4.sensor";
            } else {
                SQL_DB25M = "SELECT * FROM manual_gt4.sensor WHERE funcao LIKE '%" + valor[0] + "%' ";
            }

            while (resultado.next()) {
                tabela_Sensor.addRow(
                        new Object[]{
                            resultado.getInt("id"),
                            resultado.getString("funcao"),
                            resultado.getString("pinos_central"),
                            resultado.getString("referencia"),
                            resultado.getString("conectorgt3"),
                            resultado.getString("conectorgt4")
                        });
            }
            stm.close();

        } catch (SQLException e) {
            System.out.println("DAO Consulta Tabela Sensor " + e);
        }

    }

    public void consultaDaoSensor2(Object... valor) throws SQLException {
        String SQL_DB25M2 = "SELECT * FROM manual_gt4.sensor2";
        DefaultTableModel tabela_Sensor2 = (DefaultTableModel) valor[1];
        conn = ConexaoBanco.abreConexao();
        try {
            stm = ConexaoBanco.abreConexao().prepareStatement(SQL_DB25M2);
            resultado = stm.executeQuery();

            if ("".equals((String) valor[0])) {
                SQL_DB25M2 = "SELECT * FROM manual_gt4.sensor2";
            } else {
                SQL_DB25M2 = "SELECT * FROM manual_gt4.sensor2 WHERE funcao LIKE '%" + valor[0] + "%' ";
            }

            while (resultado.next()) {
                tabela_Sensor2.addRow(
                        new Object[]{
                            resultado.getInt("id"),
                            resultado.getString("funcao"),
                            resultado.getString("pinos_central"),
                            resultado.getString("referencia"),
                            resultado.getString("conectorgt3"),
                            resultado.getString("conectorgt4")
                        });
            }
            stm.close();

        } catch (SQLException e) {
            System.out.println("DAO Consulta Tabela Sensor2 " + e);
        }

    }

    public void consultaDaoAtuador(Object... valor) throws SQLException {
        String SQL_DB25F = "SELECT * FROM manual_gt4.atuador";
        DefaultTableModel tabela_Atuador = (DefaultTableModel) valor[1];
        conn = ConexaoBanco.abreConexao();
        try {
            stm = ConexaoBanco.abreConexao().prepareStatement(SQL_DB25F);
            resultado = stm.executeQuery();

            if ("".equals((String) valor[0])) {
                SQL_DB25F = "SELECT * FROM manual_gt4.atuador";
            } else {
                SQL_DB25F = "SELECT * FROM manual_gt4.atuador WHERE funcao LIKE '%" + valor[0] + "%' ";
            }

            while (resultado.next()) {
                tabela_Atuador.addRow(
                        new Object[]{
                            resultado.getInt("id"),
                            resultado.getString("funcao"),
                            resultado.getString("pinos_central"),
                            resultado.getString("referencia"),
                            resultado.getString("conectorgt3"),
                            resultado.getString("conectorgt4")
                        });
            }
            stm.close();

        } catch (SQLException e) {
            System.out.println("DAO Consulta Tabela Atuador " + e);
        }

    }

    public void consultaDaoAtuador2(Object... valor) throws SQLException {
        String SQL_DB25F2 = "SELECT * FROM manual_gt4.atuador2";
        DefaultTableModel tabela_Atuador2 = (DefaultTableModel) valor[1];
        conn = ConexaoBanco.abreConexao();
        try {
            stm = ConexaoBanco.abreConexao().prepareStatement(SQL_DB25F2);
            resultado = stm.executeQuery();

            if ("".equals((String) valor[0])) {
                SQL_DB25F2 = "SELECT * FROM manual_gt4.atuador2";
            } else {
                SQL_DB25F2 = "SELECT * FROM manual_gt4.atuador2 WHERE funcao LIKE '%" + valor[0] + "%' ";
            }

            while (resultado.next()) {
                tabela_Atuador2.addRow(
                        new Object[]{
                            resultado.getInt("id"),
                            resultado.getString("funcao"),
                            resultado.getString("pinos_central"),
                            resultado.getString("referencia"),
                            resultado.getString("conectorgt3"),
                            resultado.getString("conectorgt4")
                        });
            }
            stm.close();

        } catch (SQLException e) {
            System.out.println("DAO Consulta Tabela Atuador " + e);
        }

    }

    public void consultaDaoAlarme(Object... valor) throws SQLException {
        String SQL_alarme = "SELECT * FROM manual_gt4.alarme";
        DefaultTableModel tabela_Alarme = (DefaultTableModel) valor[1];
        conn = ConexaoBanco.abreConexao();
        try {
            stm = ConexaoBanco.abreConexao().prepareStatement(SQL_alarme);
            resultado = stm.executeQuery();

            if ("".equals((String) valor[0])) {
                SQL_alarme = "SELECT * FROM manual_gt4.alarme";
            } else {
                SQL_alarme = "SELECT * FROM manual_gt4.alarme WHERE funcao LIKE '%" + valor[0] + "%' ";
            }

            while (resultado.next()) {
                tabela_Alarme.addRow(
                        new Object[]{
                            resultado.getInt("id"),
                            resultado.getString("funcao"),
                            resultado.getString("pinos_central"),
                            resultado.getString("referencia"),
                            resultado.getString("conectorgt3"),
                            resultado.getString("conectorgt4")
                        });
            }
            stm.close();

        } catch (SQLException e) {
            System.out.println("DAO Consulta Tabela Alarme " + e);
        }

    }

    public void consultaDaoComunicacao(Object... valor) throws SQLException {
        String SQL_comunicacao = "SELECT * FROM manual_gt4.comunicacao";
        DefaultTableModel tabela_Comunicacao = (DefaultTableModel) valor[1];
        conn = ConexaoBanco.abreConexao();
        try {
            stm = ConexaoBanco.abreConexao().prepareStatement(SQL_comunicacao);
            resultado = stm.executeQuery();

            if ("".equals((String) valor[0])) {
                SQL_comunicacao = "SELECT * FROM manual_gt4.comunicacao";
            } else {
                SQL_comunicacao = "SELECT * FROM manual_gt4.comunicacao WHERE funcao LIKE '%" + valor[0] + "%' ";
            }

            while (resultado.next()) {
                tabela_Comunicacao.addRow(
                        new Object[]{
                            resultado.getInt("id"),
                            resultado.getString("funcao"),
                            resultado.getString("pinos_central"),
                            resultado.getString("referencia"),
                            resultado.getString("conectorgt3"),
                            resultado.getString("conectorgt4")
                        });
            }
            stm.close();

        } catch (SQLException e) {
            System.out.println("DAO Consulta Tabela comunicacao " + e);
        }

    }

    public void consultaDaoInjetor(Object... valor) throws SQLException {
        String SQL_DB15F = "SELECT * FROM manual_gt4.injetor";
        DefaultTableModel tabela_Injetor = (DefaultTableModel) valor[1];
        conn = ConexaoBanco.abreConexao();
        try {
            stm = ConexaoBanco.abreConexao().prepareStatement(SQL_DB15F);
            resultado = stm.executeQuery();

            if ("".equals((String) valor[0])) {
                SQL_DB15F = "SELECT * FROM manual_gt4.injetor";
            } else {
                SQL_DB15F = "SELECT * FROM manual_gt4.injetor WHERE funcao LIKE '%" + valor[0] + "%' ";
            }

            while (resultado.next()) {
                tabela_Injetor.addRow(
                        new Object[]{
                            resultado.getInt("id"),
                            resultado.getString("funcao"),
                            resultado.getString("pinos_central"),
                            resultado.getString("referencia"),
                            resultado.getString("conectorgt3"),
                            resultado.getString("conectorgt4")
                        });
            }
            stm.close();

        } catch (SQLException e) {
            System.out.println("DAO Consulta Tabela Injetor " + e);
        }

    }

    public void consultaDaoPBI(Object... valor) throws SQLException {
        String SQL_DB_PBI = "SELECT * FROM manual_gt4.pbi";

        DefaultTableModel tabela_PBI = (DefaultTableModel) valor[1];
        conn = ConexaoBanco.abreConexao();
        try {
            stm = ConexaoBanco.abreConexao().prepareStatement(SQL_DB_PBI);
            resultado = stm.executeQuery();

            if ("".equals((String) valor[0])) {
                SQL_DB_PBI = "SELECT * FROM manual_gt4.pbi";
            } else {
                SQL_DB_PBI = "SELECT * FROM manual_gt4.pbi WHERE funcao LIKE '%" + valor[0] + "%' ";
            }

            while (resultado.next()) {
                tabela_PBI.addRow(
                        new Object[]{
                            resultado.getInt("id"),
                            resultado.getString("funcao"),
                            resultado.getString("pinos_central"),
                            resultado.getString("referencia"),
                            resultado.getString("conectorgt3"),
                            resultado.getString("conectorgt4")
                        });
            }
            stm.close();

        } catch (SQLException e) {
            System.out.println("DAO Consulta Tabela P.B.I " + e);
        }

    }

    /*
ALTERAR SINAL
     */
    public void AlterarDaoAlimentacao(Object... valor) throws SQLException {
        String UP_ALIMENTACAO = "UPDATE manual_gt4.alimentacao SET funcao = ?, "
                + "pinos_central = ?, referencia = ?, "
                + "conectorgt3 = ?, conectorgt4 = ? "
                + " WHERE id= ?";

        tm = (Modelo_Sinais) valor[0];
        conn = ConexaoBanco.abreConexao();
        stm = (PreparedStatement) conn.prepareStatement(UP_ALIMENTACAO);

        try {
            stm.setString(1, tm.getFUNCAO_ALIMENTACAO());
            stm.setString(2, tm.getPINOS_ALIMENTACAO());
            stm.setString(3, tm.getREFERENCIA_ALIMENTACAO());
            stm.setString(4, tm.getCONECTOR_GT3_ALIMENTACAO());
            stm.setString(5, tm.getCONECTOR_GT4_ALIMENTACAO());
            stm.setInt(6, tm.getID_ALIMENTACAO());

            stm.execute();
            System.out.println(stm);
            JOptionPane.showMessageDialog(null, "Linha da Tabela Alimentação, alterado com sucesso!");

        } catch (SQLException e) {
            System.out.println("Dao Alterar Pinos Alimentação " + e);
        } finally {
            try {
                if (stm != null) {
                    stm.close();
                }
            } catch (SQLException e) {
                System.out.println("Dao Alter alimentação " + e);
            }
        }
    }

    public void AlterarDaoAtuador(Object... valor) throws SQLException {
        String UP_ATUADOR = "UPDATE manual_gt4.atuador SET funcao = ?, "
                + "pinos_central = ?, referencia = ?, "
                + "conectorgt3 = ?, conectorgt4 = ? "
                + " WHERE id= ?";

        tm = (Modelo_Sinais) valor[0];
        conn = ConexaoBanco.abreConexao();
        stm = (PreparedStatement) conn.prepareStatement(UP_ATUADOR);

        try {
            stm.setString(1, tm.getFUNCAO_ATUADOR());
            stm.setString(2, tm.getPINOS_ATUADOR());
            stm.setString(3, tm.getREFERENCIA_ATUADOR());
            stm.setString(4, tm.getCONECTOR_GT3_ATUADOR());
            stm.setString(5, tm.getCONECTOR_GT4_ATUADOR());
            stm.setInt(6, tm.getID_ATUADOR());

            stm.execute();
            System.out.println(stm);
            JOptionPane.showMessageDialog(null, "Linha da Tabela Atuador, alterado com sucesso!");

        } catch (SQLException e) {
            System.out.println("Dao Alterar Pinos Atuador " + e);
        } finally {
            try {
                if (stm != null) {
                    stm.close();
                }
            } catch (SQLException e) {
                System.out.println("Dao Alter Atuador " + e);
            }
        }
    }

    public void AlterarDaoAtuador2(Object... valor) throws SQLException {
        String UP_ATUADOR2 = "UPDATE manual_gt4.atuador2 SET funcao = ?, "
                + "pinos_central = ?, referencia = ?, "
                + "conectorgt3 = ?, conectorgt4 = ? "
                + " WHERE id= ?";

        tm = (Modelo_Sinais) valor[0];
        conn = ConexaoBanco.abreConexao();
        stm = (PreparedStatement) conn.prepareStatement(UP_ATUADOR2);

        try {
            stm.setString(1, tm.getFUNCAO_ATUADOR2());
            stm.setString(2, tm.getPINOS_ATUADOR2());
            stm.setString(3, tm.getREFERENCIA_ATUADOR2());
            stm.setString(4, tm.getCONECTOR_GT3_ATUADOR2());
            stm.setString(5, tm.getCONECTOR_GT4_ATUADOR2());
            stm.setInt(6, tm.getID_ATUADOR2());

            stm.execute();
            System.out.println(stm);
            JOptionPane.showMessageDialog(null, "Linha da Tabela Atuador, alterado com sucesso!");

        } catch (SQLException e) {
            System.out.println("Dao Alterar Pinos Atuador " + e);
        } finally {
            try {
                if (stm != null) {
                    stm.close();
                }
            } catch (SQLException e) {
                System.out.println("Dao Alter Atuador " + e);
            }
        }
    }

    public void AlterarDaoSensor(Object... valor) throws SQLException {
        String UP_SENSOR = "UPDATE manual_gt4.sensor SET funcao = ?, "
                + "pinos_central = ?, referencia = ?, "
                + "conectorgt3 = ?, conectorgt4 = ? "
                + " WHERE id= ?";

        tm = (Modelo_Sinais) valor[0];
        conn = ConexaoBanco.abreConexao();
        stm = (PreparedStatement) conn.prepareStatement(UP_SENSOR);

        try {
            stm.setString(1, tm.getFUNCAO_SENSOR());
            stm.setString(2, tm.getPINOS_SENSOR());
            stm.setString(3, tm.getREFERENCIA_SENSOR());
            stm.setString(4, tm.getCONECTOR_GT3_SENSOR());
            stm.setString(5, tm.getCONECTOR_GT4_SENSOR());
            stm.setInt(6, tm.getID_SENSOR());

            stm.execute();
            System.out.println(stm);
            JOptionPane.showMessageDialog(null, "Linha da Tabela sensor, alterado com sucesso!");

        } catch (SQLException e) {
            System.out.println("Dao Alterar Pinos sensor " + e);
        } finally {
            try {
                if (stm != null) {
                    stm.close();
                }
            } catch (SQLException e) {
                System.out.println("Dao Alter alimentação " + e);
            }
        }
    }

    public void AlterarDaoSensor2(Object... valor) throws SQLException {
        String UP_SENSOR2 = "UPDATE manual_gt4.sensor2 SET funcao = ?, "
                + "pinos_central = ?, referencia = ?, "
                + "conectorgt3 = ?, conectorgt4 = ? "
                + " WHERE id= ?";

        tm = (Modelo_Sinais) valor[0];
        conn = ConexaoBanco.abreConexao();
        stm = (PreparedStatement) conn.prepareStatement(UP_SENSOR2);

        try {
            stm.setString(1, tm.getFUNCAO_SENSOR2());
            stm.setString(2, tm.getPINOS_SENSOR2());
            stm.setString(3, tm.getREFERENCIA_SENSOR2());
            stm.setString(4, tm.getCONECTOR_GT3_SENSOR2());
            stm.setString(5, tm.getCONECTOR_GT4_SENSOR2());
            stm.setInt(6, tm.getID_SENSOR2());

            stm.execute();
            System.out.println(stm);
            JOptionPane.showMessageDialog(null, "Linha da Tabela Sensor2, alterado com sucesso!");

        } catch (SQLException e) {
            System.out.println("Dao Alterar Pinos Sensor2 " + e);
        } finally {
            try {
                if (stm != null) {
                    stm.close();
                }
            } catch (SQLException e) {
                System.out.println("Dao Alter Sensor2 " + e);
            }
        }
    }

    public void AlterarDaoAlarme(Object... valor) throws SQLException {
        String UP_ALARME = "UPDATE manual_gt4.alarme SET funcao = ?, "
                + "pinos_central = ?, referencia = ?, "
                + "conectorgt3 = ?, conectorgt4 = ? "
                + " WHERE id= ?";

        tm = (Modelo_Sinais) valor[0];
        conn = ConexaoBanco.abreConexao();
        stm = (PreparedStatement) conn.prepareStatement(UP_ALARME);

        try {
            stm.setString(1, tm.getFUNCAO_ALARME());
            stm.setString(2, tm.getPINOS_ALARME());
            stm.setString(3, tm.getREFERENCIA_ALARME());
            stm.setString(4, tm.getCONECTOR_GT3_ALARME());
            stm.setString(5, tm.getCONECTOR_GT4_ALARME());
            stm.setInt(6, tm.getID_ALARME());

            stm.execute();
            System.out.println(stm);
            JOptionPane.showMessageDialog(null, "Linha da Tabela Alarmeo, alterado com sucesso!");

        } catch (SQLException e) {
            System.out.println("Dao Alterar Pinos Alarmeo " + e);
        } finally {
            try {
                if (stm != null) {
                    stm.close();
                }
            } catch (SQLException e) {
                System.out.println("Dao Alter Alarmeo " + e);
            }
        }
    }

    public void AlterarDaoComunicacao(Object... valor) throws SQLException {
        String UP_COMUNICACAO = "UPDATE manual_gt4.comunicacao SET funcao = ?, "
                + "pinos_central = ?, referencia = ?, "
                + "conectorgt3 = ?, conectorgt4 = ? "
                + " WHERE id= ?";

        tm = (Modelo_Sinais) valor[0];
        conn = ConexaoBanco.abreConexao();
        stm = (PreparedStatement) conn.prepareStatement(UP_COMUNICACAO);

        try {
            stm.setString(1, tm.getFUNCAO_COMUNICACAO());
            stm.setString(2, tm.getPINOS_COMUNICACAO());
            stm.setString(3, tm.getREFERENCIA_COMUNICACAO());
            stm.setString(4, tm.getCONECTOR_GT3_COMUNICACAO());
            stm.setString(5, tm.getCONECTOR_GT4_COMUNICACAO());
            stm.setInt(6, tm.getID_COMUNICACAO());

            stm.execute();
            System.out.println(stm);
            JOptionPane.showMessageDialog(null, "Linha da Tabela Comunicação, alterado com sucesso!");

        } catch (SQLException e) {
            System.out.println("Dao Alterar Pinos Comunicação " + e);
        } finally {
            try {
                if (stm != null) {
                    stm.close();
                }
            } catch (SQLException e) {
                System.out.println("Dao Alter Comunicação " + e);
            }
        }
    }

    public void AlterarDaoIjetor(Object... valor) throws SQLException {
        String UP_INJETOR = "UPDATE manual_gt4.injetor SET funcao = ?, "
                + "pinos_central = ?, referencia = ?, "
                + "conectorgt3 = ?, conectorgt4 = ? "
                + " WHERE id= ?";

        tm = (Modelo_Sinais) valor[0];
        conn = ConexaoBanco.abreConexao();
        stm = (PreparedStatement) conn.prepareStatement(UP_INJETOR);

        try {
            stm.setString(1, tm.getFUNCAO_INJETOR());
            stm.setString(2, tm.getPINOS_INJETOR());
            stm.setString(3, tm.getREFERENCIA_INJETOR());
            stm.setString(4, tm.getCONECTOR_GT3_INJETOR());;
            stm.setString(5, tm.getCONECTOR_GT4_INJETOR());
            stm.setInt(6, tm.getID_INJETOR());

            stm.execute();
            System.out.println(stm);
            JOptionPane.showMessageDialog(null, "Linha da Tabela Injetor, alterado com sucesso!");

        } catch (SQLException e) {
            System.out.println("Dao Alterar Pinos Injetor " + e);
        } finally {
            try {
                if (stm != null) {
                    stm.close();
                }
            } catch (SQLException e) {
                System.out.println("Dao Alter Injetor " + e);
            }
        }
    }

    public void AlterarDaoPbi(Object... valor) throws SQLException {
        String UP_PBI = "UPDATE manual_gt4.pbi SET funcao = ?, "
                + "pinos_central = ?, referencia = ?, "
                + "conectorgt3 = ?, conectorgt4 = ? "
                + " WHERE id= ?";

        tm = (Modelo_Sinais) valor[0];
        conn = ConexaoBanco.abreConexao();
        stm = (PreparedStatement) conn.prepareStatement(UP_PBI);

        try {
            stm.setString(1, tm.getFUNCAO_PBI());
            stm.setString(2, tm.getPINOS_PBI());
            stm.setString(3, tm.getREFERENCIA_PBI());
            stm.setString(4, tm.getCONECTOR_GT3_PBI());
            stm.setString(5, tm.getCONECTOR_GT4_PBI());
            stm.setInt(6, tm.getID_PBI());

            stm.execute();
            System.out.println(stm);
            JOptionPane.showMessageDialog(null, "Linha da Tabela Painel, BC, Imob, alterado com sucesso!");

        } catch (SQLException e) {
            System.out.println("Dao Alterar Pinos Painel, BC, Imob" + e);
        } finally {
            try {
                if (stm != null) {
                    stm.close();
                }
            } catch (SQLException e) {
                System.out.println("Dao Alter Painel, BC, Imob" + e);
            }
        }
    }

}
