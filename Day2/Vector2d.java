public class Vector2d extends AbstractVector {

    public double x, y;

    public Vector2d(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){return x;}

    public double getY(){return y;}

    public  double getZ(){return 0;}

    public double[] Plus(double x2, double y2, double z2){
        double[] ResultVector = {x + x2, y + y2};
        return ResultVector;
    }

    public double[] Minus(double x2, double y2, double z2){
        double[] ResultVector = {x - x2, y - y2};
        return ResultVector;
    }

    public double DotProduct(double x2, double y2, double z2){
        return x * x2 + y * y2;
    }

    public double[] CrossProduct(double x2, double y2, double z2){

        double[] ResultVector = {y * z2 - 0 * y2,  0 * x2 - x * z2, x * y2 - y * x2};
        return ResultVector;
    }


}