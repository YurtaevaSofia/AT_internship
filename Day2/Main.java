public class Main {

    public static void main(String[] args) {

        AbstractVector Vector2d_new1 = new Vector2d(1,1);
        
        AbstractVector Vector2d_new2 = new Vector2d(2,2);

        AbstractVector Vector3d_new1 = new Vector3d(1,1,1);
        
        AbstractVector Vector3d_new2 = new Vector3d(2,2,2);

        System.out.println("Сумма векторов");
        System.out.println("      2D");
        System.out.println(Vector2d_new1.Plus(Vector2d_new2.getX(), Vector2d_new2.getY(), Vector2d_new2.getZ()));
        System.out.println("      3D");
        System.out.println(Vector3d_new1.Plus(Vector3d_new2.getX(), Vector3d_new2.getY(), Vector3d_new2.getZ()));

        System.out.println("Разность векторов");
        System.out.println("      2D");
        System.out.println(Vector2d_new1.Minus(Vector2d_new2.getX(), Vector2d_new2.getY(), Vector2d_new2.getZ()));
        System.out.println("      3D");
        System.out.println(Vector3d_new1.Minus(Vector3d_new2.getX(), Vector3d_new2.getY(), Vector3d_new2.getZ()));


        System.out.println("Векторное произведение");
        System.out.println("      2D");
        System.out.println(Vector2d_new1.CrossProduct(Vector2d_new2.getX(), Vector2d_new2.getY(), Vector2d_new2.getZ()));
        System.out.println("      3D");
        System.out.println(Vector3d_new1.CrossProduct(Vector3d_new2.getX(), Vector3d_new2.getY(), Vector3d_new2.getZ()));

        System.out.println("Скалярное произведение");
        System.out.println("      2D");
        System.out.println(Vector2d_new1.DotProduct(Vector2d_new2.getX(),Vector2d_new2.getY(),Vector2d_new2.getZ()));
        System.out.println("      3D");
        System.out.println(Vector3d_new1.DotProduct(Vector3d_new2.getX(), Vector3d_new2.getY(), Vector3d_new2.getZ()));

    }

}