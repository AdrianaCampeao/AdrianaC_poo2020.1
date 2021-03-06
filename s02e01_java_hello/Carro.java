package s02e01_java_hello;

import java.util.Scanner;

public class Carro {
	int nPessoas = 0;
    int maxPessoas = 3;
    float gasolina = 0;
    float maxGasolina = 100;
    float odometro = 0;
    float distancia = 0;
    int barulho = 4;


    boolean embarcar(){
        if (this.nPessoas <= this.maxPessoas){
            this.nPessoas += 1;
            System.out.println("embarcou");
            return true;
        }
        System.out.println("ta lotado");
        return false;
    }
    
    void abastecer(float gasolina){
        this.gasolina += gasolina;
        if(this.gasolina > this.maxGasolina);
            this.gasolina = this.maxGasolina;
        System.out.println("Tanque mais que cheio, pode dirigir");
    }

    void dirigir(float distancia){
        if(this.nPessoas == 0){
            System.out.println("Nao tem quem dirija");
            return;
        }
        if(this.gasolina >= distancia){
            this.gasolina -= distancia;
            System.out.println("Dirigindo");
            return;
        }
        System.out.println("nao tem gasolina");
    }
    
    void potencia(int barulho) {
    	switch(barulho) {
    	case 1:
    		System.out.println("Motor RUN");
    		break;
    	case 2:
    		System.out.println("Motor RUN RUN");
    		break;
    	case 3:
    		System.out.println("Motor RUN RUN RUN");
    		break;
    	default:
    		System.out.println("N�o est� andando.");
    		break;
    	}
    }


    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro(); 
        while(true){
            String line = scanner.nextLine();
            String ui[] = line.split(" ");
            if(ui[0].equals("end")){
                break;
            }else if(ui[0].equals("embarcar")){
                carro.embarcar();
            }else if(ui[0].equals("abastecer")){//qtd
                float combustivel = Float.parseFloat(ui[1]);
                carro.abastecer(combustivel);
            }else if(ui[0].equals("dirigir")){
                float distancia = Float.parseFloat(ui[1]);
                carro.dirigir(distancia);
            }else if(ui[0].equals("potencia")) {
            	int barulho = scanner.nextInt();
            	carro.potencia(barulho);
            }else {
            	System.out.println("Comando invalido");
            }
        }
        scanner.close();
    }

}
