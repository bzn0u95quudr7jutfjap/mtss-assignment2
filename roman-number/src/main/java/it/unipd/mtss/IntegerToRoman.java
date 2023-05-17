////////////////////////////////////////////////////////////////////
// Alex Scantamburlo 2042326
// Antonio Benetazzo 2034528
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;
import java.util.Optional;

public class IntegerToRoman {

    private IntegerToRoman(){}

    public static Optional<String> convert(int number){
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] r={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder roman = new StringBuilder();
        if(number < 1) {
            return Optional.empty();
        }
        if(number >= 1000) {
            return Optional.empty();
        }

        for(int i = 0; i < values.length; i++){
            while(number >= values[i]){
                number = number - values[i];
                roman.append(r[i]);
            }
        }
        return Optional.of(roman.toString());
    }
    
}