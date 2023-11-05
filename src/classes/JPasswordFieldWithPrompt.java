/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPasswordField;

/**
 *
 * @author john michael
 */
public class JPasswordFieldWithPrompt extends JPasswordField {
    final String prompt;
    
    public JPasswordFieldWithPrompt(String prompt) {
        this.prompt = prompt;
    }

    @Override
    protected void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);

        if (getPassword().length <= 0) {
            Graphics2D g2 = (Graphics2D) g.create();
            
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(super.getDisabledTextColor());
            g2.setBackground(Color.gray);
            g2.setFont(getFont());
            
            System.out.println(getHeight());
            //figure out x, y from font's FontMetrics and size of component.
            g2.drawString(prompt, 
                            getInsets().left,
                              g.getFontMetrics().getMaxAscent() + getInsets().top + getHeight() / 2 - getFont().getSize());
            g2.dispose();
        }
    }
}
