package exercises;

public class Exercise24 {
    public static void main(String[] args) {

        // Inefficient
        String info = "";

        info += "My name is Kamil.";
        info += " ";
        info += "I am a person";

        System.out.println(info);

        StringBuilder sb = new StringBuilder();

        sb.append("My name is Adam.");
        sb.append(" ");
        sb.append("I am a programmer.");

        System.out.println(sb.toString());

        StringBuilder s = new StringBuilder();

        s.append("My name is Anna")
        .append("")                              // NIE DZIAŁA .append ???
        .append("I am a teacher");

        System.out.println(s);

        System.out.println("Here is some text.\tThat was a tab. \nThat was a newline");
        System.out.println("More text.");

        System.out.printf("Total coast %d", 5);

        for(int i=0; i<20; i++){
            System.out.printf("%-2d: %s\n", i ,"here is some text");
        }

    }
}
