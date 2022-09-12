package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.Scrollable;
import javax.swing.border.LineBorder;

import br.senai.sp.jandira.AppTabuada;
import br.senai.sp.jandira.model.Usuario;

public class FrameTabuada {
	
	public String titulo;
	public int largura;
	public int altura;
	
	//Criar complementos
			Font fontTitulo = new Font("Calibri", Font.BOLD, 35);
			Color corDoTitulo = new Color(255, 0, 0);
			Color corDaInforação = new Color(150, 150, 150);
			Font fonteMultiplicando = new Font("Calibri", Font.BOLD, 20);
			Color corDoBotão = new Color(39, 148, 20);
			Color corDeDentroDoBotãoCalcular = new Color(255, 255, 255);
			Font fonteDaLetraDeDentoDoBotão = new Font("Calibri", Font.BOLD, 18);
			Color corDeDentroDoBotãoLimpar = new Color(232, 172, 41);
			Color corPreta =new Color(0, 0, 0);
			
			
		
			
		public void criarTela() {
			
			JFrame tela = new JFrame();
			tela.setTitle(titulo);
			tela.setSize(largura, altura);
			tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			tela.setLayout(null);
			
		
			
		//Criar um container 
		Container painel = tela.getContentPane();
		painel.setBackground(corDeDentroDoBotãoCalcular);
		
		
		//Criar componente para o painel
		
		
		JLabel labelTitulo = new JLabel();
		labelTitulo.setText("Tabuada 1.0");
		labelTitulo.setBounds(90, 20, 200, 70);
		labelTitulo.setFont(fontTitulo);
		labelTitulo.setForeground(corDoTitulo);
		
		JLabel labelInformação = new JLabel();
		labelInformação.setText("Com a tabuada 1.0 os seus problemas acabaram.");
		labelInformação.setBounds(90, 20, 400, 110);
		labelInformação.setForeground(corDaInforação);
		
		JLabel labelContinuaçãoInformação = new JLabel();
		labelContinuaçãoInformação.setText("Calcule a tabuada que desejar em segundos!");
		labelContinuaçãoInformação.setBounds(90, 20, 400, 150);
		labelContinuaçãoInformação.setForeground(corDaInforação);
		
		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando :");
		labelMultiplicando.setBounds(85, 20, 200, 300);
		labelMultiplicando.setFont(fonteMultiplicando);
		
		JTextField textMultiplicando = new JTextField();
		textMultiplicando.setText(null);
		textMultiplicando.setBounds(230, 150, 150, 35);
		textMultiplicando.setHorizontalAlignment(JTextField.RIGHT);
		
		JLabel labelMinimoMultiplicador = new JLabel();
		labelMinimoMultiplicador.setText("Mínimo Multiplicador :");
		labelMinimoMultiplicador.setBounds(20, 20, 200, 420);
		labelMinimoMultiplicador.setFont(fonteMultiplicando);
		
		JTextField textMinimoMultiplicador = new JTextField();
		textMinimoMultiplicador.setText(null);
		textMinimoMultiplicador.setBounds(230, 210, 150, 35);
		textMinimoMultiplicador.setHorizontalAlignment(JTextField.RIGHT);
		
		JLabel labelMaximoMultiplicador = new JLabel();
		labelMaximoMultiplicador.setText("Máximo Multiplicador :");
		labelMaximoMultiplicador.setBounds(18, 20, 200, 540);
		labelMaximoMultiplicador.setFont(fonteMultiplicando);
		
		JTextField textMaximoMultiplicador = new JTextField();
		textMaximoMultiplicador.setText(null);
		textMaximoMultiplicador.setBounds(230, 270, 150, 35);
		textMaximoMultiplicador.setHorizontalAlignment(JTextField.RIGHT);
		
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(20, 350, 250, 50);
		buttonCalcular.setBackground(corDoBotão);
		buttonCalcular.setForeground(corDeDentroDoBotãoCalcular);
		
		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBackground(corDeDentroDoBotãoLimpar);
		buttonLimpar.setBounds(280, 350, 140, 50);
		buttonLimpar.setForeground(corDeDentroDoBotãoCalcular);
		
		JLabel labelResultado = new JLabel();
		labelResultado.setText("Resultado");
		labelResultado.setBounds(20, 100, 150, 640);
		labelResultado.setForeground(corPreta);
		labelResultado.setFont(fonteDaLetraDeDentoDoBotão);
		
		JList<String> listaDeResultado = new JList();
		listaDeResultado.setBounds(18, 430, 400, 220);
		listaDeResultado.setBackground(corDeDentroDoBotãoCalcular);
		listaDeResultado.setBorder(new LineBorder(corPreta));
		
		JScrollPane scrollResultado = new JScrollPane();
		scrollResultado.setBounds(18, 430, 400, 220);
		scrollResultado.setBackground(new Color(255, 247, 158));
		
		ImageIcon iconCalculadora = new ImageIcon("C:/Users/22282226/eclipse-workspace/Projeto-Tabuada/src/br/senai/sp/jandira/calculator.png");
		JLabel labelIcon = new JLabel(iconCalculadora);
		labelIcon.setBounds(5, 20, 100, 100);
		
	
		
		
		
		
		
		
		
		
		//Adcionar Componente ao painel
		painel.add(labelTitulo);
		painel.add(labelInformação);
		painel.add(labelContinuaçãoInformação);
		painel.add(labelMultiplicando);
		painel.add(textMultiplicando);
		painel.add(labelMinimoMultiplicador);
		painel.add(textMinimoMultiplicador);
		painel.add(labelMaximoMultiplicador);
		painel.add(textMaximoMultiplicador);
		painel.add(buttonCalcular);
		painel.add(buttonLimpar);
		painel.add(labelResultado);
		painel.add(listaDeResultado);
		painel.add(scrollResultado);
		painel.add(labelIcon);
		
		
		tela.setLocationRelativeTo(null);
		tela.setResizable(false);
		
		//Tornar a tela visivel
				tela.setVisible(true);
				
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				if(textMultiplicando.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Multiplicando está vazio", "Erro", JOptionPane.OK_OPTION);
					textMultiplicando.requestFocus();
				}else if (textMinimoMultiplicador.getText().isEmpty()){
					JOptionPane.showMessageDialog(null, "Minimo Multiplicador está vazio", "Erro", JOptionPane.OK_OPTION);	
					textMultiplicando.requestFocus();
				}else if (textMaximoMultiplicador.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Máximo Multiplicador está vazio", "Erro", JOptionPane.OK_OPTION);
					textMultiplicando.requestFocus();
				}else {
					Usuario tabuada = new Usuario();
					tabuada.multiplicando = Integer.parseInt(textMultiplicando.getText());
					tabuada.minimoMultiplicador = Integer.parseInt(textMinimoMultiplicador.getText());
					tabuada.maximoMultiplicador = Integer.parseInt(textMaximoMultiplicador.getText());
					
					if (tabuada.maximoMultiplicador >= tabuada.minimoMultiplicador) {
						listaDeResultado.setListData(tabuada.getTabuada());
						scrollResultado.getViewport().add(listaDeResultado);
					} else {
					JOptionPane.showMessageDialog(null, "O mínimo multiplicador é maior que o máximo multiplicador", "Erro", JOptionPane.OK_OPTION);
					textMaximoMultiplicador.setText("");
					textMinimoMultiplicador.setText("");
					textMultiplicando.setText("");
					}
				}
			}	
				
			});		
		
				
		
		buttonLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				DefaultListModel<String> listModel = new DefaultListModel<String>();
				listaDeResultado.setModel(listModel);
				textMaximoMultiplicador.setText("");
				textMinimoMultiplicador.setText("");
				textMultiplicando.setText("");
				textMultiplicando.requestFocus();
				

				
			}
		});
				
				
					
		}	
}
