/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 23031816
 */
public class Task3 {
    
    public static void main(String[] args) {
        StdDraw.setCanvasSize(512, 512);
        StdDraw.setScale(0, 512);
        StdDraw.setPenRadius(0);
        
        LineDraw(0, 500, 0, 10);
        LineDraw(0, 500, 0.5, 10);
        LineDraw(0, 500, 1, 10);
    }
    
    public static void LineDraw(double x1, double x2, double m, double c) {
        double y = (m * x1) + c;
        
        for (double x = x1; x <= x2; x++) {
            StdDraw.point(x, Math.round(y));
            y = y + m;
        }
    }
    
}
