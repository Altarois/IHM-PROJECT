import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class PanelComit extends JPanel {
	
	public JLabel l1=new JLabel("<html>President de la Commission </br> Zac Herney </br> Adminitrateur de la Nasa </html>");
	public JLabel l2=new JLabel("<html>Membre de la comission</br>Jhon cena</br>Adminitrateur de la WWE</html>");
	public JLabel l3=new JLabel("<html>Chef De Projet</br>Marjorie Tench</br>Representante de la maison blanche</html>");
	public JLabel l4=new JLabel("");
	public JLabel l5=new JLabel("");
	public JLabel l6=new JLabel("");
	public String chaine1="";
	public String chaine2="";
	public String chaine3="";
	public PanelComit()
	{
		Dimension dim=getPreferredSize();
		dim.width=350;
		setPreferredSize(dim);
		setLayout(null);
		
		 l1.setBackground(new Color(30,45,100));
		 l1.setForeground(new Color(207,207,207));
		 l1.setVerticalAlignment(JLabel.TOP);
		l1.setFont(new Font("Tahoma", Font.BOLD, 14));
		 l1.setBounds(100,375,250,50);
		 l1.setOpaque(true);
		 add(l1);
		
		 l2.setBackground(new Color(30,45,100));
		 l2.setForeground(new Color(207,207,207));
		 l2.setVerticalAlignment(JLabel.TOP);
		l2.setFont(new Font("Tahoma", Font.BOLD, 14));
		 l2.setBounds(450,375,250,50);
		 l2.setOpaque(true);
		 add(l2);
		 
		 l2.setBackground(new Color(30,45,100));
		 l2.setForeground(new Color(207,207,207));
		 l2.setVerticalAlignment(JLabel.TOP);
		l2.setFont(new Font("Tahoma", Font.BOLD, 14));
		 l2.setBounds(450,375,250,50);
		 l2.setOpaque(true);
		 add(l2);
		 
		 l3.setBackground(new Color(30,45,100));
		 l3.setForeground(new Color(207,207,207));
		 l3.setVerticalAlignment(JLabel.TOP);
		l3.setFont(new Font("Tahoma", Font.BOLD, 14));
		 l3.setBounds(800,375,250,50);
		 l3.setOpaque(true);
		 add(l3);
		 
			try {
				Class.forName("org.postgresql.Driver");
			      System.out.println("Driver O.K."); 

			      String url = "jdbc:postgresql://localhost:5432/Gestion Congres";
			      String user = "postgres";
			      String passwd = "nabila13";
			      
			      Connection conn = DriverManager.getConnection(url, user, passwd);
			      java.sql.Statement state =  conn.createStatement();
			      
				 
				
			ResultSet result = state.executeQuery("SELECT * FROM participant");
			ResultSetMetaData resultmeta=result.getMetaData();
			
			 for(int i = 1; i <= resultmeta.getColumnCount(); i++)
			        System.out.print("\t" + resultmeta.getColumnName(i).toUpperCase() + "\t *");
			         
			      System.out.println("\n**********************************");
			         
			      while(result.next()){         
			        for(int i = 1; i <= resultmeta.getColumnCount(); i++)
			          System.out.print("\t"+ result.getObject(i).toString()+"\n");
			            
			        

			      }

			      /*result.close();
			      state.close();*/
			
				
				System.out.print("je suis la chaine 1 "+chaine1);
			
			
			System.out.print("je m execute\n");
			
			 } 
			 
			 catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}

	
	 public void paintComponent(Graphics g){
		    
		    System.out.println("Je suis exécutée !"); 
		    
		
		    
		    
		   try 
		    {
			   
			   Image img1=ImageIO.read(new File("Ressources/space.jpg"));
		       g.drawImage(img1,0,0,1200,800,this);
			   
		    	Image img=ImageIO.read(new File("Ressources/nasa.jpg"));
		       g.drawImage(img,100,150,250,200,this);
		       
		   	Image img2=ImageIO.read(new File("Ressources/jhon cena.jpg"));
		       g.drawImage(img2,450,150,250,200,this);
		       
		   	Image img3=ImageIO.read(new File("Ressources/tench.jpg"));
		       g.drawImage(img3,800,150,250,200,this);
		      
		  }      
		    catch(Exception e)
		    {
		    	e.printStackTrace();
		    	System.out.print("erreur detecter");
		    	
		    }
	      }

}
