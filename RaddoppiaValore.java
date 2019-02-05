

public class RaddoppiaValore {
      // classe che ha unico scopo di raddoppiare il valore passatole

      public void raddoppia(Valore daRaddoppiare)
      {
    	  System.out.println("\nPassaggio di un oggetto (per RIFERIMENTO)");
    	  System.out.println(">>>> nel metodo entra: "+daRaddoppiare.numero);
    	  daRaddoppiare.numero*=2;
    	  System.out.println(">>>> nel metodo diventa: "+daRaddoppiare.numero+"\n");
      }


      
      public void raddoppia(int daRaddoppiare)
      {
    	  System.out.println("\nPassaggio di un int (per VALORE)");
    	  System.out.println(">>>> nel metodo entra: "+daRaddoppiare);
    	  daRaddoppiare*=2;
    	  System.out.println(">>>> nel metodo diventa: "+daRaddoppiare+"\n");
      }
}
