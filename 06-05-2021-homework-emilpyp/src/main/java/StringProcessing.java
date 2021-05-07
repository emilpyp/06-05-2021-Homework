import java.util.ArrayList;

public class StringProcessing {
    public static void processText(String text){
        int counter = 0;
        ArrayList<String> noDuplicates = new ArrayList<>();
        StringBuilder newSentence = new StringBuilder();

        String[] words = text.split("(\\s|\\.|\\?|,|!)+");

        for(String s: words){
            if (!noDuplicates.contains(s)) {
                noDuplicates.add(s);
                newSentence.append(s).append(", ");
            }
        }
        System.out.println(newSentence);

    }

    public static void main(String[] args) {
        String text= "Hello, darling, how are you?\n" +
                "CHILD\n" +
                "Hello Daddy. Where are you?\n" +
                "FLOYD\n" +
                "I'm at Space Station Five, darling. How are you?\n" +
                "CHILD\n" +
                "I'm fine, Daddy. When are you coming home?\n" +
                "FLOYD\n" +
                "Well, I hope in a few days, sweetheart.\n" +
                "CHILD\n" +
                "I'm having a party tomorrow.\n" +
                "FLOYD\n" +
                "Yes, I know that sweetheart.\n" +
                "CHILD\n" +
                "Are you coming to my party?\n" +
                "FLOYD\n" +
                "No, I'm sorry, darling, I told you I won't be home for a few days.\n" +
                "CHILD\n" +
                "When are you coming home?\n" +
                "FLOYD\n" +
                "In three days, darling, I hope.";
        processText(text);

    }
}
