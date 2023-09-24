package Servicios;

import java.awt.Desktop;
import java.net.URI;

public class Web {
    
    public static boolean openWebpage(String link) {
        URI uri;
        try {
            uri = new URI(link);
            Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
            if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
                desktop.browse(uri);
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
