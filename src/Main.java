import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        String sString;
        int iOffset;
        char[] cChar;
        int i;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Zeichenkette eingeben (Enter ende): ");
            sString = input.nextLine();
            if (sString.length() == 0) break;
            else {
                System.out.println("Offset: ");
                iOffset = input.nextInt();
                input.nextLine();

                cChar = sString.toCharArray();
                for (i = 0; i < cChar.length; i++) {

                    if (cChar[i] >= 'A' && cChar[i] <= 'Z' && (cChar[i] + iOffset) > 'Z')
                        cChar[i] = (char) (cChar[i] - 26);

                    if (cChar[i] >= 'a' && cChar[i] <= 'z' && (cChar[i] + iOffset) > 'z')
                        cChar[i] = (char) (cChar[i] - 26);

                    cChar[i] = (char) (cChar[i] + iOffset);

                }
                System.out.println(cChar);
            }
        } while (true);
    }
}
