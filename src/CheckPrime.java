import java.util.Scanner;
public class CheckPrime {
   
        // TODO: Read n
        // TODO: Check if n is prime
        // Hint:
        // 1. If n <= 1, it is Not Prime.
        // 2. Loop from 2 to sqrt(n). If n is divisible by any number, it is Not Prime.
        // 3. Otherwise, it is Prime.
        // TODO: Print "Prime" or "Not Prime"

	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);

		int n= sc.nextInt();

		int flag=0;

		if(n<=1){

			flag=1;
	
		}
		for(int i=2; i<=Math.sqrt(n); i++){

			if(n%i==0){

				flag=1;
				break;
			}

		}
		if(flag==0){
			System.out.println("Prime");
		}else{
			System.out.println("Not Prime");
		}
	
	}
    
}
