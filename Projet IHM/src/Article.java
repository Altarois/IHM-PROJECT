import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JPanel;

public class Article extends JPanel 
{

	public static int ind;
	JButton j1=new JButton("Lire");
	JList li=new JList();
	
public Article()
{
	Dimension dim=getPreferredSize();
	dim.width=350;
	setPreferredSize(dim);
	setLayout(null);
	
	DefaultListModel<String> Model=new DefaultListModel<String>();
	
	/*Model.addElement("Article sur les asteroides");
	Model.addElement("Les Limites de L univers");
	Model.addElement("atteindre la vitesse de la lumiére");
	
	
	li.setModel(Model);
	li.setBounds(50, 200, 450, 475);
    li.setBackground(new Color(100,30,100));
	li.setForeground(new Color(207,207,207));
	li.setFont(new Font("Tahoma", Font.BOLD, 14));
	li.setOpaque(true);
    add(li);*/
	
	String[] textcb= {"Animateur","Visiteur","Specialiste"};
	 JComboBox<String> cb=new JComboBox<String>(textcb);
	 
    

	/*Model.addListDataListener(new ListDataListener() {

		@Override
		public void contentsChanged(ListDataEvent arg0) {
			
			ind=li.getSelectedIndex();
		}

		@Override
		public void intervalAdded(ListDataEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void intervalRemoved(ListDataEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	});*/
     
        j1.setBounds(550,700,150,25);
        add(j1);
        add(li);
	
        j1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				System.out.print("\nje suis l index  "+ind);
				
					dessin d1=new dessin();
				
			}
        	
        });
}
	
}
