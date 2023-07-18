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
public class SOUcitajPacijenta extends OpstaSO{
    private Pacijent pacijent;

    public Pacijent getPacijent() {
        return pacijent;
    }
    
    

    @Override
    protected void izvrsiSpecificnuOperaciju(OpstaDomenskaKlasa obj) throws Exception {
        pacijent = (Pacijent) db.vratiJednog(obj);
    }

    @Override
    protected void validiraj(OpstaDomenskaKlasa obj) throws Exception {
        if (obj == null || !(obj instanceof Pacijent))
            throw new Exception("Mora biti Pacijent!\n");
    }
    
}
