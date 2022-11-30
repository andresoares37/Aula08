import java.util.Scanner;

public class FiapStore {
	public static final int TAMANHO_CARRINHO = 5;

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		double[] carrinho = new double[TAMANHO_CARRINHO];
		int opcao = 0;
		String usuario, senha;
		System.out.println("Para entrar no sistema voc� deve informar seu usu�rio e sua senha");
		System.out.println("Digite seu usu�rio");
		usuario = leitor.next();
		System.out.println("Digite sua senha");
		senha = leitor.next();
		
		Funcoes.login(usuario, senha);

		while (opcao != 3) {
			Funcoes.exibirMenu();
			opcao = leitor.nextInt();

			switch (opcao) {
			case 1:
				System.out.println(
						"Voc� dever� digitar cada um dos " + carrinho.length + " pre�os de produtos do carrinho");
				for (int i = 0; i < carrinho.length; i++) {
					System.out.println(
							"Digite o " + (i + 1) + "� dos " + carrinho.length + " pre�os de produto do carrinho");
					carrinho[i] = leitor.nextDouble();
				}
				break;

			case 2:
				System.out.println("O total do carrinho é: " + Funcoes.somarCarrinho(carrinho));
				break;

			case 3:
				System.out.println("Saindo do sistema");
				break;

			default:
				System.out.println("Op��o inv�lida, por favor selecione outra op��o");
				break;

			}

		}

	}

}
