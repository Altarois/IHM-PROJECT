import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class MPanel extends JPanel 

{
    public static int ID=2;
	private JLabel l1;
	private JLabel l2;
	private JLabel l4;
	private JLabel l5;
	private JLabel l6;
	private JLabel l7;
	private JLabel l8;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	private JTextField t6;
	private JTextField t7;

	private JLabel l3=new JLabel("Proffession:");
	private JButton Cbut;
	private String[] textcb= {"Proffesseur","Chercheur","Etudiant","autres" };
	private JComboBox<String> cb=new JComboBox<String>(textcb);
	private JList<String> li=new JList<String>();
	public MPanel()
	{
		
		Dimension dim=getPreferredSize();
		dim.width=350;
		setPreferredSize(dim);
		
		
		JLabel l2=new JLabel("Nom:");
		JLabel l1=new JLabel("Prenom:");
		JLabel l4=new JLabel("E-Mail:");
		JLabel l5=new JLabel("N°Tel:");
		JLabel l6=new JLabel("Pays:");
		JLabel l7=new JLabel("Mot De Passe:");
		String[] textcb= {"Professeur","Etudiant","Specialiste","autre"};
		 JComboBox<String> cb=new JComboBox<String>(textcb);
		
		
		JTextField t2=new JTextField(10);
		JTextField t1=new JTextField(10);
		JTextField t3=new JTextField(10);
		JTextField t4=new JTextField(10);
		JTextField t5=new JTextField(10);
		JTextField t6=new JTextField(10);
		JTextField t7=new JTextField(10);
		
		JButton Cbut=new JButton("Inscription");
		

		
	Cbut.addActionListener(new ActionListener()
			{
	

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			String s1=new String();
			String s2=new String();
			String s3=new String();
			String s4=new String();
			String s5=new String();
			String s6=new String();
			String s7=new String();
			int n1;
			
	
			s1=t1.getText();
			s2=t2.getText();
			s3=(String) cb.getSelectedItem();
			s4=t4.getText();
			s5= t5.getText();
			s6=t6.getText();
			s7=t7.getText();
			
			ID++;
			
			
			
			try {
				      
				
				      Class.forName("org.postgresql.Driver").newInstance();
				      System.out.println("Driver O.K.");

				      String url = "jdbc:postgresql://localhost:5432/Gestion Congres";
				      String user = "postgres";
				      String passwd = "nabila13";

				      Connection conn = DriverManager.getConnection(url, user, passwd);
				      System.out.println("Connexion effective !");   
				    
				     
				       //String sql = "INSERT INTO Annuaire (nom, prenom, tel) VALUES(?,?,?)";
				      
				      /*java.sql.Statement state =  conn.createStatement();
				      
				      ResultSet result =  state.executeQuery("INSERT INTO user VALUES ('lol','lol','lol','lol','lol','lol')");
				      result.close();*/
				      
				     java.sql.Statement stmt = conn.createStatement();
				     
				    //statement= conn.prepareStatement(query,Statement.RETURN_GENERATED_KEYS); 
				     
				        /* String sql = "INSERT INTO participant (nom,prenom,profession,email,num,pays,mdp) "
				            + "VALUES ('Paul', 'dsk', 'prof', 'ifdk','0562556','canada','tamerelagrossechienne' );";
				         stmt.executeUpdate(sql);*/
				     String sql = "INSERT INTO participant (nom,prenom,profession,email,num,pays,mdp,atelier)VALUES('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','')";
					         stmt.executeUpdate(sql);
				      
				      
				      
				       
				         
				    } catch (Exception exe) {
				      exe.printStackTrace();
				    } 
			
		}
			});
	
	
		
		
		Border in=BorderFactory.createTitledBorder("Inscriptions");
		Border out=BorderFactory.createEmptyBorder(50, 50, 50, 50);
		setBorder(BorderFactory.createCompoundBorder(out, in));
		
		setLayout(null);
		
		l1.setBounds(100, 100, 75, 20);
		l2.setBounds(100,125,75,20);
		l3.setBounds(100, 150, 75, 20);
		l4.setBounds(350,100,75,20);
		l5.setBounds(350,125,75,20);
		l6.setBounds(350,150,75,20);
		l7.setBounds(225,210,100,20);
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6); 
		add(l7);
		add(cb);
		
		t1.setBounds(150,100,100,20);
		t2.setBounds(150,125,100,20);
		cb.setBounds(150,150,100,20);
		t4.setBounds(400,100,100,20);
		t5.setBounds(400,125,100,20);
		t6.setBounds(400,150,100,20);
		t7.setBounds(325, 210, 100, 20);
		
		add(t6);
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(t5);
		add(t7);
		
		Cbut.setBackground(new Color(222,111,66));
		Cbut.setBounds(340, 235, 100, 50);
		add(Cbut);
		
		
		
		
		l3.setBounds(75, 150,75,20);
		cb.setBounds(125, 175,125,30);
		//add(l3);
		//add(cb);
	}
		
		public void paintComponent(Graphics g){
		    
		  /*  System.out.println("Je suis exécutée !"); 
		    
		    Font font =new Font("Arial",Font.ITALIC,40);
		    
		    g.setFont(font);
		    g.fillOval(20, 20, 75, 75);
		    g.drawString("Salut les bro c lrb", 150, 150);*/
		    
		    
		  /*  try 
		    {
		    	Image img=ImageIO.read(new File("Ressource/background.jpg"));
		       g.drawImage(img,250,250,this);
		  }      
		    catch(Exception e)
		    {
		    	e.printStackTrace();
		    	System.out.print("erreur detecter");
		    	
		    }*/
		    
		   /* Graphics2D g2D=(Graphics2D) g;
		    
		    GradientPaint grad =new GradientPaint(0,0,Color.BLUE,800,800,Color.GRAY);
		    g2D.setPaint(grad);
		    g2D.fillRect(0, 0, getWidth(), getHeight());
		    */
		    }
		
	
}
