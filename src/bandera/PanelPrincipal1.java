/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bandera;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

/**
 *
 * @author Paul
 */
public class PanelPrincipal1 extends JPanel implements MouseListener{
    
    private Color color1;
    private Color color2;
    private Color color3;
    private Point punto=new Point(-100,-100);

    public PanelPrincipal1(Color color1, Color color2, Color color3) {
        this.color1 = color1;
        this.color2 = color2;
        this.color3 = color3;
        this.addMouseListener(this);
    }
    
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);     
        g.drawOval(WIDTH, WIDTH, WIDTH, HEIGHT);
        g.getClipRect();
  
    }
    

    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }

    public Color getColor3() {
        return color3;
    }

    public void setColor3(Color color3) {
        this.color3 = color3;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
       System.out.println(e.toString());
    }

    @Override
    public void mousePressed(MouseEvent e) {
         System.out.println(e.toString());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println(e.getX());
        System.out.println(e.getY());
        System.out.println(e.getPoint());
        System.out.println(e.getButton());
        this.punto=e.getPoint();
        this.repaint();
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println(e.toString());
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println(e.toString());
    }
    
}
