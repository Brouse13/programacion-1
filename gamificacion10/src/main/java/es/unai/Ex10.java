package es.unai;

public class Ex10 {
    private final char END_LINE = '.';
    private final char SPACE = ' ';
    private char character;
    private int numberWords;


    public static void main(String[] args) {
        new Ex10().start();
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
        return word[0] == 'i' && word[1] == 'o' && word[2] == 'n';
    }

    private void display(char[] word) {
        for(int i = 0; i < numberWords; i++) {
            System.out.print(word[i]);
        }
        System.out.println();
    }

}