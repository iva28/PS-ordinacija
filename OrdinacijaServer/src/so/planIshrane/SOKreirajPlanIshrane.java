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
public class SOKreirajPlanIshrane extends OpstaSO {

    private boolean uspeh = true;

    public boolean isUspeh() {
        return uspeh;
    }

    @Override
    protected void izvrsiSpecificnuOperaciju(OpstaDomenskaKlasa obj) throws Exception {
        Long id = db.dodaj(obj);
        if(id == -1) {
            uspeh = false;
            System.err.println("Ne može da se kreira plan");
            return;
        } 
        for (StavkaPlanaIshrane s : ((PlanIshrane) obj).getStavke()) {
            s.setPlanIshrane(new PlanIshrane(id));
            db.dodaj(s);
        }
    }

    @Override
    protected void validiraj(OpstaDomenskaKlasa obj) throws Exception {
        if (obj == null || !(obj instanceof PlanIshrane)) {
            throw new Exception("Mora biti Plan ishrane!\n");
        }
    }

}
