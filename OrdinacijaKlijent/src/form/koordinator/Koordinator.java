/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package form.koordinator;

import domen.Pacijent;
import form.FrmGlavna;
import form.FrmPrijava;
import form.jelo.FrmNovoJelo;
import form.jelo.FrmPretragaJela;
import form.kontroler.KontrolerGlavna;
import form.kontroler.pacijent.KontrolerNoviPacijent;
import form.kontroler.jelo.KontrolerNovoJelo;
import form.kontroler.KontrolerPrijava;
import form.kontroler.jelo.KontrolerPretragaJela;
import form.kontroler.pacijent.KontrolerSviPacijenti;
import form.kontroler.planIshrane.KontrolerKreirajPlanIshrane;
import form.kontroler.planIshrane.KontrolerPlanIshranePrikaz;
import form.kontroler.planIshrane.KontrolerPretragaPlanaIshrane;
import form.pacijent.FrmNoviPacijent;
import form.pacijent.FrmSviPacijenti;
import form.planIshrane.FrmKreirajPlanIshrane;
import form.planIshrane.FrmPlanIshranePrikaz;
import form.planIshrane.FrmPretragaPlanaIshrane;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import komunikacija.Komunikacija;

/**
 *
 * @author Iva
 */
public class Koordinator {

    private static Koordinator instanca;
    private final KontrolerGlavna kontrolerGlavna;

    //u ovom nizu ces da cuvas nutricionistu,izabranog pacijenta,plan ishrane
    private final Map<String, Object> parametri;

    private Koordinator() {
        kontrolerGlavna = new KontrolerGlavna(new FrmGlavna());
        parametri = new HashMap<>();
    }

    public static Koordinator vratiInstancu() {
        if (instanca == null) {
            instanca = new Koordinator();
        }
        return instanca;
    }

    public KontrolerGlavna getKontrolerGlavna() {
        return kontrolerGlavna;
    }

    public void otvoriLoginFormu() {
        KontrolerPrijava kontrolerPrijava = new KontrolerPrijava(new FrmPrijava());
        kontrolerPrijava.otvoriFormu();
    }

    public void otvoriGlavnuFormu() {
        kontrolerGlavna.otvoriFormu();
    }

    public void otvoriFrmNoviPacijent(Pacijent p) {
        KontrolerNoviPacijent kontrolerNoviP = new KontrolerNoviPacijent(new FrmNoviPacijent(kontrolerGlavna.getFrmGlavna(), true, p));
        kontrolerNoviP.otvoriFormu();
    }

    public void otvoriFrmSviPacijenti() {
        KontrolerSviPacijenti kontrolerSviPacijenti = new KontrolerSviPacijenti(new FrmSviPacijenti());
        kontrolerSviPacijenti.otvoriFormu();
    }

    public void otvoriFrmNovoJelo() {
        KontrolerNovoJelo kontrolerNovoJelo = new KontrolerNovoJelo(new FrmNovoJelo(kontrolerGlavna.getFrmGlavna(), true));
        kontrolerNovoJelo.otvoriFormu();
    }

    public void otvoriFrmPretragaJela() {
        KontrolerPretragaJela kontrolerPretragaJela = new KontrolerPretragaJela(new FrmPretragaJela());
        kontrolerPretragaJela.otvoriFormu();
    }

    public void otvoriFrmKreirajPlanIshrane() {
        KontrolerKreirajPlanIshrane kontrolerKreirajPI = new KontrolerKreirajPlanIshrane(new FrmKreirajPlanIshrane());
        kontrolerKreirajPI.otvoriFormu();
    }

    public void otvoriFrmPlanIshranePrikaz() {
        KontrolerPlanIshranePrikaz kontrolerPIPrikaz = new KontrolerPlanIshranePrikaz(new FrmPlanIshranePrikaz());
        kontrolerPIPrikaz.otvoriFormu();
    }

    public void otvoriFrmPretragaPlanaIshrane() {
        KontrolerPretragaPlanaIshrane kontrolerPretragaPlana = new KontrolerPretragaPlanaIshrane(new FrmPretragaPlanaIshrane());
        kontrolerPretragaPlana.otvoriFormu();
    }

    public void odjaviSe() {
        try {
            boolean rez = Komunikacija.vratiInstancu().odjaviSe();
            if (rez) {
                JOptionPane.showMessageDialog(kontrolerGlavna.getFrmGlavna(), "Uspeh u odjavljivanju sa sistema!");
                otvoriLoginFormu();
//                otvoriLoginFormu();
            }
        } catch (Exception ex) {
            System.err.println("Greška u odjavljivanju sa sistema " + ex.getMessage());
//            JOptionPane.showMessageDialog(kontrolerGlavna.getFrmGlavna(), "Greška pri odjavi sa sistema");
        } finally {
            kontrolerGlavna.getFrmGlavna().dispose();
        }
    }

    public void dodajParametar(String kljuc, Object vrednost) {
        parametri.put(kljuc, vrednost);
    }

    public Object uzmiParametar(String kljuc) {
        return parametri.get(kljuc);
    }

}
