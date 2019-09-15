import java.util.*;


public class PerfectNumber {
	
	public static int met1(int Number ) {
	  int Sum = 0;
		for(int i = 1 ; i < Number ; i++) {
			if(Number % i == 0)  {
				Sum = Sum + i;
			}	
		}
		 System.out.println("Summa ir " + Sum);
		return Sum;
	}
		public static int met2(int Sum,int Number) {
			if (Sum == Number) {
				System.out.println(Number + " is a Perfect Number");
			}
			else if (Sum < Number) {
				System.out.println(Number +" is deficient Number");
			}
			else if (Sum > Number) {
				System.out.println(Number +" is abundant Number");
			}
			  return 0;
		}
				

    public static void main(String[] args) {
        System.out.println("Kirils Petrovs 2.g 171rdb098");
        System.out.print("Enter A Number: ");
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt(); 

        met2(met1(Number),Number);
        
     
	}

 
}

