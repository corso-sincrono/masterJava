class Modificatori 
{
	//final rende costante o immutabile una variabile
	public final String marca="BMW";

	static int count=0;//area di memoria condivisa tra tutti
					   //gli oggetti della stessa classe

	public static int getCount(){

		return ++count;
	}


	public static void main(String[] args) 
	{
		//Modificatori x=new Modificatori();
		System.out.println("oggetto numero :"+Modificatori.getCount());

		//Modificatori y=new Modificatori();
		System.out.println("oggetto numero :"+Modificatori.getCount());

		//Modificatori z=new Modificatori();
		System.out.println("oggetto numero :"+Modificatori.getCount());

		//Modificatori j=new Modificatori();
		System.out.println("oggetto numero :"+Modificatori.getCount());
	}
}
