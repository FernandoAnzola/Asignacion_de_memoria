/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

/**
 *
 * @author FernandoAnzola
 */
public class PanelLog extends JPanel{

    private JTextArea log;
    private JScrollPane jScrollPane;
    public PanelLog() {
        setBorder(new TitledBorder("Log"));
        setLayout(null);
         log= new JTextArea();
         log.setEditable(false);
        jScrollPane= new JScrollPane(getLog());
         jScrollPane.setBounds(10, 15, 430, 150);  
    add(jScrollPane);
        
    }

    /**
     * @return the log
     */
    public JTextArea getLog() {
        return log;
    }

    /**
     * @param log the log to set
     */
    public void setLog(JTextArea log) {
        this.log = log;
    }
    
    
    
    
}
