package designpatterns.adapter;

public class App {

    public static void main(String[] args) {


        System.out.println();
        Phonepe phonepe = new Phonepe(new IciciBankAdapter());
        phonepe.performBankOperation();
        System.out.println();
        System.out.println("Aswin");
    }
}
