package backjon;

import java.util.Scanner;

public class test2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && b == c) { // 다 같을 때
            System.out.println(10000+a*1000);
        } else if (a == b || a == c || b == c) { //두개만 같을 때 ab 같,ac 같,bc랑 같을 수 있다
            if(a == b)
            System.out.println(1000 + a * 100);
            else if (a == c) {
                System.out.println(1000 + c * 100);
            } else {
                System.out.println(1000 + b * 100);
            }
        } else{
            if(a>b && a>c){
                System.out.println(a*100);
            }else if(b>a && b>c){
                System.out.println(b*100);
            }else {
                System.out.println(c*100);
            }
        }

        }
    }

