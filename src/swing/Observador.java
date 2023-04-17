package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {
	public static void main(String[] args) {
		JFrame janela = new JFrame("Observador");
		
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.setSize(600, 300);
		janela.setLayout(new FlowLayout());
		janela.setLocationRelativeTo(null);// por estar nulo centraliza baseado na tela do computador 
		
		JButton botao = new JButton("clicar");
		janela.add(botao);
		
		botao.addActionListener(e-> {
			System.out.println("evento ocorreu!!!");
			
			
//			botao.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("ocorreu um click");
//			}
		});
		
		
		janela.setVisible(true);
	}

}
