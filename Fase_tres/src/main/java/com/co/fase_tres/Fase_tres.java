/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.co.fase_tres;

import com.co.fase_tres.dto.Exportacion;
import com.co.fase_tres.dto.TasaConversion;


/**
 *
 * @author User
 */
public class Fase_tres {

    public static void main(String[] args) {
        
        Exportacion export = new Exportacion();
        export.setValorTotal(4600.0);
        TasaConversion tasa = new TasaConversion();
        tasa.setValor(4600.0);
        System.out.println(export.valorExportacionDolares(tasa));
    }
}
