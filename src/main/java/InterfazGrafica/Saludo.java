/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfazGrafica;

/**
 *
 * @author venganzaalchocolate
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import java.awt.event.*;
import javax.swing.JLabel;

public class Saludo extends JPanel implements ActionListener {

    // Componentes gráficos: un botón y un área de texto
    private JButton boton1, boton2, boton3;
    private JTextArea texto;
    private JLabel texto2;

    public Saludo() {
        initComponents();
    }

    private void initComponents() {
        // Tamaño del panel
        this.setPreferredSize(new Dimension(600, 200));

        // Borde del panel
        this.setBorder(new TitledBorder("Ejercicio 2"));

        // Creamos el botón, con un texto a mostrar
        // a . Cambiar el texto que aparece en cada botón, para que en uno sea "Nombre" y el otro "Apellidos".
        boton1 = new JButton("Nombre");
        boton2 = new JButton("Apellido");

        // Creamos el textArea de una fila por 25 columnas
        texto = new JTextArea(1, 25);

        // Establecemos el color de fondo del textArea
        texto.setBackground(Color.gray);

        // Posicionamiento de componentes con FlowLayout
        this.setLayout(new FlowLayout());

        // Añadimos los componentes al panel
        this.add(boton1);
        this.add(boton2);
        this.add(texto);

        // Se le indica al objeto boton que escuche eventos tipo click
        // y se pasa como argumento una referencia de tipo ActionListener
        // En este caso se pasa this que es el panel sobre el 
        // que está el botón y que implementa la interfaz ActionListener
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        
        
        // -----------------------------------------TAREA 3----------------------------------------------- 
        // a. Incluye un botón nuevo, con el texto "Generar Aleatorio".
        boton3 = new JButton("Generar Aleatorio");
        this.add(boton3);
        // b. Incluye una etiqueta (JLabel) en la que inicialmente se muestre el texto "Número"
        texto2= new JLabel("Numero");
        this.add(texto2);
        // c. Añade al botón "Generar Aleatorio" un controlador de eventos, usando clases internas 
        //anónimas, de forma que al pulsar sobre él, se genere un número aleatorio entre 0 y 10 y se muestre en la etiqueta (JLabel).
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Si el botón pulsado es botonSaludar
        if (e.getSource().equals(boton1)) {
            // En el boton2 como el texto no se ve con el fondo azul lo he cambiado a blanco(el texto) pero si vuelvo a presionar el botón1 
            // ya no se ve porque el color del texto es blanco así que tengo que poner que siempre que se active el boton1 me lo ponga a negro
            texto.setForeground(Color.BLACK);
            //b . Al pulsar sobre "Nombre", el área de texto debe cambiar su fondo a blanco y además debe aparecer tu nombre.
            texto.setBackground(Color.white);
            texto.setText("Elisabet ");
        } else {
            // c . Al pulsar sobre "Apellidos", el área de texto debe cambiar su fondo a azul y además deben aparecer tus apellidos.
            texto.setBackground(Color.BLUE);
            // como el texto no se ve con el fondo azul lo he cambiado a blanco(el texto)
            texto.setForeground(Color.WHITE);
            texto.setText("D'Acosta Almirón");
        }

    }
    
    /*
    Usando lo aprendido el proyecto de la tarea anterior, realiza los siguientes cambios:

    
c. Añade al botón "Generar Aleatorio" un controlador de eventos, usando clases internas 
    anónimas, de forma que al pulsar sobre él, se genere un número aleatorio entre 0 y 10 y se muestre en la etiqueta (JLabel).
d. Añade al botón "Generar Aleatorio" un controlador de eventos del tipo MouseListener, 
    implementado solamente los métodos mouseEntered y mouseExited, de forma que cuando el ratón se 
    sitúe sobre el botón cambie de color (elige uno que te guste) y cuando el ratón salga de la zona del botón, vuelva a su color original.
    */
    
}
