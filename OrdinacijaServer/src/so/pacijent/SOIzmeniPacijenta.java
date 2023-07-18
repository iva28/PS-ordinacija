/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.pacijent;

import domen.OpstaDomenskaKlasa;
import domen.Pacijent;
import so.OpstaSO;

/**
 *
 * @author Iva
 */
public class SOIzmeniPacijenta extends OpstaSO{
   private boolean uspeh = false;

    public boolean isUspeh() {
        return uspeh;
    }
    
    

    @Override
    protected void izvrsiSpecificnuOperaciju(OpstaDomenskaKlasa obj) throws Exception {
        uspeh = db.izmena(obj);
    }

    @Override
    protected void validiraj(OpstaDomenskaKlasa obj) throws Exception {
        if( obj == null || !(obj instanceof Pacijent))
            throw new Exception("Mora biti Pacijent!\n");
    }
    
    
}
