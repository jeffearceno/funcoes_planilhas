package pragitpo;

import javax.swing.JOptionPane;

public class Funcoes {

	public static void main(String[] args) {

		Double numero1 = 0.0;
		Double numero2 = 0.0;
		Double resultado = 0.0;
		int menu = -1;

		
		
		while (menu != 0) {
			menu = Integer.parseInt(JOptionPane.showInputDialog(
					"Selecione a opção que deseja:\n1-Somar\n2-Ver valor máximo\n3-Ver valor mínimo\n4-Ver média\n0-Sair"));

			switch (menu) {
			case 1:
				numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
				numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));

				resultado = numero1 + numero2;

				JOptionPane.showMessageDialog(null, "A soma de " + numero1 + " + " + numero2 + " é de: " + resultado);

				break;

			case 2:
				numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
				numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));

				resultado = Math.max(numero1, numero2);

				JOptionPane.showMessageDialog(null, "Valor máximo: " + resultado);

				break;
			case 3:
				numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
				numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));

				resultado = Math.min(numero1, numero2);

				JOptionPane.showMessageDialog(null, "Valor mínimo: " + resultado);

				break;
			case 4:
				numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
				numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));

				resultado = (numero1 + numero2) / 2;

				JOptionPane.showMessageDialog(null, "Valor médio: " + resultado);

				break;

			case 0:

				JOptionPane.showMessageDialog(null, "Fechando");

				break;

			default:

				JOptionPane.showMessageDialog(null, "Comando inválido");
				break;

			}

		}

	}

}
