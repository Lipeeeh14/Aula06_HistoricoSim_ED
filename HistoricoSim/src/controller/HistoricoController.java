package controller;

import javax.swing.JOptionPane;

import br.edu.fateczl.lipe.PilhaString.Pilha;

public class HistoricoController {
	
	public HistoricoController() {}
	
	public void inserirEndereco(Pilha historico, String endereco) {
		String[] validacao = endereco.split("\\.");
		if (!validacao[0].equals("http://www") || !validacao[2].contains("co"))
			JOptionPane.showMessageDialog(null, "Endereço inválido!");
		else {
			historico.push(endereco);			
			JOptionPane.showMessageDialog(null, "Endereço inserido com sucesso!");
		}		
	}
	
	public void removerEndereco(Pilha historico) throws Exception {
		if (historico.isEmpty())
			JOptionPane.showMessageDialog(null, "Histórico vazio!");
		else if (historico.size() == 1)
			JOptionPane.showMessageDialog(null, "Não é possível remover o último endereço!");
		else {
			historico.pop();
			JOptionPane.showMessageDialog(null, "Endereço removido com sucesso!");
		}	
	}
	
	public void consultarEndereco(Pilha historico) throws Exception {
		JOptionPane.showMessageDialog(null, historico.top());
	}
}
