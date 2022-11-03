package es.unai;

public class Ex6 {
    private final char END_LINE = '.';
    private final char SPACE = ' ';
    private char character;
    private int numberWords;


    public static void main(String[] args) {
        new Ex6().start();
    }

    private void start() {
        char[] word = new char[20];

        System.out.println("Introduce una secuencia de carácteres: ");
        character = LT.readChar();

        while (nextWord()) {
            if (character == END_LINE) {
                return;
            }

            readWord(word);

            if(checkValid(word)) {
                display(word);
            }
        }
    }

    private boolean nextWord() {
        while(character == SPACE) {
            character = LT.readChar();
        }

        return true;
    }

    private void readWord(char[] word) {
        int index = 0;

        while((character != SPACE) && (character != END_LINE)) {
            word[index] = character;
            character = LT.readChar();
            index++;
        }

        numberWords = (index);
    }

    private boolean checkValid(char[] word) {
        boolean[] valid = {false, false, false, false, false};

        for(int i = 0; i < numberWords; i++) {
            switch(word[i]) {
                case 'a' -> valid[0] = true;
                case 'e' -> valid[1] = true;
                case 'i' -> valid[2] = true;
                case 'o' -> valid[3] = true;
                case 'u' -> valid[4] = true;
            }
        }

        return valid[0] && valid[1] && valid[2] && valid[3] && valid[4];
    }

    private void display(char[] word) {
        for(int i = 0; i < numberWords; i++) {
            System.out.print(word[i]);
        }
        System.out.println();
    }

}