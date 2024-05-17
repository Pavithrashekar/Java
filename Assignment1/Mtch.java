public class Mtch {

    public static void main(String[] args) {

        Play pl=new Play("Virat",35,11000);
        Play pl1=new Play("Dhoni",42,12000);
        Play pl2=new Play("sdf",23,3000);
        Play pl3=new Play("qwe",30,2500);
        Play pl4=new Play("cvb",27,4000);
        Play.country="India";
        pl.display();
        pl1.display();
        pl2.display();
        pl3.display();
        pl4.display();
    }
    
}
