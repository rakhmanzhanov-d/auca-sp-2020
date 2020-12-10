public class Problem10 {
    public static void main(String[] args) {
        for(float i = 1; i <= 20; i++){
            m(i);
        }
    }
    static void m(float i){
        float res = 0;
        for(float t = 1; t <= i; t++){
            res += t / (t + 1);
        }
        System.out.printf("%.0f          %.4f\n", i, res);
    };
}
