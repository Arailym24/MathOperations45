public class Task8 {
    public static boolean isAllDigits(String s, int index) {
        if (index == s.length()) return true;
        if (!Character.isDigit(s.charAt(index))) return false;
        return isAllDigits(s, index + 1);
    }

    public static void main(String[] args) {
        String s = "123456";
        System.out.println(s + " contains only digits: " + isAllDigits(s, 0));
    }
}
