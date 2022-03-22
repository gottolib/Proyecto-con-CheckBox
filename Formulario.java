import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
public class Formulario extends JFrame implements ActionListener, ChangeListener {
	private JLabel label1;
	private JCheckBox c1, c2, c3;
    private JButton boton1;
    String cad, cad2="", cad3="";
    
    Formulario()
    {
    	setLayout(null);
    	label1 = new JLabel("Seleccione una opcion");
    	label1.setBounds(10,10,200,60);
    	add(label1);
    	c1 = new JCheckBox ("Mozilla ");
    	c1.setBounds(5,90,100,50);
    	add(c1);
    	c1.addChangeListener(this);
    	c2 = new JCheckBox ("Chrome ");
    	c2.setBounds(5,170,100,70);
    	add(c2);
    	c2.addChangeListener(this);
    	c3 = new JCheckBox ("Explorer ");
    	c3.setBounds(5,250,100,70);
    	add(c3);
    	c3.addChangeListener(this);
    	boton1 = new JButton("Aceptar");
    	boton1.setBounds(15,320,100,50);
    	add(boton1);
    	boton1.addActionListener(this);
    	
    }
    public void stateChanged (ChangeEvent e)

  
    {


    	if(c1.isSelected()==true)
    	{
    		cad =  c1.getText();
    	}
    	else
    	{
    		cad = "";
    	}
    	if(c2.isSelected()==true)
    	{
    		cad2 =  c2.getText();
    		
    	}
    	else
    	{
    		cad2 = "";
    	}
    	
    	if(c3.isSelected()==true)
    	{
    		cad3 = c3.getText();
    	}
    	else
    	{
    		cad3 = "";
    	}
    
    }
	 public void actionPerformed(ActionEvent e)
	    {
	    	if(e.getSource()==boton1)
	    	{
	    		setTitle(cad+cad2+cad3);
	    	}
	    }
   
    public static void main (String []ar)
    {
    	Formulario formulario1 = new Formulario();
    	formulario1.setBounds(5,5,600,500);
    	formulario1.setVisible(true);
    }
}
