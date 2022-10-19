class PatternX {
    public static void main(String[] args) {
        pattern(7);
    }

    static void pattern(int n) {
        int c = n * 2 - 1;
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < c; j++) {
                if (i == j || j == c-i-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // * *
    // * *
    // * *
    // * *
    // * *
    // *
    // * *
    // * *
    // * *
    // * *
    // * *

}