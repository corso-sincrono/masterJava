public class Diritto{
	
	private String contenutoArticolo=null;
	
	
	
	public String getContenutoArticolo(String ar){
		
		
		if(ar.equals("1")){
			contenutoArticolo=Articoli.ARTICOLO_1;
			
		}
		return contenutoArticolo;
		
	}
	
	
	
	
}