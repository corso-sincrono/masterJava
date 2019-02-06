import it.bnl.master.ContoCorrente;
import it.bnl.master.ContoArancio;
class TestConto2 
{
	public static void main(String[] args) 
	{

		ContoCorrente x= new ContoArancio(2,1000);

		x.setInteressi(2);
		System.out.println(x.getSaldo());
	}
}
