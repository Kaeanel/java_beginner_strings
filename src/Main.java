public class Main {
/*  public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
*/
    public static void explore(String assumption,
                               boolean result) {
        StringBuilder sb = new StringBuilder();
        if (result) {
            sb.append(String.format("YAY!"));
        } else {
            sb.append(String.format("WAT???!"));
        }
        sb.append("  ");
        sb.append(assumption);
        if (!result) {
            sb.append(" (Your assumption is incorrect)");
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        // Your assumptions here
    }
}