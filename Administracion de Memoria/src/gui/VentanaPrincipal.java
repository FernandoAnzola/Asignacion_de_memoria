/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author FernandoAnzola
 */
public class VentanaPrincipal extends JFrame {

    private Menu menu;
    private PanelAsignarMemoria panelAsignarMemoria;
    private Eventos eventos;
    private PanelAsignacionProcesos procesos;
    private PanelPaintMemoria pain;
    private PanelLog log;
    public VentanaPrincipal() {
        setSize(700,700);
        setLayout(null);
        setTitle("Administracion de memoria");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        eventos= new Eventos(this);

        menu = new Menu(getEventos());
        menu.setBounds(0, 0, 150, 20);
        
        panelAsignarMemoria= new PanelAsignarMemoria(getEventos());
        panelAsignarMemoria.setLocation(20, 20);
        
        procesos=  new PanelAsignacionProcesos(eventos);
        procesos.setLocation(20, 170);
        pain= new PanelPaintMemoria();
        pain.setLocation(470, 20);
        
        log= new PanelLog();
        log.setSize(450, 180);
        log.setLocation(20, 470);
  
        
        add(menu);
        add(panelAsignarMemoria);
        add(procesos);
        add(pain);
        add(log);
    }

    /**
     * @return the menu
     */
    public Menu getMenu() {
        return menu;
    }

    /**
     * @param menu the menu to set
     */
    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    /**
     * @return the panelAsignarMemoria
     */
    public PanelAsignarMemoria getPanelAsignarMemoria() {
        return panelAsignarMemoria;
    }

    /**
     * @param panelAsignarMemoria the panelAsignarMemoria to set
     */
    public void setPanelAsignarMemoria(PanelAsignarMemoria panelAsignarMemoria) {
        this.panelAsignarMemoria = panelAsignarMemoria;
    }

    /**
     * @return the eventos
     */
    public Eventos getEventos() {
        return eventos;
    }

    /**
     * @param eventos the eventos to set
     */
    public void setEventos(Eventos eventos) {
        this.eventos = eventos;
    }
}
