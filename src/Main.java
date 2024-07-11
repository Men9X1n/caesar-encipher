import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        char[] a = new char[100];
        for (int i = 0; i < str.length(); i++) {
            int covert = str.charAt(i) + 3;
            switch (BigOrSmall(covert)) {
                case 0:
                    if (covert > 90) {
                        a[i] = (char) (covert - 26);
                    } else {
                        a[i] = (char) (covert);
                    }
                    break;
                case 1:
                    if (covert > 122) {
                        a[i] = (char) (covert - 26);
                    } else {
                        a[i] = (char) covert;
                    }
                    break;
                case 2:
                    a[i] = (char) 32;
                    break;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            System.out.print(a[i]);
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
