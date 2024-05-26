import java.text.NumberFormat;
import java.text.ParseException;

public class Exceccao {
    public static void main(String[] args) {
        Number valor;
        try {
            valor = NumberFormat.getInstance().parse("al.75");
            System.out.println(valor);
        } catch (ParseException e) {
            
            e.printStackTrace();
        }
        
    }
}
