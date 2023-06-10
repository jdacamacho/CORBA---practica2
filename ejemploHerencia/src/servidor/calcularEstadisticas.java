/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidor;

import java.util.LinkedList;
import sop_corba.ObtenerEstadisticasIntPackage.estadisticasDTO;

/**
 *
 * @author INGESIS
 */
public class calcularEstadisticas {
    private estadisticasDTO estadisticas;
    
    public calcularEstadisticas(){
        this.estadisticas = new estadisticasDTO();
    }
    
    public estadisticasDTO realizarCalculos(LinkedList<Float> ofertas){
        this.estadisticas.cantidadSolicitudes = ofertas.size();
        this.estadisticas.promedioValorSolicitudes = calcularPromedio(ofertas);
        this.estadisticas.diferenciaMenorSolicitudMayorSolicitud = calcularDiferencia(ofertas);
        this.estadisticas.tasaCrecimiento = calcularTasaCrecimiento(ofertas);
        return this.estadisticas;
    }
    
    public float calcularPromedio(LinkedList<Float> ofertas){
        float valor=0;
        for(int i = 0 ; i<ofertas.size();i++){
            valor = valor + ofertas.get(i);
        }
        return valor/ofertas.size();
    }
    
    public float calcularDiferencia(LinkedList<Float> ofertas){
        float mayor=0 ;
        float menor=0;
        
        if (ofertas == null || ofertas.isEmpty()) {
            System.out.println("lista vacia");
        }
        else{
            mayor = ofertas.getFirst();
            menor = ofertas.getFirst();
            for (float numero : ofertas) {
                if (numero > mayor) {
                    mayor = numero;
                }
            }
        }
        return mayor-menor;
    }
    
    public float calcularTasaCrecimiento(LinkedList<Float> ofertas){
        float ofertaInicial=0;
        float ofertaFinal=0;
        
        if (ofertas == null || ofertas.isEmpty()) {
            System.out.println("lista vacia");
        }
        else{
            ofertaInicial = ofertas.getFirst();
            ofertaFinal = ofertas.getFirst();
            for (float numero : ofertas) {
                if (numero > ofertaFinal) {
                    ofertaFinal = numero;
                }
            }
        }
        return ((ofertaFinal - ofertaInicial)/ofertaInicial)*100; 
    }
}
