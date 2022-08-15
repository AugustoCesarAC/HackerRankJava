package JavaPrepareCertificationExercices;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-if-else/problem?isFullScreen=true

public class JavaStdinAndStdoutI
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 3; i++)
		{
			int a = scan.nextInt();
			System.out.println(a);
		}
		scan.close();

	}

}
