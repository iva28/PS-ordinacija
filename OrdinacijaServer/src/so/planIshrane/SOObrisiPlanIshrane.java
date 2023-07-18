/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.planIshrane;

import domen.OpstaDomenskaKlasa;
import domen.PlanIshrane;
import domen.StavkaPlanaIshrane;
import so.OpstaSO;

/**
 *
 * @author Iva
 */
public class SOObrisiPlanIshrane extends OpstaSO {

    private boolean uspeh = false;

    public boolean isUspeh() {
        return uspeh;
    }

    @Override
    protected void izvrsiSpecificnuOperaciju(OpstaDomenskaKlasa obj) throws Exception {
        db.obrisi(new StavkaPlanaIshrane((PlanIshrane) obj));
        uspeh = db.obrisi(obj);
    }

    @Override
    protected void validiraj(OpstaDomenskaKlasa obj) throws Exception {
        if (obj == null || !(obj instanceof PlanIshrane)) {
            throw new Exception("Mora biti Plan Ishrane!\n");
        }
    }

}
