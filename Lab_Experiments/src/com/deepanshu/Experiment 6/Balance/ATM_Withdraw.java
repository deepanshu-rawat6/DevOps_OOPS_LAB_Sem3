package Balance;

import java.util.Scanner;

import static Balance.Account.Display_Balance;

public class ATM_Withdraw {
    public void info(int bal,int withdraw){
        if(withdraw > bal){
            System.out.println("\nPlease enter a valid amount!");
        }else{
            Display_Balance(bal);
            bal -= withdraw;
            System.out.println("Balance after withdraw");
            Display_Balance(bal);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the balance:");
        int bal = sc.nextInt();
        System.out.println("Enter the withdraw amount:");
        int wtdraw = sc.nextInt();
        ATM_Withdraw obj = new ATM_Withdraw();
        obj.info(bal,wtdraw);
    }
}
