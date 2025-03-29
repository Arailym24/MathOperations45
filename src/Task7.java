public class Task7 {
    public static void permute(String str, String answer) {
        if (str.length() == 0) {
            System.out.println(answer);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            permute(ros, answer + ch);
        }
    }

    public static void main(String[] args) {
        String s = "IOX";
        permute(s, "");
    }
}
