import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int height = 0;
        int width = 0;
        try {
            height = in.nextInt();
            width = in.nextInt();
        } catch (Exception e) {
            System.out.println("Incorrect mesh size.");
            return;
        }

        String str = in.next();
        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) == 'R' || str.charAt(i) == 'G' || str.charAt(i) == 'F')) {
                System.out.println("Invalid cell type");
                return;
            }
        }

        if (str.length() != height * width) {
            System.out.println("Data mismatch");
        }

        char[][] map = new char[height][width];
        int index = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i % 2 == 0) {
                    map[i][j] = str.charAt(width * i + j);
                } else {
                    map[i][width - j - 1] = str.charAt(width * i + j);
                }
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
}
/*
4 6
GRRGGGGGGRFFFFRGGFFGRRFF
 */