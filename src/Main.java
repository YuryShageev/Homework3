public class Main {
    public static void main(String[] args) {
        short pineApples = 32767;
        System.out.println("Ананасов " + pineApples + " кг!");

        float sugar = 3;
        float onePortion = sugar / 4;
        System.out.println("Одна порция сахара весит " + onePortion + " кг!");

        byte b = 1;
        short s = 1;
        int i = 1;
        i = i + b + s;
        System.out.println(i);
    }
}