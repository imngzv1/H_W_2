
public class Main {
    public static void main(String[] args) {
        System.out.println(age(3, 1));
        System.out.println(age(10, 9));
        System.out.println(age(50, 5));
        System.out.println(age(17, 40));
        System.out.println(age(50, 40));

        String ageRandom = age(generateRandomAge(), 0);


        System.out.println(ageRandom);


    }

    static String age(int age, int temperature) {

        if (age >= 20 && age <= 40 && temperature >= -20 && temperature <= 30)
            return "Можно идти гулять";
        else if (age < 20 && temperature > 0 && temperature < 28)
            return "Можно идти гулять";
        else if (age > 45 && temperature > -10 && temperature < 25)
            return "Можно идти гулять";
        else
            return "Оставайся дома";
    }

    public static int generateRandomAge() {


        int a = 1;
        int b = 80;

        int age = a + (int) (Math.random() * b);
        return age;

    }
}