package controle;

import dao.Dao_Manual;
import dao.Dao_Modelo;
import dao.Dao_Sinal;
import java.awt.image.BufferedImage;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Modelo_Manual;
import modelo.Modelo_Modelo;
import modelo.Modelo_Sinais;

/**
 * @author INOVA GLeSantoro
 */
public class Controle_Manual {

    BufferedImage imagem;

    Dao_Manual td = new Dao_Manual();
    Dao_Sinal ts = new Dao_Sinal();
    Dao_Modelo tm = new Dao_Modelo();

    Modelo_Manual mm = new Modelo_Manual();
    Modelo_Modelo md = new Modelo_Modelo();
    Modelo_Sinais ms = new Modelo_Sinais();

    public Controle_Manual() {
    }

    /*
SALVAR
     */
    public void SalvarControleImagem(Object... valor) {
        try {
            if ("".equals(valor[0])) {
                mm.setID_IMAGEM(0);
            } else {
                mm.setID_IMAGEM((int) valor[0]);
            }

            mm.setARQUIVO((String) valor[1]);
            mm.setIMAGEM((String) valor[2]);

            td.SalvarDaoImagem(mm);
        } catch (Exception e) {
            System.out.println("erro " + e);
        }
    }

    public void salvaControleManual(Object... valor) {
        try {
            if ("".equals(valor[0])) {
                mm.setID(0);
            } else {
                mm.setID(Integer.parseInt(valor[0].toString()));
            }

            mm.setMONTADORA((String) valor[1]);
            mm.setMODELO((String) valor[2]);
            mm.setIMOBILIZADOR((String) valor[3]);
            mm.setTIPO_SIMULADOR((String) valor[4]);
            mm.setIMAGEM((String) valor[5]);
            mm.setOBSERVACAO((String) valor[6]);

            td.salvaDaoManual(mm);
        } catch (Exception e) {
            System.out.println("erro controle manual " + e);
        }

    }

    /*
ALTERAR
     */
    public void AlterarControleManual(Object... valor) {
        try {
            mm.setMONTADORA((String) valor[1]);
            mm.setMODELO((String) valor[2]);
            mm.setIMOBILIZADOR((String) valor[3]);
            mm.setTIPO_SIMULADOR((String) valor[4]);
            mm.setIMAGEM((String) valor[5]);
            mm.setTIPO_SINAL1((String) valor[6]);
            mm.setTIPO_SINAL2((String) valor[7]);
            mm.setTIPO_SINAL3((String) valor[8]);
            mm.setOBSERVACAO((String) valor[9]);
            mm.setID(Integer.parseInt(valor[0].toString()));

            td.AlterarDaoManual(mm);
            System.out.println("Controle Alterar Manual ok");
        } catch (SQLException ex) {
            System.out.println("erro ao alterar Manual " + ex);
        }
    }

    /*
CONSULTAR
     */
    public void consultaControleImagem(Object... valor) {
        try {
            td.ConsultarDaoImagem(valor);
        } catch (SQLException e) {
            System.out.println("Controle Consulta Tabela Imagem " + e);
        }
    }

    public void consultaControleManual(Object... valor) {
        Dao_Manual td = new Dao_Manual();
        try {
            td.consultaDaoManual(valor);
        } catch (SQLException e) {
            System.out.println("Controle Consulta Tabela Manual " + e);
        }
    }

    /*
EXCLUIR
     */
    public void ExcluirControleImagem(Object... valor) {
        Modelo_Manual img = new Modelo_Manual();
        try {
            img.setID_IMAGEM(Integer.parseInt(valor[0].toString()));

            td.excluirDaoImagem(img);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro " + ex);
        }
    }

    public void ExcluirControleManual(Object... valor) {
        Modelo_Manual mm = new Modelo_Manual();
        try {
            mm.setID(Integer.parseInt(valor[0].toString()));

            td.excluirDaoManual(mm);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro " + ex);
        }
    }

    /**
     * *************************************************************
     * COMBOBOX *************************************************************
     */
    public void comboBoxControleMontadora(Object... valor) {
        try {
            td.ComboBoxDaoMontadora(valor);
        } catch (SQLException e) {
            System.out.println("Controle ComboBox Montadora " + e);
        }
    }

    public void comboBoxControleModelo(Object... valor) {
        try {
            td.ComboBoxDaoModelo(valor);
        } catch (SQLException e) {
            System.out.println("Controle ComboBox Modelo " + e);
        }
    }

    public void comboBoxControleImobilizador(Object... valor) {
        try {
            td.ComboBoxDaoImobilizador(valor);
        } catch (SQLException e) {
            System.out.println("Controle ComboBox Imobilizador " + e);
        }
    }

    public void comboBoxControleSimulador(Object... valor) {
        try {
            td.ComboBoxDaoSimulador(valor);
        } catch (SQLException e) {
            System.out.println("Controle ComboBox Simulador " + e);
        }
    }

    public void SalvarControleTabelaSinal_0(Object... valor) {
        try {
            if ("".equals(valor[0])) {
                mm.setID_MANUAL(0);
            } else {
                mm.setID_MANUAL(Integer.parseInt(valor[0].toString()));
            }
            mm.setTIPO_SINAL1((String) valor[1]);
            mm.setFUNCAO((String) valor[2]);
            mm.setPINOS_CENTRAL((String) valor[3]);
            mm.setREFERENCIA((String) valor[4]);
            mm.setCONECTOR_GT3((String) valor[5]);
            mm.setCONECTOR_GT4((String) valor[6]);
            mm.setID_MANUAL(Integer.parseInt(valor[7].toString()));

            td.SalvaDaoTabelaSinal_0(mm);
        } catch (Exception e) {
            System.out.println("erro Controle Salvar tabela sinal " + e);
        }

    }

    public void SalvarControleTabelaSinal_1(Object... valor) {
        try {
            if ("".equals(valor[0])) {
                mm.setID_MANUAL(0);
            } else {
                mm.setID_MANUAL(Integer.parseInt(valor[0].toString()));
            }
            mm.setTIPO_SINAL1((String) valor[1]);
            mm.setFUNCAO((String) valor[2]);
            mm.setPINOS_CENTRAL((String) valor[3]);
            mm.setREFERENCIA((String) valor[4]);
            mm.setCONECTOR_GT3((String) valor[5]);
            mm.setCONECTOR_GT4((String) valor[6]);
            mm.setID_MANUAL(Integer.parseInt(valor[7].toString()));

            td.SalvaDaoTabelaSinal_1(mm);
        } catch (Exception e) {
            System.out.println("erro Controle Salvar tabela sinal " + e);
        }

    }

    public void SalvarControleTabelaSinal_2(Object... valor) {
        try {
            if ("".equals(valor[0])) {
                mm.setID_MANUAL(0);
            } else {
                mm.setID_MANUAL(Integer.parseInt(valor[0].toString()));
            }
            mm.setTIPO_SINAL1((String) valor[1]);
            mm.setFUNCAO((String) valor[2]);
            mm.setPINOS_CENTRAL((String) valor[3]);
            mm.setREFERENCIA((String) valor[4]);
            mm.setCONECTOR_GT3((String) valor[5]);
            mm.setCONECTOR_GT4((String) valor[6]);
            mm.setID_MANUAL(Integer.parseInt(valor[7].toString()));

            td.SalvaDaoTabelaSinal_2(mm);
        } catch (Exception e) {
            System.out.println("erro Controle Salvar tabela sinal " + e);
        }

    }

    public void SalvarControleTabelaSinal_3(Object... valor) {
        try {
            if ("".equals(valor[0])) {
                mm.setID_MANUAL(0);
            } else {
                mm.setID_MANUAL(Integer.parseInt(valor[0].toString()));
            }
            mm.setTIPO_SINAL1((String) valor[1]);
            mm.setFUNCAO((String) valor[2]);
            mm.setPINOS_CENTRAL((String) valor[3]);
            mm.setREFERENCIA((String) valor[4]);
            mm.setCONECTOR_GT3((String) valor[5]);
            mm.setCONECTOR_GT4((String) valor[6]);
            mm.setID_MANUAL(Integer.parseInt(valor[7].toString()));

            td.SalvaDaoTabelaSinal_3(mm);
        } catch (Exception e) {
            System.out.println("erro Controle Salvar tabela sinal " + e);
        }

    }

    public void SalvarControleTabelaSinal_4(Object... valor) {
        try {
            if ("".equals(valor[0])) {
                mm.setID_MANUAL(0);
            } else {
                mm.setID_MANUAL(Integer.parseInt(valor[0].toString()));
            }
            mm.setTIPO_SINAL1((String) valor[1]);
            mm.setFUNCAO((String) valor[2]);
            mm.setPINOS_CENTRAL((String) valor[3]);
            mm.setREFERENCIA((String) valor[4]);
            mm.setCONECTOR_GT3((String) valor[5]);
            mm.setCONECTOR_GT4((String) valor[6]);
            mm.setID_MANUAL(Integer.parseInt(valor[7].toString()));

            td.SalvaDaoTabelaSinal_4(mm);
        } catch (Exception e) {
            System.out.println("erro Controle Salvar tabela sinal " + e);
        }

    }

    public void SalvarControleTabelaSinal_5(Object... valor) {
        try {
            if ("".equals(valor[0])) {
                mm.setID_MANUAL(0);
            } else {
                mm.setID_MANUAL(Integer.parseInt(valor[0].toString()));
            }
            mm.setTIPO_SINAL1((String) valor[1]);
            mm.setFUNCAO((String) valor[2]);
            mm.setPINOS_CENTRAL((String) valor[3]);
            mm.setREFERENCIA((String) valor[4]);
            mm.setCONECTOR_GT3((String) valor[5]);
            mm.setCONECTOR_GT4((String) valor[6]);
            mm.setID_MANUAL(Integer.parseInt(valor[7].toString()));

            td.SalvaDaoTabelaSinal_5(mm);
        } catch (Exception e) {
            System.out.println("erro Controle Salvar tabela sinal " + e);
        }

    }

    public void SalvarControleTabelaSinal_6(Object... valor) {
        try {
            if ("".equals(valor[0])) {
                mm.setID_MANUAL(0);
            } else {
                mm.setID_MANUAL(Integer.parseInt(valor[0].toString()));
            }
            mm.setTIPO_SINAL1((String) valor[1]);
            mm.setFUNCAO((String) valor[2]);
            mm.setPINOS_CENTRAL((String) valor[3]);
            mm.setREFERENCIA((String) valor[4]);
            mm.setCONECTOR_GT3((String) valor[5]);
            mm.setCONECTOR_GT4((String) valor[6]);
            mm.setID_MANUAL(Integer.parseInt(valor[7].toString()));

            td.SalvaDaoTabelaSinal_6(mm);
        } catch (Exception e) {
            System.out.println("erro Controle Salvar tabela sinal " + e);
        }

    }

    public void SalvarControleTabelaSinal_7(Object... valor) {
        try {
            if ("".equals(valor[0])) {
                mm.setID_MANUAL(0);
            } else {
                mm.setID_MANUAL(Integer.parseInt(valor[0].toString()));
            }
            mm.setTIPO_SINAL1((String) valor[1]);
            mm.setFUNCAO((String) valor[2]);
            mm.setPINOS_CENTRAL((String) valor[3]);
            mm.setREFERENCIA((String) valor[4]);
            mm.setCONECTOR_GT3((String) valor[5]);
            mm.setCONECTOR_GT4((String) valor[6]);
            mm.setID_MANUAL(Integer.parseInt(valor[7].toString()));

            td.SalvaDaoTabelaSinal_7(mm);
        } catch (Exception e) {
            System.out.println("erro Controle Salvar tabela sinal " + e);
        }

    }

    public void SalvarControleTabelaSinal_8(Object... valor) {
        try {
            if ("".equals(valor[0])) {
                mm.setID_MANUAL(0);
            } else {
                mm.setID_MANUAL(Integer.parseInt(valor[0].toString()));
            }
            mm.setTIPO_SINAL1((String) valor[1]);
            mm.setFUNCAO((String) valor[2]);
            mm.setPINOS_CENTRAL((String) valor[3]);
            mm.setREFERENCIA((String) valor[4]);
            mm.setCONECTOR_GT3((String) valor[5]);
            mm.setCONECTOR_GT4((String) valor[6]);
            mm.setID_MANUAL(Integer.parseInt(valor[7].toString()));

            td.SalvaDaoTabelaSinal_8(mm);
        } catch (Exception e) {
            System.out.println("erro Controle Salvar tabela sinal " + e);
        }

    }

}
