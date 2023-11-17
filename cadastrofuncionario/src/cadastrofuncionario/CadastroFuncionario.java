package cadastrofuncionario;

import java.util.Scanner;

public class CadastroFuncionario {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o número de funcionários a serem cadastrados: ");
		int numeroFuncionarios = scanner.nextInt();

		if (numeroFuncionarios < 5) {
		
		scanner.nextLine();

		String[] nomes = new String[numeroFuncionarios];
		int[] idades = new int[numeroFuncionarios];
		String[] cargo = new String[numeroFuncionarios];
		String[] setor = new String[numeroFuncionarios];
		String[] admissao = new String[numeroFuncionarios];

		for (int i = 0; i < numeroFuncionarios; i++) {
			System.out.println("Funcionário " + (i + 1));
			System.out.print("Digite o nome: ");
			nomes[i] = scanner.nextLine();
			System.out.print("Digite a idade: ");
			idades[i] = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Digite o cargo: ");
			cargo[i] = scanner.nextLine();
			System.out.print("Digite o setor: ");
			setor[i] = scanner.nextLine();
			System.out.print("Digite a data de admissão: ");
			admissao[i] = scanner.nextLine();
		}

		System.out.println("\nFuncionários cadastrados:");
		for (int i = 0; i < numeroFuncionarios; i++) {
			System.out.println("Nome: " + nomes[i] + "\nIdade: " + idades[i] + "\nCargo: " + cargo[i] + "\nSetor: "
					+ setor[i] + "\nData da admissão: " + admissao[i]);

		}
	}
}
}

