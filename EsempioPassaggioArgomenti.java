

public class EsempioPassaggioArgomenti {

	public static void main(String[] args) {
	  //tipo---variabile--riferimento
		Valore x=  new Valore();//metodo costruttore

		x.numero=10;
		
		
		RaddoppiaValore raddoppiaValore=new RaddoppiaValore();
		
		raddoppiaValore.raddoppia(x);


		System.out.println("\nRisultati nel main");
		System.out.println("Passato per riferimento: "+x.numero);
















	}

}
