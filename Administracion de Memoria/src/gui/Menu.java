/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author FernandoAnzola
 */
public class Menu extends JMenuBar{

    private JMenu menu ;
    private JMenuItem acercade;
    private Eventos eventos;
    public Menu(Eventos evento1) {
    
        menu= new JMenu("Acerca de ");
        
        acercade= new JMenuItem("acerca de ");
        eventos= evento1;
        acercade.addActionListener(eventos);
        acercade.setActionCommand(Eventos.ACERCA_DE);
        menu.add(acercade);
        
        add(menu);
    
    }

    /**
     * @return the menu
     */
    public JMenu getMenu() {
        return menu;
    }

    /**
     * @param menu the menu to set
     */
    public void setMenu(JMenu menu) {
        this.menu = menu;
    }

    /**
     * @return the acercade
     */
    public JMenuItem getAcercade() {
        return acercade;
    }

    /**
     * @param acercade the acercade to set
     */
    public void setAcercade(JMenuItem acercade) {
        this.acercade = acercade;
    }
    
    
    
 
    
    
    
}
