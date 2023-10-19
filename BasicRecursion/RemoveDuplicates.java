package BasicRecursion;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "aaappnnacollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);

    }

    public static void removeDuplicates(String str, int index, StringBuilder newStr, boolean map[]) {
        if (index == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(index);
        if (map[currChar - 'a'] == true) {
            removeDuplicates(str, index + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, index + 1, newStr.append(currChar), map);
        }
    }
}
