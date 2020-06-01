import java.util.Scanner;
public class afishim_me_printf {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a;
		System.out.println("Jep nje numer nga 1-1000");
		a=input.nextInt();
		System.out.printf("%05d %n",a);

	}

}
