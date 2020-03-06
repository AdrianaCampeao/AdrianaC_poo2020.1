package projeto_3_macaco;

public class Macaco {
	int vidas = 1;
	int banana = 0;
	String cocar;
	String rir;
	int catar;
	String feliz;
	
	void vivinho() {
		if(this.vidas > 0) {
			System.out.println("um macaquinho vivinhoo!");
		}else
			System.out.println("opsss.");
	}
	
	void banana() {
		System.out.println("Me dá mais bananas?");
	}
	
	void cocar() {
		System.out.println("Coça pra mim aiii!");
	}
	
	void piolho() {
		if(catar + cocar!= null) {
		System.out.println("Catando piolhosss.");
		}
	}
	
	void feliz() {
		if(this.rir == this.feliz) {
			System.out.println("um macaquinho felizzzzz!");
		}
	}
		
	public static void main(String[] args) {
		System.out.println("Qual fase do macaquinho Chimpss você está hoje?");
		
		Macaco chimps = new Macaco();
		chimps.banana();
		chimps.feliz();
		chimps.vivinho();
		chimps.piolho();
		chimps.cocar();
	}
}
