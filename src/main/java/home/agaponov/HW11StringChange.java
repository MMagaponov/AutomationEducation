
package home.agaponov;


import com.sun.jna.platform.win32.WinDef;

import java.util.Scanner;


public class HW11StringChange {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Введите свою строку");
        String userResult = scan.nextLine();

        System.out.println("Выберите опцию");
        System.out.println("A. СТРОКА ЗАГЛАВНЫМИ БУКВАМИ");
        System.out.println("B. строка в нижнем регистре");
        System.out.println("C. С Заглавной Буквы (Первый Символ Каждого Слова В Строке )");
        System.out.println("D. пЕРВЫЙ сИМВОЛ в нИЖНЕМ рЕГИСТРЕ");
        System.out.println("E. Как в предложении(с заглавной буквы).");
        System.out.println("F. выход из программы");


        String c = scan.nextLine();
        c = c.toUpperCase();
        char choice = c.charAt(0);



        switch (choice) {
            case 'A':
                userResult = userResult.toUpperCase();
                break;
            case 'B':
                userResult = userResult.toLowerCase();
                break;
            case 'C':
                userResult = toTitleCase(userResult);
                break;
            case 'D':
                userResult = toLowCase(userResult);
                break;
            case 'E':
                userResult = capitalize(userResult);
                break;
            case 'F':
                userResult = "Выход";
                break;
            default:
                userResult = "Выход";
                break;

        }

        System.out.println(userResult);

    }

    private static String capitalize(final String line) {
        return Character.toUpperCase(line.charAt(0)) + line.substring(1);
    }

    public static String toTitleCase(String givenString) {
        String[] arr = givenString.split(" ");
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < arr.length; i++) {
            sb.append(Character.toUpperCase(arr[i].charAt(0)))
                    .append(arr[i].substring(1)).append(" ");
        }
        return sb.toString().trim();
    }

    public static String toLowCase(String givenString) {
        String[] arr = givenString.split(" ");
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < arr.length; i++) {
            sb.append(Character.toLowerCase(arr[i].charAt(0)))
                    .append(arr[i].substring(1)).append(" ");
        }
        return sb.toString().trim();
    }

}

