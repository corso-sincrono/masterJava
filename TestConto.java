import it.bnl.master.ContoCorrente;
import it.bnl.master.ContoArancio;
public class TestConto 
{
	public static void main(String[] args) 
	{
		ContoCorrente x=new ContoCorrente(1000);

		ContoArancio y=new ContoArancio(2,1000);

		System.out.println("saldo iniziale cc :"+x.getSaldo());
		System.out.println("----------------------------");
		System.out.println("saldo iniziale ca :"+y.getSaldoConInteressi());
	}
}
