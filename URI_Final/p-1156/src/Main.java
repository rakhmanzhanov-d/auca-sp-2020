public class Main {
    public static void main(String[] args) {
        int n = 39;
        float div = 1;
        float sum = 0;
        for(int i = 1; i <= n; i += 2){
            sum += (i / div);
            div *= 2;
        }
        System.out.printf("%.2f\n", sum);
    }
}
