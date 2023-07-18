/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.kuvar;

import domen.OpstaDomenskaKlasa;
import domen.Kuvar;
import java.util.List;
import so.OpstaSO;

/**
 *
 * @author Iva
 */
public class SOUcitajKuvare extends OpstaSO{
    
      private List<OpstaDomenskaKlasa> lista;

    public List<OpstaDomenskaKlasa> vratiListu() {
        return lista;
    }

    @Override
    protected void izvrsiSpecificnuOperaciju(OpstaDomenskaKlasa obj) throws Exception {
        lista = db.svi(obj);
    }

    @Override
    protected void validiraj(OpstaDomenskaKlasa obj) throws Exception {
        if (!(obj instanceof Kuvar))
            throw new Exception("Mora biti Kuvar!\n");
    }
    
}
