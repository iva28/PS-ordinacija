/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.planIshrane;

import domen.OpstaDomenskaKlasa;
import domen.PlanIshrane;
import domen.StavkaPlanaIshrane;
import java.util.ArrayList;
import java.util.List;
import so.OpstaSO;

/**
 *
 * @author Iva
 */
public class SOUcitajPlanIshrane extends OpstaSO {
    private PlanIshrane planIshrane;

    public PlanIshrane getPlanIshrane() {
        return planIshrane;
    }

    @Override
    protected void izvrsiSpecificnuOperaciju(OpstaDomenskaKlasa obj) throws Exception {
        planIshrane = (PlanIshrane) db.vratiJednog(obj);
        List<OpstaDomenskaKlasa> stavke_baza = db.nadji(new StavkaPlanaIshrane(planIshrane));
        List<StavkaPlanaIshrane> stavke = new ArrayList<>();
        for(OpstaDomenskaKlasa s : stavke_baza) {
            StavkaPlanaIshrane stavka = (StavkaPlanaIshrane) s;
            stavke.add(stavka);
        }
        planIshrane.setStavke(stavke);
    }

    @Override
    protected void validiraj(OpstaDomenskaKlasa obj) throws Exception {
        if (obj == null || !(obj instanceof PlanIshrane))
            throw new Exception("Mora biti Plan Ishrane!\n");
    }

}
