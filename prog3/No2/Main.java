import java.time.Instant;
import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        System.out.print("n番目");
        System.out.println(" 素数");
        System.out.println("--------------");

        //変数準備
        int min = 2;
        int max = 100000;
        int count = 1;

        //処理時間を計測するための変数群
        Instant now = Instant.now();
        Instant time;

        //countがmax以下である範囲内でループする
        while(count <= max){
            boolean isPrime = true;
            for(int i = 2; i * i <= min; i++){
                if(i != min & min % i == 0){
                    isPrime = false;
                    break;
                }
            }
            //isPrimeがtrue
            if(isPrime){
                time = Instant.now();
                Duration d = Duration.between(now, time);
                System.out.println(count + "\t" + min + "\t" + (float)d.toMillis()/1000 + "ms");
                count++;
            }
            min++;
        }
    }
}