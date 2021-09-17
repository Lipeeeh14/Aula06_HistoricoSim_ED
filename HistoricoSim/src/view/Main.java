package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.lipe.PilhaString.Pilha;
import controller.HistoricoController;

public class Main {

	public static void main(String[] args) {
		int op = 0;
		Pilha historico = new Pilha();
		HistoricoController hController = new HistoricoController();
		String endereco;
		
		try {
			do {
				op = Integer.parseInt(JOptionPane.showInputDialog("Digite o que deseja fazer: \n"
						+ "1 - Adicionar um endere�o \n"
						+ "2 - Remover o �ltimo endere�o \n"
						+ "3 - �ltimo endere�o visitado \n"
						+ "0 - Sair \n"));
				
				switch(op) {
					case 0:
						op = 0;
						JOptionPane.showMessageDialog(null, "At� a pr�xima!");
						break;
					case 1:
						endereco = JOptionPane.showInputDialog("Digite o endere�o:");
						hController.inserirEndereco(historico, endereco);
						break;
					case 2:
						hController.removerEndereco(historico);
						break;
					case 3:
						hController.consultarEndereco(historico);
						break;
					default:
						JOptionPane.showMessageDialog(null, "Op��o inv�lida, tente novamente!");
				}
			} while(op != 0);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro: "+ e.getMessage());
		}			
	}

}
