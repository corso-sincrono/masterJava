package it.bnl.master;
public final class ContoCorrente 
{
	
	private String nome;
	private String cognome;
	private double saldo;

	public ContoCorrente(){}

	public ContoCorrente(String nome,String cognome,double saldo){

		//this.nome=nome;
		setNome(nome);
		this.cognome=cognome;
		this.saldo=saldo;
	}

	//utilizzo dell'overloading
	public ContoCorrente(double saldo){


			this.saldo=saldo;
	}

	public void setNome(String nome){
		
		this.nome=nome;

		
	}
	public String getNome(){

		return this.nome;
	}


	public void setCognome(String cognome){
		
		this.cognome=cognome;

		
	}
	public String getCognome(){

		return this.cognome;
	}

	public void setSaldo(double saldo){


		this.saldo=saldo;
	}
	
	//final impedisce l'override del metodo
	public final double getSaldo(){


		return this.saldo;
	}
	
}
