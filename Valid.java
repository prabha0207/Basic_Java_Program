import java.util.Scanner;
public class Valid
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char[] a=s.toCharArray();
		int i;
		for(i=0;i<a.length;i++){
		
		
			if(a[i]>='0' && a[i]<='9'){
				System.out.println("yes");
			}
			else{
				System.out.println("no");
			}
			break;
		}
	}

}
