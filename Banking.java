import java.util.Scanner;
public class Banking {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float n1 = 10000;
        float n3 = 0;
        char rp;
        
        do{
        System.out.println("Banking");
        System.out.println("Choose your operator");
        System.out.println("1.Deposit\n2.Withdraw\n3.Checkbalance\n4.Loan offers\n5.Exit");
        int choice = sc.nextInt();

        

        //float n1 = (float) Math.floor(Math.random()*5);
        
        
        

        switch(choice){
            case 1:
                
                System.out.println("Enter the Amount you want to deposit");
                float deposit = sc.nextFloat();
                n3=n1+deposit;
                
                System.out.println("Your current balance is: "+n3);
                break;

            case 2:
                
                System.out.println("Enter the Amount you want to withdraw");
                float with = sc.nextFloat();
                if (n1>=with){
                n3=n1-with;
                System.out.println("Your current balance is: "+n3);
                
                }
                else{
                    System.out.println("Insufficient bank balance");
                }
                break;
            case 3:
                System.out.println("Your balance is : "+ n1);


            case 4:
                System.out.println("we are providing all types of loans with less interest");

                break;
        }
            System.out.println("Do you need to continue if yes press Y");
            rp=sc.next().charAt(0);
         }while(rp=='Y');

    }     
            
}    
        
