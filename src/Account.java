public class Account {
    double balance;
    int id;
    String owner;

    public Account(){}

    public void setBalance(int balance){
        this.balance=balance;
    }
    double getBalance(){
        return balance;
    }

    public void setId (int id){
        this.id=id;
    }
    int getId (){
        return id;
    }

    public void setOwner(String owner){
        this.owner=owner;
    }
    String getOwner(){
        return owner;
    }



}
