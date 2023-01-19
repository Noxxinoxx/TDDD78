package noxtddd78;

public class main6 {
	
	public static void main(String[] args) {
		System.out.println(isPrime(4));
		isPrime1();
	}
	
	
	
	public static boolean isPrime(int number) {
		for(int i = 2; i < number; i++) {
			int rest = number % i; 
			if(rest == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void isPrime1() {
		
       int i =0;
       int t =0;

       for (i = 1; i <= 100; i++){ 		  	  
          int cou =0; 	  
          for(t = i; t >= 1; t--){
             if(i % t == 0) {
            	 cou = cou + 1;
	     	 }
          }
		  if (cou == 2) {
		     System.out.println(i);
		  }	
       }	
       
	}

	
}
