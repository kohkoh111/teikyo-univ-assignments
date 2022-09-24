package prog3.No7;
abstract class Function{
    //関数値f(x)を返す抽象メソッド
    abstract public double f(double x);
    //関数f(x)を微分して得られる関数を返す抽象メソッド
    abstract public Function differentiates();
}

public class Polynomial extends Function{
    private double[] coefficients;  
    private int degree;//最高次数を格納するようのフィールド
    
    //コンストラクタ
    public Polynomial(double[] coefficients) {
        this.coefficients = coefficients;
        degree = degree();
    }

    //最高次数を求める
    public int degree() {
        int d = 0;
        for (int i = 0; i < coefficients.length; i++)
            if (coefficients[i] != 0) d = i;
        return d;
    }

    //多項式f(x)においてxが任意の定数の時の値を求めるメソッド
    public double f(double f) {
        double value = 0;
        for (int n = coefficients.length - 1; n >= 0; n --) {
			value += coefficients[n] * Math.pow(f, n);
		}
		return value;
    }

    // f(x)のdf(x)/dxを求める
    public Polynomial differentiates() {
        double[] ce = new double[coefficients.length - 1];
		for (int n = coefficients.length - 1; n >= 1; n --) {
			ce[n - 1] = coefficients[n] * n;
		}
		return new Polynomial(ce);//微分後の係数を引数としインスタンス作成、戻り値として返す
    }
    

    //toStringメソッドをオーバライドし、式の記載方法を上書き
    @Override
    public String toString() {
        if (degree ==  0) return "" + coefficients[0];
        if (degree ==  1) return coefficients[1] + "x^1 + " + coefficients[0];
        String s = coefficients[degree] + "x^" + degree;
        for (int i = degree-1; i >= 0; i--) {
            if      (coefficients[i] == 0) continue;
            else if (coefficients[i]  > 0) s = s + " + " + ( coefficients[i]);
            else if (coefficients[i]  < 0) s = s + " - " + (-coefficients[i]);
            if      (i == 1) s = s + "x^1";
            else if (i >  1) s = s + "x^" + i;
        }
        return s;
    }

    //メインメソッド
    public static void main(String[] args) { 
        double[] coefficients = {1,2,3};
        Polynomial p   = new Polynomial(coefficients);
        System.out.println("p (x)       = " + p);
        System.out.println("p (2)       = " + p.f(2));
        System.out.println("q (x)       = " + p.differentiates());
        System.out.println("q (2)       = " + p.differentiates().f(2));
   }
}