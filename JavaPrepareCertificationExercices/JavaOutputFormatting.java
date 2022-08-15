package JavaPrepareCertificationExercices;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-output-formatting/problem?isFullScreen=true

public class JavaOutputFormatting
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x1=sc.nextInt();
            sc.close();
            
            int spaceCount = 15-s1.length();
            String space = " ";
            String space2 = "";
            
            for(int y = 0; y < spaceCount; y++)
            {
                space2 = space2 + space;
            }
                        
            System.out.printf("%s%s%03d%n",s1, space2, x1);
            
        }
        System.out.println("================================");

	}

}
