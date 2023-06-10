package sop_corba;


/**
* sop_corba/ObtenerEstadisticasIntPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from operaciones.idl
* jueves 8 de junio de 2023 03:12:55 PM COT
*/

public abstract class ObtenerEstadisticasIntPOA extends org.omg.PortableServer.Servant
 implements sop_corba.ObtenerEstadisticasIntOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("registrarValorOferta", new java.lang.Integer (0));
    _methods.put ("consultarMayorOferta", new java.lang.Integer (1));
    _methods.put ("consultarEstadisticas", new java.lang.Integer (2));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // sop_corba/ObtenerEstadisticasInt/registrarValorOferta
       {
         float valor = in.read_float ();
         boolean $result = false;
         $result = this.registrarValorOferta (valor);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // sop_corba/ObtenerEstadisticasInt/consultarMayorOferta
       {
         float $result = (float)0;
         $result = this.consultarMayorOferta ();
         out = $rh.createReply();
         out.write_float ($result);
         break;
       }

       case 2:  // sop_corba/ObtenerEstadisticasInt/consultarEstadisticas
       {
         sop_corba.ObtenerEstadisticasIntPackage.estadisticasDTOHolder resultado = new sop_corba.ObtenerEstadisticasIntPackage.estadisticasDTOHolder ();
         this.consultarEstadisticas (resultado);
         out = $rh.createReply();
         sop_corba.ObtenerEstadisticasIntPackage.estadisticasDTOHelper.write (out, resultado.value);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:sop_corba/ObtenerEstadisticasInt:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public ObtenerEstadisticasInt _this() 
  {
    return ObtenerEstadisticasIntHelper.narrow(
    super._this_object());
  }

  public ObtenerEstadisticasInt _this(org.omg.CORBA.ORB orb) 
  {
    return ObtenerEstadisticasIntHelper.narrow(
    super._this_object(orb));
  }


} // class ObtenerEstadisticasIntPOA