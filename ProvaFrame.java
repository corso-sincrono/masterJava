import java.awt.Frame;
import java.awt.Color;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class  ProvaFrame implements ActionListener
{
		static Button b=null;
		static Button b1=null;

	public static void main(String[] args) 
	{
		Frame x=new Frame("Prova Frame");
		x.setLayout(null);
		x.setVisible(true);
		x.setSize(500,500);
		x.setLocation(300,50);
		x.setBackground(Color.red);

		b=new Button("CHIUDI");
		b.setSize(80,30);
		b.setLocation(220,300);
		b.addActionListener(new ProvaFrame());
		x.add(b);

		b1=new Button("AZZERA");
		b1.setSize(80,30);
		b1.setLocation(300,300);
		b1.addActionListener(new ProvaFrame());
		x.add(b1);

	}

	public void actionPerformed(ActionEvent e){
		
			if(e.getSource()==b){
			System.exit(0);
			}
	}
}
