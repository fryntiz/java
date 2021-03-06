package Ventanas;

/**
 * Ventana simple que pide tu nombre y edad
 * Al Pulsar "Aceptar" Salta un diaógo mostrando la información introducida
 * Al pulsar "Borrar" Limpia lo que hayamos escrito
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class NombreEdad extends JFrame implements ActionListener {

    private JButton btnAceptar; //Creado botón Aceptar
    private JButton btnBorrar; //Creado botón Borrar
    JTextField txtNombre; //Entrada de texto para nombre
    JTextField txtEdad; //Entrada de texto para Edad

    public static void main(String[] args) {
        NombreEdad vp = new NombreEdad();
    }

    public NombreEdad() {
        JLabel lblNombre = new JLabel("Nombre: ");
        txtNombre = new JTextField(10);

        JLabel lblEdad = new JLabel("Edad: ");
        txtEdad = new JTextField(2);

        //Botón Borrar
        btnBorrar = new JButton("Borrar"); //Crea objeto
        btnBorrar.addActionListener(this); //Lo pone en escuchar eventos
        this.add(btnBorrar); //Agrega al panel

        //Botón Aceptar
        btnAceptar = new JButton("Aceptar"); //Crea objeto
        btnAceptar.addActionListener(this); //Lo pone en escuchar eventos
        this.add(btnAceptar); //Agrega al panel

        this.setLayout(new GridLayout(3, 2));

        //Agregando etiquetas y campos de texto para nombre y edad
        this.add(lblNombre);
        this.add(txtNombre);
        this.add(lblEdad);
        this.add(txtEdad);
        
        //Congiguraciones y comportamiento
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar al salir
        this.setTitle("Nombre de la Ventana"); 
        //this.setSize(200, 200);
        this.setResizable(false); //Bloquea la redimensión de la ventana
        //this.setSize(new Dimension(300,200));
        this.pack();
        this.setVisible(true); //Marca como visible la ventana
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAceptar) {
            StringBuilder sb = new StringBuilder("Nombre: ");
            sb.append(txtNombre.getText());
            sb.append("\nEdad: ");
            sb.append(txtEdad.getText());
            JOptionPane.showMessageDialog(this, sb.toString(), "Información de la Persona", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == btnBorrar) {
            txtNombre.setText("");
            txtEdad.setText("");
        }
    }
}
