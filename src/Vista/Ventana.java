package Vista;

import Vista.Login.LoginView;
import Vista.Principal.PrincipalView;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame{
    private JPanel loginView, principalView;
    
    public Ventana() {
        loginView = new LoginView() {
            @Override
            public void ingresar() {
                setContentPane(principalView);
            }
        };
        
        principalView = new PrincipalView() {
            @Override
            public void salir() {
                setContentPane(loginView);
            }
        };
        
        setContentPane(loginView);
        cargarPropiedades();
    }
    
    private void cargarPropiedades(){
        setSize(1300, 720); // tamaño
        setState(JFrame.MAXIMIZED_BOTH);
        setLayout(null); // layout null
        setLocationRelativeTo(null); // centrar ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // para terminar ejecución al cerrar
        setVisible(true); // hacer ventana visible
        setTitle("Shopee");
    }
}
