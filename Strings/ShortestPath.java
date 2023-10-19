package Strings;

public class ShortestPath {
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));

    }

    public static double getShortestPath(String str) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'N') {
                y++; // North
            } else if (str.charAt(i) == 'S') {
                y--; // South
            } else if (str.charAt(i) == 'E') {
                x++; // East
            } else if (str.charAt(i) == 'W') {
                x--; // West
            }
        }
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
}
