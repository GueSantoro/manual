package util;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 * @author INOVA GleSantoro
 */
public class ManipularImagem {

    public static BufferedImage setImagemDimencao(String caminhaImg, Integer imgLargura, Integer imgAltura) {
        Double novaLargura = null;
        Double novaAltura = null;
        Double imgProporcao = null;
        Graphics2D g2b = null;
        BufferedImage imagem = null, novaImagem = null;

        try {
            imagem = ImageIO.read(new File(caminhaImg));
        } catch (Exception e) {
            System.out.println("imagem " + e);
        }

        novaLargura = (double) imagem.getWidth();
        novaAltura = (double) imagem.getHeight();

        if (novaLargura >= imgLargura) {

            imgProporcao = (novaAltura / novaLargura);
            novaLargura = (double) imgLargura;
            novaAltura = (novaLargura * imgProporcao);

            while (novaAltura > imgAltura) {
                novaLargura = (double) (--imgLargura);
                novaAltura = (novaLargura * imgProporcao);
            }
        } else if (novaAltura >= imgAltura) {
            imgProporcao = (novaLargura / novaAltura);
            novaAltura = (double) imgAltura;
            while (novaLargura > imgLargura) {
                novaAltura = (double) (--imgAltura);
                novaLargura = (novaAltura * imgProporcao);
            }
        }
        novaImagem = new BufferedImage(novaLargura.intValue(),
                novaAltura.intValue(), BufferedImage.TYPE_INT_ARGB);
        g2b = novaImagem.createGraphics();
        g2b.drawImage(imagem, 0, 0, novaLargura.intValue(),
                novaAltura.intValue(), null);
        return novaImagem;
    }

    public static byte[] getImgBytes(BufferedImage imagem) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ImageIO.write(imagem, "PNG", baos);
        } catch (IOException ex) {
            //handle it here.... not implemented yet...
        }

        InputStream is = new ByteArrayInputStream(baos.toByteArray());

        return baos.toByteArray();
    }

    public static void exibiImagemLabel(byte[] minhaimagem, javax.swing.JLabel label) {
        if (minhaimagem != null) {
            InputStream input = new ByteArrayInputStream(minhaimagem);
            try {
                BufferedImage imagem = ImageIO.read(input);
                label.setIcon(new ImageIcon(imagem));
            } catch (IOException ex) {
            }

        } else {
            label.setIcon(null);

        }

    }
}
