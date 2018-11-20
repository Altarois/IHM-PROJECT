import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;


public class LoginPanel extends JPanel 
{ 
 
	private JLabel l1=new JLabel("E-Mail:");
	private JLabel l2=new JLabel("Mot De Passe:");
	private JTextField t1=new JTextField();
	private JTextField t2=new JTextField();
	private JButton confirm=new JButton("Se Connecter");
    public static String inf="Pas encore connectes";
    public static JPanel lol=new JPanel();
    public static JButton j1=new JButton("S'inscrire");
    public static JButton j2=new JButton("S'inscrire");
    public static JButton j3=new JButton("S'inscrire");
    public static JButton j4=new JButton("S'inscrire");
    public static JButton j5=new JButton("S'inscrire");
    public static JButton j6=new JButton("S'inscrire");
    public static JButton j7=new JButton("S'inscrire");
    public static JButton j8=new JButton("S'inscrire");
    public static JButton j9=new JButton("S'inscrire");
    public static JButton j10=new JButton("S'inscrire");
    public static JButton j11=new JButton("S'inscrire");
    public static JButton jA=new JButton("Articles");
  
    
	public LoginPanel()
	{
		setLayout(null);
		

		Border in=BorderFactory.createTitledBorder("Connexion");
		
		Border out=BorderFactory.createEmptyBorder(25,25,25,25);
		setBorder(BorderFactory.createCompoundBorder(out, in));
		setBorder(BorderFactory.createCompoundBorder(out, in));
		
		
		l1.setBounds(250,100,100,20);
		l2.setBounds(250,150,100,20);
		add(l2);
		add(l1);
		
		t1.setBounds(350,100,100,20);
		t2.setBounds(350,150,100,20); 
		add(t1);
		add(t2);
		
		confirm.setBounds(340, 245, 150, 50);
		add(confirm);
		
		confirm.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				String use=t1.getText();
				String pswd=t2.getText();
				
				try { 
				Class.forName("org.postgresql.Driver").newInstance();
			      System.out.println("Driver O.K."); 

			      String url = "jdbc:postgresql://localhost:5432/Gestion Congres";
			      String user = "postgres";
			      String passwd = "nabila13";

			      Connection conn = DriverManager.getConnection(url, user, passwd);
			      java.sql.Statement state =  conn.createStatement();
			      
			      System.out.println("Connexion effective !");  
			      
			      String sql="SELECT email,mdp,nom,prenom,pays,profession FROM participant WHERE email='"+use+"' AND mdp='"+pswd+"'";
			      
			     
			      ResultSet result = ((java.sql.Statement) state).executeQuery(sql);
			     
			      //On récupère les MetaData
			      ResultSetMetaData resultMeta = result.getMetaData();
			      
			      if(use.equals("") || pswd.equals(""))
			      {JOptionPane.showMessageDialog(null, "remplissez les champs vides :");}
			         
			      
			      else
			      {
			     while(result.next()){
			    	  Co.chaine="<html>nom :" + result.getString("nom")+"<br> </br>" 
			    	  +"prenom :" + result.getString("prenom")+"<br> </br>"  
			    			  +"profession :" + result.getString("profession") +"<br> </br>" 
			    					  +"email :" + result.getString("email")+"<br> </br>" 
			    								 +"pays :" + result.getString("pays")
			    											  
			    	  +"</br> </br>-------------------------------------------------------------------</html>";
			    	}
			     
			     Co.a=1;
			     Co.users=use;
			     Co.pswd=pswd;
			     Co.modif=new JLabel(Co.chaine);
			     Co.chaine2="Vous etes connecté";
			   if(Co.a==1)
			   {
			     //AFFICHAGE INFO EN UTILISANT LE 2 PANEL MODIFIER/////////////
				   System.out.print(Co.a+"\n"+Co.chaine+"\n");
			     //Co.modif.setBounds(50,50,400,400);
			  
			   jA.setBounds(550, 700, 150, 75);
			   HomePanel.pan4.add(jA);
			   HomePanel.pan4.info.setText(Co.chaine);
			   Main.fen.setContentPane(HomePanel.pan4);
			   Main.fen.repaint();
			   Main.fen.setVisible(true);
			   lol.setLayout(null);
			    
			    lol.add(Co.modif);
			   
			   //AFFICHAGE DES JBUTTON APRES AVOIR EFFECTUER LA CONNEXION///////////
			   j1.setBounds(800, 100, 150, 25);
			   j2.setBounds(800, 150, 150, 25);
			   j3.setBounds(800, 200, 150, 25);
			   j4.setBounds(800, 250, 150, 25);
			   j5.setBounds(800, 300, 150, 25);
			   j6.setBounds(800, 350, 150, 25);
			   j7.setBounds(800,400, 150, 25);
			   j8.setBounds(800, 450, 150, 25);
			   j9.setBounds(800, 500, 150, 25);
			   j10.setBounds(800, 550, 150, 25);
			   j11.setBounds(800, 600, 150, 25);
			   
			   
		//MISE A JOUR EN BDD DES ATELIER POUR CHAQUE BOUTON/////////////////////////  
			j1.addActionListener(new ActionListener()
					{

						
						public void actionPerformed(ActionEvent arg0) 
						{
							
							
							
							
							try {
								Class.forName("org.postgresql.Driver");
							      System.out.println("Driver O.K."); 

							      String url = "jdbc:postgresql://localhost:5432/Gestion Congres";
							      String user = "postgres";
							      String passwd = "nabila13";
								 
								 java.sql.Statement state =  conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
							PreparedStatement prepare = conn.prepareStatement("UPDATE participant SET atelier = 'Dramatic' WHERE id =10");
							System.out.print("je m execute\n");
							
							 } 
							 
							 catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						}
				
					});
			 
			    
			   
			   PanelA.panA1.add(j1);
			   PanelA.panA1.add(j2);
			   PanelA.panA1.add(j3);
			   PanelA.panA1.add(j4);
			   PanelA.panA1.add(j5);
			   PanelA.panA1.add(j6);
			   PanelA.panA1.add(j7);
			   PanelA.panA1.add(j8);
			   PanelA.panA1.add(j9);
			   PanelA.panA1.add(j10);
			   PanelA.panA1.add(j11);
			   
			   Main.fen2.setContentPane(PanelA.panA1);
			  
			   }
			     
			      }
				}
			      
			      			    	
			      
				
				catch(Exception e)
				{
					e.printStackTrace();
				}
			
				
			}
			
		});
		
		
		
	}
	
	
	
}
