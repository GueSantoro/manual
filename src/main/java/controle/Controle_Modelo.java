package controle;

import dao.Dao_Modelo;
import java.awt.image.BufferedImage;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Modelo_Modelo;

/**
 * @author INOVA GleSantoro
 */
public class Controle_Modelo {

    Modelo_Modelo mm = new Modelo_Modelo();
    Dao_Modelo td = new Dao_Modelo();

    BufferedImage imagem;

    public Controle_Modelo() {
    }

    /**
     * *************************************************************
     * SALVAR **********************************************************
     */
    public void salvaControleMontadora(Object... valor) {
        //consulta ModeloVisao 
        try {
            if ("".equals(valor[0])) {
                mm.setID_MONTADORA(0);
            } else {
                mm.setID_MONTADORA((int) valor[0]);
            }
            mm.setMONTADORA((String) valor[1]);

            td.salvaDaoMontadora(mm);
        } catch (SQLException ex) {
            System.out.println("erro " + ex);
        }
    }

    public void salvaControleModelo(Object... valor) {
        //consulta ModeloVisao 
        try {
            if ("".equals(valor[0])) {
                mm.setID_MODELO(0);
            } else {
                mm.setID_MODELO((int) valor[0]);
            }
            mm.setMODELO((String) valor[1]);

            td.salvaDaoModelo(mm);
        } catch (SQLException ex) {
            System.out.println("erro " + ex);
        }
    }

    public void salvaControleImobilizador(Object... valor) {
        //consulta ModeloVisao 
        try {
            if ("".equals(valor[0])) {
                mm.setID_IMOBILIZADOR(0);
            } else {
                mm.setID_IMOBILIZADOR((int) valor[0]);
            }
            mm.setIMOBILIZADOR((String) valor[1]);

            td.salvaDaoImobilizador(mm);
        } catch (SQLException ex) {
            System.out.println("erro " + ex);
        }
    }

    /**
     * *************************************************************
     * EXCLUIR *************************************************************
     */
    public void ExcluirControleMontadora(Object... valor) {
        try {
            mm.setID_MONTADORA(Integer.parseInt(valor[0].toString()));

            td.excluirDaoMontadora(mm);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro " + ex);
        }
    }

    public void ExcluirControleModelo(Object... valor) {
        try {
            mm.setID_MODELO(Integer.parseInt(valor[0].toString()));

            td.excluirDaoModelo(mm);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro " + ex);
        }
    }

    public void ExcluirControleImbilizador(Object... valor) {
        try {
            mm.setID_IMOBILIZADOR(Integer.parseInt(valor[0].toString()));

            td.excluirDaoImobilizador(mm);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro " + ex);
        }
    }

    /**
     * *************************************************************
     * CONSULTA *************************************************************
     */
    public void consultaControleMontadora(Object... valor) {
        try {
            td.ConsultarDaoMontadora(valor);
        } catch (Exception e) {
            System.out.println("Controle Consulta Tabela Montadora " + e);
        }
    }

    public void consultaControleModelo(Object... valor) {
        try {
            td.ConsultarDaoModelo(valor);
        } catch (Exception e) {
            System.out.println("Controle Consulta Tabela Montadora " + e);
        }
    }

    public void consultaControleImobilizador(Object... valor) {
        try {
            td.ConsultarDaoImobilizador(valor);
        } catch (Exception e) {
            System.out.println("Controle Consulta Tabela Montadora " + e);
        }
    }

    /**
     * *************************************************************
     * ALTERAR *************************************************************
     */
    public void AlterarControleMontadora() {

    }
}
