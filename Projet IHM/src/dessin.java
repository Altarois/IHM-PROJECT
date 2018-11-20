import java.awt.BorderLayout;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
 
import javax.swing.JFrame;
import javax.swing.JTextArea;
 
public class dessin extends JFrame
{
    private JTextArea text;
 
    public dessin()
    {
        // INIT
        setTitle("Lecture");
        setSize(800,500);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setLocationRelativeTo(getParent());
       
        setBackground(new Color(100,30,100));
		setForeground(new Color(207,207,207));
 
         
        // TEXTE
        text = new JTextArea(readFile("Ressources/ez.txt"));
        
         
        // AJOUT DANS LA FENETRE
        add(text,BorderLayout.CENTER);
         
        // AFFICHE
        setVisible(true);
    }
     
    /**
     * Lis un fichier
     * @param file adresse du fichier
     * @return chaine de caractère
     */
    public String readFile( String file )
    {
        // LIS LE FICHIER
        String lines = "";
        String line;
        try
        {
            // CREE LE FLUX
            BufferedReader reader = new BufferedReader( new FileReader(file) );
             
            // LIS LIGNE A LIGNE
            while( (line = reader.readLine()) != null )
                lines += line+"\n";
        }
        catch( Exception e )
        {
            lines = "Une erreur s'est produite durant la lecture du flux : "+e.getMessage();
        }  
         
        return lines;
    }
     
    public static void main( String [] args )
    {
        new dessin();
    }
}
