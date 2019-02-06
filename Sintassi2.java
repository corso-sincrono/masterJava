class Sintassi2 
{
	public static void main(String[] args) 
	{
		int[] x={2,1,5,4};//array di interi con assegnazione dei valori
		String[] nomi=new String[3];//dichiarazione di un array di stringhe
		
		String cognomi="aaaaaaaaaaa";				

		System.out.println("lunghezza   "+cognomi.length());//lunghezza della stringa
		//nomi[3]="mario";//accesso all'indice i-esimo per inserire il valore


		for(int item:x)//ciclo for-each, valido solo da java 5 in poi
		{
			System.out.println(item);
		}
	}
}
