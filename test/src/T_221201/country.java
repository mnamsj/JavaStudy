package T_221201;

import java.util.Scanner;
public class country {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp;
        do {
            System.out.println("1. Korea");
            System.out.println("2. USA");
            System.out.println("3. Japan");
            System.out.println("4. China");
            System.out.print("number? ");
            inp = sc.nextInt();
             
            String str = "none";
            switch(inp) {
            case 1:
                str = "Seoul";
                break;
            case 2:
                str = "Washington";
                break;
            case 3:
                str = "Tokyo";
                break;
            case 4:
                str = "Beijing";
                break;
            }
            System.out.println();
            System.out.println(str);
            System.out.println();
        } while (1 <= inp && inp <= 4);
        sc.close();
    }
}

