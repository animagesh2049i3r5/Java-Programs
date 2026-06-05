public class VowelCounter {
    public static void main(String[] args) {
        System.out.println(countVowels("Hello World"));
        System.out.println(countVowels("AP Computer Science A"));
        System.out.println("Anirudh Magesh 3/23/26");
    }

    public static int countVowels(String str) {
        int count = 0;

        String lowerStr = str.toLowerCase();

        for (int i = 0; i < lowerStr.length(); i++) {
            char ch = lowerStr.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}
