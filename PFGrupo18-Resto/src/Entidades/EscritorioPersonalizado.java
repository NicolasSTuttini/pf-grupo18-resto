/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JDesktopPane;

/**
 *
 * @author nstut
 */
public class EscritorioPersonalizado extends JDesktopPane{
    
    private BufferedImage img;

    public EscritorioPersonalizado() {
       try {
           img = ImageIO.read(getClass().getResourceAsStream("/imagenes/fondo.png"));
       } catch (Exception ex) {
           
       }
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, 0, 0, null);
    }
    
    
    
}
