import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        char[] str1 = str.toCharArray();
        for (int i = 0; i < str1.length; i++) {
            int covert = str1[i] + 3;
            switch (BigOrSmall(covert)) {
                case 0:
                    if (covert > 90) {
                        str1[i] = (char) (covert - 26);
                    } else {
                        str1[i] = (char) (covert);
                    }
                    break;
                case 1:
                    if (covert > 122) {
                        str1[i] = (char) (covert - 26);
                    } else {
                        str1[i] = (char) covert;
                    }
                    break;
                case 2:
                    str1[i] = (char) 32;
                    break;
            }
        }
        for (char c : str1) {
            System.out.print(c);
        }
    }

    static int BigOrSmall(int covert) {
        if (covert >= 97) {
            return 1;
        } else if (covert == 35) {
            return 2;
        } else {
            return 0;
        }
    }
}
