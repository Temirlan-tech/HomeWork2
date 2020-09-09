public class HomeWork2 {


    public static void main(String[] args) {
        System.out.println(myAge(22,35));
        System.out.println(myAge(15,29));
        System.out.println(myAge(67,40));
        System.out.println(myAge(9,16));
        System.out.println(myAge(33,19));

    }

    public static String myAge (int age, int temp){
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
