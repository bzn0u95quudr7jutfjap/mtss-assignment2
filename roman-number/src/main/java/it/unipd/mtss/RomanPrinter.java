////////////////////////////////////////////////////////////////////
// Alex Scantamburlo 2042326
// Antonio Benetazzo 2034528
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {
    
    public static String print(int num){
        return printAsciiArt(IntegerToRoman.convert(num).get());
    }

    private static String printAsciiArt(String romanNumber){
        String[] row ={"", "", "", "", "", ""};
        for(int i = 0; i<romanNumber.length(); i++){
            switch (romanNumber.charAt(i)) {
                case 'I':
                    row[0] = row[0] + "  _____ ";
                    row[1] = row[1] + " |_   _|";
                    row[3] = row[3] + "   | |  ";
                    row[2] = row[2] + "   | |  ";
                    row[4] = row[4] + "  _| |_ ";
                    row[5] = row[5] + " |_____|";
                    break;

                case 'V':
                    row[0] = row[0] + " __      __";
                    row[1] = row[1] + " \\ \\    / /";
                    row[2] = row[2] + "  \\ \\  / / ";
                    row[3] = row[3] + "   \\ \\/ /  ";
                    row[4] = row[4] + "    \\  /   ";
                    row[5] = row[5] + "     \\/    ";
                    break;

                case 'X':
                    row[0] = row[0] + " __   __";
                    row[1] = row[1] + " \\ \\ / /";
                    row[2] = row[2] + "  \\ V / ";
                    row[3] = row[3] + "   > <  ";
                    row[4] = row[4] + "  / . \\ ";
                    row[5] = row[5] + " /_/ \\_\\";
                    break;

                case 'L':
                    row[0] = row[0] + "  _      ";
                    row[1] = row[1] + " | |     ";
                    row[2] = row[2] + " | |     ";
                    row[3] = row[3] + " | |     ";
                    row[4] = row[4] + " | |____ ";
                    row[5] = row[5] + " |______|";
                    break;

                case 'C':
                    row[0] = row[0] + "    _____ ";
                    row[1] = row[1] + "   / ____|";
                    row[2] = row[2] + "  | |     ";
                    row[3] = row[3] + "  | |     ";
                    row[4] = row[4] + "  | |____ ";
                    row[5] = row[5] + "   \\_____|";
                    break;
                
                case 'D':
                    row[0] = row[0] + "    _____  ";
                    row[1] = row[1] + "   |  __ \\ ";
                    row[2] = row[2] + "   | |  | |";
                    row[3] = row[3] + "   | |  | |";
                    row[4] = row[4] + "   | |__| |";
                    row[5] = row[5] + "   |_____/ ";
                    break;
                
                case 'M':
                    row[0] = row[0] + "    __  __ ";
                    row[1] = row[1] + "   |  \\/  |";
                    row[2] = row[2] + "   | \\  / |";
                    row[3] = row[3] + "   | |\\/| |";
                    row[4] = row[4] + "   | |  | |";
                    row[5] = row[5] + "   |_|  |_|";
                    break;
                
                default:
                    break;
            }
        }
        String s = "";
        for(int i = 0; i < 6; i++){
            s = s + row[i] + "\n";
        }
        return s;
    }
}
