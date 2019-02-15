import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class main {
    /**
     * Método
     * @param charachters
     * @return
     */
    public static boolean isValid(String[] charachters) {
        int amountOfInt = 0;
        int amountOfSymbols = 0;
        if (charachters[0].matches("[0-9]") && charachters[1].matches("[0-9]")) {
            for (String oneLetter : charachters)
                if (oneLetter.matches("[0-9]")) {
                    amountOfInt ++;
                } else if(oneLetter.matches("[+/*-]")) {
                    amountOfSymbols ++;
                }
                else {
                    return false;
                }
            if (amountOfInt - 1 == amountOfSymbols){
                return true;
            }
        }
        return false;
    }

    public static boolean isNumber(String charachter){
        if (charachter.matches("[1-9]")){
            return true;
        }
        else if (charachter.matches("[+/*-]")){
            return false;
        }
        return false;
    }

    public static String[] extractText(){
        StringBuilder contentBuilder = new StringBuilder();
        try{
            Stream<String> lines = Files.lines(
                    Paths.get("datos.txt"),
                    StandardCharsets.UTF_8);
            lines.forEach(s ->contentBuilder.append(s));
        }catch (IOException exception){
            System.out.println("Error");
        }
        String calculation = contentBuilder.toString();
        String[] onlySymbols = calculation.split(" ");
        return onlySymbols;
    }

    public static void main (String[] args){

    }
}
