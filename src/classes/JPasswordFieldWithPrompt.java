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
            g2.setColor(new Color(129,129,129));
            g2.setBackground(Color.gray);
            g2.setFont(getFont());
            
            int horizontalOffset = 4 + getInsets().left; // 4 is the left offset.
            int verticalOffset = getInsets().top + g.getFontMetrics().getMaxAscent() + (getHeight() / 2) - (getFont().getSize() / 2) - 2;
            g2.drawString(prompt,horizontalOffset,verticalOffset);
            g2.dispose();
        }
    }
}
