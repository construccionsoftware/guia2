package interfaz;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import mundo.Perro;

public class Interfaz extends JFrame  {

	JTextField jnamePerro, namePerro, razaPerro, jrazaPerro, localidad, jlocalidad,propietario,jpropietario,tel,jtel,cedula,jcedula,dia,jdia,busca,jbusca;
	JLabel titulo;
	String disp = "";
	JButton registrar;
	JButton buscar;
	JTextArea busqueda;
    JComboBox localidades,dias; 
	ArrayList<Perro> bdPerros = new ArrayList<Perro>();
	Perro p;
	private static final long serialVersionUID = 1L;

	public Interfaz() {
		setLayout(null);
		titulo = new JLabel("***************************VETERINARIA Y GUARDERIA CANINA EAN*************************\n");
		busqueda = new JTextArea(12,40);
		JScrollPane scrollPane = new JScrollPane(busqueda); 
		//scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		busqueda.setEditable(false);
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		//JText labels
		namePerro = new JTextField("Nombre del Perro", 15);
		razaPerro = new JTextField("Raza del Perro", 15);
		localidad = new JTextField("Localidad", 15);
		propietario = new JTextField("Propietario", 15);
		tel = new JTextField("Telefono del propietario", 15);
		cedula = new JTextField("Cedula del propietario", 15);
		dia = new JTextField("Dia de asistencia", 15);
		busca= new JTextField("Busqueda por localidad",15);
		//Jtext atributos
		jnamePerro = new JTextField(20);
		jrazaPerro = new JTextField(20);
		jlocalidad = new JTextField(20);
		jpropietario = new JTextField(20);
		jtel = new JTextField(20);
		jcedula = new JTextField(20);
		jdia = new JTextField(20);
		jbusca = new JTextField(10);
		//Atributo de los labels
		namePerro.setEditable(false);
		razaPerro.setEditable(false);
		localidad.setEditable(false);
		propietario.setEditable(false);
		tel.setEditable(false);
		cedula.setEditable(false);
		dia.setEditable(false);
		busca.setEditable(false);
		//Botones
		registrar = new JButton("Registrar");
		buscar = new JButton("Buscar");
		//Lista desplegable
		localidades = new JComboBox();
		localidades.setModel(new DefaultComboBoxModel(new String[] {"Usaquen", "Chapinero", "Teusaquillo", "Suba"})); 
		localidades.setPreferredSize(new Dimension(220,20));
		dias = new JComboBox();
		dias.setModel(new DefaultComboBoxModel(new String[] {"Lunes", "Martes", "Miercoles", "Jueves","Viernes"})); 
		dias.setPreferredSize(new Dimension(230,20));
	    //Adicionarlos al contaider de la interfaz
		container.add(titulo);
		container.add(namePerro);
		container.add(jnamePerro);
		container.add(razaPerro);
		container.add(jrazaPerro);
		container.add(localidad);
		container.add(localidades);
		container.add(propietario);
		container.add(jpropietario);
		container.add(tel);
		container.add(jtel);
		container.add(cedula);
		container.add(jcedula);
		container.add(dia);
		container.add(dias);
		container.add(registrar);
		
		JSeparator separator = new JSeparator();
	    container.add(separator);

		//container.add(busqueda);
		container.add(scrollPane);
		container.add(busca);
		container.add(jbusca);
		container.add(buscar);
		
		//Llenado de la base de datos
		Perro pbd;
		pbd= new Perro("Rocky","Unica","Usaquen","Jorge","123","123","Martes");
		bdPerros.add(pbd);
		pbd= new Perro("Candy","Unica","Chapinero","Jorge","123","123","Miercoles");
		bdPerros.add(pbd);
		pbd= new Perro("Titin","Unica","Usaquen","Jorge","123","123","Martes");
		bdPerros.add(pbd);
		pbd= new Perro("Violeta","Unica","Suba","Jorge","123","123","Jueves");
		bdPerros.add(pbd);
		pbd= new Perro("Cande","Unica","Usaquen","Jorge","123","123","Jueves");
		bdPerros.add(pbd);
		pbd= new Perro("Azul","Unica","Usaquen","Jorge","123","123","Martes");
		bdPerros.add(pbd);
		pbd= new Perro("Capitan","Unica","Chapinero","Jorge","123","123","Viernes");
		bdPerros.add(pbd);
		pbd= new Perro("Orion","Unica","Usaquen","Jorge","123","123","Martes");
		bdPerros.add(pbd);
		pbd= new Perro("Orfeo","Unica","Suba","Jorge","123","123","Lunes");
		bdPerros.add(pbd);
		pbd= new Perro("Fiona","Unica","Usaquen","Jorge","123","123","Martes");
		bdPerros.add(pbd);
		
		
		setVisible(true);
		registrar.addActionListener(new ActionListener() {  
			  public void actionPerformed(ActionEvent event ) {  
				    p = new Perro();
					p.setNombre(jnamePerro.getText());
					p.setRaza(jrazaPerro.getText());
					p.setLocalidad(localidades.getSelectedItem().toString());
					p.setPropietario(jpropietario.getText());
					p.setCedulaPropietario(jcedula.getText());
					p.setTelefonoPropietario(jtel.getText());
					p.setDiaAsistencia(jdia.getText());
					bdPerros.add(p);
					JOptionPane.showMessageDialog(null,p.getNombre()+"  !!!  A quedado Registrado  ����");
					jnamePerro.setText("");
					jrazaPerro.setText("");
					jlocalidad.setText("");
					jpropietario.setText("");
					jcedula.setText("");
					jtel.setText("");
					jdia.setText("");
			   
			  }  
			});  
		
		buscar.addActionListener(new ActionListener() {  
			  public void actionPerformed(ActionEvent event ) {  
				  Perro p1;
				  String text="";
				  busqueda.setText("");
				
				  for (int i = 0; i <bdPerros.size(); i++) {
					  
			           p1=bdPerros.get(i);
			         
					  if(p1.getLocalidad().equals(jbusca.getText()))
					  {
						  System.out.println("Encontrados"+p1.getLocalidad());
						  text+="\n------------------------------------------------------------------------------\n";
						  text+=p1.textPerro(p1.getNombre(), p1.getRaza(), p1.getLocalidad(), p1.getPropietario(), p1.getCedulaPropietario(), p1.getTelefonoPropietario(), p1.getDiaAsistencia());
					  }
			        }
				  busqueda.setText(text);
			 
				  
			   
			  }  
			});
		}
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Perro p = new Perro();
		
		Interfaz ventana=new Interfaz();
		ventana.setBounds(200,150,500,700);
		ventana.setVisible(true);
		ventana.setResizable(false);
	}

}
