// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	   String word = args[0];
           char letter = 0;
           for (int i=0; i<word.length(); i++) {
                letter = word.charAt(i);
                letter = toUpperCase (letter);
                if (letter == 'A' || letter == 'E' || letter == 'F'|| letter == 'H'|| letter == 'I'|| letter == 'L'|| letter == 'M' || letter == 'N'|| letter == 'O'|| letter == 'R'|| letter == 'S'|| letter == 'X') {
                        System.out.println("Give me an " + letter + ": " + letter + "!");
                }
                else System.out.println("Give me a  " + letter + ": " + letter + "!");
           }

           System.out.println("What does that spell?");

           int num = Integer.parseInt((args[1]));
           String upperWord = allWordUpper(word);
           for (int i=0; i<num; i++) {
                System.out.println(upperWord + "!!!");
           }
        }

        public static char toUpperCase (char result) {
                switch (result) {
                        case 'a': result = 'A';
                        break;
                        case 'b': result = 'B';
                        break;
                        case 'c': result = 'C';
                        break;
                        case 'd': result = 'D';
                        break;
                        case 'e': result = 'E';
                        break;
                        case 'f': result = 'F';
                        break;
                        case 'g': result = 'G';
                        break;
                        case 'h': result = 'H';
                        break;
                        case 'i': result = 'I';
                        break;
                        case 'j': result = 'J';
                        break;
                        case 'k': result = 'K';
                        break;
                        case 'l': result = 'L';
                        break;
                        case 'm': result = 'M';
                        break;
                        case 'n': result = 'N';
                        break;
                        case 'o': result = 'O';
                        break;
                        case 'p': result = 'P';
                        break;
                        case 'q': result = 'Q';
                        break;
                        case 'r': result = 'R';
                        break;
                        case 's': result = 'S';
                        break;
                        case 't': result = 'T';
                        break;
                        case 'u': result = 'U';
                        break;
                        case 'v': result = 'V';
                        break;
                        case 'w': result = 'W';
                        break;
                        case 'x': result = 'X';
                        break;
                        case 'y': result = 'Y';
                        break;
                        case 'z': result = 'Z';
                        break;
                }
                return result;
        }

        public static String allWordUpper (String word) {
                int num = word.length();
                String newWord = "";
                for (int i=0; i<num; i++) {
                        newWord = newWord + toUpperCase(word.charAt(i));
                }
                return newWord;
        }
}
