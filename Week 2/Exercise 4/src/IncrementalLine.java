/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 23031816
 */
public class IncrementalLine {
    
    public static void main(String[] args){
        StdDraw.setCanvasSize(512, 512);
        StdDraw.setScale(0, 512);
        StdDraw.setPenRadius(0);
        
        LineDraw(10, 10, 40, 30);
        LineDraw(10, 10, 40, 90);
    }
    
    public static void LineDraw(double x1, double y1, double x2, double y2) {
        double tY = y2 - y1;
        double tX = x2 - x1;
        double m = tY / tX;
        double c = y1 - (m * x1);
        
        for (double x = x1; x <= x2; x++) {
            double y = (m * x) + c;
            StdDraw.point(x, Math.round(y));
        }
    }
}
