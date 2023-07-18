/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.nutricionista;

import domen.Nutricionista;
import domen.OpstaDomenskaKlasa;
import java.util.List;
import so.OpstaSO;

/**
 *
 * @author Iva
 */
public class SOUcitajListuNutricionista extends OpstaSO {

    private List<OpstaDomenskaKlasa> lista;

    public List<OpstaDomenskaKlasa> getLista() {
        return lista;
    }
    
    @Override
    protected void izvrsiSpecificnuOperaciju(OpstaDomenskaKlasa obj) throws Exception {
        lista = db.svi(obj);
    }

    @Override
    protected void validiraj(OpstaDomenskaKlasa obj) throws Exception {
        if (obj == null || !(obj instanceof Nutricionista)) {
            throw new Exception("Mora biti Nutricionista!\n");
        }
    }

}
