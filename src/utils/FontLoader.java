/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;

/**
 *
 * @author rwill
 */
public class FontLoader {
    Font regular;
    Font bold;
    
    private void registerFont(Font font) {
        GraphicsEnvironment.getLocalGraphicsEnvironment().registerFont(font);
    }
    
    public Font interRegular(float size) {
        try {
            regular = Font.createFont(Font.TRUETYPE_FONT, FontLoader.class.getResourceAsStream("../fonts/Inter/Inter-Regular.ttf")).deriveFont(size);
        
            registerFont(regular);
        } catch (IOException | FontFormatException e) {
            System.out.println(e);
        }
        
        return regular;
    }
    
    public Font interBold(float size) {
        try {
            regular = Font.createFont(Font.TRUETYPE_FONT, FontLoader.class.getResourceAsStream("../fonts/Inter/Inter-Bold.ttf")).deriveFont(size);
        
            registerFont(regular);
        } catch (IOException | FontFormatException e) {
            System.out.println(e);
        }
        
        return bold;
    }
    
    public Font puritanRegular(float size) {
        try {
            regular = Font.createFont(Font.TRUETYPE_FONT, FontLoader.class.getResourceAsStream("../fonts/Puritan/Puritan-Regular.ttf")).deriveFont(size);
        
            registerFont(regular);
        } catch (IOException | FontFormatException e) {
            System.out.println(e);
        }
        
        return regular;
    }
    
    public Font puritanBold(float size) {
        try {
            regular = Font.createFont(Font.TRUETYPE_FONT, FontLoader.class.getResourceAsStream("../fonts/Puritan/Puritan-Bold.ttf")).deriveFont(size);
        
            registerFont(regular);
        } catch (IOException | FontFormatException e) {
            System.out.println(e);
        }
        
        return regular;
    }
}
