import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;



   

public class Main {

	public static JFrame fen=new JFrame("Congres");
	public static JFrame fen2=new JFrame("Atelier");
	public static JFrame fen3=new JFrame("Article");
	public static JFrame fen4=new JFrame("Membres et Comités");
	public static HomePanel H1=new HomePanel();
	public static void main(String[] args) 
	
	{
		
		
		
		fen.setSize(1250,850);
		fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fen.setLocationRelativeTo(null);
		
		fen.setContentPane(H1);
		fen.setBackground(Color.blue);
		 
		fen.setVisible(true);
		
		System.out.print(Co.a);
		
		
		/*JPanel pan=new JPanel();
		MPanel pan2=new MPanel();
		
		
		
		fen.add(pan);
		fen.show();
		
		
		
 
  		pan.setLayout(null);
  		
		
		
		
		
		JButton j1=new JButton(new ImageIcon("/Ressources/icone2.jpg"));
		JButton j2=new JButton(new ImageIcon("Ressource/icone2.png"));
		JButton j3=new JButton("Planning");
		JButton j4=new JButton("Atelier");
		JButton j5=new JButton("Membres Et Comités");
		JButton j6=new JButton("Sponsors");
		JButton j7=new JButton("Acceuil");
		
		
		j1.setBounds(50, 275, 350, 200);
		j2.setBounds(450, 275, 350, 200);
		j3.setBounds(850, 275, 350, 200);
		j4.setBounds(50, 525, 350, 200);
		j5.setBounds(450, 525, 350, 200);
		j6.setBounds(850, 525, 350, 200);
		j7.setBounds(50, 50, 250, 150);
		

		pan.add(j1);
		pan.add(j2);
		pan.add(j3);
		pan.add(j4);
		pan.add(j5);
		pan.add(j6);
		pan.add(j7);	
		
  MemberPanel pan3=new MemberPanel();
		
		
  
  
		j1.addActionListener(new ActionListener() {
		
			

			@Override
			public void actionPerformed(ActionEvent e) {
			fen.setSize(650,350);
			fen.setLocationRelativeTo(null);
			fen.setContentPane(pan2);
		   fen.setVisible(true);
		    }});

		j2.addActionListener(new ActionListener() {
			

			@Override
			public void actionPerformed(ActionEvent e) {
		 JFrame fen=new JFrame();	
		 fen.setSize(1250,850);
			fen.setLocationRelativeTo(null);
			
			fen.setContentPane(pan3);
			
			JButton j8=new JButton("Acceuil");
			j8.setBounds(200, 25, 150, 100);
			pan3.add(j8);
			
			j8.addActionListener(new ActionListener()
					{

						@Override
						public void actionPerformed(ActionEvent arg0)
						{
							fen.setContentPane(pan);
							fen.repaint();
						}
				
					});
		 
		    
		    fen.setVisible(true);
		    }});
		
		
		
		
		fen.setVisible(true);
		fen.repaint();
		
		//CTRL + SHIFT + O pour générer les imports
		/*      
	    try {
		      Class.forName("org.postgresql.Driver");
		      System.out.println("Driver O.K.");

		      String url = "jdbc:postgresql://localhost:5432/Gestion Congres";
		      String user = "postgres";
		      String passwd = "nabila13";

		      Connection conn = DriverManager.getConnection(url, user, passwd);
		      System.out.println("Connexion effective !");         
		         
		    } catch (Exception exe) {
		      exe.printStackTrace();
		    }      
		
		  
		
		Connection conn = null;
	    try {
	        // db parameters
	        String url = "jdbc:sqlite:C:/sqlite/db/chinook.db";
	        // create a connection to the database
	        conn = DriverManager.getConnection(url);
	        
	        System.out.println("Connection to SQLite has been established.");
	        
	    } catch (SQLException e) {
	        System.out.println(e.getMessage());
	    } finally {
	        try {
	            if (conn != null) {
	                conn.close();
	            }
	        } catch (SQLException ex) {
	            System.out.println(ex.getMessage());
	        }
		

	}

	*/
	
	
	

	
}
	 public void paintComponent(Graphics g){
		    
		    System.out.println("Je suis exécutée !"); 
		    
		
		    
		    
		   try 
		    {
			   
		    	Image img=ImageIO.read(new File("Ressources/background.jpg"));
		       g.drawImage(img,1250,850,(ImageObserver) this);
		       System.out.print("affiche");
		  }      
		    catch(Exception e)
		    {
		    	e.printStackTrace();
		    	System.out.print("erreur detecter");
		    	
		    }
	      }	
}
