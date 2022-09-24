//Vectorクラスを継承し，2次元ベクトルを表すクラス
public class Vector2D extends Vector{
    //コンストラクタ
    //スーパークラスのコンストラクタによりdimensionを2で初期化する
    public Vector2D(){
        super();//親クラス
    }

    //コンストラクタ，スーパークラスのコンストラクタにより
    //dimensionを2で初期化し，続けて
    //フィールドelementsの0番目の要素をxで
    //フィールドelementsの1番目の要素をyで初期化する
    public Vector2D(double x, double y){
        super();
        super.setElement(0, x);
        super.setElement(1, y);
    }
    
    //abstract double innerProduct(Vector v)を実装
    //thisの0番目の要素とvの0番目の要素の積と
    //thisの1番目の要素とvの1番目の要素の積
    //の和によりthisとvの内積を求めるメソッド
    public double innerProduct(Vector v){
        return this.getElement(0) * v.getElement(0) 
        + this.getElement(1) * v.getElement(1);
    }

    //abstract double scalarMultiplication(double scalar)を実装 
    //thisの各要素にscalarを掛けた値を要素とする
    //vector，scalar * thisを返すメソッド
    Vector scalarMultiplication(double scalar){
    double x = scalar * this.getElement(0);
    double y = scalar * this.getElement(1);
	return new Vector2D(x,y);
    }
    
    //abstract double addVector(Vector v)を実装
    //thisと引数vの加算により得られるvectorを返すメソッド
    //Vector addVector(Vector v);
    Vector addVector(Vector v){
        double x = v.getElement(0) + this.getElement(0);
        double y = v.getElement(1) + this.getElement(1);
	return new Vector2D(x, y);
    }
}
