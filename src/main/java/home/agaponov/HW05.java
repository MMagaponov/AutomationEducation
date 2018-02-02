package home.agaponov;


public class HW05 {
    public static void main(String[] args) {
        String digits = "45685";
        int length = digits.length();
        int i = 0;

        System.out.println("Value is:" + digits);
        System.out.println("Length is:" + length);

        for(i = length-1; i >= 0; i--) {
            System.out.println(digits.charAt(i));
        }
    }

}
