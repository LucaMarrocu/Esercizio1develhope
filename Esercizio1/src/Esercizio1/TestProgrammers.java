package Esercizio1;

public class TestProgrammers {
    public static void main(String[] args) {
        Programmer prog1= new Programmer();
        Programmer prog2= new Programmer();

        prog1.name = " Luca ";
        prog1.age =  23;
        prog1.wearsGlasses = false;

        prog2.name = " Jacopo ";
        prog2.age = 25;
        prog2.wearsGlasses= true;

        prog1.drinkCoffe();
        prog1.printsDatails();

        System.out.println("------------------");

        prog2.printsDatails();
        prog2.hasGlasses();


    }
}
