public class Play {

    String name;
    int age;
    static String country;
    int ttlruns;

    public Play(String name,int age,int ttlruns) {

        this.name=name;
        this.age=age;
        //this.country=country;
        this.ttlruns=ttlruns;
    }

    public void display() {

        if(ttlruns>5000) {

            System.out.println(name+" "+age+" "+country+" "+ttlruns);

        }
    }
    
}
