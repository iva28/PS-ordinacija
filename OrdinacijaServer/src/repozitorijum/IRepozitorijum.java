/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repozitorijum;

import java.util.List;

/**
 *
 * @author Iva
 * @param <T>
 */
public interface IRepozitorijum<T> {
    List<T> svi(T param) throws Exception;
    Long dodaj(T param) throws Exception;
    T vratiJednog(T param) throws Exception;
    boolean obrisi(T param)throws Exception;
    boolean izmena(T param) throws Exception;
    List<T> nadji(T param) throws Exception;
}
