package controle;

public class TesteMetodo {

	static void meuMetodo(String opcao, int a, int b) {
	
	    String adicao = "A soma dos valores é: ";
	    String subtracao = "O resultado da subtração é: ";
	    String divisao = "O resultado da divisão é: ";
	    String multiplicacao = "O resultado da multiplicação é: ";
	    
	    int soma = a + b;
	    int subtrai = a - b;
	    int divide = a / b;
	    int multiplica = a * b;
	    
	    if (opcao.equals("adição")) {
	    	System.out.println(adicao + soma);
	    }else if(opcao.equals("subtração")) {
	    	System.out.println(subtracao + subtrai);
	    }else if(opcao.equals("divisão")) {
	    	System.out.println(divisao + divide);
	    }else if(opcao.equals("multiplicação")) {
	    	System.out.println(multiplicacao + multiplica);
	    }
	  }

	  public static void main(String[] args) {
	    meuMetodo("adição", 2, 2);
	    
	  }
	}


