package Servicios;

import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JButton;

public class ObjetosGraficosService {
    
    public static JButton crearBoton(int x, int y, int ancho, int alto, Color cfondo, Color cletra){
        JButton boton = new JButton();
        boton.setBounds(x,y,ancho,alto);
        boton.setFocusable(false);
        boton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        boton.setBackground(cfondo);
        boton.setForeground(cletra);
        boton.setVisible(true);
        return boton;
    }
    
    public static JButton crearBotonI(int x, int y, int ancho, int alto,Color cfondo){
        JButton boton = new JButton();
        boton.setBounds(x,y,ancho,alto);
        boton.setBackground(cfondo);
        boton.setFocusable(false);
        boton.setBorder(null);
        boton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        boton.setVisible(true);
        return boton;
    }
    
}
