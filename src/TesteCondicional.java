public class TesteCondicional {
	
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 20;
		int quantidadePessoas = 3;
		
		if (idade >= 18) {
            System.out.println("Voc� tem mais que 18 anos");
            System.out.println("Seja bem-vindo");
		} else {
			if (quantidadePessoas >= 2) {
                System.out.println("voc� n�o tem 18, mas pode entrar, " 
                					+ "pois est� acompanhado");
            } else {
            	System.out.println("Infelizmente voc� n�o pode entrar");
            }
        }
		
		
	}
}
