/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domen;

import java.io.Serializable;
import java.util.List;
import java.sql.ResultSet;

/**
 *
 * @author iva
 */
public abstract class OpstaDomenskaKlasa implements Serializable{
    public abstract String imeTabele();
    public abstract String vratiParametre();
    public abstract String vratiNaziveParametara();
    public abstract String vratiNazivPrimarnogKljuca();
    public abstract Long vratiPrimarniKljuc();
    public abstract List<OpstaDomenskaKlasa> konvertujUListu(ResultSet rs);
    public abstract String uslovZaIzmenu();
    public abstract String uslovZaJednog();
    public abstract String uslovZaVise();
    public abstract  String spajanje();
    public abstract  String vratiSlozenPrimarniKljuc();
    public abstract String uslovZaBrisanjeVise(); 
}
