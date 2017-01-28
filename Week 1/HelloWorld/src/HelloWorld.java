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
        System.out.println("Welcome to the Computer Graphics and Modelling Module!");
        
        // The display window is scaled to min = 0 and max = 1
        // Draw a square
        StdDraw.square(0.2, 0.3, 0.05); // Centre x = 0.2 any y = 0.2, and half length = 0.1 of the square
        
        // Graphics 2D text
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.text(0.5, 0.8, "Welcome to Computer Graphics and Modelling Module!");
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.text(0.5, 0.5, "Our first Graphics 2D Program");
        
        StdDraw.setPenColor(StdDraw.MAGENTA);
        // Pretty shapes
        StdDraw.square(0.2, 0.15, 0.05);
        
        // Rectangle
        StdDraw.rectangle(0.4, 0.15, 0.08, 0.05);
        
        // ELlipse
        StdDraw.ellipse(0.6, 0.15, 0.1, 0.05);
        
        // Circle
        StdDraw.circle(0.8, 0.15, 0.05);
        
        // Arc
        StdDraw.arc(0.93, 0.15, 0.05, 0, 180);
        
    }
}
