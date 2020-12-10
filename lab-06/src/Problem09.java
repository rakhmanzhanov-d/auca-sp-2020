public class Problem09 {
    public static void main(String[] args) {
        System.out.println("i            m(i)");
        System.out.println("_________________");
        for(float i = 1; i <= 901; i += 100){
            m(i);
        }
    }
    static void m(float i){
        float res = 0;
        float sum = 0;
        float sign = 1;

        for(float t = 1; t <= i; t++){
            sum += sign / (2 * t - 1);
            sign = -sign;
        }
        res = 4 * sum;
        System.out.printf("%.0f          %.4f\n", i, res);
    }
}
