package EntraJoptions;

import javax.swing.JOptionPane;

public class IMC {

	public static void main(String[] args) {
		String peso = JOptionPane.showInputDialog("Qual o seu peso?");
		String altura = JOptionPane.showInputDialog("Qual sua altura?");
		
			double pesoQuilograma = Double.parseDouble(peso);
			double alturaQuilograma = Double.parseDouble(altura);
			double imc = pesoQuilograma / (alturaQuilograma * alturaQuilograma);
			
			String msg = (imc >= 20 && imc <= 25) ? "Peso Ideal" : "Acima do Peso";
			msg = "IMC - " + imc + "/n" + msg;
			JOptionPane.showMessageDialog(null, msg);
			
	

	}

}
