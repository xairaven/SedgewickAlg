package Chapter1.Section4;

/**
 * Ex. 1.4.13 <br>
 * 13.06.2022
 * @author xairaven & Rene Argento
 */
public class Task_13 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.4.13 --");
        System.out.println("""
                a) Accumulator (page 93)
                   * object overhead -> 16 bytes
                   * double value (total) -> 8 bytes
                   * int value (N) -> 4 bytes
                   * padding -> 4 bytes
                   Amount of memory needed: 16 + 8 + 4 + 4 = 32 bytes
                   
                b) Transaction (page 79)
                   * object overhead -> 16 bytes
                   * String reference (who) -> 8 bytes
                   * Date reference (when) -> 8 bytes
                   * double value (amount) -> 8 bytes
                   Amount of memory needed: 16 + 8 + 8 + 8 = 40 bytes
                   
                c) FixedCapacityStackOfStrings with capacity C and N entries (page 133)
                   * object overhead -> 16 bytes
                   * String[] (a)
                      object overhead -> 16 bytes
                      int value (length) -> 4 bytes
                      padding -> 4 bytes
                      String references -> 8C bytes
                      N Strings -> (32 bytes (a Java 7+ String size) + 24 + 2Ch bytes (for the char array)) * N = (56 + 2Ch) * N bytes
                   * int value (n) -> 4 bytes
                   * padding -> 4 bytes
                   Amount of memory needed: 16 + 16 + 4 + 4 + 8C + 56N + (2Ch * N) + 4 + 4 = (2Ch * N) + 8C + 56N + 48 bytes
                   
                d) Point2D (page 77)
                   * object overhead -> 16 bytes
                   * double value (x) -> 8 bytes
                   * double value (y) -> 8 bytes
                   Amount of memory needed: 16 + 8 + 8 = 32 bytes
                   
                e) Interval1D (page 77)
                   * object overhead -> 16 bytes
                   * double value (left) -> 8 bytes
                   * double value (right) -> 8 bytes
                   Amount of memory needed: 16 + 8 + 8 = 32 bytes
                   
                f) Interval2D (page 77)
                   * object overhead -> 16 bytes
                   * Interval1D reference (x) -> 8 bytes
                   * Interval1D reference (y) -> 8 bytes
                   Amount of memory needed: 16 + 8 + 8 = 32 bytes
                
                g) Double (page 34)
                   * object overhead -> 16 bytes
                   * double value (x) -> 8 bytes
                   Amount of memory needed: 16 + 8 = 24 bytes
                """);
    }
}
