
package Vista.Login;
import Servicios.ObjetosGraficosService;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;

public abstract class LoginView extends JPanel{
    JPanel pDerecho, pIzquierdo, pArriba;
    Font fLogin,fInfoLogin,fInfo2Login, fTitulo, fBotonI;
    Color colorPrincipal;
    ImageIcon iLogin,iLoginA;
    Cursor cMano,cRaya;
    Border bordeN;
    
    
    public LoginView() {
        cargarRecursos();
        cargarPaneles();
        cargarLabels();
        cargarBotones();
        cargarFields();
        setSize(1300, 720);
        setLayout(null);

    }
    
    private void cargarRecursos(){        
        fLogin = new Font("Helvetica", Font.PLAIN, 13);
        fInfoLogin = new Font("Helvetica", Font.PLAIN, 15);
        fInfo2Login = new Font("Helvetica", Font.PLAIN, 25);
        fTitulo = new Font("Helvetica",Font.PLAIN,20);
        fBotonI = new Font("Helvetica",Font.BOLD,15);
        
        colorPrincipal = new Color(239,80,37);
        
        iLogin = new ImageIcon("src/Vista/login.png");
        iLoginA = new ImageIcon("src/Vista/loginArriba.png");     
        
        cMano = new Cursor(Cursor.HAND_CURSOR);
        cRaya = new Cursor(Cursor.TEXT_CURSOR);
        
        bordeN = BorderFactory.createLineBorder(new Color(255,255,255),1,true);
    }
    
    private void cargarPaneles(){
        pDerecho = new JPanel();
        pDerecho.setBounds(750, 150, 420, 500);
        pDerecho.setBackground(Color.WHITE);
        pDerecho.setLayout(null);
        add(pDerecho);
        
        pArriba = new JPanel();
        pArriba.setBounds(0,0,1280,100);
        pArriba.setBackground(Color.WHITE);
        pArriba.setLayout(null);
        add(pArriba);
        
        pIzquierdo = new JPanel();
        pIzquierdo.setBounds(0, 0, 1280, 720); // coordenadas y tamaño
        pIzquierdo.setBackground(colorPrincipal);
        pIzquierdo.setLayout(null);
        add(pIzquierdo);
    }
    
    private void cargarLabels(){
        JLabel labelLoginA =new JLabel();
        labelLoginA.setIcon(iLoginA);
        labelLoginA.setBounds(60,20,300,40);
        pArriba.add(labelLoginA);
        //label arriba
        JLabel lArriba = new JLabel("Iniciar sesión"); // etiqueta de texto
        lArriba.setBounds(200, 25, 300, 40);
        lArriba.setFont(fInfo2Login);
        lArriba.setForeground(Color.black); // cambiar el color de la fuente
        pArriba.add(lArriba);
        //label arriba
        JLabel lArriba2 = new JLabel("¿Necesitas ayuda?"); // etiqueta de texto
        lArriba2.setBounds(1100, 27, 200, 40);
        lArriba2.setFont(fInfoLogin);
        lArriba2.setForeground(new Color(238,77,45)); // cambiar el color de la fuente
        lArriba2.setCursor(cMano);
        pArriba.add(lArriba2);
        
        
        //imagen shopee principal
        JLabel labelLogin =new JLabel();
        labelLogin.setIcon(iLogin);
        labelLogin.setBounds(130,200,800,400);
        pIzquierdo.add(labelLogin);
                
       

        JLabel lTitulo = new JLabel("Iniciar sesión"); // etiqueta de texto
        lTitulo.setBounds(30, 30, 150, 20);
        lTitulo.setFont(fTitulo);
        lTitulo.setForeground(Color.black); // cambiar el color de la fuente
        lTitulo.setCursor(cRaya);
        pDerecho.add(lTitulo);


        JLabel lOlvido = new JLabel("¿Olvidó su contraseña?");
        lOlvido.setFont(fLogin);
        lOlvido.setBounds(30, 300, 150, 20);
        lOlvido.setForeground(new Color(0,122,200));
        lOlvido.setCursor(cMano);
        pDerecho.add(lOlvido);
        
        JLabel lTelefono = new JLabel("Iniciar con teléfono");
        lTelefono.setFont(fLogin);
        lTelefono.setBounds(280, 300, 150, 20);
        lTelefono.setForeground(new Color(0,122,200));
        lTelefono.setCursor(cMano);
        pDerecho.add(lTelefono);
        
        JLabel lNuevo = new JLabel("¿Nuevo en Shopee?");
        lNuevo.setFont(fInfoLogin);
        lNuevo.setBounds(95, 430, 150, 20);
        lNuevo.setForeground(new Color(200,200,200));
        lNuevo.setCursor(cRaya);
        pDerecho.add(lNuevo);
        
        JLabel lRegistro = new JLabel("Regístrate");
        lRegistro.setFont(fInfoLogin);
        lRegistro.setBounds(235, 430, 150, 20);
        lRegistro.setForeground(new Color(238,77,45));
        lRegistro.setCursor(cMano);
        pDerecho.add(lRegistro);

    }
    
    private void cargarBotones(){
        JButton bEntrar = ObjetosGraficosService.crearBoton(30,250,360,40,new Color(243,130,108),Color.WHITE);
        bEntrar.setFont(fBotonI);
        bEntrar.setText("INICIAR SESION");
        bEntrar.setBorder(bordeN);
        pDerecho.add(bEntrar);
        bEntrar.addActionListener(e -> ingresar());
        
        //boton entrar con facebook
        JButton bEntrarF = new JButton();
        bEntrarF.setFont(fInfoLogin);
        bEntrarF.setText("Facebook");
        bEntrarF.setBounds(30,370, 175, 40);
        bEntrarF.setFocusable(false);
        bEntrarF.setBackground(Color.WHITE);
        bEntrarF.setForeground(Color.black);
        bEntrarF.setCursor(cMano);
        pDerecho.add(bEntrarF);
        //boton entrar con gmail
        JButton bEntrarG = new JButton();
        bEntrarG.setFont(fInfoLogin);
        bEntrarG.setText("Google");
        bEntrarG.setBounds(215,370, 175, 40);
        bEntrarG.setFocusable(false);
        bEntrarG.setBackground(Color.WHITE);
        bEntrarG.setForeground(Color.black);
        bEntrarG.setCursor(cMano);
        pDerecho.add(bEntrarG);

    }
    
    private void cargarFields(){
        JTextField tNombreUsuario = new JTextField("Telefono/Nombre de usuario/Correo");
        tNombreUsuario.setBounds(30, 90, 360, 40);
        tNombreUsuario.setForeground(new Color(200,200,200));
        tNombreUsuario.setBackground(Color.WHITE);
        //tNombreUsuario.setCaretColor(Color.BLUE); // Color de la línea que parpadea
        pDerecho.add(tNombreUsuario);

        JPasswordField tClaveUsuario = new JPasswordField("Contraseña");
        tClaveUsuario.setBounds(30, 170, 360, 40);
        tClaveUsuario.setForeground(Color.DARK_GRAY);
        //tClaveUsuario.setCaretColor(Color.BLUE);
        pDerecho.add(tClaveUsuario);
        
    }

    public abstract void ingresar();
}
