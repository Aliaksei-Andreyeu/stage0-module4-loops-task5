package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int x = 0; x < height; x++) {
            for (int y = 0; y < height; y++) {
                if ((x > y && x + y < height - 1) || (x < y && x + y > height - 1)) {
                    System.out.print(" ");
                } else {
                    System.out.print("8");
                }
            }
            System.out.println();
        }
    }
}