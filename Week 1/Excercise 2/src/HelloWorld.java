/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 23031816
 */
public class HelloWorld {
    public static void main(String[] args) {
        
        // This class will display 'Hello World' as a graphic
        
        // This sets the pen colour to green
        StdDraw.setPenColor(StdDraw.GREEN);
        
        // This is the code to draw out the graphic
        
        // H
        StdDraw.line(0.1, 0.5, 0.1, 0.8);
        StdDraw.line(0.1, 0.65, 0.2, 0.65);
        StdDraw.line(0.2, 0.5, 0.2, 0.8);
        
        // e
        StdDraw.line(0.25, 0.55, 0.35, 0.55);
        StdDraw.arc(0.3, 0.55, 0.05, 0, 180);
        StdDraw.arc(0.3, 0.55, 0.05, 180, -30);
        
        // l
        StdDraw.line(0.4, 0.55, 0.4, 0.8);
        StdDraw.arc(0.45, 0.55, 0.05, 180, -30);
        
        // l
        StdDraw.line(0.56, 0.55, 0.56, 0.8);
        StdDraw.arc(0.61, 0.55, 0.05, 180, -30);
        
        // o
        StdDraw.circle(0.75, 0.55, 0.05);
        
        // W
        StdDraw.line(0.1, 0.2, 0.1, 0.4);
        StdDraw.arc(0.15, 0.2, 0.05, 180, 0);
        StdDraw.line(0.2, 0.2, 0.2, 0.4);
        StdDraw.arc(0.25, 0.2, 0.05, 180, 0);
        StdDraw.line(0.3, 0.2, 0.3, 0.4);
        
        // o
        StdDraw.circle(0.4, 0.2, 0.05);
        
        // r
        StdDraw.line(0.5, 0.15, 0.5, 0.35);
        StdDraw.arc(0.55, 0.35, 0.05, 30, 180);
        
        // l
        StdDraw.line(0.65, 0.2, 0.65, 0.4);
        StdDraw.arc(0.7, 0.2, 0.05, 180, -30);
        
        // d
        StdDraw.circle(0.85, 0.2, 0.05);
        StdDraw.line(0.9, 0.2, 0.9, 0.4);
        StdDraw.arc(0.95, 0.2, 0.05, 180, -120);
    }
}
