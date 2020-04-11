public abstract class AbstractVector {

    public abstract double getX();

    public abstract double getY();

    public abstract double getZ();

    public abstract double[] Plus(double x, double y, double z);

    public abstract double[] Minus(double x, double y, double z);

    public abstract double[] CrossProduct(double x, double y, double z);

    public abstract double DotProduct(double x, double y, double z);
    }
