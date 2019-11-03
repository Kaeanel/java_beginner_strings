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
        int firstNumber = 12;
        int secondNumber = 12;
        explore("Primitives use double equals",
                firstNumber == secondNumber);

        Object firstObject = new Object();
        Object secondObject = new Object();

        explore("Object references use double equals to check if they refer to the same object in memory, seemingly equal objects are not equal",
                firstObject != secondObject);

        Object sameObject = firstObject;
        explore("Object references must refer to the same object to us double equals",
                firstObject == sameObject);

        String firstString = "Kaeanel";
        String secondString = "Kaeanel";
        explore("String literals are actually referring to the same objects",
                firstString == secondString);

        String differentString = new String("Kaeanel");
        explore("String objects that contain the same characters but point to different objects canno use double equals",
                firstString != differentString);

        String anotherString = new String("Kaeanel");
        explore("String Interning adds to the same String Pool where literals live so you get back to the same reference",
                anotherString.intern() == firstString);

        explore("All Objects should use equals() to check equality",
                firstString.equals(differentString));
    }
}