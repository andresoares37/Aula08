
public class Funcoes {
	public static double somarCarrinho(double[] produtos) {
		double soma = 0;
		for(int i=0; i<produtos.length;i++) {
			soma = soma + produtos[i];
		}
		
		return soma;
	}
	
	public static boolean validarLogin(String username, String password) {
		if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("123")) {
			return true;
		}
		return false;
		
	}
	
	public static void login(String username, String password) {
		if (Funcoes.validarLogin(username, password) == true) {
			System.out.println("Login bem sucedido!");
		}
		else {
			System.out.println("Usuário ou senha incorretos.");
			login(username, password);
		}
	}
	
	public static void exibirMenu() {
		System.out.println("FIAP STORE! A LOJA DOS FIAPERS!");
		System.out.println("1 - Informar todos os valores do carrinho");
		System.out.println("2 - Exibir total do carrinho");
		System.out.println("3 - Sair");
	}

}
