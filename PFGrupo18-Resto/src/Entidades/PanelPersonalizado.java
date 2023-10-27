/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author nstut
 */
public class PanelPersonalizado extends JPanel{
    private Image imagen;
   
    public PanelPersonalizado(String ruta) {
        try {
           imagen = ImageIO.read(getClass().getResourceAsStream(ruta));
       } catch (Exception ex) {
       }
    }
    
   
    
    @Override
    public void paint(Graphics g) {
        g.drawImage(imagen,0,0,getWidth(),getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }
}
