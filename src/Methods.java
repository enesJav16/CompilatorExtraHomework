public class Methods {
    Account [] accs;

    public void checkBalance(Account []a ,int b){
        for (int i = 0; i < a.length; i++) {
            if (a[i].id==b){
                System.out.println("Balance of account ID #"+a[i].id+" is: "+ a[i].balance+"$");
            }
        }
    }
    public void deposit (Account [] a,int b,int c){
        for (int i = 0; i < a.length; i++) {
            if (a[i].id==b){
                a[i].balance += c;
                System.out.println("Balance of account ID #"+a[i].id+" is: "+ a[i].balance+"$");
            }
        }
    }
    public void withdrawal(Account [] a,int b,int c){
        for (int i = 0; i < a.length; i++) {
            if (a[i].id==b){
                a[i].balance -= c;
                System.out.println("Balance of account ID #"+a[i].id+" is: "+ a[i].balance+"$");
            }
        }
    }
    public void transaction(Account [] a, int b,int c,int d){
        for (int i = 0; i < a.length; i++) {
            if (a[i].id==b){
                a[i].balance-=d;
                a[c-1].balance+=d;
                System.out.println("Balance of account ID #"+a[i].id+" is: "+ a[i].balance+"$");
                System.out.println("Balance of account ID #"+a[c-1].id+" is: "+ a[c-1].balance+"$");
            }
        }
    }

}
