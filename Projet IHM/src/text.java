import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.swing.JTextField;

public class text extends JTextField {
	private ResultSetMetaData resultMeta;
	
	public text()
	{
		
	}
	
	public text(ResultSetMetaData resultM)
	{
	    this.resultMeta =resultM;
	}
	

	public ResultSetMetaData getResultMeta() {
		return resultMeta;
	}

	public void setResultMeta(ResultSetMetaData resultMeta) {
		this.resultMeta = resultMeta;
	}
	
	public String affichage(ResultSetMetaData result)
	{
		try { 
			Class.forName("org.postgresql.Driver").newInstance();
		      System.out.println("Driver O.K.");

		      String url = "jdbc:postgresql://localhost:5432/Gestion Congres";
		      String user = "postgres";
		      String passwd = "nabila13";

		      Connection conn = DriverManager.getConnection(url, user, passwd);
		      java.sql.Statement state =  conn.createStatement();
		      
		      System.out.println("Connexion effective !");  
		      
		      
		  
		      
		      
		         
		     while(((ResultSet) result).next()){
		    	return  "nom\t" + ((ResultSet) result).getString("nom") + "\t |"
		    	 + "prenom\t" + ((ResultSet) result).getString("prenom") + "\t |"
		    	  +"\n---------------------------------";
		    	}
		      
		      
		    	
		      
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		return null;
		
	}

	
}
