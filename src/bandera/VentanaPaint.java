/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bandera;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Juano
 */
public class VentanaPaint extends JFrame implements ActionListener {
    
     private PanelPaint panelPaint;
    private JPanel panelPrincipal;
    private JComboBox jComboBox1;
    private JComboBox jComboBox2;
    private JTextField jTextField1;
    private JTextField jTextField2;
   
    public VentanaPaint() {
        this.setSize(1000, 600);
        this.setLocation(100, 100);
        this.setTitle("Paint 1.0");
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("Rojo");
        this.jComboBox1.addItem("Azul");
        this.jComboBox1.addItem("Verde");
        this.jComboBox1.addActionListener(this);
        this.jComboBox2 = new JComboBox();
        this.jComboBox2.addItem("Cuadrado");
        this.jComboBox2.addItem("Circulo");
        this.jComboBox2.addItem("Triangulo");
        this.jComboBox2.addActionListener(this);
        this.jTextField1 = new JTextField();
        this.jTextField1.setText("");
        this.jTextField2 = new JTextField();
        this.jTextField2.setText("");
        this.panelPaint = new PanelPaint();
        this.panelPaint.setBackground(Color.white);
        this.setContentPane(this.panelPaint);
        this.panelPrincipal = new JPanel(new BorderLayout());
        this.panelPrincipal.add(this.panelPaint,BorderLayout.CENTER);
        this.panelPrincipal.add(this.jComboBox1,BorderLayout.WEST);
        this.panelPrincipal.add(this.jComboBox2,BorderLayout.EAST);
        this.panelPrincipal.add(this.jTextField1,BorderLayout.NORTH);
        this.panelPrincipal.add(this.jTextField2,BorderLayout.SOUTH);
        this.setContentPane(this.panelPrincipal);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    

    public static void main(String[] args) {
        new VentanaPaint();
    }

     @Override
    public void actionPerformed(ActionEvent e) {
        var f =this.jComboBox2.getSelectedItem().toString();
        var q =this.jTextField1.getText();
        var t = this.jTextField2.getText();
        
        if(this.jComboBox1.getSelectedIndex()==0){
            this.panelPaint.setColorLinea(Color.red);
        }
        if(this.jComboBox1.getSelectedIndex()==1){
            this.panelPaint.setColorLinea(Color.blue);
        }
        if(this.jComboBox1.getSelectedIndex()==2){
            this.panelPaint.setColorLinea(Color.green);
        }
        
        this.panelPaint.numfigura(f);
        this.panelPaint.dimensiones(q, t);

}
  
        
        
        



            
    
}
