
package home.agaponov;


import com.sun.jna.platform.win32.WinDef;

import java.util.Scanner;

public class HW11StringChange {

    public String firstUpperCase(String word){
        if(word == null || word.isEmpty()) return "";//или return word;
        return word.substring(0, 1).toUpperCase() + word.substring(1);
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
            case 'C':  userResult = "Март";
                break;
            case 'D':  userResult = "Апрель";
                break;
            case 'E':  userResult = "Май";
                break;
            case 'F':  userResult = "Июнь";
                break;
            case 'G':  userResult = "Июль";
                break;

        }

        System.out.println(userResult);

    }


}

