/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package form.koordinator;

import domen.Nutricionista;
import form.FrmGlavna;
import form.FrmKonfiguracijaKonekcije;
import form.kontroler.KontrolerKonfiguracijaKonekcije;
import form.kontroler.KontrolerPokreniServer;
import java.util.ArrayList;
import java.util.List;
import niti.KlijentNit;

/**
 *
 * @author Iva
 */
public class KoordinatorS {

    private static KoordinatorS instanca;
    private final KontrolerPokreniServer kontrolerPokreniServer;
    private List<KlijentNit> aktivniKorisnici;

    private KoordinatorS() {
        kontrolerPokreniServer = new KontrolerPokreniServer(new FrmGlavna());
        aktivniKorisnici = new ArrayList<>();
    }

    public List<KlijentNit> getAktivniKorisnici() {
        return aktivniKorisnici;
    }

    public void setAktivniKorisnici(List<KlijentNit> aktivniKorisnici) {
        this.aktivniKorisnici = aktivniKorisnici;
    }

    public static KoordinatorS vratiInstancu() {
        if (instanca == null) {
            instanca = new KoordinatorS();
        }
        return instanca;
    }

    public KontrolerPokreniServer getKontrolerPokreniServer() {
        return kontrolerPokreniServer;
    }

    public void otvoriServerFormu() {
        kontrolerPokreniServer.otvoriFormu();
    }

    public void otvoriFormuKonfiguracijeKonekcije() {
        KontrolerKonfiguracijaKonekcije kontrolerKonekcije
                = new KontrolerKonfiguracijaKonekcije(new FrmKonfiguracijaKonekcije(kontrolerPokreniServer.getFrmGlavna(), true));
        kontrolerKonekcije.otvoriFormu();
    }

    public boolean vecJeUlogovan(Nutricionista n) {
        for (KlijentNit klijent : aktivniKorisnici) {
            if (klijent.getAdministrator().equals(n)) {
                return true;
            }
        }
        return false;
    }

    public boolean odjaviSe(Nutricionista nutricionista) {
        for (KlijentNit klijent : aktivniKorisnici) {
            if (nutricionista.equals(klijent.getAdministrator())) {
                kontrolerPokreniServer.odjavaNutricioniste(nutricionista);
                return true;
            }
        }
        return false;
    }


    public void dodajKlijentaNutricionistu(Nutricionista n) {
        kontrolerPokreniServer.dodajNutricionistu(n);
    }

}
