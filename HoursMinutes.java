import java.util.*;
import java.io.*;
import java.util.Scanner;
public class HoursMinutes
{
	public static void main(String args[]) 
  {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
	  int min = total%60;
		int hour = total/60;
    System.out.println(hour+" "+min);
	}
}
