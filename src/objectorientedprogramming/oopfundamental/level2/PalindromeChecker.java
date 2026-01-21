package Object_Oriented_Programming.OOPFundamental.level2;

public class PalindromeChecker {
    private String text;

    public PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        String rev = "";
        for (int i = text.length() - 1; i >= 0; i--)
            rev += text.charAt(i);
        return text.equals(rev);
    }

    public void displayResult() {
        System.out.println(isPalindrome() ? "Palindrome" : "Not Palindrome");
    }

    public static void main(String[] args) {
        PalindromeChecker p = new PalindromeChecker("level");
        p.displayResult();
    }
}
