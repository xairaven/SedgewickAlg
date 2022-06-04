package Chapter1.Section1;

/**
 * Ex. 1.1.4 <br>
 * 11.01.2022
 * @author xairaven
 */
public class Task_04 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.1.4 --");
        System.out.println("""
        ENG version:
        A) if (a > b) then c < 0;          No such keyword as "then" in Java
        B) if a > b { c = 0; }             Missing parentheses. Should be: if (a > b) { c = 0; }
        C) if (a > b) c = 0;               Nothing wrong
        D) if (a > b) c = 0 else b = 0;    Missing ";" after c = 0
        
        RUS version (idk why it different):
        A) if (a > b) then c < 0;          No such keyword as "then" in Java
        Б) a > b { c = 0; }                Missing IF
        В) (a > b) c = 0;                  Missing IF
        Г) (a > b) c = 0 else b = 0;       Missing IF and semicolon after c = 0
        """);
    }
}
