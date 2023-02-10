/**
 * <h1>Lab0</h1>
 *<h2>CISC 181-080L</h2>
 * <h3>University of Delaware</h3>
 * This Lab is used to get used to creating Lab projects.
 *
 * @author Maanav Rao
 * @since 2023-02-09
 */
public class Lab0 {
    public static double celsius_to_fahrenheit(double cdeg) {  return 32.0 + (cdeg * 1.8);}
    public static void main(String[] args) {
        System.out.println("Hello");
        double LBS_TO_KILO = 0.45359237;
        System.out.println(175 * LBS_TO_KILO);

        int age = 19;
        System.out.println(age);
        age = age + 1;
        System.out.println(age);

        int JOE_AGE = 25;
        if (JOE_AGE < 18) {
            System.out.println("minor");
        }
        else if (JOE_AGE < 65) {
            System.out.println("adult");
        }
        else {
            System.out.println("senior");
        }

        int total = 0;
        for (int i = 0; i < 10; i++) {
            total += i;
        }
        System.out.println(total);

        int guess = 1;
        while (guess % 7 != 0) {
            guess = new java.util.Random().nextInt(100); }
        System.out.println(guess);


    }
}
