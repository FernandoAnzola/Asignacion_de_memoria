/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author FernandoAnzola
 */
   
    public class Eventos implements ActionListener{
        
        private VentanaPrincipal ventana;
        
        public static final String ACERCA_DE="Acerca de";
        public static final String ASIGNAR_MEMORIA="Asignar memoria";

    public Eventos(VentanaPrincipal ventana1) {
    ventana=ventana1;
    
    }
        
        
        
        
        @Override
        public void actionPerformed(ActionEvent e) {
          //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         String evento= e.getActionCommand();
            
         if (evento.equals(ACERCA_DE)){
             JOptionPane.showMessageDialog(null, "Administracion de memoria "+"\n"
                     +"creado por: Fernando Anzola");
         }
         if (evento.equals(ASIGNAR_MEMORIA)){
     
                     int mtotal=0;     
                     int mSO=0;
             try {
              mtotal =Integer.valueOf(ventana.getPanelAsignarMemoria().getJtmemoriatotal().getText());
                  mSO= Integer.valueOf(ventana.getPanelAsignarMemoria().getJtmemoriaSO().getText());
                   if (mtotal>mSO){
                 System.out.println("memoria total: "+mtotal+"\n"+
             "Memoria Sistema operativo: "+mSO);
          
                 }else
                     JOptionPane.showMessageDialog(null, "Lo sentimos no se puede realizar la asignacion"+"\n"+
                         "de memoria que desea , la memoria del sistema operativo excede la disponible");
             
                 } catch (Exception ex) {
                 JOptionPane.showMessageDialog(null, "Lo sentimos no se puede realizar la asignacion"+"\n"+
                         "de memoria que desea por favor verificar los datos");
             }
             
         
             
                
         }
         
        }
        
        
        
        
        
    }
