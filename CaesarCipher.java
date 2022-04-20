import javax.swing.SpringLayout;

public class CaesarCipher {
    public static void main(String[] args) {

        //String A = encript("ABCdXYZ", -1);
        // System.out.println(A);
        String word = "HelloWorld";
        int shift = 9;
        String chain = encript(word, shift);

        System.out.println("start: "+ word);
        System.out.println("shift: "+shift);
        System.out.println("result:"+chain);
    }
    
    public static String encript(String word, int shift) {
        //A =65 | Z=90
        //char letra = word;
        //int letra_ascii = (int)letra;
        //System.out.println((int) letra);
        word=word.toUpperCase();
        if (shift<-25 || shift>25 ) {
            return "shift out of range";
        }
        String new_string="";
        if (shift >= 0) {
            for (int i = 0; i < word.length(); i++) {
                int ascii = (int) word.charAt(i);
                ascii = ascii+shift;
                if (ascii > 90) {
                    ascii = ascii - 26;
                }
                char new_char = (char) (ascii);
                new_string += new_char;
            }
        } else {
            for (int j = 0; j < word.length(); j++) {
                int ascii = (int) word.charAt(j);
                ascii = ascii + shift;
                if (ascii < 65) {
                    ascii = ascii + 26;
                }
                char new_char = (char) (ascii);
                new_string += new_char;
            }
        }
        return new_string;
        // System.out.println(new_string);
            // char new_char = (char) (letra_ascii + shift);
            // System.out.println(new_char);
            // System.out.println(new_char+"a");
    }
    
}