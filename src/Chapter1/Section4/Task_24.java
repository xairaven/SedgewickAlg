package Chapter1.Section4;

/**
 * Ex. 1.4.24 <br>
 * 15.06.2022
 * @author xairaven
 */
public class Task_24 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.4.24 --");

        boolean[] floors = {false, false, false, false, true, true, true, true, true, true, true};

        System.out.println("F = 5th floor");
        System.out.printf("Simple method result: %d\n", findFloorSimple(floors) + 1);
        System.out.printf("Enhanced method result: %d", findFloorEnhanced(floors) + 1);
    }

    // lg(N)
    private static int findFloorSimple(boolean[] floors) {
        return findFloorSimple(floors, 0, floors.length - 1);
    }

    private static int findFloorSimple(boolean[] floors, int lo, int hi) {
        if (lo > hi) return -1;

        int mid = lo + (hi - lo) / 2;

        if (!floors[mid]) return findFloorSimple(floors, mid + 1, hi);
        else {
            int temp = findFloorSimple(floors, lo, mid - 1);

            if (temp == -1) return mid;
            else return temp;
        }
    }

    // ~2lg(F)
    private static int findFloorEnhanced(boolean[] floors) {
        int floor = 0;

        for (int power = 1; floor < floors.length; power++) {
            if (floors[floor]) break;
            floor = 1 << power;
        }

        int prevFloor = floor/2;
        floor = Math.min(floors.length - 1, floor);

        int temp = findFloorSimple(floors, prevFloor + 1, floor - 1);
        return (temp == -1) ? floor : temp;
    }
}

/*
Result example:
F = 5th floor
Simple method result: 5
Enhanced method result: 5
 */

