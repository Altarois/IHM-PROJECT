import javax.swing.JFrame;

public class Wframe extends JFrame
{
	

	

		public Wframe() 
		{
		
		this.setSize(1250,800);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setLayout(null);
		MPanel p=new MPanel();
		this.setContentPane(p);
		
		
		
		
	}

	
}
