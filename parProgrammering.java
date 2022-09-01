import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class parProgrammering {

    @Test
      void program() {
        int regularNumber = 1;
        assertEquals("i",convertNumeralOneToRomanValue(regularNumber));
    }

    String convertNumeralOneToRomanValue(int numberOne){
        String romanNumberOne = "i";
        if(numberOne == 1){
            return romanNumberOne;
        }
        return null;
    }

    @Test
    void ConvertSecondNumber(){
        int regularNumber = 2;
        assertEquals("ii", convertNumeralTwoToRomanValue(regularNumber));
    }

    String convertNumeralTwoToRomanValue(int numberTwo){
        String romanNumberTwo = "ii";
        if (numberTwo == 2) {
            return romanNumberTwo;
        }
        return null;
    }
}

