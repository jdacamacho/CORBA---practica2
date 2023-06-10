/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.util.HashMap;
import java.util.LinkedList;
import sop_corba.ObtenerEstadisticasIntPOA;
import sop_corba.ObtenerEstadisticasIntPackage.estadisticasDTO;
import sop_corba.ObtenerEstadisticasIntPackage.estadisticasDTOHolder;
import servidor.calcularEstadisticas;

/**
 *
 * @author LENOVO
 */
public class ObtenerEstadisticasImpl extends ObtenerEstadisticasIntPOA{

    
    private LinkedList <Float> ofertas;
    public ObtenerEstadisticasImpl()
    {
        this.ofertas = new LinkedList<>();
    }

    @Override
    public boolean registrarValorOferta(float valor) {
        System.out.println("Entrando a registrar oferta...");
        if(consultarMayorOferta() < valor){
            this.ofertas.add(valor);
            return true;
        }
        return false;
    }

    @Override
    public float consultarMayorOferta() {
        float mayor = 0;
        System.out.println("Entrando a consultar mayor oferta...");
        if (this.ofertas == null || this.ofertas.isEmpty()) {
            return mayor;
        }
        else{
            mayor = this.ofertas.getFirst();
            for (float numero : this.ofertas) {
                if (numero > mayor) {
                    mayor = numero;
                }
            }
        }
        return mayor;
    }

    @Override
    public void consultarEstadisticas(estadisticasDTOHolder resultado) {
        System.out.println("Entrando a consultar estaditicas...");
        calcularEstadisticas calcularEstadisticas = new calcularEstadisticas();
        resultado.value=calcularEstadisticas.realizarCalculos(this.ofertas);
    }
    
}
