package br.senai.sp.jandira;

import br.senai.sp.jandira.gui.FrameTabuada;
import br.senai.sp.jandira.model.Usuario;

public class AppTabuada {

	public static void main(String[] args) {
		
		
		FrameTabuada tela = new FrameTabuada();
		tela.titulo = "Tabuada 1.0";
		tela.largura = 450; 
		tela.altura = 700;
		tela.criarTela();
		
		
		
		Usuario usuario = new Usuario();
		
		usuario.multiplicando = 9;
		usuario.minimoMultiplicador = 25;
		usuario.maximoMultiplicador = 105;
		
		String[] resultado = usuario.getTabuada();
		
		int i = 0;
		 while(i < resultado.length) {
			 System.out.println(resultado[i]);
			 i++;
		 }
		
	 
	}

}
