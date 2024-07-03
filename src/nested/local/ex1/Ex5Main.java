package nested.local.ex1;

import java.util.Random;
import java.util.Scanner;

public class Ex5Main {
    public static void complicatedProgram(Fortune fortune) {
        System.out.println("복잡한 과정 시작");
        System.out.println("복잡한 과정 종료 후, 원하는 기능 실행");

        fortune.run();

        System.out.println("다시 복잡한 과정 시작");
        System.out.println("복잡한 과정 종료 후 프로그램 종료");
    }

    public static void main(String[] args) {
//        complicatedProgram(new Fortune() {
//            @Override
//            public void run() {
//                System.out.println("*** 오늘은 행운의 날입니다. 행복하세요");
//            }
//        });
//
//        complicatedProgram(new Fortune() {
//            @Override
//            public void run() {
//                Random random = new Random();
//                int rand = random.nextInt(100);
//                System.out.println("*** 오늘 행운의 번호는 " + rand + " 입니다");
//            }
//        });
        
        complicatedProgram(new Fortune() {
            @Override
            public void run() {
                Random random = new Random();
                Scanner scanner = new Scanner(System.in);

                System.out.print("오늘의 행운 번호를 입력하세요 : ");
                int input = scanner.nextInt();

                for(int i = 0; i < 3; i++) {
                    int lucky = random.nextInt(100);
                    if (lucky == input) {
                        System.out.println("와우! 완전한 행운의 날입니다. 맞춘 행운의 번호는 " + input + " 입니다");
                        return;
                    }
                }

                System.out.println("입력하신 번호는 불운의 번호이니 오늘은 피하세요 :)");
            }
        });
    }
}
