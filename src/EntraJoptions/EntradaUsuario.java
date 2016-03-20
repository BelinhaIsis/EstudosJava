package EntraJoptions;

import javax.swing.JOptionPane;

public class EntradaUsuario {

	public static void main(String[] args) {
		System.out.print("Seja Bem Vindo!");
		String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
		System.out.println(nome);
		JOptionPane.showMessageDialog(null,nome);

	}

}
