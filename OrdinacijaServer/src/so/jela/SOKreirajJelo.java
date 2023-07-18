/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.jela;

import domen.OpstaDomenskaKlasa;
import domen.Jelo;
import java.util.List;
import so.OpstaSO;

/**
 *
 * @author Iva
 */
public class SOKreirajJelo extends OpstaSO {

    private boolean uspeh;

    public boolean isUspeh() {
        return uspeh;
    }

    @Override
    protected void izvrsiSpecificnuOperaciju(OpstaDomenskaKlasa obj) throws Exception {
        Long signal = db.dodaj(obj);
        if (signal > 0) {
            uspeh = true;
        }
    }

    @Override
    protected void validiraj(OpstaDomenskaKlasa obj) throws Exception {
        if (obj == null || !(obj instanceof Jelo)) {
            throw new Exception("Mora biti Jelo!\n");
        }
    }

}
