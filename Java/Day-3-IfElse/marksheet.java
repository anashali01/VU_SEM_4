import java.util.Scanner;

public class marksheet {
    public static void main(String arg[]) {
        int rollNo, sub1, sub2, sub3, total;
        float avg;
        String name;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Roll Number : ");
        rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Your Name : ");
        name = sc.nextLine();

        System.out.print("Enter Your Subject 1 Marks : ");
        sub1 = sc.nextInt();

        System.out.print("Enter Your Subject 2 Marks : ");
        sub2 = sc.nextInt();

        System.out.print("Enter Your Subject 3 Marks : ");
        sub3 = sc.nextInt();

        total = sub1 + sub2 + sub3;
        avg = total / 3.0f;

        System.out.println("\n----- MARKSHEET -----");
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Total   : " + total);
        System.out.println("Average : " + avg);

        if (sub1 < 35 || sub2 < 35 || sub3 < 35) {
            System.out.println("Result  : FAIL");
        } else {
            System.out.println("Result  : PASS");

            if (avg >= 75)
                System.out.println("Grade   : Distinction");
            else if (avg >= 60)
                System.out.println("Grade   : First Class");
            else if (avg >= 50)
                System.out.println("Grade   : Second Class");
            else
                System.out.println("Grade   : Pass Class");
        }

    }
}
