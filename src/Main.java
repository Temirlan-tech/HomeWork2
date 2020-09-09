


public class Main {
    public static void main(String[] args) {
        myAge(30, 28);
        System.out.println(myAge( 36, 30));
        System.out.println(myAge(20, 28));
        System.out.println(myAge(15, 29));
        System.out.println(myAge(25, 34));
        System.out.println(myAge(38, 48));

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

}
