package controle;

public class TesteMetodo {

	static void meuMetodo(String opcao, int a, int b) {
	
	    String adicao = "A soma dos valores �: ";
	    String subtracao = "O resultado da subtra��o �: ";
	    String divisao = "O resultado da divis�o �: ";
	    String multiplicacao = "O resultado da multiplica��o �: ";
	    
	    int soma = a + b;
	    int subtrai = a - b;
	    int divide = a / b;
	    int multiplica = a * b;
	    
	    if (opcao.equals("adi��o")) {
	    	System.out.println(adicao + soma);
	    }else if(opcao.equals("subtra��o")) {
	    	System.out.println(subtracao + subtrai);
	    }else if(opcao.equals("divis�o")) {
	    	System.out.println(divisao + divide);
	    }else if(opcao.equals("multiplica��o")) {
	    	System.out.println(multiplicacao + multiplica);
	    }
	  }

	  public static void main(String[] args) {
	    meuMetodo("adi��o", 2, 2);
	    
	  }
	}


