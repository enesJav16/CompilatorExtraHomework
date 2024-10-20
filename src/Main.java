import java.util.Scanner;
import java.util.zip.CheckedOutputStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner1 =new Scanner(System.in);
        Account acc1=new Account();
        Account acc2=new Account();
        Account acc3=new Account();

        acc1.setBalance(10000);acc1.setId(1);
        acc2.setBalance(20000);acc2.setId(2);
        acc3.setBalance(30000);acc3.setId(3);

        Account [] accs={acc1,acc2,acc3};

        Methods methods=new Methods();


        boolean a=true;


        while (a){
            System.out.println("Account 1 ID:1\nAccount 2 ID 2\nAccount 3 ID 3\nFinish code 99");
            System.out.println("Chose account:");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            int accId=scanner1.nextInt();
            if(accId>accs.length || accId<0){
                System.out.println("There is no such account.");
            } else if (accId==99) {
                a=false;
            } else {
                boolean b = true;
                while (b) {
                    System.out.println("Chose what operation you want to do:");
                    System.out.println("____________________________________");
                    System.out.println("Checking Balance                : 1\n" +
                            "Depositing                      : 2\n" +
                            "Withdrawing                     : 3\n" +
                            "Transferring to another account : 4\n" +
                            "Going back to main              : 0\n" +
                            "Finish code                     : 99");
                    int opp = scanner1.nextInt();
                    switch (opp) {
                        case 0:
                            b=false;
                            break;
                        case 1:
                            System.out.println("____________________________________\n");
                            methods.checkBalance(accs, accId);
                            System.out.println("=====================================\n");
                            break;

                        case 2:

                            System.out.println("____________________________________\n");
                            System.out.println("How much do you want to deposit: ");
                            int deposit = scanner1.nextInt();
                            methods.deposit(accs, accId, deposit);
                            System.out.println("=====================================\n");
                            break;

                        case 3:
                            System.out.println("____________________________________\n");
                            System.out.println("How much do you want to withdraw: ");
                            int withdrawal = scanner1.nextInt();
                            methods.withdrawal(accs, accId, withdrawal);
                            System.out.println("=====================================\n");
                            break;

                        case 4:
                            System.out.println("____________________________________\n");
                            System.out.println("To which account you want to transfer: ");
                            int toWhichAcc = scanner1.nextInt();
                            if (toWhichAcc == accId) {
                                System.out.println("You cant transfer to your current account");
                                System.out.println("=====================================\n");
                            } else {
                                System.out.println("How much do you want to transfer:");
                                int transferAmount = scanner1.nextInt();
                                methods.transaction(accs, accId, toWhichAcc, transferAmount);
                                System.out.println("=====================================\n");
                            }
                            break;
                        case 99:
                            a=false;
                            b=false;
                            break;
                        default:
                            System.out.println("There is no such operation.");
                    }
                }
            }
        }
    }
}