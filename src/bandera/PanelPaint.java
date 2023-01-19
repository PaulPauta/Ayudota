/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bandera;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

/**
 *
 * @author Juano
 */

public class PanelPaint extends JPanel implements MouseListener {

    private int x1 = 0;
    private int y1 = 0;
    private int x2 = 0;
    private int y2 = 0;
    private int G1 = 0;
    private int d1=0;
    private int d2=0;
    private Color colorLinea = Color.BLACK;

    public PanelPaint() {
        this.addMouseListener(this);
    }
    public void numfigura(String e){
        if(e.equalsIgnoreCase("Cuadrado")){
            this.G1=0;
        }
        if(e.equalsIgnoreCase("Circulo")){
            this.G1=1;
        }
        if(e.equalsIgnoreCase("Triangulo")){
            this.G1=2;
        }
    }
    public void dimensiones(String e1, String e2){
        this.d1=Integer.valueOf(e1).intValue();
        this.d2=Integer.valueOf(e2).intValue();
    }
        

    @Override
    public void paint(Graphics g) {
        //g.drawOval(280,20,40,40);
        /*g.drawOval(280, 20, 40, 40);
        g.drawLine(200, 100, 400, 110);
        g.setColor(Color.red);
        g.drawLine(300, 60, 300, 300);*/
        super.repaint();
        if(G1==0){
            g.setColor(this.getColorLinea());
            g.drawRect(this.x1, this.y1, this.d1, this.d2);
        
        }
        if(G1==1){
        g.setColor(this.colorLinea);
            g.drawOval(this.x1, this.y1, this.d1, this.d2);
            g.setColor(this.colorLinea);
        
        }
        if(G1==2){
        g.setColor(this.colorLinea);

            g.setColor(this.colorLinea);

            g.drawLine(this.x1, this.y1 - this.d1, this.x1 + this.d1, this.y1 + this.d2);
            g.drawLine(this.x1 - this.d1, this.y1 + this.d2, this.x1, this.y1 - this.d2);
            g.drawLine(this.x1 - this.d1, this.y1 + this.d2, this.x1 + this.d1, this.y1 + this.d2);
            g.setColor(this.colorLinea);
        
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //   JOptionPane.showMessageDialog(this, e.getPoint());

        this.x1 = e.getX() ;
        this.y1 = e.getY() ;
        //G1 = this.x2;
        //G2 = this.y2;  
        super.repaint();
        //this.x1 = e.getX() ;
        //this.y1 = e.getY()  ;
     }
    
    /*public void mouseReleased1(MouseEvent e) {
        
        this.x1 = e.getX();
        this.y1 = e.getY();
        
    }*/
    
    

    @Override
    public void mouseEntered(MouseEvent e) {
    }



    @Override
    public void mouseExited(MouseEvent e) {
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }
    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
    public int getG1() {
        return G1;
    }

    public void setG1(int G1) {
        this.G1 = G1;
    }

    public Color getColorLinea() {
        return colorLinea;
    }

    public void setColorLinea(Color colorLinea) {
        this.colorLinea = colorLinea;
        
}




}
