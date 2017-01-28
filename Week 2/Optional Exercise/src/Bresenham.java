/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 23031816
 */
public class Bresenham {
    
    public static void main(String[] args) {
        StdDraw.setCanvasSize(512, 512);
        StdDraw.setScale(0, 512);
        StdDraw.setPenRadius(0);
        
        BresenhamLineDraw(10, 10, 40, 30);
        BresenhamLineDraw(10, 10, 40, 90);
    }
    
    public static void BresenhamLineDraw(double x1, double y1, double x2, double y2) {
        double ty = y2 - y1;
        double tx = x2 - x1;
        double x = x1;
        double y = y1;
        double d = 2 * ty - tx;
        double te = 2 * ty;
        double tne = 2 * (ty - tx);
        StdDraw.point(x, y);
        x = x + 1;
        
        while (x < x2) {
            if(d < 0) {
                d = d + te;
            } else {
                d = d + tne;
                y = y + 1;
            }
                StdDraw.point(x,y);
                x = x + 1;
        }
    }
}
