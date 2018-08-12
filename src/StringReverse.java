public class StringReverse {

    private void reverse (String words){
        String[] word = words.split("\\s+");
        String[] result = new String[word.length];

        for (int i=0; i<word.length; i++){
            result[i]=word[word.length-1-i];
            System.out.print(result[i]+" ");
        }

    }

    public static void main(String[] args) {
        StringReverse sr = new StringReverse();
        sr.reverse("How Are You");

    }
}
