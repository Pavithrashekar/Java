public class Accountt {

    int num;
    String name;
    double amount;
    double wthdrw;
    double dpst;
    static float intst=0.2f;

    public Accountt(int num,String name,double amount,double wthdrw,double dpst) 
    {
        this.num=num;
        this.name=name;
        this.amount=amount;
        this.wthdrw=wthdrw;
        this.dpst=dpst;
        //this.intst=intst;
        this.withdraw();
        this.deposit();
        this.intrest();
    }

    public void withdraw() {

        System.out.println("Balance is:"+(amount-wthdrw));

    }

    public void deposit() {

        System.out.println("Balance is:"+(amount+dpst));

    }

    public void intrest() {

        System.out.println("Final is:"+((float)(amount*intst)));
    }
    
}
