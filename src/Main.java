import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int first;
        int second;
        String operation = null;
        float result;
        int restart = 1;


        Scanner sc = new Scanner(System.in);
        while(restart == 1){
            System.out.println("===Java Calculator===");
            System.out.println("첫 번째 숫자");
            first = sc.nextInt();
            sc.nextLine();
            while(true){
                System.out.println("연산자(+,-,*,/)");
                operation = sc.nextLine();
                if("+".equals(operation) || "-".equals(operation) || "*".equals(operation) || "/".equals(operation)){
                    break;
                }else{
                    System.out.println("잘못된 입력");
                    continue;
                }
            }
            System.out.println("두 번째 숫자");
            second = sc.nextInt();
            result = calculate(first, second, operation);
            System.out.println(result);
            System.out.println("1:계속하기, 2:종료");
            restart = sc.nextInt();
        }

    }

    public static float calculate(int first, int second, String operation){
        float result = 0;
        if("+".equals(operation)){
            result = first + second;
        }else if("-".equals(operation)){
            result = first - second;
        }else if("*".equals(operation)){
            result = first * second;
        }else if("/".equals(operation)){
            result = (float)first/second;
        }
        return result;
    }
}