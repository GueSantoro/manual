
package util;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 * @author INOVA GleSantoro
 */
public class PosicaoFormulario {

 // ABRIR DORMULARIO CENTRALIZADO    
    public void abrirFormulario (JInternalFrame janela, JDesktopPane descktop){
        
        // CENTRALIZAR FORMULARIO 
        int lDesktop = descktop.getWidth();
        int aDesktop = descktop.getHeight();
        int lIFrame = janela.getWidth();
        int aIFrame = janela.getHeight();
        janela.setLocation(lDesktop/ 2-lIFrame/2, aDesktop/2- aIFrame/ 2); 
        descktop.add(janela);
        janela.setVisible(true);
    }
    
}
