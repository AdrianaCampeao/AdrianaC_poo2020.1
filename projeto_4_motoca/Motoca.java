package projeto_4_motoca;

import java.util.Scanner;

class Pessoa{
	String nome;
	int idade;
	boolean habilitacao;
	
	public Pessoa( String nome, int idade) { 
		this.nome = nome;
		this.idade = idade;
	}
}
public class Motoca {
	Pessoa pessoa;
	int potencia;
	
	boolean habilitar() {
		if(pessoa.habilitacao == null) {
		System.out.println("Habilitadíssimaah");
		return true;
		}else {
			System.out.println("Comando inválido");
			return false;
		}
	}
	void embarcar(Pessoa pessoa) {
		if(this.pessoa == null) {
			this.pessoa = pessoa;
		}else {
			System.out.println("Ja tem gente na motoca");
		}
	}
	void desembarcar() {
		if(this.pessoa != null) {
			this.pessoa = null;
		}else {
			System.out.println("Nao tem ninguem na moto");
		}
	}
	void dirigir() {
		if(this.pessoa == null) {
			System.out.println("Não tem ninguem na moto.");
		}else if(this.pessoa.idade < 6) {
			System.out.println("Não pode andar de moto");
		} else {
			System.out.println("Pode andar de moto de boas");
		}
	}
	String fazerVroom(){
		String saida = "";
		for(int i = 0; i < this.potencia; i++)
			saida += "run ";
		return saida;
	}

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Motoca motoca  = new Motoca();
		while(true) {
			String line = scanner.nextLine();
			String ui[] = line.split(" ");
			if(ui[0].equals("end")) {
				break;
			}else if(ui[0].equals("fazerVroom")) { //potencia
				Pessoa pessoa = motoca.pessoa;
				motoca = new Motoca(Integer.parseInt(ui[1]));
				motoca.fazerVroom();
			}else if(ui[0].equals("habilitar")) { //ver se tem habilitação pra poder dirigir
				motoca.habilitar();
			}else if(ui[0].equals("embarcar")) { //nome  idade
				int idade = Integer.parseInt(ui[2]);
				Pessoa pessoa = new Pessoa(ui[1], idade);
				motoca.embarcar(pessoa);
			}else if(ui[0].equals("desembarcar")) {
				motoca.desembarcar();
			}else if(ui[0].equals("dirigir")) {
				motoca.dirigir();
			}else {
				System.out.println("Comando invalido");
			}
		}
		scanner.close();
	}
}
