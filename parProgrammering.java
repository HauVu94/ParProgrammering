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

}

