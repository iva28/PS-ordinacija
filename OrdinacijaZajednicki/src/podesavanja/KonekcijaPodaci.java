/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package podesavanja;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 *
 * @author Iva
 */
public class KonekcijaPodaci {

    private static KonekcijaPodaci instanca;
    private Properties props;

    private KonekcijaPodaci() {
        try {
            props = new Properties();
            props.load(new FileInputStream("../OrdinacijaZajednicki/konekcija/konekcija.properties"));
        } catch (Exception ex) {
            System.err.println("Greška pri učitavanju konekcija properties fajla! " + ex.getMessage());
        }
    }

    public static KonekcijaPodaci vratiInstancu() {
        if (instanca == null) {
            instanca = new KonekcijaPodaci();
        }
        return instanca;
    }

    public String vratiProperti(String kljuc) {
        return props.getProperty(kljuc);
    }

    public void postaviAdresu(String adresa) {
        try {
            props.setProperty("adresa", adresa);
//            props.store(new FileOutputStream(new File("C:\\Users\\DELL\\Desktop\\seminarskiPS\\OrdinacijaZajednicki\\konekcija\\konekcija.properties")), null);
            props.store(new FileOutputStream(new File("../OrdinacijaZajednicki/konekcija/konekcija.properties")), null);
        } catch (Exception ex) {
            System.err.println("Greška pri upisu adrese u properties fajl\n" + ex.getMessage());
        }
    }

    public void postaviPort(String port) {
        try {
            props.setProperty("port", port);
//            props.store(new FileOutputStream(new File("C:\\Users\\DELL\\Desktop\\seminarskiPS\\OrdinacijaZajednicki\\konekcija\\konekcija.properties")), null);
            props.store(new FileOutputStream(new File("../OrdinacijaZajednicki/konekcija/konekcija.properties")), null);
        } catch (Exception ex) {
            System.err.println("Greška pri upisu porta u properties fajl\n" + ex.getMessage());
        }
    }

}
