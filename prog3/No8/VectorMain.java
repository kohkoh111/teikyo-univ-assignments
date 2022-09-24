public class VectorMain{
    public static void main(String[] args){
	double x1 = 1;
	double y1 = 2;
	double x2 = 3;
	double y2 = 4;
	double scalar = 5;
	Vector2D v1 = new Vector2D(x1, y1);
	Vector2D v2 = new Vector2D(x2, y2);
	System.out.println("v1 = " + v1);
	System.out.println("v2 = " + v2);
	System.out.println("scalar*v1 = " + scalar + "*" + v1 + " = " + 
			   v1.scalarMultiplication(scalar));
	System.out.println("v1 * v2 = " + v1 + " * " + v2 + " = " +
			   v1.innerProduct(v2));
	System.out.println("v1 + v2 = " + v1 + " + " + v2 + " = " +
			   v1.addVector(v2));
    }
}