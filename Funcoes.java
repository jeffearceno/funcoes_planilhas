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
					"Selecione a op��o que deseja:\n1-Somar\n2-Ver valor m�ximo\n3-Ver valor m�nimo\n4-Ver m�dia\n0-Sair"));

			switch (menu) {
			case 1:
				numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro n�mero"));
				numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo n�mero"));

				resultado = numero1 + numero2;

				JOptionPane.showMessageDialog(null, "A soma de " + numero1 + " + " + numero2 + " � de: " + resultado);

				break;

			case 2:
				numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro n�mero"));
				numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo n�mero"));

				resultado = Math.max(numero1, numero2);

				JOptionPane.showMessageDialog(null, "Valor m�ximo: " + resultado);

				break;
			case 3:
				numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro n�mero"));
				numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo n�mero"));

				resultado = Math.min(numero1, numero2);

				JOptionPane.showMessageDialog(null, "Valor m�nimo: " + resultado);

				break;
			case 4:
				numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro n�mero"));
				numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo n�mero"));

				resultado = (numero1 + numero2) / 2;

				JOptionPane.showMessageDialog(null, "Valor m�dio: " + resultado);

				break;

			case 0:

				JOptionPane.showMessageDialog(null, "Fechando");

				break;

			default:

				JOptionPane.showMessageDialog(null, "Comando inv�lido");
				break;

			}

		}

	}

}
