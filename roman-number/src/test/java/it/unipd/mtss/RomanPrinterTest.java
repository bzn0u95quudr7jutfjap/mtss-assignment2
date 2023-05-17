package it.unipd.mtss;

import static org.junit.Assert.*;
import org.junit.Test;

import org.mockito.MockedStatic;
import org.mockito.Mockito;

import java.util.Optional;

public class RomanPrinterTest {

    @Test
    public void test1() {
        try(MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)){
            utilities.when(() -> IntegerToRoman.convert(1)).thenReturn(Optional.of("I"));
            String exp =    "  _____ \n" + 
                            " |_   _|\n" +
                            "   | |  \n" +
                            "   | |  \n" +
                            "  _| |_ \n" +
                            " |_____|\n";
            String act = RomanPrinter.print(1);

            assertEquals(exp, act);
        }
    } 

    @Test
    public void test5() {
        try(MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)){
            utilities.when(() -> IntegerToRoman.convert(5)).thenReturn(Optional.of("V"));
            String exp =    " __      __\n" + 
                            " \\ \\    / /\n" +
                            "  \\ \\  / / \n" + 
                            "   \\ \\/ /  \n" +
                            "    \\  /   \n" +
                            "     \\/    \n";

            String act = RomanPrinter.print(5);
            
            assertEquals(exp, act);
        }
    }

    @Test
    public void test10(){
        try(MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)){
            utilities.when(() -> IntegerToRoman.convert(10)).thenReturn(Optional.of("X"));
            String exp =    " __   __\n" + 
                            " \\ \\ / /\n" +
                            "  \\ V / \n" + 
                            "   > <  \n" + 
                            "  / . \\ \n" + 
                            " /_/ \\_\\\n";

            String act = RomanPrinter.print(10);
            
            assertEquals(exp, act);
        }
    } 

    @Test
    public void test16(){
        try(MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)){
            utilities.when(() -> IntegerToRoman.convert(16)).thenReturn(Optional.of("XVI"));
            String exp =    " __   __ __      __  _____ \n" +          
                            " \\ \\ / / \\ \\    / / |_   _|\n" +
                            "  \\ V /   \\ \\  / /    | |  \n" +
                            "   > <     \\ \\/ /     | |  \n" +
                            "  / . \\     \\  /     _| |_ \n" +
                            " /_/ \\_\\     \\/     |_____|\n";

            String act = RomanPrinter.print(16);
            
            assertEquals(exp, act);
        }
    } 

    @Test
    public void test50(){
        try(MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)){
            utilities.when(() -> IntegerToRoman.convert(50)).thenReturn(Optional.of("L"));
            String exp =    "  _      \n" + 
                            " | |     \n" + 
                            " | |     \n" + 
                            " | |     \n" +
                            " | |____ \n" + 
                            " |______|\n";

            String act = RomanPrinter.print(50);
            
            assertEquals(exp, act);
        }
    }

    @Test
    public void test100(){
        try(MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)){
            utilities.when(() -> IntegerToRoman.convert(100)).thenReturn(Optional.of("C"));
            String exp =    "    _____ \n" + 
                            "   / ____|\n" + 
                            "  | |     \n" + 
                            "  | |     \n" + 
                            "  | |____ \n" + 
                            "   \\_____|\n";

            String act = RomanPrinter.print(100);
            
            assertEquals(exp, act);
        }
    }

    @Test
    public void test156(){
        try(MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)){
            utilities.when(() -> IntegerToRoman.convert(156)).thenReturn(Optional.of("CLVI"));
            String exp =    "    _____   _       __      __  _____ \n" + 
                            "   / ____| | |      \\ \\    / / |_   _|\n" +
                            "  | |      | |       \\ \\  / /    | |  \n" +
                            "  | |      | |        \\ \\/ /     | |  \n" +
                            "  | |____  | |____     \\  /     _| |_ \n" +
                            "   \\_____| |______|     \\/     |_____|\n";

            String act = RomanPrinter.print(156);
            
            assertEquals(exp, act);
        } 
    }

    @Test
    public void test500(){
        try(MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)){
            utilities.when(() -> IntegerToRoman.convert(500)).thenReturn(Optional.of("D"));
            String exp =    "    _____  \n" + 
                            "   |  __ \\ \n" + 
                            "   | |  | |\n" + 
                            "   | |  | |\n" + 
                            "   | |__| |\n" + 
                            "   |_____/ \n";

            String act = RomanPrinter.print(500);
            
            assertEquals(exp, act);
        }
    }

    @Test
    public void test1000(){
        try(MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)){
            utilities.when(() -> IntegerToRoman.convert(1000)).thenReturn(Optional.of("M"));
            String exp =    "    __  __ \n" + 
                            "   |  \\/  |\n" + 
                            "   | \\  / |\n" + 
                            "   | |\\/| |\n" + 
                            "   | |  | |\n" + 
                            "   |_|  |_|\n";

            String act = RomanPrinter.print(1000);
            
            assertEquals(exp, act);
        }
    }

    @Test
    public void test1510(){
        try(MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)){
            utilities.when(() -> IntegerToRoman.convert(1510)).thenReturn(Optional.of("MDX"));
            String exp =    "    __  __     _____   __   __\n" + 
                            "   |  \\/  |   |  __ \\  \\ \\ / /\n" +
                            "   | \\  / |   | |  | |  \\ V / \n" + 
                            "   | |\\/| |   | |  | |   > <  \n" + 
                            "   | |  | |   | |__| |  / . \\ \n" + 
                            "   |_|  |_|   |_____/  /_/ \\_\\\n";

            RomanPrinter printer = new RomanPrinter();                    
            String act = printer.print(1510);
            
            assertEquals(exp, act);
        } 
    }

}