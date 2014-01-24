/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import sun.text.normalizer.UBiDiProps;

/**
 *
 * @author FernandoAnzola
 */
public class PanelAsignacionProcesos extends JPanel {

    private Eventos eventos;
    private JLabel jlnombreProceso;
    private JTextField jtnombreproceso;
    private JLabel jlubicacioninicial;
    private JTextField jTubicaioninicial;
    private JLabel jltamañoMemoria;
    private JTextField jttamañoMemoria;
    private JComboBox algoritmos;
    private JLabel jlAlgoritmo;
    
    private JButton btAsignacionManual;
    private JButton btAsignacionAlgoritmo;
    private JButton btAgregar;

    public PanelAsignacionProcesos(Eventos eventos1) {

        setSize(450, 300);
        setBorder(new TitledBorder("Asignacion Procesos"));
        setOpaque(true);
        setLayout(null);
        eventos = eventos1;


        jlnombreProceso = new JLabel("Nombre Proceso");
        jlnombreProceso.setBounds(20, 50, 150, 20);
        jtnombreproceso = new JTextField("");
        jtnombreproceso.setBounds(180, 50, 100, 20);
        jlubicacioninicial = new JLabel("Posicion Inicial");
        jlubicacioninicial.setBounds(20, 80, 150, 20);
        jTubicaioninicial = new JTextField("");
        jTubicaioninicial.setBounds(180, 80, 100, 20);
        jltamañoMemoria = new JLabel("Tamaño Memoria");
        jltamañoMemoria.setBounds(20, 110, 150, 20);
        jttamañoMemoria = new JTextField("");
        jttamañoMemoria.setBounds(180, 110, 100, 20);
        jlAlgoritmo= new JLabel("Seleccione Algoritmo");
        jlAlgoritmo.setBounds(20, 140, 100, 30);
        
        algoritmos = new JComboBox();
        algoritmos.addItem("mejor ajuste");
        algoritmos.setBounds(180, 140, 100, 30);
        
        
        btAsignacionManual= new JButton("Agregar de forma Manual");
        btAsignacionManual.setBounds(20, 20, 200, 30);
                
        btAsignacionAlgoritmo= new JButton("Agregar empleando algoritmo");
        btAsignacionAlgoritmo.setBounds(220, 20, 200, 30);
        
        btAgregar= new JButton("Asignar Proceso");
        btAgregar.setBounds(300, 250, 150, 30);
        
        
        
        add(jlnombreProceso);
        add(jltamañoMemoria);
        add(jlubicacioninicial);
        add(jtnombreproceso);
        add(jttamañoMemoria);
        add(jTubicaioninicial);
        add(jlAlgoritmo);
        add(algoritmos);
        add(btAsignacionManual);
        add(btAsignacionAlgoritmo);
        add(btAgregar);




    }
}
