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
public class Dao_Modelo {

    Modelo_Sinais tm = new Modelo_Sinais();
    Modelo_Modelo mm = new Modelo_Modelo();

    ResultSet resultado;
    Connection conn;
    PreparedStatement stm;

    /*
SALVAR 
     */
    public void salvaDaoMontadora(Object... valor) throws SQLException {
        String SQL_Montadora = "INSERT INTO manual_gt4.montadora (montadora ) "
                + "VALUES(?)";

        mm = (Modelo_Modelo) valor[0];
        conn = ConexaoBanco.abreConexao();
        stm = (PreparedStatement) conn.prepareStatement(SQL_Montadora);

        try {
            stm.setString(1, mm.getMONTADORA());

            stm.execute();
            JOptionPane.showMessageDialog(null, "Montadora salvo com Sucesso! ");
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

    public void salvaDaoModelo(Object... valor) throws SQLException {
        String SQL_Modelo = "INSERT INTO manual_gt4.modelo (modelo) "
                + "VALUES(?)";
        mm = (Modelo_Modelo) valor[0];
        conn = ConexaoBanco.abreConexao();
        stm = (PreparedStatement) conn.prepareStatement(SQL_Modelo);

        try {
            stm.setString(1, mm.getMODELO());

            stm.execute();
            System.out.println("Cadastro salvo com sucesso!");
            System.out.println(stm);

        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                if (stm != null) {
                    stm.close();
                }
            } catch (SQLException e) {
                System.out.println("dao salva modelo " + e);
            }
        }
    }

    public void salvaDaoImobilizador(Object... valor) throws SQLException {
        String SQL_Imobilizador = "INSERT INTO manual_gt4.imobilizador (imobilizador)"
                + "VALUES(?)";
        mm = (Modelo_Modelo) valor[0];
        conn = ConexaoBanco.abreConexao();
        stm = (PreparedStatement) conn.prepareStatement(SQL_Imobilizador);

        try {
            stm.setString(1, mm.getIMOBILIZADOR());

            stm.execute();
            System.out.println("Cadastro salvo com sucesso!");
            System.out.println(stm);

        } catch (SQLException e) {
            System.out.println("daor salva imobilizador " + e);
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
CONSULTTA
     */
    public void ConsultarDaoMontadora(Object... valor) {

        String SQL_MT = "SELECT * FROM manual_gt4.montadora";
        DefaultTableModel tabela_Montadora = (DefaultTableModel) valor[1];
        conn = ConexaoBanco.abreConexao();
        try {
            stm = ConexaoBanco.abreConexao().prepareStatement(SQL_MT);
            resultado = stm.executeQuery();

            if ("".equals((String) valor[0])) {
                SQL_MT = "SELECT * FROM manual_gt4.montadora";
            } else {
                SQL_MT = "SELECT * FROM manual_gt4.montadora WHERE funcao LIKE '%" + valor[0] + "%' ";
            }

            while (resultado.next()) {
                tabela_Montadora.addRow(
                        new Object[]{
                            resultado.getInt("id"),
                            resultado.getString("montadora")
                        });
            }
            stm.close();

        } catch (SQLException e) {
            System.out.println("DAO Consulta Tabela Monadora " + e);
        }

    }

    public void ConsultarDaoModelo(Object... valor) {

        String SQL_MD = "SELECT * FROM manual_gt4.modelo";
        DefaultTableModel tabela_Modelo = (DefaultTableModel) valor[1];
        conn = ConexaoBanco.abreConexao();
        try {
            stm = ConexaoBanco.abreConexao().prepareStatement(SQL_MD);
            resultado = stm.executeQuery();

            if ("".equals((String) valor[0])) {
                SQL_MD = "SELECT * FROM manual_gt4.modelo";
            } else {
                SQL_MD = "SELECT * FROM manual_gt4.modelo WHERE funcao LIKE '%" + valor[0] + "%' ";
            }

            while (resultado.next()) {
                tabela_Modelo.addRow(
                        new Object[]{
                            resultado.getInt("id"),
                            resultado.getString("modelo")
                        });
            }
            stm.close();

        } catch (SQLException e) {
            System.out.println("DAO Consulta Tabela Modelo " + e);
        }

    }

    public void ConsultarDaoImobilizador(Object... valor) {

        String SQL_IM = "SELECT * FROM manual_gt4.imobilizador";
        DefaultTableModel tabela_Imobilizador = (DefaultTableModel) valor[1];
        conn = ConexaoBanco.abreConexao();
        try {
            stm = ConexaoBanco.abreConexao().prepareStatement(SQL_IM);
            resultado = stm.executeQuery();

            if ("".equals((String) valor[0])) {
                SQL_IM = "SELECT * FROM manual_gt4.imobilizador";
            } else {
                SQL_IM = "SELECT * FROM manual_gt4.imobilizador WHERE funcao LIKE '%" + valor[0] + "%' ";
            }

            while (resultado.next()) {
                tabela_Imobilizador.addRow(
                        new Object[]{
                            resultado.getInt("id"),
                            resultado.getString("imobilizador")
                        });
            }
            stm.close();

        } catch (SQLException e) {
            System.out.println("DAO Consulta Tabela Monadora " + e);
        }

    }

    /*
EXCLUIR
     */
    public void excluirDaoMontadora(Object... valor) {
        String Del_MT = "DELETE FROM manual_gt4.montadora WHERE id = ?";
        mm = (Modelo_Modelo) valor[0];
        conn = ConexaoBanco.abreConexao();
        try {
            stm = (PreparedStatement) conn.prepareStatement(Del_MT);
            stm.setInt(1, mm.getID_MONTADORA());

            stm.execute();
            JOptionPane.showConfirmDialog(null, "Deseja apagar essa Montadora? ");
        } catch (SQLException e) {
            System.out.println("Dao Excluir " + e);
        }
    }

    public void excluirDaoModelo(Object... valor) {
        String Del_MD = "DELETE FROM manual_gt4.modelo WHERE id = ?";
        mm = (Modelo_Modelo) valor[0];
        conn = ConexaoBanco.abreConexao();
        try {
            stm = (PreparedStatement) conn.prepareStatement(Del_MD);
            stm.setInt(1, mm.getID_MODELO());

            stm.execute();
            JOptionPane.showConfirmDialog(null, "Deseja apagar essa Modelo? ");
        } catch (SQLException e) {
            System.out.println("Dao Excluir " + e);
        }
    }

    public void excluirDaoImobilizador(Object... valor) {
        String Del_IM = "DELETE FROM manual_gt4.imobilizador WHERE id = ?";
        mm = (Modelo_Modelo) valor[0];
        conn = ConexaoBanco.abreConexao();
        try {
            stm = (PreparedStatement) conn.prepareStatement(Del_IM);
            stm.setInt(1, mm.getID_IMOBILIZADOR());

            stm.execute();
            JOptionPane.showConfirmDialog(null, "Deseja apagar essa Imobilizador? ");
        } catch (SQLException e) {
            System.out.println("Dao Excluir " + e);
        }
    }

}
