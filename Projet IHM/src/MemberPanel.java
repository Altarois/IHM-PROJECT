import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class MemberPanel extends JPanel implements ActionListener {
	/**
	 * 
	 */
	private static int cpt=0;
	private static int cpt2=0;
	 JButton j7=new JButton("Acceuil");
	private JButton j1=new JButton("Inscription");
	private JButton j2=new JButton("Connexion");
	private static final long serialVersionUID = 1L;
	private JList<String> li=new JList<String>();
	private JLabel l1=new JLabel("News");
	private JLabel l2=new JLabel("Affichage");
	//private JLabel l3=new JLabel("veuillez vous connectez");
	public JLabel info=new JLabel("LOL",SwingConstants.LEFT);
	public JButton j3=new JButton("information personel");
	public JButton j4=new JButton("Article");
	
	
	

	public MemberPanel()
	{
	
		
		Dimension dim=getPreferredSize();
		dim.width=350;
		setPreferredSize(dim);
		setLayout(null);
		
		Border in=BorderFactory.createTitledBorder("Espace Membre");
		
		
		Border out=BorderFactory.createEmptyBorder(150,25,25,25);
		setBorder(BorderFactory.createCompoundBorder(out, in));
		setBorder(BorderFactory.createCompoundBorder(out, in));
		
		
		
	 l1.setBounds(300, 125, 100, 100);
	 l1.setFont(new Font("Tahoma", Font.BOLD, 20));
	 l2.setBounds(750, 125, 100, 100);
	 l2.setFont(new Font("Tahoma", Font.BOLD, 20));
	
	 add(l1);
	 add(l2);
	 l1.setForeground(new Color(207,207,207));
	 l2.setForeground(new Color(207,207,207));
	  
DefaultListModel<String> ageModel=new DefaultListModel<String>();
		
		ageModel.addElement("1) lol");
		ageModel.addElement("2) lol");
		ageModel.addElement("3) lol");
		
		li.setModel(ageModel);
		li.setBounds(150, 200, 450, 475);
	    li.setBackground(new Color(100,30,100));
		li.setForeground(new Color(207,207,207));
		li.setFont(new Font("Tahoma", Font.BOLD, 14));
		li.setOpaque(true);
	    add(li);
		
	   	
	
		
		//this.setBackground(new Color(215,238,244));
		
		JPanel pan=new JPanel();
		pan.setLayout(new GridLayout(1,0));
		
		j1.setForeground(new Color(207,207,207));
		j2.setForeground(new Color(207,207,207));
		j7.setForeground(new Color(207,207,207));
		j1.setFont(new Font("Tahoma", Font.BOLD, 14));
		j2.setFont(new Font("Tahoma", Font.BOLD, 14));
		j7.setFont(new Font("Tahoma", Font.BOLD, 14));
		j1.setBackground(new Color(30,45,100));
		j2.setBackground(new Color(30,45,100));
		j7.setBackground(new Color(30,45,100));
		j4.setForeground(new Color(207,207,207));
		j4.setBackground(new Color(30,45,100));
		j4.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		
		j7.setBounds(50, 25, 150, 100);
		j4.setBounds(200, 25, 150, 100);
		j1.setBounds(350,25,150,100);
		j2.setBounds(500,25,150,100);
		
		add(j4);
		add(j1);
		add(j2);
		add(j7);
		
		
		//JButton ActionBut=new JButton();
		
		 j1.addActionListener(this);
		 j2.addActionListener(this);
		 j7.addActionListener(this);
		 j4.addActionListener(this);
		 
		 System.out.print(Co.a+Co.users+Co.pswd);
		 info.setText(LoginPanel.inf);
		 info.setBackground(new Color(30,45,100));
		 info.setForeground(new Color(207,207,207));
		 info.setVerticalAlignment(JLabel.TOP);
		info.setFont(new Font("Tahoma", Font.BOLD, 14));
		 info.setBounds(650,200,400,400);
		 info.setOpaque(true);
		 add(info);
		 
		

		 
		
				
					
						
		}
			    
	public void actionPerformed(ActionEvent e) 
	{
		JButton ActionBut=(JButton)e.getSource();
		
		if(ActionBut==j1)
		{
			if(cpt==0) {
			JFrame f1=new JFrame("Inscriptions");
			f1.setSize(650, 350);
			f1.setLocationRelativeTo(null);
			MPanel p1=new MPanel();
			f1.setLayout(null);
			f1.setContentPane(p1);
			f1.setVisible(true);
			cpt++;
			}
			else
			{System.out.print("fenetre deja ouverte\n");}
		 
		}
		
		
		
		
		else if(ActionBut==j2)
	        {
				JFrame f1=new JFrame("Connexion");
				f1.setSize(650, 350);
		       	f1.setLocationRelativeTo(null);
				LoginPanel p2=new LoginPanel();
				f1.setLayout(null);
				f1.setContentPane(p2);
				 /* JTextField info=new JTextField(Co.chaine);
				      info.setBounds(650,250 , 450, 475);
						add(info);*/
				 
			     // ((Appendable) info).append(Co.chaine);
			
					
				this.repaint();
				f1.setVisible(true);
			
		}
	    
		else if(ActionBut==j7)
		{
			/*JFrame f1=new JFrame("Connexion");
			f1.setSize(650, 450);
			f1.setLocationRelativeTo(null);
			
			f1.setLayout(null);
			f1.setContentPane(LoginPanel.lol);
			f1.setVisible(true);*/
			Main.fen.setContentPane(Main.H1);
			Main.fen.repaint();
			Main.fen.setVisible(true);
			
		}
		
		else if(ActionBut==j4)
		{
	
			
			Article pan=new Article();
			Main.fen3.setSize(1200, 800);
			Main.fen3.setContentPane(pan);
			Main.fen3.setLocationRelativeTo(null);
			Main.fen3.repaint();
			Main.fen3.setVisible(true);
			
		}
			
			
	}
	
	 public void paintComponent(Graphics g){
		    
		    System.out.println("Je suis exécutée !"); 
		    
		
		    
		    
		   try 
		    {
			   
		    	Image img=ImageIO.read(new File("Ressources/space.jpg"));
		       g.drawImage(img,0,0,1250,850,this);
		       System.out.print("affiche");
		  }      
		    catch(Exception e)
		    {
		    	e.printStackTrace();
		    	System.out.print("erreur detecter");
		    	
		    }
	      }

	public JLabel getInfo() {
		return info;
	}

	public void setInfo(JLabel info) {
		this.info = info;
	}

		
	}
	

	
	

