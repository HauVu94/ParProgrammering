import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class parProgrammering {

    @Test
      void program() {
        int regularNumber = 1;
        assertEquals("i", convertNumeralToRomanValue(regularNumber));
    }

    @Test
    void ConvertSecondNumber(){
        int regularNumber = 2;
        assertEquals("ii", convertNumeralToRomanValue(regularNumber));
    }


    @Test
    void convertThirdNumber(){
        int regularNumber = 3;
        assertEquals("iii", convertNumeralToRomanValue(regularNumber));

    }
    String convertNumeralToRomanValue(int number){
        String romanNumberThree = "iii";
        if(number == 3){
            return romanNumberThree;
        }
        String romanNumberTwo = "ii";
        if (number == 2) {
            return romanNumberTwo;
        }
        String romanNumberOne = "i";
        if(number == 1){
            return romanNumberOne;
        }
        return null;
    }




}

