public class Vector3d extends AbstractVector {
    public double x, y, z;

    public Vector3d(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX(){return x;}

    public double getY(){return y;}

    public  double getZ(){return z;}

    public double[] Plus(double x2, double y2, double z2){
        double[] ResultVector = {x + x2, y + y2, z + z2};
        return ResultVector;
    }

    public double[] Minus(double x2, double y2, double z2){
        double[] ResultVector = {x - x2, y - y2, z - z2};
        return ResultVector;
    }

    public double[] CrossProduct(double x2, double y2, double z2){
        double[] ResultVector = {y * z2 - z * y2,  z * x2 - x * z2, x * y2 - y * x2};
        return ResultVector;
    }

    public double DotProduct(double x2, double y2, double z2){
        return x * x2 + y * y2 + z * z2;
    }
}
