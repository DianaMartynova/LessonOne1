import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Easy
        System.out.println("EASY!Введите первое число:");
        int a = scanner.nextInt();
        System.out.println("EASY!Введите второе число:");
        int b = scanner.nextInt();
        Easy easy = new Easy();
        System.out.println(easy.sum(a,b));

        //Medium
        System.out.println("MEDIUM!Введите первое число ");
        int num = scanner.nextInt();
        System.out.println("MEDIUM!Введите второе число ");
        int num2 = scanner.nextInt();
        System.out.println("MEDIUM!Введите третье число ");
        int num3 = scanner.nextInt();
        Medium medium = new Medium();
        System.out.println(medium.primer(num,num2,num3));


        System.out.println("MEDIUM!Введите первое число:");
        int number = scanner.nextInt();
        System.out.println("MEDIUM!Введите второе число больше 0:");
        int number2 = scanner.nextInt();
        System.out.println(medium.sub(number, number2));


        System.out.println("MEDIUM!Введите первое дробное число:");
        double number3 = scanner.nextDouble();
        System.out.println("MEDIUM!Введите второе дробное число:");
        double number4 = scanner.nextDouble();
        System.out.println(medium.summa(number3, number4));

        //Hard

        System.out.println("HARD!Введите верхнюю границу случайного числа");
        int maxNumber = scanner.nextInt();
        Hard hard = new Hard();
        System.out.println(hard.generate(maxNumber));


    }
}
