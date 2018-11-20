import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelA extends JPanel
{

	
	
	private JLabel l1=new JLabel("Atelier Meteorolgique");
	private JLabel l2=new JLabel("Atelier Théorique sur la Panspermie");
	private JLabel l3=new JLabel("Atelier sur Les nouvelles thecnologies");
	private JLabel l4=new JLabel("Atelier sur la conquete de l espace");
	private JLabel l5=new JLabel("Atelier sur les trous noirs");
	private JLabel l6=new JLabel("Atelier physique qantique");
	private JLabel l7=new JLabel("Atelier Sur la matiere noir");
	private JLabel l8=new JLabel("Atelier BigBang");
	private JLabel l9=new JLabel("Atelier");
	private JLabel l10=new JLabel("Atelier");
	private JLabel l11=new JLabel("Atelier");
	
   public JLabel lc=new JLabel("veuillez vous connectez");
	
	/*private JButton j1=new JButton("S'inscrire");
	private JButton j2=new JButton("S'inscrire");
	private JButton j3=new JButton("S'inscrire");
	private JButton j4=new JButton("S'inscrire");
	private JButton j5=new JButton("S'inscrire");
	private JButton j6=new JButton("S'inscrire");
	private JButton j7=new JButton("S'inscrire");
	private JButton j8=new JButton("S'inscrire");
	private JButton j9=new JButton("S'inscrire");
	private JButton j10=new JButton("S'inscrire");
	private JButton j11=new JButton("S'inscrire");
	*/
	
	 public static PanelA panA1=new PanelA();
	    public static PanelA panA2=new PanelA();

public PanelA()
{
	
	Dimension dim=getPreferredSize();
	dim.width=350;
	setPreferredSize(dim);
	setLayout(null);
	
	
	lc.setText(Co.chaine2);
	lc.setBounds(550,0,200,100);
	l1.setBounds(150, 50, 300, 100);
    l2.setBounds(150, 100, 300, 100);
    l3.setBounds(150, 150, 300, 100);
    l4.setBounds(150, 200, 300, 100);
    l5.setBounds(150, 250, 150, 100);
    l6.setBounds(150, 300, 200, 100);
    l7.setBounds(150, 350, 200, 100);
    l8.setBounds(150, 400, 200, 100);
    l9.setBounds(150, 450, 200, 100);
    l10.setBounds(150,500, 200, 100);
    l11.setBounds(150, 550, 200, 100);
   
    lc.setForeground(new Color(207,207,207));
    l1.setForeground(new Color(207,207,207));
    l2.setForeground(new Color(207,207,207));
    l3.setForeground(new Color(207,207,207));
    l4.setForeground(new Color(207,207,207));
    l5.setForeground(new Color(207,207,207));
    l6.setForeground(new Color(207,207,207));
    l7.setForeground(new Color(207,207,207));
    l8.setForeground(new Color(207,207,207));
    l9.setForeground(new Color(207,207,207));
    l10.setForeground(new Color(207,207,207));
    l11	.setForeground(new Color(207,207,207));
    
    add(lc);
    add(l1);
    add(l2);
    add(l3);
    add(l4);
    add(l5);
    add(l6);
    add(l7);
    add(l8);
    add(l9);
    add(l10);
    add(l11);
    
 
    
    
}  

public void paintComponent(Graphics g){
    
    System.out.println("Je suis exécutée !"); 
    

    
    
   try 
    {
	   
	   Image img1=ImageIO.read(new File("Ressources/space.jpg"));
       g.drawImage(img1,0,0,1250,850,this);
	   
  
      
  }      
    catch(Exception e)
    {
    	e.printStackTrace();
    	System.out.print("erreur detecter");
    	
    }
  }

}
