/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.pacijent;

import domen.OpstaDomenskaKlasa;
import domen.Pacijent;
import java.util.List;
import so.OpstaSO;

/**
 *
 * @author Iva
 */
public class SONadjiPacijente extends OpstaSO{

     private List<OpstaDomenskaKlasa> lista;

    public List<OpstaDomenskaKlasa> vratiListu() {
        return lista;
    }
    @Override
    protected void izvrsiSpecificnuOperaciju(OpstaDomenskaKlasa obj) throws Exception {
        lista = db.nadji(obj);
    }

    @Override
    protected void validiraj(OpstaDomenskaKlasa obj) throws Exception {
        if (obj == null || !(obj instanceof Pacijent))
            throw new Exception("Mora biti Pacijent!\n");
    }
    
}
