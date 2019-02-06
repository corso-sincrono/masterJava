package it.bnl.master;
public class  ContoArancio extends ContoCorrente
{
	private double interesse;



	public void setInteressi(double i){
	
		this.interesse=i;
	
	}
	




	public ContoArancio(){

			super();
	}

	public ContoArancio(double i,double s){
		
		super(s);//passaggio del parametro s al costruttore
				 //della super classe
				 //!!!! deve essere la prima istruzione !!!
		interesse=i;
		


		}


	//Overriding del metodo getSaldo() della super classe 
	@Override//valida solo da java 5 in poi
	public double getSaldo(){

		double s=super.getSaldo();

		return s*interesse;

	}


}
