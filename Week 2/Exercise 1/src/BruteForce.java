/**
 *
 * @author 23031816
 */
public class BruteForce {
    
    public static void main(String args[]){
        StdDraw.setCanvasSize(512, 512);
        StdDraw.setScale(0, 512);
        StdDraw.setPenRadius(0);

        LineDraw(0, 500, 0, 10);
        LineDraw(0, 500, 0.5, 10);
        LineDraw(0, 500, 1, 10);
        LineDraw(0, 500, 2, 10);
        LineDraw(0, 500, 5, 10);
        LineDraw(0, 500, 10, 10);
    }
    
    public static void LineDraw(double x1, double x2, double m, double c) {
        for (double x = x1; x <= x2; x++) {
            double y = (m * x) + c;
            StdDraw.point(x, Math.round(y));
        }
    }
}


// Do this with the canvas thing