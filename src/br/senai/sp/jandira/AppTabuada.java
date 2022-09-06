package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Usuario;

public class AppTabuada {

	public static void main(String[] args) {
		
		
		Usuario usuario = new Usuario();
		
		usuario.multiplicando = 5;
		usuario.minimoMultiplicador = 7;
		usuario.maximoMultiplicador = 45;
		
		String[] resultado = usuario.getTabuada();
		
		int i = 0;
		 while(i < resultado.length) {
			 System.out.println(resultado[i]);
			 i++;
		 }
		
	 
	}

}
