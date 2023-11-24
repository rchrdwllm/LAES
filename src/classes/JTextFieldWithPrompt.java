/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.BorderFactory;
import javax.swing.JTextField;

/**
 *
 * @author john michael
 */
public class JTextFieldWithPrompt extends JTextField {
    final String prompt;
    
    public JTextFieldWithPrompt(String prompt) {
        this.prompt = prompt;
        
        setBorder(BorderFactory.createCompoundBorder(getBorder(), 
        BorderFactory.createEmptyBorder(0, 16, 0, 16)));
    }

    @Override
    protected void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);

        if (getText().isEmpty()) {
            Graphics2D g2 = (Graphics2D) g.create();
            
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(new Color(129,129,129));
            g2.setBackground(Color.gray);
            g2.setFont(getFont());
//            g2.setFont(getFont().deriveFont(Font.ITALIC));

            
            System.out.println(getHeight());
            //figure out x, y from font's FontMetrics and size of component.
            
            int horizontalOffset = 4 + getInsets().left; // 4 is the left offset.
            int verticalOffset = getInsets().top + g.getFontMetrics().getMaxAscent() + (getHeight() / 2) - (getFont().getSize() / 2) - 2;
            g2.drawString(prompt,horizontalOffset, verticalOffset);
            g2.dispose();
        }
    }
}
