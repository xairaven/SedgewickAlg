package Section1;

public class MainSection1 {
    public static void main(String[] args) {
        Task_1.main();
        Task_2.main();
        Task_3.main(args); // Main -> Edit configurations -> Program Arguments -> Your input
        Task_4.main();
        Task_5.main(0.5, 1);
        Task_6.main();
        Task_7.main();
        Task_8.main();
        Task_9.main(52); //Converting from decimal to binary
        Task_10.main();

        boolean[][] arrTask11 = {
                {true, false, true, true},
                {true, true, true, true},
                {false, false, true, true},
                {true, false, false, true}
        };
        Task_11.main(arrTask11);

        Task_12.main();

        int[][] arrTask13 = {
                {1, 2, 3, 4, 5},
                {5, 7, 9, 8, 6},
                {1, 5, 6, 7, 7},
                {2, 3, 2, 3, 9}
        };
        Task_13.main(arrTask13);

        Task_14.main(2);

        int[] arrTask15 = {1, 1, 2, 3, 1, 2, 3, 5, 6}; int M = 6;
        Task_15.main(arrTask15, M);

        Task_16.main(6);
        Task_17.main();
        Task_18.main();
        Task_19.main();
        Task_20.main(5);
        Task_21.main(); //User Input
    }
}