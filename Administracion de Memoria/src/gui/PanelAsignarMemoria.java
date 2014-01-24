/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author FernandoAnzola
 */
public class PanelAsignarMemoria extends JPanel  {

    
    private JLabel jlmemoriatotal;
    private JTextField jtmemoriatotal;
    private JLabel jlmemoriaSO;
    private JTextField jtmemoriaSO;
    private JButton buttonasignar;
    private Eventos eventos;
    
    public PanelAsignarMemoria(Eventos eventos1) {
    
        setSize(450, 150);
        setBorder(new TitledBorder("Asiganción inicial de memoria"));
        setOpaque(true);
        setLayout(null);
        eventos=eventos1;
    
        jlmemoriatotal= new JLabel("Asignar memoria Sistema");
        jlmemoriatotal.setBounds(20, 40, 150, 30);
        
        jtmemoriatotal= new JTextField("");
        jtmemoriatotal.setBounds(190, 40, 50, 30);
        
        jlmemoriaSO= new JLabel("Asignar memoria SO");
        jlmemoriaSO.setBounds(20, 90, 150, 30);
        
        jtmemoriaSO= new JTextField("");
        jtmemoriaSO.setBounds(190, 90, 50, 30);
        
        buttonasignar= new JButton("Asignar");
        buttonasignar.setBounds(300, 70, 100, 30);
        buttonasignar.addActionListener(eventos);
        buttonasignar.setActionCommand(Eventos.ASIGNAR_MEMORIA);
        
       add(jlmemoriatotal);
       add(jtmemoriatotal);
       add(jlmemoriaSO);
       add(jtmemoriaSO);
       add(buttonasignar);
        
        
    }

    /**
     * @return the jlmemoriatotal
     */
    public JLabel getJlmemoriatotal() {
        return jlmemoriatotal;
    }

    /**
     * @param jlmemoriatotal the jlmemoriatotal to set
     */
    public void setJlmemoriatotal(JLabel jlmemoriatotal) {
        this.jlmemoriatotal = jlmemoriatotal;
    }

    /**
     * @return the jtmemoriatotal
     */
    public JTextField getJtmemoriatotal() {
        return jtmemoriatotal;
    }

    /**
     * @param jtmemoriatotal the jtmemoriatotal to set
     */
    public void setJtmemoriatotal(JTextField jtmemoriatotal) {
        this.jtmemoriatotal = jtmemoriatotal;
    }

    /**
     * @return the jlmemoriaSO
     */
    public JLabel getJlmemoriaSO() {
        return jlmemoriaSO;
    }

    /**
     * @param jlmemoriaSO the jlmemoriaSO to set
     */
    public void setJlmemoriaSO(JLabel jlmemoriaSO) {
        this.jlmemoriaSO = jlmemoriaSO;
    }

    /**
     * @return the jtmemoriaSO
     */
    public JTextField getJtmemoriaSO() {
        return jtmemoriaSO;
    }

    /**
     * @param jtmemoriaSO the jtmemoriaSO to set
     */
    public void setJtmemoriaSO(JTextField jtmemoriaSO) {
        this.jtmemoriaSO = jtmemoriaSO;
    }

    /**
     * @return the buttonasignar
     */
    public JButton getButtonasignar() {
        return buttonasignar;
    }

    /**
     * @param buttonasignar the buttonasignar to set
     */
    public void setButtonasignar(JButton buttonasignar) {
        this.buttonasignar = buttonasignar;
    }
    
    
    
    
}
