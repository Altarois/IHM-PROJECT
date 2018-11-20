import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HomePanel extends JPanel implements ActionListener 
{
	private static int cpt=0;
	private static int cpt2=0;
	private static int cpt3=0;
	private static int cpt4=0;
	private static int cpt5=0;
	private static int cpt6=0;
	
	JButton j1=new JButton(new ImageIcon("Ressources/pre.jpg"));
	JButton j2=new JButton(new ImageIcon("Ressources/icone1.jpg"));
	JButton j3=new JButton(new ImageIcon("Ressources/planning.jpg"));
	JButton j4=new JButton(new ImageIcon("Ressources/atelier.jpg"));
	JButton j5=new JButton(new ImageIcon("Ressources/jupiter.jpg"));
	JButton j6=new JButton(new ImageIcon("Ressources/moon.jpg"));
	JButton j7=new JButton(new ImageIcon("Ressources/atelier.jpg"));
	MPanel pan2=new MPanel();		
    public static  MemberPanel pan3=new MemberPanel();
    public static MemberPanel pan4=new MemberPanel();
   
	
	
	public HomePanel()
	{
		Dimension dim=getPreferredSize();
		dim.width=350;
		setPreferredSize(dim);
		setLayout(null);
		
		
		j1.setBounds(50, 250, 350, 200);
		j2.setBounds(450, 250, 350, 200);
		j3.setBounds(850, 250, 350, 200);
		j4.setBounds(50, 525, 350, 200);
		j5.setBounds(450, 525, 350, 200);
		j6.setBounds(850, 525, 350, 200);
		//j7.setBounds(50, 50, 250, 150);
		
		add(j1);
		add(j2);
		add(j3);
		add(j4);
		add(j5);
		add(j6);
		add(j7);
		
		MPanel pan2=new MPanel();		
        //MemberPanel pan3=new MemberPanel();
        
        
		j1.addActionListener(this);
		 j2.addActionListener(this);
		 j3.addActionListener(this);
		 j4.addActionListener(this);
		 j5.addActionListener(this);
		 j6.addActionListener(this);
		 j7.addActionListener(this);
		
		 
		
						 
				}
	
	 public void actionPerformed(ActionEvent e) 
		{
			JButton ActionBut=(JButton)e.getSource();
			
			if(ActionBut==j1)
			{
				Ppanel p1=new Ppanel();
				Main.fen.setContentPane(p1);
				Main.fen.setVisible(true);
				Main.fen.repaint();
				
				
			}
			
			else if(ActionBut==j2)
			{
				
					
					Main.fen.setContentPane(pan3);
					Main.fen.repaint();
					Main.fen.setVisible(true);
					
					/* JFrame fen=new JFrame();	
					 fen.setSize(1250,850);
						fen.setLocationRelativeTo(null);
						
						fen.setContentPane(pan3);
					 
					    
					    fen.setVisible(true);*/
					
					
				}
			
			else if(ActionBut==j3)
			{
				
			}
		
			else if(ActionBut==j4)
			{
				
					
					Main.fen2.setSize(1200, 800);
					Main.fen2.setLocationRelativeTo(null);
					
					
					Main.fen2.setContentPane(PanelA.panA1);
					Main.fen2.setVisible(true);
					cpt4++;
					
					
				 	
			}
		
			else if(ActionBut==j5)
			{
				Main.fen4.setSize(1200, 800);
				Main.fen4.setLocationRelativeTo(null);
				PanelComit pa=new PanelComit();
				
				Main.fen4.setContentPane(pa);
				Main.fen4.setVisible(true);
				
			}
				
			else if(ActionBut==j6)
			{
				
			}
			
			else if(ActionBut==j7)
			{
				
			}
		
		}

	 public void paintComponent(Graphics g){
		    
		   
		    
		
		    
		    
		   try 
		    {
			   
		    	Image img=ImageIO.read(new File("Ressources/background.jpg"));
		       g.drawImage(img,0,0,1250,850,this);
		 
		  }      
		    catch(Exception e)
		   
		    {
		    	e.printStackTrace();
		    	System.out.print("erreur detecter");
		    	
		    } 
	      }
		    
		/*	@Override
			public void actionPerformed(ActionEvent e) {
			JFrame fen=new JFrame();
				fen.setSize(650,350);
			fen.setLocationRelativeTo(null);
			fen.setContentPane(pan2);
		   fen.setVisible(true);
		    }});*/

	
			

			
			/*public void actionPerformed(ActionEvent e) {
		 JFrame fen=new JFrame();	
		 fen.setSize(1250,850);
			fen.setLocationRelativeTo(null);
			
			fen.setContentPane(pan3);
		 
		    
		    fen.setVisible(true);
		    }});*/
		
	}


