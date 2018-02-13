
package home.agaponov;


import com.sun.jna.platform.win32.WinDef;

import java.util.Scanner;


/**
Не полное решение
**/
public class HW11StringChange {

    private static String capitalize(final String line) {
        return Character.toUpperCase(line.charAt(0)) + line.substring(1);
    }

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
        //String userResult = "";



        switch (choice) {
            case 'A':  userResult = userResult.toUpperCase();
                break;
            case 'B':  userResult = userResult.toLowerCase();
                break;
            case 'C':  userResult = "";
                break;
            case 'D':  userResult = "";
                break;
            case 'E':  userResult = capitalize(userResult);
                break;
            case 'F':  userResult = "Выход";
                break;
            default:  userResult = "Выход";
                break;

        }

        System.out.println(userResult);

    }


}

