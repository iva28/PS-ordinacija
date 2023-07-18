/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.nutricionista;

import domen.OpstaDomenskaKlasa;
import domen.Nutricionista;
import so.OpstaSO;

/**
 *
 * @author Iva
 */
public class SOPrijaviSe extends OpstaSO{
    
    private Nutricionista nutricionista;

    public Nutricionista vratiNutricionistu() {
        return nutricionista;
    }

    public void setNutricionista(Nutricionista nutricionista) {
        this.nutricionista = nutricionista;
    }
    
    
    @Override
    protected void izvrsiSpecificnuOperaciju(OpstaDomenskaKlasa obj) throws Exception {
        nutricionista  =  (Nutricionista) db.vratiJednog(obj);
    }

    @Override
    protected void validiraj(OpstaDomenskaKlasa obj) throws Exception {
        if(obj == null || !(obj instanceof Nutricionista))
            throw new Exception("Mora biti Nutricionista!\n");
    }

    
   
    
}
