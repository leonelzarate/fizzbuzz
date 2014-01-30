public class Fizzbuzz {
    
    
    public void imprimeFizzbuzz(){
        
        for(int i=1; i<=100; i++){
            if (i%15 == 0){
                System.out.print("FizzBuzz ");
            }else if (i%3 == 0){
               System.out.print("Fizz ");
            }else if (i%5 == 0){
               System.out.print("Buzz "); 
            }
            else {
                System.out.print(i + " ");
            }
        }
        
    }
    
    public static void main(String[] args) {
        
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        fizzbuzz.imprimeFizzbuzz();
    }
}
