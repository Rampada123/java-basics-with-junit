package inheritance;

class Human {
    String brain;

    Human() {
        brain = "Installed";
        System.out.println("Human born with brain");
    }
}

public class Student {
    public static void main(String[] args) {
        Human h = new Human();
    }
}



