import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*Hoja de trabajo 3
Clase calculadora
Daniela Batz
Jose Ramos
Algoritmos y estructuras de datos*/

public class Calculadora {

    private static final String ADD = "+"; 
    private static final String SUB = "-";
    private static final String MUL = "*";
    private static final String DIV = "/";

    public Calculadora(){
    }

    public void calculateFile(String fileName) throws IOException {
        BufferedReader br = null;
        StringBuilder sb = null;
        try {
            FileReader fileReader = new FileReader(fileName);
            br = new BufferedReader(fileReader);

            sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                line = br.readLine();
            }

            String input = sb.toString();
            System.out.println(input + " = " + calculate(input));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            br.close();
        }
    }
    
}

