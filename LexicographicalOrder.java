public class LexicographicalOrder {

    public static void main(String[] args) {
        String[] words = { "Javascript", "C", "Python", "Java" };

        for (int i = 0; i < words.length - 1; i++) {
            if(words[i].compareTo(words[i+1]) > 0){
                String temp = words[i+1];
                words[i+1] = words[i];
                words[i] = temp;
            }
        }

        for (int i = 0; i < words.length; ++i) {
            System.out.println(words[i]);
        }
    }
}
