package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int num = height;

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height; j++) {

                if (i == 0 || i == height) {
                    System.out.print(8);
                } else if (j >= i && j <= num) {
                    System.out.print(8);
                } else if (j <= i && j >= num) {
                    System.out.print(8);
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
            num--;
        }
    }
}
