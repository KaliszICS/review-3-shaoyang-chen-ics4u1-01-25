import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
	}

	public static void q1() {
		//Write question 1 code here
		System.out.print("In: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        System.out.println(ch[0]);

	}

	public static void q2() {
		//Write question 2 code here
		System.out.print("In: ");
        Scanner sc = new Scanner(System.in);
        Boolean bol = sc.nextBoolean();
        System.out.println(!bol);

	}

	public static void q3() {
		//Write question 3 code here
		System.out.print("In: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = n - 5 >= 0;
        System.out.println(flag);
	}

	public static void q4() {
		//Write question 4 code here
		System.out.print("In: ");
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        boolean flag1 = d <= 2;
        boolean flag2 = d >= -2;
        boolean flag3 = flag1 && flag2;
        System.out.println(flag3);
	}

	public static void q5() {
		//Write question 5 code here
		System.out.print("In: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Boolean flag = input.equals("Hello World");
        System.out.println(flag);
	}

	public static void q6() {
		//Write question 6 code here
		System.out.print("In: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.print("In: ");
        int n2 = sc.nextInt();
        boolean flag = n1 <= n2;
        System.out.println(flag);
	}

	public static void q7() {
		//Write question 7 code here
		System.out.print("In: ");
        Scanner sc = new Scanner(System.in);
        double d1 = sc.nextDouble();
        System.out.println("In: ");
        double d2 = sc.nextDouble();
        boolean flag = d1 >= d2;
        System.out.println(flag);

	}

}
