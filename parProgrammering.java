import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class parProgrammering {

    @Test
      void program() {
        int regularNumber = 8;
        assertTrue(checkFirstNumber(regularNumber));
    }

    boolean checkFirstNumber(int i){
        String romanNumberOne = "i";
        if(i == 1){
            return true;
        }
        return false;
    }
}

