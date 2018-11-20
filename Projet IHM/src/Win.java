import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Win extends JFrame
{

	private String titre="inscription";
	private boolean cond=false;
	public boolean isCond() {
		return cond;
	}
	public void setCond(boolean cond) {
		this.cond = cond;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public Win() 
	{
	
		 JFrame f1=new JFrame();
	f1.setSize(600, 450);
	//f1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	f1.setLocationRelativeTo(null);
	
	JPanel p1=new JPanel();
	p1.setLayout(null);
	JButton j11=new JButton(this.titre);
	j11.setBounds(250, 300, 100, 50);
	f1.add(p1);
	p1.add(j11);
	
	
	
	
	}

}
