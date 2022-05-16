public class TesteIR {

    public static void main(String[] args) {

        double salario = 3300.0;

        if (salario >= 1900 && salario <= 2800) 
        	System.out.println("Pode deduzir R$ 142,00");
        else if (salario > 2800 && salario <= 3751)
        	System.out.println("Pode deduzir R$ 350,00");
        else if (salario > 3751 && salario <= 4664)
        	System.out.println("Pode deduzir R$ 636,00");
    }
}