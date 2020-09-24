public class Problem10 {
    public static void main(String[] args) {
        double curPeople = 312032486;
        double death = 31536000.0 / 13;
        double birth = 31536000.0 / 7;
        double imigrant = 31536000.0 / 45;

        double afterYear = curPeople - death + birth + imigrant;
        double after2Years = afterYear - death + birth + imigrant;
        double after3Years = after2Years - death + birth + imigrant;
        double after4Years = after3Years - death + birth + imigrant;
        double after5Years = after4Years - death + birth + imigrant;

        System.out.println("People in U.S after 5 years will be = " + after5Years);

    }
}
