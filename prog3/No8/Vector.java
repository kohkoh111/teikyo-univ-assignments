//プログラミング3 ８回演習3
public abstract class Vector{
    //フィールド
    private int dimension;//ベクトルの次元を格納する
    private double[] elements;//ベクトルの各要素を格納する、長さはdimension
    //コンストラクタ
    public Vector(){
        this.dimension = 2;
        setDimension(dimension);
    }
    public Vector(int dimension){
        // 引数dimensionでフィールドdimensionを初期化し，
        // フィールドelementsを長さdimensionの配列として初期化する
        this.dimension = dimension;
        setDimension(dimension);
    }    
    //メソッド
    public int getDimension(){
        return this.dimension;
    }
    public void setDimension(int dimension){
        // フィールドdimension をセットし，
        // フィールドelementsを長さdimensionで初期化するセッタ
        this.dimension = dimension;
        this.elements = new double[dimension];
    }
    public double getElement(int i){
        return elements[i];
    }
    public void setElement(int i, double e){
        // フィールドelementsのi番目の要素を引数eでセットするセッタ
        this.elements[i] = e;
    }
    @Override
    public String toString(){
        // ベクトルの文字列表現(x1, x2, ..., xn)を返すメソッド
    //    return "(" + this.getElement(0) + ", " + this.getElement(1) + ")";
    String s = "";
    for(int i = 0; i < elements.length; i++){//n次元ベクトルに対応
        if(i == 0){
            s  += elements[i];
        }else{
        s += ", " + elements[i];
        }
    }
    return "(" + s + ")";//n次元ベクトルの文字列表記で返す
}
    abstract double innerProduct(Vector v);
    // thisとvの内積を返す抽象メソッド
    abstract Vector scalarMultiplication(double scalar);
    // thisをscalar倍して得られるベクトルscalar*thisを返す抽象メソッド
    abstract Vector addVector(Vector v);
    // thisとvとの加算により得られるベクトルthis+vを返す抽象メソッド
}