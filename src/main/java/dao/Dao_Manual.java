package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Modelo_Manual;
import modelo.Modelo_Modelo;
import modelo.Modelo_Sinais;

/**
 * @author INOVA GleSantoro
 */
public class Dao_Manual {

    Modelo_Manual mm = new Modelo_Manual();
    Modelo_Modelo md = new Modelo_Modelo();
    Modelo_Sinais tm = new Modelo_Sinais();

    ResultSet resultado;
    Connection conn;
    PreparedStatement stm;

    /*
SALVAR IMAGEM
     */
    public void SalvarDaoImagem(Object... valor) {
        String SQL_Imagem = "INSERT INTO imagem (arquivo, imagem) value (?,?)";
        mm = (Modelo_Manual) valor[0];
        conn = ConexaoBanco.abreConexao();

        try {
            stm = (PreparedStatement) conn.prepareStatement(SQL_Imagem);

            stm.setString(1, mm.getARQUIVO());
            stm.setString(2, mm.getIMAGEM());

            stm.execute();
            System.out.println(stm);
            JOptionPane.showMessageDialog(null, "Imagem Salvo com sucesso!");
        } catch (Exception e) {
            System.out.println("Dao Salvar Imagem " + e);
        }
    }

    /*
EXCLUIR IMAGEM
     */
    public void excluirDaoImagem(Object... valor) {
        String Del_IMAGEM = "DELETE FROM manual_gt4.imagem WHERE id = ?";
        mm = (Modelo_Manual) valor[0];
        conn = ConexaoBanco.abreConexao();
        try {
            stm = (PreparedStatement) conn.prepareStatement(Del_IMAGEM);
            stm.setInt(1, mm.getID_IMAGEM());

            stm.execute();
            JOptionPane.showConfirmDialog(null, "Deseja apagar esta imagem? ");
        } catch (SQLException e) {
            System.out.println("Dao Excluir " + e);
        }
    }

    /*
CONSULTA IMAGEM
     */
    public void ConsultarDaoImagem(Object... valor) throws SQLException {
        String SQL_IMG = "SELECT * FROM manual_gt4.imagem";
        DefaultTableModel tabelaImagem = (DefaultTableModel) valor[1];
        conn = ConexaoBanco.abreConexao();
        stm = ConexaoBanco.abreConexao().prepareStatement(SQL_IMG);
        try {
            resultado = stm.executeQuery();

            if ("".equals((String) valor[0])) {
                SQL_IMG = "SELECT * FROM manual_gt4.imagem";
            } else {
                SQL_IMG = "SELECT * FROM manual_gt4.imagem WHERE arquivo LIKE '%" + valor[0] + "%' ";
            }

            while (resultado.next()) {
                tabelaImagem.addRow(
                        new Object[]{
                            resultado.getInt("id"),
                            resultado.getString("arquivo"),
                            resultado.getString("imagem")
                        });
            }
            stm.close();

        } catch (SQLException e) {
            System.out.println("DAO Consulta Tabela Imagem " + e);
        }

    }

    /*
SALVAR MANUAL
     */
    public void salvaDaoManual(Object... valor) throws SQLException {
        String SQL_Manual = "INSERT INTO manual_gt4.manual (montadora, modelo, imobilizador, tiposimulador"
                + ", imagem, observacao) value (?,?,?,?,?,?)";
        mm = (Modelo_Manual) valor[0];
        conn = ConexaoBanco.abreConexao();

        try {
            stm = (PreparedStatement) conn.prepareStatement(SQL_Manual);

            stm.setString(1, mm.getMONTADORA());
            stm.setString(2, mm.getMODELO());
            stm.setString(3, mm.getIMOBILIZADOR());
            stm.setString(4, mm.getTIPO_SIMULADOR());
            stm.setString(5, mm.getIMAGEM());
            stm.setString(6, mm.getOBSERVACAO());

            stm.execute();
            System.out.println(stm);
            JOptionPane.showMessageDialog(null, "Manual Salvo com sucesso!");
        } catch (Exception e) {
            System.out.println("Dao Salvar Manual " + e);
        }
    }

    /*
ALTERAR MANUAL
     */
    public void AlterarDaoManual(Object... valor) throws SQLException {
        String UP_MANUAL = "UPDATE manual_gt4.manual SET montadora = ?, "
                + "modelo = ?, imobilizador = ?, "
                + "tiposimulador = ?, imagem = ?, tiposinal1 =?, tiposinal2=?"
                + "tiposinal3=?, observacao=? "
                + " WHERE id= ?";

        mm = (Modelo_Manual) valor[0];
        conn = ConexaoBanco.abreConexao();
        stm = (PreparedStatement) conn.prepareStatement(UP_MANUAL);

        try {
            stm.setString(1, mm.getMONTADORA());
            stm.setString(2, mm.getMODELO());
            stm.setString(3, mm.getIMOBILIZADOR());
            stm.setString(4, mm.getTIPO_SIMULADOR());
            stm.setString(5, mm.getIMAGEM());
            stm.setString(6, mm.getTIPO_SINAL1());
            stm.setString(7, mm.getTIPO_SINAL2());
            stm.setString(8, mm.getTIPO_SINAL3());
            stm.setString(9, mm.getOBSERVACAO());
            stm.setInt(10, mm.getID());

            stm.execute();
            System.out.println(stm);
            JOptionPane.showMessageDialog(null, "Manual alterado com sucesso!");

        } catch (SQLException e) {
            System.out.println("Dao Alterar Manual" + e);
        } finally {
            try {
                if (stm != null) {
                    stm.close();
                }
            } catch (SQLException e) {
                System.out.println("Dao Alter Manual" + e);
            }
        }
    }


    /*
CONSULTAR MANUAL
     */
    public void consultaDaoManual(Object... valor) throws SQLException {
        String SQL_MANUAL = "SELECT * FROM manual_gt4.manual";
        DefaultTableModel tabelaImagem = (DefaultTableModel) valor[1];
        conn = ConexaoBanco.abreConexao();
        stm = ConexaoBanco.abreConexao().prepareStatement(SQL_MANUAL);
        try {
            resultado = stm.executeQuery();

            if ("".equals((String) valor[0])) {
                SQL_MANUAL = "SELECT * FROM manual_gt4.manual";
            } else {
                SQL_MANUAL = "SELECT * FROM manual_gt4.manual WHERE montadora LIKE '%" + valor[0] + "%' ";
            }

            while (resultado.next()) {
                tabelaImagem.addRow(
                        new Object[]{
                            resultado.getInt("id"),
                            resultado.getString("montadora"),
                            resultado.getString("modelo"),
                            resultado.getString("imobilizador"),
                            resultado.getString("tiposimulador"),
                            resultado.getString("imagem"),
                            resultado.getString("observacao")});
            }
            stm.close();

        } catch (SQLException e) {
            System.out.println("DAO Consulta Tabela Manual " + e);
        }
    }

    /*
EXCLUIR IMAGEM
     */
    public void excluirDaoManual(Object... valor) {
        String Del_Manual = "DELETE FROM manual_gt4.manual WHERE id = ?";
        mm = (Modelo_Manual) valor[0];
        conn = ConexaoBanco.abreConexao();
        try {
            stm = (PreparedStatement) conn.prepareStatement(Del_Manual);
            stm.setInt(1, mm.getID());

            stm.execute();
            JOptionPane.showConfirmDialog(null, "Deseja mesmo apagar esta Opção? ");
        } catch (SQLException e) {
            System.out.println("Dao Excluir " + e);
        }
    }


    /*
COMBOBOX
     */
    public void ComboBoxDaoMontadora(Object... valor) throws SQLException {
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) valor[1];
        conn = ConexaoBanco.abreConexao();
        String SQL_BOX = "SELECT montadora FROM montadora ORDER BY montadora ";
        try {
            stm = ConexaoBanco.abreConexao().prepareStatement(SQL_BOX);
            resultado = stm.executeQuery();
            while (resultado.next()) {
                modelo.addElement(
                        resultado.getString("montadora")
                );
            }

        } catch (SQLException e) {
            System.out.println("Dao ComboBox Montadora " + e);
        }

    }

    public void ComboBoxDaoModelo(Object... valor) throws SQLException {
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) valor[1];
        conn = ConexaoBanco.abreConexao();
        String SQL_BOX = "SELECT modelo FROM manual_gt4.modelo ORDER BY modelo ";
        try {
            stm = ConexaoBanco.abreConexao().prepareStatement(SQL_BOX);
            resultado = stm.executeQuery();
            while (resultado.next()) {
                modelo.addElement(
                        resultado.getString("modelo")
                );
            }

        } catch (SQLException e) {
            System.out.println("Dao ComboBox Modelo " + e);
        }

    }

    public void ComboBoxDaoImobilizador(Object... valor) throws SQLException {
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) valor[1];
        conn = ConexaoBanco.abreConexao();
        String SQL_BOX = "SELECT imobilizador FROM imobilizador ORDER BY imobilizador asc ";
        try {
            stm = ConexaoBanco.abreConexao().prepareStatement(SQL_BOX);
            resultado = stm.executeQuery();
            while (resultado.next()) {
                modelo.addElement(
                        resultado.getString("imobilizador")
                );
            }

        } catch (SQLException e) {
            System.out.println("Dao ComboBox Imobiilizador " + e);
        }

    }

    public void ComboBoxDaoSimulador(Object... valor) throws SQLException {
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) valor[1];
        conn = ConexaoBanco.abreConexao();
        String SQL_BOX = "SELECT tipo FROM tiposimulador ORDER BY tipo asc ";
        try {
            stm = ConexaoBanco.abreConexao().prepareStatement(SQL_BOX);
            resultado = stm.executeQuery();
            while (resultado.next()) {
                modelo.addElement(
                        resultado.getString("tipo")
                );
            }

        } catch (SQLException e) {
            System.out.println("Dao ComboBox Simulador " + e);
        }

    }

//SALVA TABELA DE SINAIS
    public void SalvaDaoTabelaSinal_0(Object... valor) {

        String SQL_CHECK_ALI = "INSERT INTO sinal(tipo, funcao, pinos_central, referencia,"
                + " conectorgt3, conectorgt4, id_manual) values (?,?,?,?,?,?,?)";
        mm = (Modelo_Manual) valor[0];
        conn = ConexaoBanco.abreConexao();

        try {

            stm = (PreparedStatement) conn.prepareStatement(SQL_CHECK_ALI);

            stm.setString(1, mm.getTIPO_SINAL1());
            stm.setString(2, mm.getFUNCAO());
            stm.setString(3, mm.getPINOS_CENTRAL());
            stm.setString(4, mm.getREFERENCIA());
            stm.setString(5, mm.getCONECTOR_GT3());
            stm.setString(6, mm.getCONECTOR_GT4());
            stm.setInt(7, mm.getID());

            stm.execute();
            System.out.println(stm);
            JOptionPane.showMessageDialog(null, " Tabela Sinal Salvo com sucesso ");
        } catch (Exception e) {
            System.out.println("Dao Salvar Manual Tsbela Sinal" + e);
        }

    }

    public void SalvaDaoTabelaSinal_1(Object... valor) {

        String SQL_CHECK = "INSERT INTO sinal_1(tipo, funcao, pinos_central, referencia,"
                + " conectorgt3, conectorgt4, id_manual) values (?,?,?,?,?,?,?)";
        mm = (Modelo_Manual) valor[0];
        conn = ConexaoBanco.abreConexao();

        try {

            stm = (PreparedStatement) conn.prepareStatement(SQL_CHECK);

            stm.setString(1, mm.getTIPO_SINAL1());
            stm.setString(2, mm.getFUNCAO());
            stm.setString(3, mm.getPINOS_CENTRAL());
            stm.setString(4, mm.getREFERENCIA());
            stm.setString(5, mm.getCONECTOR_GT3());
            stm.setString(6, mm.getCONECTOR_GT4());
            stm.setInt(7, mm.getID());

            stm.execute();
            System.out.println(stm);
            JOptionPane.showMessageDialog(null, " Tabela Sinal Salvo com sucesso ");
        } catch (Exception e) {
            System.out.println("Dao Salvar Manual Tsbela Sinal" + e);
        }

    }

    public void SalvaDaoTabelaSinal_2(Object... valor) {

        String SQL_CHECK = "INSERT INTO sinal_2(tipo, funcao, pinos_central, referencia,"
                + " conectorgt3, conectorgt4, id_manual) values (?,?,?,?,?,?,?)";
        mm = (Modelo_Manual) valor[0];
        conn = ConexaoBanco.abreConexao();

        try {

            stm = (PreparedStatement) conn.prepareStatement(SQL_CHECK);

            stm.setString(1, mm.getTIPO_SINAL1());
            stm.setString(2, mm.getFUNCAO());
            stm.setString(3, mm.getPINOS_CENTRAL());
            stm.setString(4, mm.getREFERENCIA());
            stm.setString(5, mm.getCONECTOR_GT3());
            stm.setString(6, mm.getCONECTOR_GT4());
            stm.setInt(7, mm.getID());

            stm.execute();
            System.out.println(stm);
            JOptionPane.showMessageDialog(null, " Tabela Sinal Salvo com sucesso ");
        } catch (Exception e) {
            System.out.println("Dao Salvar Manual Tsbela Sinal" + e);
        }

    }

    public void SalvaDaoTabelaSinal_3(Object... valor) {

        String SQL_CHECK_ALI = "INSERT INTO sinal_3(tipo, funcao, pinos_central, referencia,"
                + " conectorgt3, conectorgt4, id_manual) values (?,?,?,?,?,?,?)";
        mm = (Modelo_Manual) valor[0];
        conn = ConexaoBanco.abreConexao();

        try {

            stm = (PreparedStatement) conn.prepareStatement(SQL_CHECK_ALI);

            stm.setString(1, mm.getTIPO_SINAL1());
            stm.setString(2, mm.getFUNCAO());
            stm.setString(3, mm.getPINOS_CENTRAL());
            stm.setString(4, mm.getREFERENCIA());
            stm.setString(5, mm.getCONECTOR_GT3());
            stm.setString(6, mm.getCONECTOR_GT4());
            stm.setInt(7, mm.getID());

            stm.execute();
            System.out.println(stm);
            JOptionPane.showMessageDialog(null, " Tabela Sinal Salvo com sucesso ");
        } catch (Exception e) {
            System.out.println("Dao Salvar Manual Tsbela Sinal" + e);
        }

    }

    public void SalvaDaoTabelaSinal_4(Object... valor) {

        String SQL_CHECK_ALI = "INSERT INTO sinal_4(tipo, funcao, pinos_central, referencia,"
                + " conectorgt3, conectorgt4, id_manual) values (?,?,?,?,?,?,?)";
        mm = (Modelo_Manual) valor[0];
        conn = ConexaoBanco.abreConexao();

        try {

            stm = (PreparedStatement) conn.prepareStatement(SQL_CHECK_ALI);

            stm.setString(1, mm.getTIPO_SINAL1());
            stm.setString(2, mm.getFUNCAO());
            stm.setString(3, mm.getPINOS_CENTRAL());
            stm.setString(4, mm.getREFERENCIA());
            stm.setString(5, mm.getCONECTOR_GT3());
            stm.setString(6, mm.getCONECTOR_GT4());
            stm.setInt(7, mm.getID());

            stm.execute();
            System.out.println(stm);
            JOptionPane.showMessageDialog(null, " Tabela Sinal Salvo com sucesso ");
        } catch (Exception e) {
            System.out.println("Dao Salvar Manual Tsbela Sinal" + e);
        }

    }

    public void SalvaDaoTabelaSinal_5(Object... valor) {

        String SQL_CHECK_ALI = "INSERT INTO sinal_5(tipo, funcao, pinos_central, referencia,"
                + " conectorgt3, conectorgt4, id_manual) values (?,?,?,?,?,?,?)";
        mm = (Modelo_Manual) valor[0];
        conn = ConexaoBanco.abreConexao();

        try {

            stm = (PreparedStatement) conn.prepareStatement(SQL_CHECK_ALI);

            stm.setString(1, mm.getTIPO_SINAL1());
            stm.setString(2, mm.getFUNCAO());
            stm.setString(3, mm.getPINOS_CENTRAL());
            stm.setString(4, mm.getREFERENCIA());
            stm.setString(5, mm.getCONECTOR_GT3());
            stm.setString(6, mm.getCONECTOR_GT4());
            stm.setInt(7, mm.getID());

            stm.execute();
            System.out.println(stm);
            JOptionPane.showMessageDialog(null, " Tabela Sinal Salvo com sucesso ");
        } catch (Exception e) {
            System.out.println("Dao Salvar Manual Tsbela Sinal" + e);
        }

    }

    public void SalvaDaoTabelaSinal_6(Object... valor) {

        String SQL_CHECK_ALI = "INSERT INTO sinal_6(tipo, funcao, pinos_central, referencia,"
                + " conectorgt3, conectorgt4, id_manual) values (?,?,?,?,?,?,?)";
        mm = (Modelo_Manual) valor[0];
        conn = ConexaoBanco.abreConexao();

        try {

            stm = (PreparedStatement) conn.prepareStatement(SQL_CHECK_ALI);

            stm.setString(1, mm.getTIPO_SINAL1());
            stm.setString(2, mm.getFUNCAO());
            stm.setString(3, mm.getPINOS_CENTRAL());
            stm.setString(4, mm.getREFERENCIA());
            stm.setString(5, mm.getCONECTOR_GT3());
            stm.setString(6, mm.getCONECTOR_GT4());
            stm.setInt(7, mm.getID());

            stm.execute();
            System.out.println(stm);
            JOptionPane.showMessageDialog(null, " Tabela Sinal Salvo com sucesso ");
        } catch (Exception e) {
            System.out.println("Dao Salvar Manual Tsbela Sinal" + e);
        }

    }

    public void SalvaDaoTabelaSinal_7(Object... valor) {

        String SQL_CHECK_ALI = "INSERT INTO sinal_7(tipo, funcao, pinos_central, referencia,"
                + " conectorgt3, conectorgt4, id_manual) values (?,?,?,?,?,?,?)";
        mm = (Modelo_Manual) valor[0];
        conn = ConexaoBanco.abreConexao();

        try {

            stm = (PreparedStatement) conn.prepareStatement(SQL_CHECK_ALI);

            stm.setString(1, mm.getTIPO_SINAL1());
            stm.setString(2, mm.getFUNCAO());
            stm.setString(3, mm.getPINOS_CENTRAL());
            stm.setString(4, mm.getREFERENCIA());
            stm.setString(5, mm.getCONECTOR_GT3());
            stm.setString(6, mm.getCONECTOR_GT4());
            stm.setInt(7, mm.getID());

            stm.execute();
            System.out.println(stm);
            JOptionPane.showMessageDialog(null, " Tabela Sinal Salvo com sucesso ");
        } catch (Exception e) {
            System.out.println("Dao Salvar Manual Tsbela Sinal" + e);
        }

    }

    public void SalvaDaoTabelaSinal_8(Object... valor) {

        String SQL_CHECK_ALI = "INSERT INTO sinal_8(tipo, funcao, pinos_central, referencia,"
                + " conectorgt3, conectorgt4, id_manual) values (?,?,?,?,?,?,?)";
        mm = (Modelo_Manual) valor[0];
        conn = ConexaoBanco.abreConexao();

        try {

            stm = (PreparedStatement) conn.prepareStatement(SQL_CHECK_ALI);

            stm.setString(1, mm.getTIPO_SINAL1());
            stm.setString(2, mm.getFUNCAO());
            stm.setString(3, mm.getPINOS_CENTRAL());
            stm.setString(4, mm.getREFERENCIA());
            stm.setString(5, mm.getCONECTOR_GT3());
            stm.setString(6, mm.getCONECTOR_GT4());
            stm.setInt(7, mm.getID());

            stm.execute();
            System.out.println(stm);
            JOptionPane.showMessageDialog(null, " Tabela Sinal Salvo com sucesso ");
        } catch (Exception e) {
            System.out.println("Dao Salvar Manual Tsbela Sinal" + e);
        }

    }
}
