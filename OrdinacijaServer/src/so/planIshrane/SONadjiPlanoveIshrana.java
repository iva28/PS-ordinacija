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
public class SONadjiPlanoveIshrana extends OpstaSO {

    private List<OpstaDomenskaKlasa> lista;

    public List<OpstaDomenskaKlasa> vratiListu() {
        return lista;
    }

    @Override
    protected void izvrsiSpecificnuOperaciju(OpstaDomenskaKlasa obj) throws Exception {
       lista = db.nadji(obj);
        for (OpstaDomenskaKlasa o : lista) {
            PlanIshrane plan = (PlanIshrane) o;
            List<OpstaDomenskaKlasa> stavkeG = db.nadji(new StavkaPlanaIshrane(plan));
            List<StavkaPlanaIshrane> stavke = new ArrayList<>();
            for (OpstaDomenskaKlasa s : stavkeG) {
                stavke.add((StavkaPlanaIshrane)s);
            }
            plan.setStavke(stavke);
        }
    }

    @Override
    protected void validiraj(OpstaDomenskaKlasa obj) throws Exception {
        if (obj == null || !(obj instanceof PlanIshrane)) {
            throw new Exception("Mora biti Plan Ishrane!\n");
        }
    }

}
