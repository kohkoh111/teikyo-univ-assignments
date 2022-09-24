package prog3.No5;
public class Euclid {
	
    //再帰関数を使わないver
    public static int euclidean(int a, int b) {
		while (b != 0) {
			int ans = a % b;
			a = b;
			b = ans;
		}
		return a;
	}
    //再帰関数ver
    public static int euclideanRecursive(int a, int b) {
        if(b == 0) return a;
        else return euclideanRecursive(b, a % b);
	}

    //main method
	public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("usage: Java a b");
        }else{        
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
		System.out.println("("+ args[0] + ", " + args[1] + ")="+ euclidean(a, b));//再帰関数を使わないver
        System.out.println("("+ args[0] + ", " + args[1] + ")="+ euclideanRecursive(a, b));//再帰関数ver
        }
    }
}