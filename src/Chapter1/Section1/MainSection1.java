package Chapter1.Section1;

import edu.princeton.cs.introcs.In;

import java.util.Arrays;

public class MainSection1 {
    public static void main(String[] args) { /*
        Task_01.main();                   //RUN TASKS SEPARATELY
        Task_02.main();
        Task_03.main(args);               //Main -> Edit configurations -> Program Arguments -> Your input
        Task_04.main();
        Task_05.main(0.5, 1);
        Task_06.main();
        Task_07.main();
        Task_08.main();
        Task_09.main(52);                 //Converting from decimal to binary
        Task_10.main();
        Task_11.main();                   //User input in method
        Task_12.main();
        Task_13.main();
        Task_14.main(2);
        Task_15.main();                   //User input in method
        Task_16.main(6);
        Task_17.main();
        Task_18.main();
        Task_19.main();
        Task_20.main(5);
        Task_21.main();                   //User input from keyboard
        Task_22.main();                   //User input in method
        Task_23.main();
        Task_24.main(args);               //Main -> Edit configurations -> Program Arguments -> Your input
        Task_25.main();
        Task_26.main(1,3,2,4);            //a, b, c, t
        Task_27.main();                   //User input in method
        Task_28.main();                   //User input in method
        Task_29.main();                   //User input in method
        Task_30.main(5);
        Task_31.main(args);               //Main -> Edit configurations -> Program Arguments -> Your input
        Task_32.main(args);               //Main -> Edit configurations -> Program Arguments -> Your input
        Task_33.main();                   //User input in method
        Task_34.main();
        Task_35.main();                   //User input in method. N = ~6_000_002
        Task_36.main(args);               //Main -> Edit configurations -> Program Arguments -> Your input
        Task_37.main(args);               //Main -> Edit configurations -> Program Arguments -> Your input */
        //Task_38.main(args);               //resources/largeW.txt
        In in = new In(args[0]);
        int[] array = in.readAllInts();
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}