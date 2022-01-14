package Chapter1.Section1;
//11.01.2022
//Ex. 1.1.3
public class Task_03 {
    public static void main(String[] args) {
        System.out.println("-- Task 1.1.3 --");
        if (args.length == 3) {
            if(args[0].equals(args[1]) && args[1].equals(args[2])) {
                System.out.println("Equals");
            } else {
                System.out.println("Doesn't equals");
            }
        } else {
            System.out.println("Number of args != 3");
        }
        System.out.print("\n\n");
    }
}
