import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class parProgrammering {

    @Test
      void ConvertNumberOne() {
        int Number = 1;
        assertEquals("i", convertNumeralToRomanValue(Number));
    }

    @Test
    void ConvertNumberTwo(){
        int Number = 2;
        assertEquals("ii", convertNumeralToRomanValue(Number));
    }


    @Test
    void convertNumberTree(){
        int Number = 3;
        assertEquals("iii", convertNumeralToRomanValue(Number));

    }

    @Test
    void convertFourtNumber(){
        int number = 4;
        assertEquals("iv", convertNumeralToRomanValue(number) );
    }

    @Test
    void convertNumberFive(){
        int number = 5;
        assertEquals("v", convertNumeralToRomanValue(number) );
    }

    @Test
    void convertNumberNine(){
        int number = 9;
        assertEquals("ix", convertNumeralToRomanValue(number) );
    }

    @Test
    void convertNumberTen(){
        int number = 10;
        assertEquals("x", convertNumeralToRomanValue(number) );
    }

    @Test
    void convertNumberFourty(){
        int number = 40;
        assertEquals("xl", convertNumeralToRomanValue(number) );
    }
    
    @Test
    void convertNumberFifty(){
        int number = 50;
        assertEquals("l", convertNumeralToRomanValue(number));
    }

    @Test
    void convertNumberNinety(){
        int number = 90;
        assertEquals("xc", convertNumeralToRomanValue(number));
    }

    @Test
    void convertNumberHundred(){
        int number = 100;
        assertEquals("c", convertNumeralToRomanValue(number));
    }

    @Test
    void convertNumberFourHundred(){
        int number = 400;
        assertEquals("cd", convertNumeralToRomanValue(number));
    }

    @Test
    void convertNumberFiveHundred(){
        int number = 500;
        assertEquals("d", convertNumeralToRomanValue(number));
    }

    @Test
    void convertNumberNineHundred(){
        int number = 900;
        assertEquals("cm", convertNumeralToRomanValue(number));
    }

    @Test
    void convertNumberThousand(){
        int number = 1000;
        assertEquals("m", convertNumeralToRomanValue(number));
    }



    String convertNumeralToRomanValue(int number){

        StringBuilder result = new StringBuilder();

        if (number == 1000){
            result.append("m");
            number -= 1000;
        }


        if (number == 900){
            result.append("cm");
            number -= 900;
        }

        if (number == 500){
            result.append("d");
            number -= 500;
        }

        if (number == 400){
            result.append("cd");
            number -= 400;
        }

        if (number == 100){
            result.append("c");
            number -= 100;
        }


        if (number == 90){
            result.append("xc");
            number -= 90;
        }

        if (number == 50){
            result.append("l");
            number -= 50;
        }

        if(number == 40){
            result.append("xl");
            number -= 40;
        }

        if(number == 10){
            result.append("x");
            number -= 10;
        }

        if(number == 9){
            result.append("ix");
            number -= 9;
        }

        if(number >= 5){
            result.append("v");
            number -= 5;
        }

        if(number >= 4){
            result.append("iv");
            number -= 4;

        }

        // denne while vil hente alle tall fra 1-3
        while (number > 0){  // så lenge tall er større enn 0 skriv ut "i" også ta vekk tallet 1.
            result.append("i"); // legge til + "i" hver gang
            number -= 1;
        }
        return result.toString(); // skriv ut resultatet


        // gjøre denne opp til sjekk 1-3.
//        String romanNumberOne = "i";
//        if(number == 1){
//            return romanNumberOne;
//        }


    }




}

