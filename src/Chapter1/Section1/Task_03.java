package Chapter1.Section1;

/**
 * Ex. 1.1.3 <br>
 * 11.01.2022
 * @author xairaven
 */
public class Task_03 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.1.3 --");
        // Input from command line (3 int args). Example: 1 2 3
        if (args.length != 3) {
            System.out.println("Number of args != 3");
            return;
        }

        if (args[0].equals(args[1]) && args[1].equals(args[2])) {
            System.out.println("Equal");
        } else System.out.println("Not equal");
    }
}

/*
Example:
1 2 3 -> Not Equal
4 2 4 -> Not Equal
4 4 4 -> Equal
*/