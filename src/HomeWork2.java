import java.util.Random;

public class HomeWork2 {


    public static void main(String[] args) {
        System.out.println(myAge(generateRandomeAge(), 35));
        System.out.println(myAge(generateRandomeAge(), 29));
        System.out.println(myAge(generateRandomeAge(), 40));
        System.out.println(myAge(generateRandomeAge(), 16));
        System.out.println(myAge(generateRandomeAge(), 19));

    }

    public static String myAge(int age, int temp) {
        if (age > 20 && age < 45 && temp > -20 && temp < 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temp > 0 && temp < 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temp > -10 && temp < 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }


    }

    public static int generateRandomeAge() {
        Random random = new Random();
        int i = random.nextInt(100) + 1;
        return i;
    }

}
