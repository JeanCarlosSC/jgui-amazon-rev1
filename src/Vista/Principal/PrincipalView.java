package Vista.Principal;

import Servicios.ObjetosGraficosService;
import Servicios.Web;
import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.border.Border;

public abstract class PrincipalView extends JPanel{
    
    JPanel pArriba, pAbajo;
    Font fLogin,fInfoLogin,fInfo2Login, fTitulo, fBotonI;
    Color colorPrincipal;
    ImageIcon iLogin,iLoginA;
    Cursor cMano,cRaya;
    Border bordeN;
    JTextField buscar = new JTextField("  Regístrate y obten un cupón de envío gratis");
    
    public PrincipalView(){
        cargarRecursos();
        setSize(1300, 720);
        setLayout(null);
        cargarPaneles();
        cargarBotones();
        buscar.setBounds(270, 65, 750, 35);
        buscar.setBorder(null);
        buscar.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                buscar.setText(""); // Borra el texto cuando se obtiene el enfoque
            }
        });
        pArriba.add(buscar);
    }
    
    private void cargarPaneles(){
        pArriba = new JPanel();
        pArriba.setBounds(0,0,1300,130);
        pArriba.setBackground(colorPrincipal);
        pArriba.setLayout(null);
        add(pArriba);
        
        pAbajo = new JPanel();
        pAbajo.setBounds(0, 130, 1300, 590);
        pAbajo.setBackground(Color.WHITE);
        pAbajo.setLayout(null);
        add(pAbajo);
                
    }
    
    private void cargarRecursos(){        
        fLogin = new Font("Helvetica", Font.PLAIN, 13);
        fInfoLogin = new Font("Helvetica", Font.PLAIN, 15);
        fInfo2Login = new Font("Helvetica", Font.PLAIN, 25);
        fTitulo = new Font("Helvetica",Font.PLAIN,20);
        fBotonI = new Font("Helvetica",Font.BOLD,15);
        
        colorPrincipal = new Color(238,78,46);
        
        iLogin = new ImageIcon("src/Vista/login.png");
        iLoginA = new ImageIcon("src/Vista/loginArriba.png");     
        
        cMano = new Cursor(Cursor.HAND_CURSOR);
        cRaya = new Cursor(Cursor.TEXT_CURSOR);
        
        bordeN = BorderFactory.createLineBorder(new Color(255,255,255),1,true);
    }
    
    private void cargarBotones(){
        JButton BGrande = ObjetosGraficosService.crearBotonI(50,430,1200,115,Color.WHITE);
        BGrande.setIcon(new ImageIcon("img/BGrande.png"));
        pAbajo.add(BGrande);
        
        JButton BMidIzq = ObjetosGraficosService.crearBotonI(50,10,790,235,Color.WHITE);
        BMidIzq.setIcon(new ImageIcon("src/Vista/BMidIzq.png"));
        BMidIzq.addActionListener(e -> {
            Web.openWebpage("https://es.wikipedia.org/wiki/Moneda#/media/Archivo:Assorted_United_States_coins.jpg");
        });
        pAbajo.add(BMidIzq);
        
        JButton BMidDerA = ObjetosGraficosService.crearBotonI(850,10,400,120,Color.WHITE);
        BMidDerA.setIcon(new ImageIcon("src/Vista/BMidDerA.png"));
        pAbajo.add(BMidDerA);
        
        JButton BMidDerB = ObjetosGraficosService.crearBotonI(850,130,400,115,Color.WHITE);
        BMidDerB.setIcon(new ImageIcon("src/Vista/BMidDerB.png"));
        pAbajo.add(BMidDerB);
        
        JButton BLogo = ObjetosGraficosService.crearBotonI(50,55,185,52,colorPrincipal);
        BLogo.setIcon(new ImageIcon("src/Vista/Logo.png"));
        pArriba.add(BLogo);
        
        JButton BBuscar = ObjetosGraficosService.crearBotonI(1020,65,65,35,Color.WHITE);
        BBuscar.setIcon(new ImageIcon("src/Vista/Bbuscar.png"));
        pArriba.add(BBuscar);
        
        JButton BSalir = ObjetosGraficosService.crearBoton(1100, 10, 110, 25, colorPrincipal, Color.WHITE);
        BSalir.setText("Cerrar Sesión");
        BSalir.setBorder(null);
        BSalir.addActionListener(e -> salir());
        /*BSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(new LoginView());
            }
        });*/
        pArriba.add(BSalir);
        
    }

    public abstract void salir();
}
