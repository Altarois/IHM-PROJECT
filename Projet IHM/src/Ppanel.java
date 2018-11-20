import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Ppanel extends JPanel 
{
	
	
	
	public Ppanel()
	{
		
	}
	

	 public void paintComponent(Graphics g){
		    
		    System.out.println("Je suis exécutée !"); 
		    
		
		    
		    
		   try 
		    {
			   
			   Image img1=ImageIO.read(new File("Ressources/nebuleuse.png"));
		       g.drawImage(img1,0,0,1250,850,this);
			   
		  
		      
		  }      
		    catch(Exception e)
		    {
		    	e.printStackTrace();
		    	System.out.print("erreur detecter");
		    	
		    }
	      }

}
