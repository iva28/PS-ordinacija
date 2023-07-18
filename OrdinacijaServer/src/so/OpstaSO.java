/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so;

import domen.OpstaDomenskaKlasa;
import repozitorijum.db.KonekcijaSaBazom;
import repozitorijum.db.impl.DBBroker;

/**
 *
 * @author Iva
 */
public abstract class OpstaSO {
    protected DBBroker db = new DBBroker();
    public final void izvrsiOperaciju(OpstaDomenskaKlasa obj) throws Exception {
        try {
            validiraj(obj);
            KonekcijaSaBazom.getInstanca().otvoriKonekciju();
            izvrsiSpecificnuOperaciju(obj);
            KonekcijaSaBazom.getInstanca().potvrdiTransakciju();
        } catch (Exception e) {
            KonekcijaSaBazom.getInstanca().ponistiTransakciju();
        } finally {
            KonekcijaSaBazom.getInstanca().zatvoriKonekciju();
        }
    }
    protected abstract void izvrsiSpecificnuOperaciju(OpstaDomenskaKlasa obj) throws Exception;
    protected abstract void validiraj(OpstaDomenskaKlasa obj) throws Exception;
}
