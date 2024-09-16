package view;

import javax.swing.JOptionPane;

import controllerPilha.ControllerPilha;

public class Principal {
	public static void main(String[] args) throws Exception {
		ControllerPilha pilha = new ControllerPilha(null);
		String valor;
		int result;
		do {
			valor = JOptionPane.showInputDialog("Digite o valor");
			if(valor.contains("*")){
				result = pilha.pop() * pilha.pop();
				pilha.push(result);
			}else if(valor.contains("/")) {
				int n2 = pilha.pop();
				int n1 = pilha.pop();
				result = n1 / n2;
				pilha.push(result);
			}else if(valor.contains("-")){
				int n2 = pilha.pop();
				int n1 = pilha.pop();
				result = n1 - n2;
				pilha.push(result);
			}else if(valor.contains("+")) {
				result = pilha.pop() + pilha.pop();
				pilha.push(result);
			}else if(!valor.equals("FIM")){
				pilha.push(Integer.parseInt(valor));
			}
		}while(!valor.equals("FIM"));
		System.out.println(pilha.top());	
	}
}