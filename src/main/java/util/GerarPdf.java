package util;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import dao.ConexaoBanco;
import java.awt.Desktop;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @author INOVA GleSantoro
 */
public class GerarPdf {

    String SQL_MANUAL = "SELECT b.montadora, b.modelo, b.imobilizador, b.imagem, "
            + "aa.funcao, a.pinos_central, a.referencia, a.conectorgt3, a.conectorgt4, b.observacao "
            + "FROM sinal a inner join manual b on a.id_manual = b.id WHERE id_manual=?";
    String SQL_MANUAL_GT3 = "SELECT b.montadora, b.modelo, b.imobilizador, b.imagem, "
            + "a.funcao, a.pinos_central, a.referencia, a.conectorgt3, b.observacao "
            + "FROM sinal a inner join manual b on a.id_manual = b.id WHERE id_manual=?";
    String SQL_MANUAL_GT4 = "SELECT b.montadora, b.modelo, b.imobilizador, b.imagem, "
            + "a.funcao, a.pinos_central, a.referencia, a.conectorgt4, b.observacao "
            + "FROM sinal a inner join manual b on a.id_manual = b.id WHERE id_manual=?";
    String SQL_GT3 = "SELECT tiposimulador FROM manual WHERE tiposimulador = 'GT3'";
    String SQL_GT4 = "SELECT tiposimulador FROM manual WHERE tiposimulador = 'GT4'";
    String SQL_MANUAL_MONT = "SELECT montadora, modelo, imobilizador FROM manual_gt4.manual";
    String SQL_MAUAL_IMG = "SELECT arquivo FROM manual_gt4. manual WHERE ID=?";

    /**
     * ***********************************************************************************************************
     */
    String SQLMANUAL = "SELECT montadora, modelo, imobilizador, imagem, observacao "
            + "FROM manual_gt4.manual";
    String SQLMONTADORA = "SELECT montadora FROM manual_gt4.manual";
    String SQLMODELO = "SELECT modelo FROM manual_gt4.manual";
    String SQLIMOBILIZADOR = "SELECT imobilizador FROM manual_gt4.manual";

    String SQLALIMENTACAO = "SELECT * FROM manual_gt4.sinal";
    String SQLSENSOR = "SELECT * FROM manual_gt4.sinal";
    String SQLSENSOR2 = "SELECT * FROM manual_gt4.sinal";
    String SQLATUADOR = "SELECT * FROM manual_gt4.sinal";
    String SQLATUADOR2 = "SELECT * FROM manual_gt4.sinal";
    String SQLALARME = "SELECT * FROM manual_gt4.sinal";
    String SQLCOMUNICACAO = "SELECT * FROM manual_gt4.sinal";
    String SQLINJETOR = "SELECT * FROM manual_gt4.sinal";
    String SQLPBI = "SELECT * FROM manual_gt4.sinal";


    String FILE_NAME = "C:\\PDF\\ TestePdf.pdf";
    String IMAGEM = "C:\\PDF\\logo-horizontal1.png"; //"C:\\PDF\\logo-horizontal1.png"
    String IMG_PATH = "C:\\PDF\\marca_d_agua1.png";
    String IMG_PATH2 = "C:\\PDF\\marca_d_agua1.png";
    Document DOCUMENTO = new Document();
    Paragraph PAR = new Paragraph("TESTANDO PDF ");
    Paragraph ESPAÇO = new Paragraph("\n");
    PdfPTable TABELA = new PdfPTable(4);
    PdfPTable TABELA1 = new PdfPTable(4);
    PdfPTable TABELA2 = new PdfPTable(4);
    PdfDocument PDF_DOC = new PdfDocument();
    Font FONT = new Font(Font.FontFamily.COURIER, 30, Font.ITALIC, BaseColor.RED);
    ResultSet resultado;
    Connection conn;
    PreparedStatement stm;

//  CONSTRUTOR
    public GerarPdf() {
        try {
            PdfWriter.getInstance(DOCUMENTO, new FileOutputStream(FILE_NAME));
            DOCUMENTO.setMargins(30, 20, 30, 20);
            DOCUMENTO.setMarginMirroring(true);
            DOCUMENTO.setPageSize(PageSize.A4);
            DOCUMENTO.newPage();
            DOCUMENTO.open();

            CONEXAO_BANCO_DADOS();

            DOCUMENTO.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            Desktop.getDesktop().open(new File(FILE_NAME));
        } catch (IOException ex) {
            System.out.println("Error:" + ex);
        }
    }

//CONEXAO COM O BANCO DE DADOS CABEÇALHO
    public void CONEXAO_BANCO_DADOS() {
        try {
            conn = ConexaoBanco.abreConexao();
            stm = ConexaoBanco.abreConexao().prepareStatement(SQLMANUAL);
            resultado = stm.executeQuery();
            while (resultado.next()) {
                Paragraph para = new Paragraph(new Phrase(
                        50F, resultado.getString("montadora"),
                        FontFactory.getFont(FontFactory.COURIER_BOLD, 20F, BaseColor.RED)));
                para.setAlignment(Element.ALIGN_CENTER);
                IMAGEM_CABECALHO();
                DOCUMENTO.add(para);
                PARAGRAFO_MODELO();
                DOCUMENTO.add(ESPAÇO);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

//PARAGRAFO TABELA DO BANCO DE DADOS
    public void PARAGRAFO_MODELO() throws SQLException, DocumentException {
        try {
            conn = ConexaoBanco.abreConexao();
            stm = ConexaoBanco.abreConexao().prepareStatement(SQLMANUAL);
            resultado = stm.executeQuery();

            while (resultado.next()) {
                Paragraph para1 = new Paragraph(new Phrase(
                        50F, resultado.getString("modelo"),
                        FontFactory.getFont(FontFactory.TIMES_BOLD, 20F, BaseColor.BLACK
                        )));
                para1.setAlignment(Element.ALIGN_CENTER);
                DOCUMENTO.add(para1);
                PARAGRAFO_IMOBILIZADOR();
                DOCUMENTO.newPage();
                DOCUMENTO.add(new Paragraph(""));
            }

        } catch (Exception e) {
        }
    }

    public void PARAGRAFO_IMOBILIZADOR() throws SQLException, DocumentException {
        try {
            conn = ConexaoBanco.abreConexao();
            stm = ConexaoBanco.abreConexao().prepareStatement(SQLMANUAL);
            resultado = stm.executeQuery();

            while (resultado.next()) {
                Paragraph para1 = new Paragraph(new Phrase(
                        50F, resultado.getString("imobilizador"),
                        FontFactory.getFont(FontFactory.TIMES_BOLD, 20F, BaseColor.BLUE
                        )));
                para1.setAlignment(Element.ALIGN_CENTER);
                DOCUMENTO.add(para1);
                IMAGEM_MARCA_DAGUA2();
                DOCUMENTO.add(ESPAÇO);
                IMAGEM_IMOB();
                DOCUMENTO.newPage();
                DOCUMENTO.add(new Paragraph(""));
            }

        } catch (Exception e) {
        }
    }

    public void PARAGRAFO_OBSERVACAO() throws SQLException, DocumentException {
        try {
            conn = ConexaoBanco.abreConexao();
            stm = ConexaoBanco.abreConexao().prepareStatement(SQLMANUAL);
            resultado = stm.executeQuery();

            while (resultado.next()) {
                Paragraph para1 = new Paragraph(new Phrase(
                        50F, resultado.getString("observacao"),
                        FontFactory.getFont(FontFactory.TIMES_BOLD, 20F, BaseColor.BLUE
                        )));
                DOCUMENTO.add(para1);
                IMAGEM_IMOB();
                DOCUMENTO.newPage();
                DOCUMENTO.add(new Paragraph(""));
            }

        } catch (Exception e) {
        }
    }

//IMAGENS BANCO DE DADOS E FISICA
    public void IMAGEM_CABECALHO() {
        try {
            Image imag = Image.getInstance(IMAGEM);
            imag.setAlignment(
                    Image.ALIGN_CENTER
                    | Image.TEXTWRAP
                    | Image.ALIGN_TOP);
            DOCUMENTO.add(imag);
            IMAGEM_MARCA_DAGUA2();
        } catch (Exception e) {
        }

    }

    public void IMAGEM_MARCA_DAGUA2() {
        try {
            Image imagem = Image.getInstance(IMG_PATH);
            imagem.setAlignment(Image.UNDERLYING);

            DOCUMENTO.add(imagem);
            IMAGEM_MARCA_DAGUA3();
            DOCUMENTO.add(ESPAÇO);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void IMAGEM_MARCA_DAGUA3() {
        try {
            Image imagem = Image.getInstance(IMG_PATH2);
            imagem.setAlignment(Image.LIST);

            DOCUMENTO.add(imagem);
            DOCUMENTO.add(ESPAÇO);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void IMAGEM_IMOB() {
        try {
            conn = ConexaoBanco.abreConexao();
            stm = ConexaoBanco.abreConexao().prepareStatement(SQLMANUAL);
            resultado = stm.executeQuery();
            while (resultado.next()) {
                Image imagem = Image.getInstance(
                        resultado.getString("imagem"));
                imagem.setAlignment(Image.ALIGN_CENTER);
                DOCUMENTO.add(imagem);
                IMAGEM_MARCA_DAGUA2();
                PARAGRAFO_ALIMENTACAO();
                DOCUMENTO.newPage();
            }

        } catch (Exception e) {
            System.out.println("erro " + e);
        }

    }

//PARAGRAFOS SINAIS DE TABELA
    public void PARAGRAFO_ALIMENTACAO() {
        try {
            Paragraph pAlimentacao = new Paragraph(new Phrase(
                    30F, "Alimentação" + "                    " + " DB9", FontFactory.getFont(
                            FontFactory.TIMES_BOLD, 20F, BaseColor.RED
                    ))
            );
            pAlimentacao.setAlignment(Element.ALIGN_CENTER);

            DOCUMENTO.add(pAlimentacao);
            DOCUMENTO.add(ESPAÇO);
            TABELA_PDF_ALIMENTACAO();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void PARAGRAFO_SENSOR() {
        try {
            Paragraph pAlimentacao = new Paragraph(new Phrase(
                    30F, "Sensor              DB25M", FontFactory.getFont(
                            FontFactory.TIMES_BOLD, 20F, BaseColor.RED
                    ))
            );
            pAlimentacao.setAlignment(Element.ALIGN_CENTER);

            DOCUMENTO.add(pAlimentacao);
            DOCUMENTO.add(ESPAÇO);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void PARAGRAFO_ATUADOR() {
        try {
            Paragraph pAlimentacao = new Paragraph(new Phrase(
                    30F, "Atuador        DB25F", FontFactory.getFont(
                            FontFactory.TIMES_BOLD, 20F, BaseColor.RED
                    ))
            );
            pAlimentacao.setAlignment(Element.ALIGN_CENTER);

            DOCUMENTO.add(pAlimentacao);
            DOCUMENTO.add(ESPAÇO);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

//TABELA DO BANCO DE DADOS
    public void TABELA_PDF_ALIMENTACAO() {
        try {
            conn = ConexaoBanco.abreConexao();
            stm = ConexaoBanco.abreConexao().prepareStatement(SQLALIMENTACAO);
            resultado = stm.executeQuery();

            PdfPCell COLUNA = new PdfPCell(new Phrase(20, "FUNÇÃO", FontFactory.getFont(
                    FontFactory.TIMES_BOLD, 12F, BaseColor.BLACK)));
            TABELA.addCell(COLUNA);
            COLUNA = new PdfPCell(new Phrase(20, "PINO DA CENTRAL", FontFactory.getFont(
                    FontFactory.TIMES_BOLD, 12F, BaseColor.BLACK)));
            TABELA.addCell(COLUNA);
            COLUNA = new PdfPCell(new Phrase(20, "REFERENCIA", FontFactory.getFont(
                    FontFactory.TIMES_BOLD, 12F, BaseColor.BLACK)));
            TABELA.addCell(COLUNA);
            COLUNA = new PdfPCell(new Phrase(20, "CONECTOR ", FontFactory.getFont(
                    FontFactory.TIMES_BOLD, 12F, BaseColor.BLACK)));
            TABELA.addCell(COLUNA);

            TABELA.setHeaderRows(4);
            while (resultado.next()) {
                TABELA.addCell(new Phrase(20F, resultado.getString("funcao"), FontFactory.getFont(
                        FontFactory.TIMES_BOLD, 12F, BaseColor.BLUE
                )));
                TABELA.addCell(new Phrase(20F, resultado.getString("pinos_central"), FontFactory.getFont(
                        FontFactory.TIMES_BOLD, 12F, BaseColor.BLUE
                )));
                TABELA.addCell(new Phrase(20F, resultado.getString("referencia"), FontFactory.getFont(
                        FontFactory.TIMES_BOLD, 12F, BaseColor.BLUE
                )));
                TABELA.addCell(new Phrase(20F, resultado.getString("conectorgt3"), FontFactory.getFont(
                        FontFactory.TIMES_BOLD, 12F, BaseColor.BLUE
                )));

                DOCUMENTO.add(TABELA);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void TABELA_PDF_SENSOR() {
        PARAGRAFO_SENSOR();
        try {
            conn = ConexaoBanco.abreConexao();
            stm = ConexaoBanco.abreConexao().prepareStatement(SQLALIMENTACAO);
            resultado = stm.executeQuery();

            PdfPCell COLUNA = new PdfPCell(new Phrase("FUNÇÃO"));
            TABELA1.addCell(COLUNA);
            COLUNA = new PdfPCell(new Phrase("PINO DA CENTRAL"));
            TABELA1.addCell(COLUNA);
            COLUNA = new PdfPCell(new Phrase("REFERENCIA"));
            TABELA1.addCell(COLUNA);
            COLUNA = new PdfPCell(new Phrase("CONECTOR "));
            TABELA1.addCell(COLUNA);

            TABELA1.setHeaderRows(4);
            while (resultado.next()) {
                TABELA1.addCell(new Phrase(20F, resultado.getString("funcao"), FontFactory.getFont(
                        FontFactory.TIMES_BOLD, 12F, BaseColor.BLUE
                )));
                TABELA1.addCell(new Phrase(20F, resultado.getString("pinos_central"), FontFactory.getFont(
                        FontFactory.TIMES_BOLD, 12F, BaseColor.BLUE
                )));
                TABELA1.addCell(new Phrase(20F, resultado.getString("referencia"), FontFactory.getFont(
                        FontFactory.TIMES_BOLD, 12F, BaseColor.BLUE
                )));
                TABELA1.addCell(new Phrase(20F, resultado.getString("conectorgt3"), FontFactory.getFont(
                        FontFactory.TIMES_BOLD, 12F, BaseColor.BLUE
                )));

                DOCUMENTO.add(TABELA1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void TABELA_PDF_ATUADOR() {
        PARAGRAFO_ATUADOR();
        try {
            conn = ConexaoBanco.abreConexao();
            stm = ConexaoBanco.abreConexao().prepareStatement(SQLALIMENTACAO);
            resultado = stm.executeQuery();

            PdfPCell COLUNA = new PdfPCell(new Phrase("FUNÇÃO"));
            TABELA2.addCell(COLUNA);
            COLUNA = new PdfPCell(new Phrase("PINO DA CENTRAL"));
            TABELA2.addCell(COLUNA);
            COLUNA = new PdfPCell(new Phrase("REFERENCIA"));
            TABELA2.addCell(COLUNA);
            COLUNA = new PdfPCell(new Phrase("CONECTOR "));
            TABELA2.addCell(COLUNA);

            TABELA2.setHeaderRows(4);
            while (resultado.next()) {
                TABELA2.addCell(new Phrase(20F, resultado.getString("funcao"), FontFactory.getFont(
                        FontFactory.TIMES_BOLD, 12F, BaseColor.BLUE
                )));
                TABELA2.addCell(new Phrase(20F, resultado.getString("pinos_central"), FontFactory.getFont(
                        FontFactory.TIMES_BOLD, 12F, BaseColor.BLUE
                )));
                TABELA2.addCell(new Phrase(20F, resultado.getString("referencia"), FontFactory.getFont(
                        FontFactory.TIMES_BOLD, 12F, BaseColor.BLUE
                )));
                TABELA2.addCell(new Phrase(20F, resultado.getString("conectorgt3"), FontFactory.getFont(
                        FontFactory.TIMES_BOLD, 12F, BaseColor.BLUE
                )));

                DOCUMENTO.add(TABELA2);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void LINK_URL() {
        try {
            Paragraph pUrl = new Paragraph(new Phrase(
                    10F, "https://www.youtube.com/channel/UCOg4HA2aCNAr1FrMyFqVNWg",
                    FontFactory.getFont(
                            FontFactory.COURIER, 12F, BaseColor.BLUE
                    )));
            pUrl.setAlignment(Element.ALIGN_CENTER);

            Paragraph pUrlInova = new Paragraph(new Phrase(
                    10F, "http://www.autoleap.com.br/",
                    FontFactory.getFont(
                            FontFactory.COURIER, 12F, BaseColor.BLUE
                    )));
            pUrlInova.setAlignment(Element.ALIGN_CENTER);

            DOCUMENTO.add(pUrl);
            DOCUMENTO.add(ESPAÇO);
            DOCUMENTO.add(pUrlInova);
            DOCUMENTO.add(ESPAÇO);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
