package sop_corba;


/**
* sop_corba/ObtenerEstadisticasIntOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from operaciones.idl
* jueves 8 de junio de 2023 03:12:55 PM COT
*/

public interface ObtenerEstadisticasIntOperations 
{
  boolean registrarValorOferta (float valor);
  float consultarMayorOferta ();
  void consultarEstadisticas (sop_corba.ObtenerEstadisticasIntPackage.estadisticasDTOHolder resultado);
} // interface ObtenerEstadisticasIntOperations
