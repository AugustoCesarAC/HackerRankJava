package JavaPrepareCertificationExercices;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-stdin-stdout/problem?isFullScreen=true

public class JavaStdinStdoutII
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		double d = scan.nextDouble();
		String s = scan.nextLine();
		s = scan.nextLine();
		scan.close();

		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
	}

}
